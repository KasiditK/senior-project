package kasidit94.cskku.dev.thaisignlanguage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.media.MediaPlayer;
import android.net.Uri;

import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.SimpleAdapter;
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


public class ActivityMainTSL extends AppCompatActivity implements View.OnClickListener{

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    private Toolbar mToolbar;
    private TextView textOut;
    private EditText textIn;
    private Button btnTran,btnclear;
    private VideoView videoView;

    private ImageButton btnRight, btnLeft;
    private NavigationView navRight, navLeft;
    private Context context = this;
    private ArrayList<HashMap<String, String>> favorite;
    private ListView Favorite;

//    private menu downloadOne, downloadTwo, downloadThree;

    private String dirPath;
    final String URL1 = "http://178.128.16.70/htdocs/01/defualt.zip";
    Button buttonOne,buttonTwo,buttonThree,buttonFour,buttonCancelOne;
    TextView textViewProgressOne,showpath;
    ProgressBar progressBarOne, progressBarTwo, progressBarThree, progressBarFour;

    int downloadIdOne,downloadIdTwo,downloadIdThree,downloadIdFour;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tsl);
        init();
        dictionary();
        showVideo();
        onClickNav();

        /// Downlaod FILE
        onClickListenerOne();
        onClickListenerTwo();
        onClickListenerThree();
        onClickListenerFour();

        // Favorite Function
        onClickFavorite();

        // select database function
        callDatabase();


        dirPath = Utils.getRootDirPath(getApplicationContext());
        ///

        // Set evant for button TSL
        btnTran.setOnClickListener(this);
        btnclear.setOnClickListener(this);
//        downloadOne.setOnMenuItemClickListener(null);


        // Toolbar
        mToolbar = (Toolbar) findViewById(R.id.nav_action);
        setSupportActionBar(mToolbar);

        // Left navigation



/*        ###############   old Action Bar and Navigaton Left Only   ###############

//        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout,R.string.open, R.string.close);
//        mDrawerLayout.addDrawerListener(mToggle);
//        mToggle.syncState();
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

          ###############   old Action Bar and Navigaton Left Only   ###############
*/

    }

    private void init(){
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        btnTran = (Button) findViewById(R.id.btnTran);
        textIn = (EditText) findViewById(R.id.inputSentence);
        textOut = (TextView) findViewById(R.id.sh_word);
        btnclear = (Button) findViewById(R.id.btnClear);
        videoView =(VideoView) findViewById(R.id.showVideo);
        btnRight = (ImageButton) findViewById(R.id.btnRight);
        btnLeft = (ImageButton) findViewById(R.id.btnLeft);
        navRight = (NavigationView) findViewById(R.id.navRight);
        navLeft = (NavigationView) findViewById(R.id.navLeft);
        mDrawerLayout.setDrawerListener(mToggle);
        Favorite = (ListView) findViewById(R.id.favorite);



        buttonOne = findViewById(R.id.buttonOne);
        buttonTwo = findViewById(R.id.buttonTwoDownload);
        buttonThree = findViewById(R.id.buttonThree);
        buttonFour = findViewById(R.id.buttonFour);
        showpath = findViewById(R.id.textshow);
        buttonCancelOne = findViewById(R.id.buttonCancelOne);
        textViewProgressOne = findViewById(R.id.textViewProgressOne);

        progressBarOne = findViewById(R.id.progressBarOne);
        progressBarTwo = findViewById(R.id.progressBarTwo);
        progressBarThree = findViewById(R.id.progressBarThree);
        progressBarFour = findViewById(R.id.progressBarFour);


    }

    /* function open Navigation View */
    private void onClickNav(){
        btnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mDrawerLayout.isDrawerOpen(navLeft))
                {
                    mDrawerLayout.closeDrawer(navLeft);
                }
                else if(!mDrawerLayout.isDrawerOpen(navLeft))
                {
                    mDrawerLayout.openDrawer(navLeft);
                }
                if (mDrawerLayout.isDrawerOpen(navRight))
                {
                    mDrawerLayout.closeDrawer(navRight);
                }
            }
        });

        btnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mDrawerLayout.isDrawerOpen(navRight))
                {
                    mDrawerLayout.closeDrawer(navRight);
                }
                else if(!mDrawerLayout.isDrawerOpen(navRight))
                {
                    mDrawerLayout.openDrawer(navRight);
                }
                if (mDrawerLayout.isDrawerOpen(navLeft))
                {
                    mDrawerLayout.closeDrawer(navLeft);
                }
            }
        });
    }

    /* End open Navigation View */


    private void callDatabase(){
        DatabaseTSL dbTSL = new DatabaseTSL(this);
        dbTSL.getWritableDatabase();

        // Select Data
        favorite = dbTSL.SelectAllData();

        // Select to ListView
        SimpleAdapter simpleAdapter;
        simpleAdapter = new SimpleAdapter(getApplicationContext(),favorite,R.layout.layout_row,
                new String[]{"sentences_Name"},
                new int[]{R.id.col_name});
        Favorite.setAdapter(simpleAdapter);
    }


    /* function button download 1-4 */
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
                                buttonOne.setText(""); //Pause
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
                                buttonOne.setText(""); //complete
                                buttonOne.setBackgroundResource(R.drawable.ic_action_check_download);
                                showpath.setText(dirPath);
                                Toast.makeText(ActivityMainTSL.this, "Complete", Toast.LENGTH_SHORT).show();

                            }

                            @Override
                            public void onError(Error error) {

                                buttonOne.setText("Start");
                                Toast.makeText(ActivityMainTSL.this, "ERROR", Toast.LENGTH_SHORT).show();
                                textViewProgressOne.setText("");
                                progressBarOne.setProgress(0);
                                downloadIdOne = 0;
                                buttonCancelOne.setEnabled(false);
                                progressBarOne.setIndeterminate(false);
                                buttonOne.setEnabled(true);

                            }
                        });
                buttonOne.setBackgroundResource(R.drawable.ic_action_check_download);
            }
        });

        buttonCancelOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PRDownloader.cancel(downloadIdOne);
            }
        });
    }

    public void onClickListenerTwo() {
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Status.RUNNING == PRDownloader.getStatus(downloadIdTwo)) {
                    PRDownloader.pause(downloadIdTwo);
                    return;
                }

                buttonTwo.setEnabled(false);
                progressBarTwo.setIndeterminate(true);
                progressBarTwo.getIndeterminateDrawable().setColorFilter(
                        Color.BLUE, android.graphics.PorterDuff.Mode.SRC_IN);

                if (Status.PAUSED == PRDownloader.getStatus(downloadIdTwo)) {
                    PRDownloader.resume(downloadIdTwo);
                    return;
                }
                downloadIdTwo = PRDownloader.download(URL1, dirPath, "wechat.apk")
                        .build()
                        .setOnStartOrResumeListener(new OnStartOrResumeListener() {
                            @Override
                            public void onStartOrResume() {
                                progressBarTwo.setIndeterminate(false);
                                buttonTwo.setEnabled(true);
                                buttonTwo.setText("");
//                                buttonCancelTwo.setEnabled(true);
//                                buttonCancelTwo.setText(R.string.cancel);
                            }
                        })
                        .setOnPauseListener(new OnPauseListener() {
                            @Override
                            public void onPause() {
                                buttonTwo.setText("");
                            }
                        })
                        .setOnCancelListener(new OnCancelListener() {
                            @Override
                            public void onCancel() {
                                downloadIdTwo = 0;
                                buttonTwo.setText("");
//                                buttonCancelTwo.setEnabled(false);
                                progressBarTwo.setProgress(0);
//                                textViewProgressTwo.setText("");
                                progressBarTwo.setIndeterminate(false);
                            }
                        })
                        .setOnProgressListener(new OnProgressListener() {
                            @Override
                            public void onProgress(Progress progress) {
                                long progressPercent = progress.currentBytes * 100 / progress.totalBytes;
                                progressBarTwo.setProgress((int) progressPercent);
//                                textViewProgressTwo.setText(Utils.getProgressDisplayLine(progress.currentBytes, progress.totalBytes));
                            }
                        })
                        .start(new OnDownloadListener() {
                            @Override
                            public void onDownloadComplete() {
                                buttonTwo.setEnabled(false);
//                                buttonCancelTwo.setEnabled(false);
                                buttonTwo.setText("");
                            }

                            @Override
                            public void onError(Error error) {
                                buttonTwo.setText("");
                                Toast.makeText(getApplicationContext(), "error" + " " + "2", Toast.LENGTH_SHORT).show();
//                                textViewProgressTwo.setText("");
                                progressBarTwo.setProgress(0);
                                downloadIdTwo = 0;
//                                buttonCancelTwo.setEnabled(false);
                                progressBarTwo.setIndeterminate(false);
                                buttonTwo.setEnabled(true);
                            }
                        });
                buttonTwo.setBackgroundResource(R.drawable.ic_action_check_download);
            }
        });

        buttonCancelOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PRDownloader.cancel(downloadIdTwo);
            }
        });
    }

    public void onClickListenerThree() {
        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Status.RUNNING == PRDownloader.getStatus(downloadIdThree)) {
                    PRDownloader.pause(downloadIdThree);
                    return;
                }

                buttonThree.setEnabled(false);
                progressBarThree.setIndeterminate(true);
                progressBarThree.getIndeterminateDrawable().setColorFilter(
                        Color.BLUE, android.graphics.PorterDuff.Mode.SRC_IN);

                if (Status.PAUSED == PRDownloader.getStatus(downloadIdThree)) {
                    PRDownloader.resume(downloadIdThree);
                    return;
                }
                downloadIdThree = PRDownloader.download(URL1, dirPath, "instagram.apk")
                        .build()
                        .setOnStartOrResumeListener(new OnStartOrResumeListener() {
                            @Override
                            public void onStartOrResume() {
                                progressBarThree.setIndeterminate(false);
                                buttonThree.setEnabled(true);
                                buttonThree.setText("");
//                                buttonCancelThree.setEnabled(true);
//                                buttonCancelThree.setText("cancel");
                            }
                        })
                        .setOnPauseListener(new OnPauseListener() {
                            @Override
                            public void onPause() {
                                buttonThree.setText("");
                            }
                        })
                        .setOnCancelListener(new OnCancelListener() {
                            @Override
                            public void onCancel() {
                                downloadIdThree = 0;
                                buttonThree.setText("");
//                                buttonCancelThree.setEnabled(false);
                                progressBarThree.setProgress(0);
//                                textViewProgressThree.setText("");
                                progressBarThree.setIndeterminate(false);
                            }
                        })
                        .setOnProgressListener(new OnProgressListener() {
                            @Override
                            public void onProgress(Progress progress) {
                                long progressPercent = progress.currentBytes * 100 / progress.totalBytes;
                                progressBarThree.setProgress((int) progressPercent);
//                                textViewProgressThree.setText(Utils.getProgressDisplayLine(progress.currentBytes, progress.totalBytes));
                            }
                        })
                        .start(new OnDownloadListener() {
                            @Override
                            public void onDownloadComplete() {
                                buttonThree.setEnabled(false);
//                                buttonCancelThree.setEnabled(false);
                                buttonThree.setText("");
                            }

                            @Override
                            public void onError(Error error) {
                                buttonThree.setText("");
                                Toast.makeText(getApplicationContext(), "error" + " " + "3", Toast.LENGTH_SHORT).show();
//                                textViewProgressThree.setText("");
                                progressBarThree.setProgress(0);
                                downloadIdThree = 0;
//                                buttonCancelThree.setEnabled(false);
                                progressBarThree.setIndeterminate(false);
                                buttonThree.setEnabled(true);
                            }
                        });
                buttonThree.setBackgroundResource(R.drawable.ic_action_check_download);
            }
        });

        buttonCancelOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PRDownloader.cancel(downloadIdThree);
            }
        });

    }

    public void onClickListenerFour() {
        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Status.RUNNING == PRDownloader.getStatus(downloadIdFour)) {
                    PRDownloader.pause(downloadIdFour);
                    return;
                }

                buttonFour.setEnabled(false);
                progressBarFour.setIndeterminate(true);
                progressBarFour.getIndeterminateDrawable().setColorFilter(
                        Color.BLUE, android.graphics.PorterDuff.Mode.SRC_IN);

                if (Status.PAUSED == PRDownloader.getStatus(downloadIdFour)) {
                    PRDownloader.resume(downloadIdFour);
                    return;
                }
                downloadIdFour = PRDownloader.download(URL1, dirPath, "flashlight.apk")
                        .build()
                        .setOnStartOrResumeListener(new OnStartOrResumeListener() {
                            @Override
                            public void onStartOrResume() {
                                progressBarFour.setIndeterminate(false);
                                buttonFour.setEnabled(true);
                                buttonFour.setText("");
//                                buttonCancelFour.setEnabled(true);
//                                buttonCancelFour.setText(R.string.cancel);
                            }
                        })
                        .setOnPauseListener(new OnPauseListener() {
                            @Override
                            public void onPause() {
                                buttonFour.setText("");
                            }
                        })
                        .setOnCancelListener(new OnCancelListener() {
                            @Override
                            public void onCancel() {
                                downloadIdFour = 0;
                                buttonFour.setText("");
//                                buttonCancelFour.setEnabled(false);
                                progressBarFour.setProgress(0);
//                                textViewProgressFour.setText("");
                                progressBarFour.setIndeterminate(false);
                            }
                        })
                        .setOnProgressListener(new OnProgressListener() {
                            @Override
                            public void onProgress(Progress progress) {
                                long progressPercent = progress.currentBytes * 100 / progress.totalBytes;
                                progressBarFour.setProgress((int) progressPercent);
//                                textViewProgressFour.setText(Utils.getProgressDisplayLine(progress.currentBytes, progress.totalBytes));
                            }
                        })
                        .start(new OnDownloadListener() {
                            @Override
                            public void onDownloadComplete() {
                                buttonFour.setEnabled(false);
//                                buttonCancelFour.setEnabled(false);
                                buttonFour.setText("");
                            }

                            @Override
                            public void onError(Error error) {
                                buttonFour.setText("");
                                Toast.makeText(getApplicationContext(), "ERROR" + " " + "4", Toast.LENGTH_SHORT).show();
//                                textViewProgressFour.setText("");
                                progressBarFour.setProgress(0);
                                downloadIdFour = 0;
//                                buttonCancelFour.setEnabled(false);
                                progressBarFour.setIndeterminate(false);
                                buttonFour.setEnabled(true);
                            }
                        });
                buttonFour.setBackgroundResource(R.drawable.ic_action_check_download);
            }
        });

        buttonCancelOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PRDownloader.cancel(downloadIdFour);
            }
        });
    }

    /* function button download 1-4 */


    private void showVideo(){

        ///////// fake video show
        String filename = "videoplay";
        String filePlace = "android.resource://"+ getPackageName()+"/raw/"+filename;
        String filePath = "/storage/self/primary/Android/data/kasidit94.cskku.dev.thaisignlanguage/files/Video_Thai_Consonant/m044.mp4";
        videoView.setVideoURI(Uri.parse(filePath));
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

    private void onClickFavorite(){

        final DatabaseTSL databaseTSL = new DatabaseTSL(this);


        Favorite.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String favorite_sentences = ((TextView)view.findViewById(R.id.col_name)).getText().toString();
                int pushFavoriteInList=0;
//                long flag = databaseTSL.insertData(favorite_sentences);

//                Toast.makeText(context, name, Toast.LENGTH_SHORT).show();
                try {
                    // sent input to LexTo

                    String addData[] = databaseTSL.onCheckSentencs(favorite_sentences);
                    if (addData != null){
                        pushFavoriteInList = Integer.valueOf(addData[2]);
                        pushFavoriteInList += 1;

                        databaseTSL.onUpdateFavorite(pushFavoriteInList,favorite_sentences);
                        Log.d("Found Sentences",addData[0] + " - " + addData[1] +" - " + addData[2]);
                    }

                    else {
//                        Log.d("Messenger : ",addData[0]+addData[1]+addData[2]);

                        Log.d("Update",": Update Favorite Success !!");
                    }
                    Word(favorite_sentences);
                    Toast.makeText(context, "แสดงตัดคำ", Toast.LENGTH_SHORT).show();


                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }




    @Override
    public void onClick(View v) {

        String inSentence = textIn.getText().toString();
        final DatabaseTSL databaseTSL = new DatabaseTSL(this);

//        long flag = databaseTSL.insertData(inSentence);

        //Check Sentences

        int pushFavorite=0;

        switch (v.getId()){
            case R.id.btnTran:

                // LexTo ตัดคำ
                try {
                    String addData[] = databaseTSL.onCheckSentencs(inSentence);
                    if (addData != null){
                        pushFavorite = Integer.valueOf(addData[2]);
                        pushFavorite += 1;
                        databaseTSL.onUpdateFavorite(pushFavorite,inSentence);
                        Log.d("Found Sentences",addData[0] + " - " + addData[1] +" - " + addData[2]);
                    }

                    else {
//                        Log.d("Messenger : ",addData[0]+addData[1]+addData[2]);
                        databaseTSL.insertData(inSentence);
                        Log.d("Update",": Update Favorite Success !!");
                    }

                    // sent input to LexTo
                    Word(inSentence);
                    Toast.makeText(this, "แสดงตัดคำ", Toast.LENGTH_SHORT).show();

//                    if (flag > 0){
//                        Toast.makeText(getApplicationContext(), "Insert data Successfully", Toast.LENGTH_SHORT).show();
//                        Log.d("insert data ", "Success");
//
//
//                    }else {
//                        Toast.makeText(getApplicationContext(), "Insert Fail", Toast.LENGTH_SHORT).show();
//                        Log.d("Insert : ","FAIL !");
//                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                textIn.setText("");
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
    public ActivityMainTSL() throws IOException {

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
    public ActivityMainTSL(File dictFile) throws IOException {

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
        ActivityMainTSL tokenizer=new ActivityMainTSL(new File("/data/data/kasidit94.cskku.dev.thaisignlanguage/files/lexitron.txt"));
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
