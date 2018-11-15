package kasidit94.cskku.dev.thaisignlanguage;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.media.MediaPlayer;
import android.net.Uri;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.downloader.Error;
import com.downloader.OnCancelListener;
import com.downloader.OnDownloadListener;
import com.downloader.OnPauseListener;
import com.downloader.OnProgressListener;
import com.downloader.OnStartOrResumeListener;
import com.downloader.PRDownloader;
import com.downloader.Progress;
import com.downloader.Status;
import kasidit94.cskku.dev.thaisignlanguage.utils.Utils;


import java.util.*;

import java.io.*;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    private Toolbar mToolbar;
    private TextView textOut;
    private EditText textIn;
    private Button btnTran,btnclear;
    private VideoView videoView;
    private MenuItem downloadOne;
//    private menu downloadOne, downloadTwo, downloadThree;

    private String dirPath;
    final String URL1 = "http://178.128.16.70/htdocs/01/defualt.zip";
    Button buttonOne,buttonCancelOne;
    TextView textViewProgressOne,showpath;
    ProgressBar progressBarOne;

    int downloadIdOne;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        dictionary();
        showVideo();

        /// Downlaod FILE
        onClickListenerOne();
        dirPath = Utils.getRootDirPath(getApplicationContext());

        ///

        // Set evant for button
        btnTran.setOnClickListener(this);
        btnclear.setOnClickListener(this);
//        downloadOne.setOnMenuItemClickListener(null);


        // Toolbar
        mToolbar = (Toolbar) findViewById(R.id.nav_action);
        setSupportActionBar(mToolbar);

        // Left navigation

        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout,R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }

    private void init(){
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        btnTran = (Button) findViewById(R.id.btnTran);
        textIn = (EditText) findViewById(R.id.inputSentence);
        textOut = (TextView) findViewById(R.id.sh_word);
        btnclear = (Button) findViewById(R.id.btnClear);
        videoView =(VideoView) findViewById(R.id.showVideo);

        downloadOne = findViewById(R.id.downloadOne);
        buttonOne = findViewById(R.id.buttonOne);
        showpath = findViewById(R.id.textshow);
        buttonCancelOne = findViewById(R.id.buttonCancelOne);
        textViewProgressOne = findViewById(R.id.textViewProgressOne);

        progressBarOne = findViewById(R.id.progressBarOne);

    }


    public void onClickListenerOne(){
        buttonOne.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (Status.RUNNING == PRDownloader.getStatus(downloadIdOne)){
                    PRDownloader.pause(downloadIdOne);
                    return;
                }
                buttonOne.setEnabled(false);
                progressBarOne.setIndeterminate(true);
                progressBarOne.getIndeterminateDrawable().setColorFilter(Color.BLACK, PorterDuff.Mode.SRC_IN);

                if (Status.PAUSED == PRDownloader.getStatus(downloadIdOne)){
                    PRDownloader.resume(downloadIdOne);
                    return;
                }

                downloadIdOne = PRDownloader.download(URL1, dirPath, "testdownload.zip")
                        .build().setOnStartOrResumeListener(new OnStartOrResumeListener() {
                            @Override
                            public void onStartOrResume() {

                                progressBarOne.setIndeterminate(false);
                                buttonOne.setEnabled(true);
                                buttonOne.setText("PAUSE");
                                buttonCancelOne.setEnabled(false);
                            }
                        }).setOnPauseListener(new OnPauseListener() {
                            @Override
                            public void onPause() {
                                buttonOne.setText("Resume");
                            }
                        }).setOnCancelListener(new OnCancelListener() {
                            @Override
                            public void onCancel() {
                                buttonOne.setText("Start");
                                buttonCancelOne.setEnabled(false);
                                progressBarOne.setProgress(0);
                                textViewProgressOne.setText(" ");
                                downloadIdOne = 0;
                                progressBarOne.setIndeterminate(false);
                            }
                        }).setOnProgressListener(new OnProgressListener() {
                            @Override
                            public void onProgress(Progress progress) {
                                long progressPercent = progress.currentBytes * 100 / progress.totalBytes;
                                progressBarOne.setProgress((int) progressPercent);
                                textViewProgressOne.setText(Utils.getProgressDisplayLine(progress.currentBytes, progress.totalBytes));
                                progressBarOne.setIndeterminate(false);
                            }
                        }).start(new OnDownloadListener() {
                            @Override
                            public void onDownloadComplete() {
                                buttonOne.setEnabled(false);
                                buttonCancelOne.setEnabled(false);
                                buttonOne.setText("Completed");
                                showpath.setText(dirPath);
                                Toast.makeText(MainActivity.this, "Complete", Toast.LENGTH_SHORT).show();

                            }

                            @Override
                            public void onError(Error error) {

                                buttonOne.setText("Start");
                                Toast.makeText(MainActivity.this, "ERROR", Toast.LENGTH_SHORT).show();
                                textViewProgressOne.setText("");
                                progressBarOne.setProgress(0);
                                downloadIdOne = 0;
                                buttonCancelOne.setEnabled(false);
                                progressBarOne.setIndeterminate(false);
                                buttonOne.setEnabled(true);

                            }
                        });
            }
        });

        buttonCancelOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PRDownloader.cancel(downloadIdOne);
            }
        });
    }







    private void showVideo(){

        ///////// fake video show
        String filename = "videoplay";
        String filePlace = "android.resource://"+ getPackageName()+"/raw/"+filename;
        videoView.setVideoURI(Uri.parse(filePlace));
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                videoView.start();
            }
        });
        ////// end of fake video show
    }

    private void dictionary(){
        String line ="";
        StringBuffer stringBuffer = new StringBuffer();
        InputStream inputStream = getResources().openRawResource(R.raw.lexitron);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        try {
            while ((line = bufferedReader.readLine()) != null){
                stringBuffer.append(line+"\n");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        String data  ;
//        System.out.print(stringBuffer);
//        textView.setText(stringBuffer);

        FileOutputStream fos = null;
        String path ;
        try {
            fos = openFileOutput("lexitron.txt",MODE_PRIVATE);
            fos.write(stringBuffer.toString().getBytes());
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }






    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnTran:
                String inSentence = textIn.getText().toString();
                // LexTo ตัดคำ
                try {
                    Word(inSentence);
                    Toast.makeText(this, "แปลภาษาตัดคำ", Toast.LENGTH_SHORT).show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;

            case R.id.btnClear:

                textOut.setText("");
                textIn.setText("");
                break;


        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (mToggle.onOptionsItemSelected(item)){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

/*     ====================== LEXTO ======================      */


//class LongLexTo {

    //Private variables
    private Trie dict;               //For storing words from dictionary
    private LongParseTree ptree;     //Parsing tree (for Thai words)

    //Returned variables
    private Vector indexList;  //List of word index positions
    private Vector lineList;   //List of line index positions
    private Vector typeList;   //List of word types (for word only)
    private Iterator iter;     //Iterator for indexList OR lineList (depends on the call)
    private static Scanner Sc = new Scanner(System.in);
    /*******************************************************************/
    /*********************** Return index list *************************/
    /*******************************************************************/
    public Vector getIndexList() {
        return indexList; }

    /*******************************************************************/
    /*********************** Return type list *************************/
    /*******************************************************************/
    public Vector getTypeList() {
        return typeList;

    }

    /*******************************************************************/
    /******************** Iterator for index list **********************/
    /*******************************************************************/
    //Return iterator's hasNext for index list
    public boolean hasNext() {
        if(!iter.hasNext())
            return false;
        return true;
    }

    //Return iterator's first index
    public int first() {
        return 0;
    }

    //Return iterator's next index
    public int next() {
        return((Integer)iter.next()).intValue();
    }

    /*******************************************************************/
    /********************** Constructor (default) **********************/
    /*******************************************************************/
    public MainActivity() throws IOException {

        dict=new Trie();
        File dictFile=new File("lexitron.txt");
        if(dictFile.exists())
            addDict(dictFile);
        else
            System.out.println(" !!! Error: Missing default dictionary file, lexitron.txt");
        indexList=new Vector();
        lineList=new Vector();
        typeList=new Vector();
        ptree=new LongParseTree(dict, indexList, typeList);
    } //Constructor

    /*******************************************************************/
    /************** Constructor (passing dictionary file ) *************/
    /*******************************************************************/
    public MainActivity(File dictFile) throws IOException {

        dict=new Trie();
        if(dictFile.exists())
            addDict(dictFile);
        else
            System.out.println(" !!! Error: The dictionary file is not found, " + dictFile.getName());
        indexList=new Vector();
        lineList=new Vector();
        typeList=new Vector();
        ptree=new LongParseTree(dict, indexList, typeList);
    } //Constructor

    /*******************************************************************/
    /**************************** addDict ******************************/
    /*******************************************************************/
    public void addDict(File dictFile) throws IOException {

        //Read words from dictionary
        String line, word, word2;
        int index;
        final File file = dictFile;
        InputStreamReader fr = new InputStreamReader(new FileInputStream(file));
        BufferedReader br = new BufferedReader(fr);

        while((line=br.readLine())!=null) {
            line=line.trim();
            if(line.length()>0)
                dict.add(line);
        }
    } //addDict

    /****************************************************************/
    /************************** wordInstance ************************/
    /****************************************************************/
    public void wordInstance(String text) {

        indexList.clear();
        typeList.clear();
        int pos, index;
        String word;
        boolean found;
        char ch;

        pos=0;
        while(pos<text.length()) {

            //Check for special characters and English words/numbers
            ch=text.charAt(pos);

            //English
            if(((ch>='A')&&(ch<='Z'))||((ch>='a')&&(ch<='z'))) {
                while((pos<text.length())&&(((ch>='A')&&(ch<='Z'))||((ch>='a')&&(ch<='z'))))
                    ch=text.charAt(pos++);
                if(pos<text.length())
                    pos--;
                indexList.addElement(new Integer(pos));
                typeList.addElement(new Integer(3));
            }
            //Digits
            else if(((ch>='0')&&(ch<='9'))||((ch>='�')&&(ch<='�'))) {
                while((pos<text.length())&&(((ch>='0')&&(ch<='9'))||((ch>='�')&&(ch<='�'))||(ch==',')||(ch=='.')))
                    ch=text.charAt(pos++);
                if(pos<text.length())
                    pos--;
                indexList.addElement(new Integer(pos));
                typeList.addElement(new Integer(3));
            }
            //Special characters
            else if((ch<='~')||(ch=='�')||(ch=='�')||(ch=='�')||(ch=='�')||(ch==',')) {
                pos++;
                indexList.addElement(new Integer(pos));
                typeList.addElement(new Integer(4));
            }
            //Thai word (known/unknown/ambiguous)
            else
                pos=ptree.parseWordInstance(pos, text);
        } //While all text length
        iter=indexList.iterator();
    } //wordInstance

    /****************************************************************/
    /************************** lineInstance ************************/
    /****************************************************************/
    public void lineInstance(String text) {

        int windowSize=10; //for detecting parentheses, quotes
        int curType, nextType, tempType, curIndex, nextIndex, tempIndex;
        lineList.clear();
        wordInstance(text);
        int i;
        for(i=0; i<typeList.size()-1; i++) {
            curType=((Integer)typeList.elementAt(i)).intValue();
            curIndex=((Integer)indexList.elementAt(i)).intValue();

            if((curType==3)||(curType==4)) {
                //Parenthesese
                if((curType==4)&&(text.charAt(curIndex-1)=='(')) {
                    int pos=i+1;
                    while((pos<typeList.size())&&(pos<i+windowSize)) {
                        tempType=((Integer)typeList.elementAt(pos)).intValue();
                        tempIndex=((Integer)indexList.elementAt(pos++)).intValue();
                        if((tempType==4)&&(text.charAt(tempIndex-1)==')')) {
                            lineList.addElement(new Integer(tempIndex));
                            i=pos-1;
                            break;
                        }
                    }
                }
                //Single quote
                else if((curType==4)&&(text.charAt(curIndex-1)=='\'')) {
                    int pos=i+1;
                    while((pos<typeList.size())&&(pos<i+windowSize)) {
                        tempType=((Integer)typeList.elementAt(pos)).intValue();
                        tempIndex=((Integer)indexList.elementAt(pos++)).intValue();
                        if((tempType==4)&&(text.charAt(tempIndex-1)=='\'')) {
                            lineList.addElement(new Integer(tempIndex));
                            i=pos-1;
                            break;
                        }
                    }
                }
                //Double quote
                else if((curType==4)&&(text.charAt(curIndex-1)=='\"')) {
                    int pos=i+1;
                    while((pos<typeList.size())&&(pos<i+windowSize)) {
                        tempType=((Integer)typeList.elementAt(pos)).intValue();
                        tempIndex=((Integer)indexList.elementAt(pos++)).intValue();
                        if((tempType==4)&&(text.charAt(tempIndex-1)=='\"')) {
                            lineList.addElement(new Integer(tempIndex));
                            i=pos-1;
                            break;
                        }
                    }
                }
                else
                    lineList.addElement(new Integer(curIndex));
            }
            else {
                nextType=((Integer)typeList.elementAt(i+1)).intValue();
                nextIndex=((Integer)indexList.elementAt(i+1)).intValue();
                if((nextType==3)||
                        ((nextType==4)&&((text.charAt(nextIndex-1)==' ')||(text.charAt(nextIndex-1)=='\"')||
                                (text.charAt(nextIndex-1)=='(')||(text.charAt(nextIndex-1)=='\''))))
                    lineList.addElement(new Integer(((Integer)indexList.elementAt(i)).intValue()));
                else if((curType==1)&&(nextType!=0)&&(nextType!=4))
                    lineList.addElement(new Integer(((Integer)indexList.elementAt(i)).intValue()));
            }
        }
        if(i<typeList.size())
            lineList.addElement(new Integer(((Integer)indexList.elementAt(indexList.size()-1)).intValue()));
        iter=lineList.iterator();
    } //lineInstance

    /****************************************************************/
    /*************************** Demo *******************************/
    /****************************************************************/
//"app/src/main/java/kasidit94/cskku/dev/thaisignlanguage/lexitron.txt"
    public void Word(String input) throws IOException {
        MainActivity tokenizer=new MainActivity(new File("/data/data/kasidit94.cskku.dev.thaisignlanguage/files/lexitron.txt"));
        File unknownFile=new File("unknown.txt");
        if(unknownFile.exists())
            tokenizer.addDict(unknownFile);
        Vector typeList;
        String text="",line, inSentence;
        int begin, end, type;
//        do {
//            System.out.print("\n >>> Enter input file ('q' to quit): ");
//        inFileName=(streamReader.readLine()).trim();
            inSentence = input;
//            if(inSentence.equals("q"))
//                System.exit(1);

//        } while(inSentence=="");

        if(inSentence!=null) {
            line=inSentence;
            line=line.trim();
            if(line.length()>0) {

                tokenizer.wordInstance(line);
                typeList=tokenizer.getTypeList();
                begin=tokenizer.first();
                int i=0;
                while(tokenizer.hasNext()) {
                    end=tokenizer.next();
                    type=((Integer)typeList.elementAt(i++)).intValue();
                    System.out.print("  " + line.substring(begin, end));
                    text+= line.substring(begin, end)+" | ";
                    textOut.setText(text.toString());
                    begin=end;
                }
//                System.out.print("\n");

            }
//            else {
//                System.out.println("not have sentence");
//            }
        }  //while all line

    } //main


}
