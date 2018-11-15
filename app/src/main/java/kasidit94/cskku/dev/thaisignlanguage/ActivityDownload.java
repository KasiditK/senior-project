package kasidit94.cskku.dev.thaisignlanguage;


import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.downloader.Error;
import com.downloader.OnCancelListener;
import com.downloader.OnDownloadListener;
import com.downloader.OnPauseListener;
import com.downloader.OnProgressListener;
import com.downloader.OnStartOrResumeListener;
import com.downloader.PRDownloader;
import com.downloader.Progress;
import com.downloader.Status;

import org.w3c.dom.Text;

import kasidit94.cskku.dev.thaisignlanguage.unzip.Decompress;
import kasidit94.cskku.dev.thaisignlanguage.utils.Utils;


public class ActivityDownload extends AppCompatActivity {

        TextView textViewProgressCommunication;
        Button btnDownloadCommunication,btnDeleteCommunication;
        ProgressBar progressBarCommunication;

        int downloadIdOne,downloadIdTwo,downloadIdThree,downloadIdFour;

        private String dirDownloadPath,getDirUnzipPath;
        final String URL1 = "http://178.128.16.70/htdocs/01/Video_Thai_Consonant.zip";

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activiy_download);
            init();
            onClickListenerOne();
        }

        private void init(){

            dirDownloadPath = Utils.getRootDirPath(getApplicationContext());
            getDirUnzipPath = Utils.getRootDirPath(getApplicationContext())+"FileVideo";

            textViewProgressCommunication = (TextView) findViewById(R.id.textProgressCommunication);
            btnDownloadCommunication = (Button) findViewById(R.id.downloadCommunication);
            btnDeleteCommunication = (Button) findViewById(R.id.deleteCommunication);
            progressBarCommunication = (ProgressBar) findViewById(R.id.progressBarCommunication);
        }


       public void onClickListenerOne(){


            btnDownloadCommunication.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (Status.RUNNING == PRDownloader.getStatus(downloadIdOne)){
                    PRDownloader.pause(downloadIdOne);
                    return;
                }
                btnDownloadCommunication.setEnabled(false);
                progressBarCommunication.setIndeterminate(true);
                progressBarCommunication.getIndeterminateDrawable().setColorFilter(Color.BLACK, PorterDuff.Mode.SRC_IN);

                if (Status.PAUSED == PRDownloader.getStatus(downloadIdOne)){
                    PRDownloader.resume(downloadIdOne);
                    return;
                }

                downloadIdOne = PRDownloader.download(URL1, dirDownloadPath, "download.zip")
                        .build().setOnStartOrResumeListener(new OnStartOrResumeListener() {
                            @Override
                            public void onStartOrResume() {

                                progressBarCommunication.setIndeterminate(false);
                                btnDownloadCommunication.setEnabled(true);
                                btnDownloadCommunication.setText(""); //Pause
                            }
                        }).setOnPauseListener(new OnPauseListener() {
                            @Override
                            public void onPause() {
                                btnDownloadCommunication.setText("Resume");
                            }
                        }).setOnCancelListener(new OnCancelListener() {
                            @Override
                            public void onCancel() {
                                btnDownloadCommunication.setText("Start");
                                progressBarCommunication.setProgress(0);
                                textViewProgressCommunication.setText(" ");
                                downloadIdOne = 0;
                                progressBarCommunication.setIndeterminate(false);
                            }
                        }).setOnProgressListener(new OnProgressListener() {
                            @Override
                            public void onProgress(Progress progress) {
                                long progressPercent = progress.currentBytes * 100 / progress.totalBytes;
                                progressBarCommunication.setProgress((int) progressPercent);
                                textViewProgressCommunication.setText(Utils.getProgressDisplayLine(progress.currentBytes, progress.totalBytes));
                                progressBarCommunication.setIndeterminate(false);
                            }
                        }).start(new OnDownloadListener() {
                            @Override
                            public void onDownloadComplete() {
                                btnDownloadCommunication.setEnabled(false);
                                btnDownloadCommunication.setText(""); //complete
                                btnDownloadCommunication.setBackgroundResource(R.drawable.ic_action_check_download);

                                Toast.makeText(ActivityDownload.this, "Complete", Toast.LENGTH_SHORT).show();

                                Decompress unzip = new Decompress(dirDownloadPath+"/download.zip",dirDownloadPath);
                                if (unzip.unzip()){
                                    Toast.makeText(ActivityDownload.this, "Unzip Success", Toast.LENGTH_SHORT).show();
                                }else {
                                    Toast.makeText(ActivityDownload.this, "Unzip Fail", Toast.LENGTH_SHORT).show();
                                }

                            }

                            @Override
                            public void onError(Error error) {

                                btnDownloadCommunication.setText("Start");
                                Toast.makeText(ActivityDownload.this, "ERROR", Toast.LENGTH_SHORT).show();
                                textViewProgressCommunication.setText("");
                                progressBarCommunication.setProgress(0);
                                downloadIdOne = 0;
                                progressBarCommunication.setIndeterminate(false);
                                btnDownloadCommunication.setEnabled(true);

                            }
                        });
                btnDownloadCommunication.setBackgroundResource(R.drawable.ic_action_check_download);
            }
        });


    }
}
