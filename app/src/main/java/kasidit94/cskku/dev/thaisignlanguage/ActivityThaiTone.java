package kasidit94.cskku.dev.thaisignlanguage;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.VideoView;

public class ActivityThaiTone extends AppCompatActivity {


    LinearLayout buttonToneOne,buttonToneTwo,buttonToneThree,buttonToneFour;
    Dialog dialog1,dialog2,dialog3,dialog4;
    VideoView videoPOPUP;
    Button audioPlay, videoPlay, loopPlay;
    TextView textclose;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thai_tone);
        init();
        onClickButtonTones();
    }

    private void init(){

        buttonToneOne = (LinearLayout) findViewById(R.id.toneOne);
        buttonToneTwo = (LinearLayout) findViewById(R.id.toneTwo);
        buttonToneThree = (LinearLayout) findViewById(R.id.toneThree);
        buttonToneFour = (LinearLayout) findViewById(R.id.toneFour);

        dialog1 = new Dialog(this);
        dialog2 = new Dialog(this);
        dialog3 = new Dialog(this);
        dialog4 = new Dialog(this);

        textclose =(TextView) findViewById(R.id.textclose);

        audioPlay = (Button) findViewById(R.id.audio1);

        videoPlay = (Button) findViewById(R.id.video1);

        loopPlay =(Button) findViewById(R.id.loop1);

        videoPOPUP = (VideoView) findViewById(R.id.videoPopup);

    }

    private void onClickButtonTones(){


        /*
            Button One
                        */

        buttonToneOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog1 = new Dialog(ActivityThaiTone.this);
                dialog1.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog1.setContentView(R.layout.popup_video);

                textclose = (TextView) dialog1.findViewById(R.id.textclose);
                textclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog1.dismiss();
                    }
                });
                dialog1.show();



                dialog1.show();

                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog1.getWindow().getAttributes());
                dialog1.getWindow().setAttributes(lp);
                dialog1.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog1.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_mai_aek);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiTone.this,R.raw.s_maiaek);
                audioPlay.start();

                ActivityThaiTone.this.audioPlay = (Button) dialog1.findViewById(R.id.audio1);
                ActivityThaiTone.this.audioPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        audioPlay.start();
                    }
                });

                videoPlay = (Button) dialog1.findViewById(R.id.video1);
                videoPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                    }
                });

                loopPlay = (Button) dialog1.findViewById(R.id.loop1);
                loopPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                        audioPlay.start();

                    }
                });
            }
        });


         /*
            Button Two
                        */

        buttonToneTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog2 = new Dialog(ActivityThaiTone.this);
                dialog2.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog2.setContentView(R.layout.popup_video);
                textclose = (TextView) dialog2.findViewById(R.id.textclose);

                textclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog2.dismiss();
                    }
                });
                dialog2.show();



                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog2.getWindow().getAttributes());
                dialog2.getWindow().setAttributes(lp);
                dialog2.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog2.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_mai_to);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiTone.this,R.raw.s_maito);
                audioPlay.start();

                ActivityThaiTone.this.audioPlay = (Button) dialog2.findViewById(R.id.audio1);
                ActivityThaiTone.this.audioPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        audioPlay.start();
                    }
                });

                videoPlay = (Button) dialog2.findViewById(R.id.video1);
                videoPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                    }
                });

                loopPlay = (Button) dialog2.findViewById(R.id.loop1);
                loopPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                        audioPlay.start();

                    }
                });

            }
        });


        /*
            Button Three
                        */
        buttonToneThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog3 = new Dialog(ActivityThaiTone.this);
                dialog3.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog3.setContentView(R.layout.popup_video);
                textclose = (TextView) dialog3.findViewById(R.id.textclose);

                textclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog3.dismiss();
                    }
                });
                dialog3.show();
                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog3.getWindow().getAttributes());
                dialog3.getWindow().setAttributes(lp);
                dialog3.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog3.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_mai_to);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiTone.this,R.raw.s_maitee);
                audioPlay.start();

                ActivityThaiTone.this.audioPlay = (Button) dialog3.findViewById(R.id.audio1);
                ActivityThaiTone.this.audioPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        audioPlay.start();
                    }
                });

                videoPlay = (Button) dialog3.findViewById(R.id.video1);
                videoPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                    }
                });

                loopPlay = (Button) dialog3.findViewById(R.id.loop1);
                loopPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                        audioPlay.start();

                    }
                });
            }
        });

        /*
            Button Four
                        */

        buttonToneFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog4 = new Dialog(ActivityThaiTone.this);
                dialog4.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog4.setContentView(R.layout.popup_video);
                textclose = (TextView) dialog4.findViewById(R.id.textclose);

                textclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog4.dismiss();
                    }
                });
                dialog4.show();
                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog4.getWindow().getAttributes());
                dialog4.getWindow().setAttributes(lp);
                dialog4.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog4.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_mai_to);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiTone.this,R.raw.s_maijudtava);
                audioPlay.start();

                ActivityThaiTone.this.audioPlay = (Button) dialog4.findViewById(R.id.audio1);
                ActivityThaiTone.this.audioPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        audioPlay.start();
                    }
                });

                videoPlay = (Button) dialog4.findViewById(R.id.video1);
                videoPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                    }
                });

                loopPlay = (Button) dialog4.findViewById(R.id.loop1);
                loopPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                        audioPlay.start();

                    }
                });
            }
        });

    }
}
