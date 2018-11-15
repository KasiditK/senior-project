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

public class ActivityThaiConsonant extends AppCompatActivity {

    TextView textclose;
    Dialog dialog1,dialog2,dialog3,dialog4,dialog5,dialog6,dialog7,dialog8,dialog9,dialog10,dialog11
            ,dialog12,dialog13,dialog14,dialog15,dialog16,dialog17,dialog18,dialog19,dialog20,dialog21,dialog22
            ,dialog23,dialog24,dialog25,dialog26,dialog27,dialog28,dialog29,dialog30,dialog31,dialog32,dialog33
            ,dialog34,dialog35,dialog36,dialog37,dialog38,dialog39,dialog40,dialog41,dialog42;
    VideoView videoPOPUP;
    Button audioPlay, videoPlay, loopPlay;
    LinearLayout t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23
            ,t24,t25,t26,t27,t28,t29,t30,t31,t32,t33,t34,t35,t36,t37,t38,t39,t40,t41,t42;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thai_consonant);
        init();

        onClickButton();
    }

    public void init(){
        t1 = (LinearLayout) findViewById(R.id.conOne);
        t2 = (LinearLayout) findViewById(R.id.conTwo);
        t3 = (LinearLayout) findViewById(R.id.conThree);
        t4 = (LinearLayout) findViewById(R.id.conFour);
        t5 = (LinearLayout) findViewById(R.id.conFive);
        t6 = (LinearLayout) findViewById(R.id.conSix);
        t7 = (LinearLayout) findViewById(R.id.conSeven);
        t8 = (LinearLayout) findViewById(R.id.conEight);
        t9 = (LinearLayout) findViewById(R.id.conNine);
        t10 = (LinearLayout) findViewById(R.id.conTen);

        t11 = (LinearLayout) findViewById(R.id.conEleven);
        t12 = (LinearLayout) findViewById(R.id.conTwelve);
        t13 = (LinearLayout) findViewById(R.id.conThirteen);
        t14 = (LinearLayout) findViewById(R.id.conFourteen);
        t15 = (LinearLayout) findViewById(R.id.conFifteen);
        t16 = (LinearLayout) findViewById(R.id.conSixteen);
        t17 = (LinearLayout) findViewById(R.id.conSeventeen);
        t18 = (LinearLayout) findViewById(R.id.conEightteen);
        t19 = (LinearLayout) findViewById(R.id.conNineteen);
        t20 = (LinearLayout) findViewById(R.id.conTwenty);

        t21 = (LinearLayout) findViewById(R.id.conTwentyone);
        t22 = (LinearLayout) findViewById(R.id.conTwentytwo);
        t23 = (LinearLayout) findViewById(R.id.conTwentythree);
        t24 = (LinearLayout) findViewById(R.id.conTwentyfour);
        t25 = (LinearLayout) findViewById(R.id.conTwentyfive);
        t26 = (LinearLayout) findViewById(R.id.conTwentysix);
        t27 = (LinearLayout) findViewById(R.id.conTwentyseven);
        t28 = (LinearLayout) findViewById(R.id.conTwentyeight);
        t29 = (LinearLayout) findViewById(R.id.conTwentynine);
        t30 = (LinearLayout) findViewById(R.id.conThirty);

        t31 = (LinearLayout) findViewById(R.id.conThirtyone);
        t32 = (LinearLayout) findViewById(R.id.conThirtytwo);
        t33 = (LinearLayout) findViewById(R.id.conThirtythree);
        t34 = (LinearLayout) findViewById(R.id.conThirtyfour);
        t35 = (LinearLayout) findViewById(R.id.conThirtyfive);
        t36 = (LinearLayout) findViewById(R.id.conThirtysix);
        t37 = (LinearLayout) findViewById(R.id.conThirtyseven);
        t38 = (LinearLayout) findViewById(R.id.conThirtyeight);
        t39 = (LinearLayout) findViewById(R.id.conThirtynine);
        t40 = (LinearLayout) findViewById(R.id.conFourty);

        t41 = (LinearLayout) findViewById(R.id.conFourtyone);
        t42 = (LinearLayout) findViewById(R.id.conFourtytwo);

        textclose =(TextView) findViewById(R.id.textclose);

        dialog1 = new Dialog(this);
        dialog2 = new Dialog(this);
        dialog3 = new Dialog(this);
        dialog4 = new Dialog(this);
        dialog5 = new Dialog(this);
        dialog6 = new Dialog(this);
        dialog7 = new Dialog(this);
        dialog8 = new Dialog(this);
        dialog9 = new Dialog(this);
        dialog10 = new Dialog(this);
        dialog11 = new Dialog(this);
        dialog12 = new Dialog(this);
        dialog13 = new Dialog(this);
        dialog14 = new Dialog(this);
        dialog15 = new Dialog(this);
        dialog16 = new Dialog(this);
        dialog17 = new Dialog(this);
        dialog18 = new Dialog(this);
        dialog19 = new Dialog(this);
        dialog20 = new Dialog(this);
        dialog21 = new Dialog(this);
        dialog22 = new Dialog(this);
        dialog23 = new Dialog(this);
        dialog24 = new Dialog(this);
        dialog25 = new Dialog(this);
        dialog26 = new Dialog(this);
        dialog27 = new Dialog(this);
        dialog28 = new Dialog(this);
        dialog29 = new Dialog(this);
        dialog31 = new Dialog(this);
        dialog32 = new Dialog(this);
        dialog33 = new Dialog(this);
        dialog34 = new Dialog(this);
        dialog35 = new Dialog(this);
        dialog36 = new Dialog(this);
        dialog37 = new Dialog(this);
        dialog38 = new Dialog(this);
        dialog39 = new Dialog(this);
        dialog40 = new Dialog(this);
        dialog41 = new Dialog(this);
        dialog42 = new Dialog(this);



        audioPlay = (Button) findViewById(R.id.audio1);

        videoPlay = (Button) findViewById(R.id.video1);

        loopPlay =(Button) findViewById(R.id.loop1);

        videoPOPUP = (VideoView) findViewById(R.id.videoPopup);
    }

    public void onClickButton() {


        /*
            Button One
                        */

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog1 = new Dialog(ActivityThaiConsonant.this);
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

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiConsonant.this,R.raw.s_korkai);
                audioPlay.start();

                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog1.getWindow().getAttributes());
                dialog1.getWindow().setAttributes(lp);
                dialog1.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog1.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_korkai);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                ActivityThaiConsonant.this.audioPlay = (Button) dialog1.findViewById(R.id.audio1);
                ActivityThaiConsonant.this.audioPlay.setOnClickListener(new View.OnClickListener() {
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

        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog2 = new Dialog(ActivityThaiConsonant.this);
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
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_khorkhai);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiConsonant.this,R.raw.s_khorkhai);
                audioPlay.start();

                ActivityThaiConsonant.this.audioPlay = (Button) dialog2.findViewById(R.id.audio1);
                ActivityThaiConsonant.this.audioPlay.setOnClickListener(new View.OnClickListener() {
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
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog3 = new Dialog(ActivityThaiConsonant.this);
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
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_khor_kwai);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiConsonant.this,R.raw.s_khorkwai);
                audioPlay.start();

                ActivityThaiConsonant.this.audioPlay = (Button) dialog3.findViewById(R.id.audio1);
                ActivityThaiConsonant.this.audioPlay.setOnClickListener(new View.OnClickListener() {
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

        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog4 = new Dialog(ActivityThaiConsonant.this);
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
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_kor_ra_kang);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiConsonant.this,R.raw.s_korrakang);
                audioPlay.start();

                ActivityThaiConsonant.this.audioPlay = (Button) dialog4.findViewById(R.id.audio1);
                ActivityThaiConsonant.this.audioPlay.setOnClickListener(new View.OnClickListener() {
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

        /*
            Button Five
                        */

        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog5 = new Dialog(ActivityThaiConsonant.this);
                dialog5.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog5.setContentView(R.layout.popup_video);
                textclose = (TextView) dialog5.findViewById(R.id.textclose);

                textclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog5.dismiss();
                    }
                });
                dialog5.show();
                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog5.getWindow().getAttributes());
                dialog5.getWindow().setAttributes(lp);
                dialog5.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog5.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_tortao);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiConsonant.this,R.raw.s_tortao);
                audioPlay.start();

                ActivityThaiConsonant.this.audioPlay = (Button) dialog5.findViewById(R.id.audio1);
                ActivityThaiConsonant.this.audioPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        audioPlay.start();
                    }
                });

                videoPlay = (Button) dialog5.findViewById(R.id.video1);
                videoPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                    }
                });

                loopPlay = (Button) dialog5.findViewById(R.id.loop1);
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
            Button Six
                        */

        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog6 = new Dialog(ActivityThaiConsonant.this);
                dialog6.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog6.setContentView(R.layout.popup_video);
                textclose = (TextView) dialog6.findViewById(R.id.textclose);

                textclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog6.dismiss();
                    }
                });
                dialog6.show();
                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog6.getWindow().getAttributes());
                dialog6.getWindow().setAttributes(lp);
                dialog6.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog6.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_tor_tung);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiConsonant.this,R.raw.s_tortung);
                audioPlay.start();

                ActivityThaiConsonant.this.audioPlay = (Button) dialog6.findViewById(R.id.audio1);
                ActivityThaiConsonant.this.audioPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        audioPlay.start();
                    }
                });

                videoPlay = (Button) dialog6.findViewById(R.id.video1);
                videoPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                    }
                });

                loopPlay = (Button) dialog6.findViewById(R.id.loop1);
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
            Button Seven
                        */

        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog7 = new Dialog(ActivityThaiConsonant.this);
                dialog7.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog7.setContentView(R.layout.popup_video);
                textclose = (TextView) dialog7.findViewById(R.id.textclose);

                textclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog7.dismiss();
                    }
                });
                dialog7.show();
                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog7.getWindow().getAttributes());
                dialog7.getWindow().setAttributes(lp);
                dialog7.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog7.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_tor_tan);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiConsonant.this,R.raw.s_tortan);
                audioPlay.start();

                ActivityThaiConsonant.this.audioPlay = (Button) dialog7.findViewById(R.id.audio1);
                ActivityThaiConsonant.this.audioPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        audioPlay.start();
                    }
                });

                videoPlay = (Button) dialog7.findViewById(R.id.video1);
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
            Button Eight
                        */


        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog8 = new Dialog(ActivityThaiConsonant.this);
                dialog8.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog8.setContentView(R.layout.popup_video);
                textclose = (TextView) dialog8.findViewById(R.id.textclose);

                textclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog8.dismiss();
                    }
                });
                dialog8.show();
                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog1.getWindow().getAttributes());
                dialog8.getWindow().setAttributes(lp);
                dialog8.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog8.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_torpu_tao);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiConsonant.this,R.raw.s_torputao);
                audioPlay.start();

                ActivityThaiConsonant.this.audioPlay = (Button) dialog8.findViewById(R.id.audio1);
                ActivityThaiConsonant.this.audioPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        audioPlay.start();
                    }
                });

                videoPlay = (Button) dialog8.findViewById(R.id.video1);
                videoPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                    }
                });

                loopPlay = (Button) dialog8.findViewById(R.id.loop1);
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
            Button Nine
                        */


        t9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog9 = new Dialog(ActivityThaiConsonant.this);
                dialog9.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog9.setContentView(R.layout.popup_video);
                textclose = (TextView) dialog9.findViewById(R.id.textclose);

                textclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog9.dismiss();
                    }
                });
                dialog9.show();
                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog9.getWindow().getAttributes());
                dialog9.getWindow().setAttributes(lp);
                dialog9.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog9.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_tor_nang);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiConsonant.this,R.raw.s_tornang);
                audioPlay.start();

                ActivityThaiConsonant.this.audioPlay = (Button) dialog9.findViewById(R.id.audio1);
                ActivityThaiConsonant.this.audioPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        audioPlay.start();
                    }
                });

                videoPlay = (Button) dialog9.findViewById(R.id.video1);
                videoPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                    }
                });

                loopPlay = (Button) dialog9.findViewById(R.id.loop1);
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
            Button Ten
                        */


        t10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog10 = new Dialog(ActivityThaiConsonant.this);
                dialog10.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog10.setContentView(R.layout.popup_video);
                textclose = (TextView) dialog10.findViewById(R.id.textclose);

                textclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog10.dismiss();
                    }
                });
                dialog10.show();
                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog10.getWindow().getAttributes());
                dialog10.getWindow().setAttributes(lp);
                dialog10.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog10.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_torpa_tuk);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiConsonant.this,R.raw.s_torpatuk);
                audioPlay.start();

                ActivityThaiConsonant.this.audioPlay = (Button) dialog10.findViewById(R.id.audio1);
                ActivityThaiConsonant.this.audioPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        audioPlay.start();
                    }
                });

                videoPlay = (Button) dialog10.findViewById(R.id.video1);
                videoPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                    }
                });

                loopPlay = (Button) dialog10.findViewById(R.id.loop1);
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
            Button elven
                        */
        
        t11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog11 = new Dialog(ActivityThaiConsonant.this);
                dialog11.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog11.setContentView(R.layout.popup_video);
                textclose = (TextView) dialog11.findViewById(R.id.textclose);

                textclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog11.dismiss();
                    }
                });
                dialog11.show();
                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog11.getWindow().getAttributes());
                dialog11.getWindow().setAttributes(lp);
                dialog11.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog11.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_sor_sua);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiConsonant.this,R.raw.s_sorsua);
                audioPlay.start();

                ActivityThaiConsonant.this.audioPlay = (Button) dialog11.findViewById(R.id.audio1);
                ActivityThaiConsonant.this.audioPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        audioPlay.start();
                    }
                });

                videoPlay = (Button) dialog11.findViewById(R.id.video1);
                videoPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                    }
                });

                loopPlay = (Button) dialog11.findViewById(R.id.loop1);
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
            Button Twelve
                        */

        t12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog12 = new Dialog(ActivityThaiConsonant.this);
                dialog12.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog12.setContentView(R.layout.popup_video);
                textclose = (TextView) dialog12.findViewById(R.id.textclose);

                textclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog12.dismiss();
                    }
                });
                dialog12.show();
                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog12.getWindow().getAttributes());
                dialog12.getWindow().setAttributes(lp);
                dialog12.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog12.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_sorsa_ra);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiConsonant.this,R.raw.s_sorsara);
                audioPlay.start();

                ActivityThaiConsonant.this.audioPlay = (Button) dialog12.findViewById(R.id.audio1);
                ActivityThaiConsonant.this.audioPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        audioPlay.start();
                    }
                });

                videoPlay = (Button) dialog12.findViewById(R.id.video1);
                videoPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                    }
                });

                loopPlay = (Button) dialog12.findViewById(R.id.loop1);
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
            Button Thirteen
                        */

        t13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog13 = new Dialog(ActivityThaiConsonant.this);
                dialog13.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog13.setContentView(R.layout.popup_video);
                textclose = (TextView) dialog13.findViewById(R.id.textclose);

                textclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog13.dismiss();
                    }
                });
                dialog13.show();
                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog13.getWindow().getAttributes());
                dialog13.getWindow().setAttributes(lp);
                dialog13.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog13.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_sorborru_si);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiConsonant.this,R.raw.s_sorborrusi);
                audioPlay.start();

                ActivityThaiConsonant.this.audioPlay = (Button) dialog13.findViewById(R.id.audio1);
                ActivityThaiConsonant.this.audioPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        audioPlay.start();
                    }
                });

                videoPlay = (Button) dialog13.findViewById(R.id.video1);
                videoPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                    }
                });

                loopPlay = (Button) dialog13.findViewById(R.id.loop1);
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
            Button Fourteen
                        */

        t14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog14 = new Dialog(ActivityThaiConsonant.this);
                dialog14.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog14.setContentView(R.layout.popup_video);
                textclose = (TextView) dialog14.findViewById(R.id.textclose);

                textclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog14.dismiss();
                    }
                });
                dialog14.show();
                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog14.getWindow().getAttributes());
                dialog14.getWindow().setAttributes(lp);
                dialog14.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog14.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_sor_soul);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiConsonant.this,R.raw.s_sorsoul_);
                audioPlay.start();

                ActivityThaiConsonant.this.audioPlay = (Button) dialog14.findViewById(R.id.audio1);
                ActivityThaiConsonant.this.audioPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        audioPlay.start();
                    }
                });

                videoPlay = (Button) dialog14.findViewById(R.id.video1);
                videoPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                    }
                });

                loopPlay = (Button) dialog14.findViewById(R.id.loop1);
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
            Button Fifteen
                        */

        t15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog15 = new Dialog(ActivityThaiConsonant.this);
                dialog15.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog15.setContentView(R.layout.popup_video);
                textclose = (TextView) dialog15.findViewById(R.id.textclose);

                textclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog15.dismiss();
                    }
                });
                dialog15.show();
                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog15.getWindow().getAttributes());
                dialog15.getWindow().setAttributes(lp);
                dialog15.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog15.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_por_pan);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiConsonant.this,R.raw.s_porpan);
                audioPlay.start();

                ActivityThaiConsonant.this.audioPlay = (Button) dialog15.findViewById(R.id.audio1);
                ActivityThaiConsonant.this.audioPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        audioPlay.start();
                    }
                });

                videoPlay = (Button) dialog15.findViewById(R.id.video1);
                videoPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                    }
                });

                loopPlay = (Button) dialog15.findViewById(R.id.loop1);
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
            Button Sixteen
                        */

        t16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog16 = new Dialog(ActivityThaiConsonant.this);
                dialog16.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog16.setContentView(R.layout.popup_video);
                textclose = (TextView) dialog16.findViewById(R.id.textclose);

                textclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog16.dismiss();
                    }
                });
                dialog16.show();
                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog16.getWindow().getAttributes());
                dialog16.getWindow().setAttributes(lp);
                dialog16.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog16.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_por_pa);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiConsonant.this,R.raw.s_porpa);
                audioPlay.start();

                ActivityThaiConsonant.this.audioPlay = (Button) dialog16.findViewById(R.id.audio1);
                ActivityThaiConsonant.this.audioPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        audioPlay.start();
                    }
                });

                videoPlay = (Button) dialog16.findViewById(R.id.video1);
                videoPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                    }
                });

                loopPlay = (Button) dialog16.findViewById(R.id.loop1);
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
            Button Seventeen
                        */

        t17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog17 = new Dialog(ActivityThaiConsonant.this);
                dialog17.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog17.setContentView(R.layout.popup_video);
                textclose = (TextView) dialog17.findViewById(R.id.textclose);

                textclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog17.dismiss();
                    }
                });
                dialog17.show();
                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog17.getWindow().getAttributes());
                dialog17.getWindow().setAttributes(lp);
                dialog17.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog17.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_por_pung);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiConsonant.this,R.raw.s_porpung);
                audioPlay.start();

                ActivityThaiConsonant.this.audioPlay = (Button) dialog17.findViewById(R.id.audio1);
                ActivityThaiConsonant.this.audioPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        audioPlay.start();
                    }
                });

                videoPlay = (Button) dialog17.findViewById(R.id.video1);
                videoPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                    }
                });

                loopPlay = (Button) dialog17.findViewById(R.id.loop1);
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
            Button Eightteen
                        */

        t18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog18 = new Dialog(ActivityThaiConsonant.this);
                dialog18.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog18.setContentView(R.layout.popup_video);
                textclose = (TextView) dialog18.findViewById(R.id.textclose);

                textclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog18.dismiss();
                    }
                });
                dialog18.show();
                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog18.getWindow().getAttributes());
                dialog18.getWindow().setAttributes(lp);
                dialog18.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog18.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_pro_sumpao);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiConsonant.this,R.raw.s_prosumpao);
                audioPlay.start();

                ActivityThaiConsonant.this.audioPlay = (Button) dialog18.findViewById(R.id.audio1);
                ActivityThaiConsonant.this.audioPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        audioPlay.start();
                    }
                });

                videoPlay = (Button) dialog18.findViewById(R.id.video1);
                videoPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                    }
                });

                loopPlay = (Button) dialog18.findViewById(R.id.loop1);
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
            Button Nineteen
                        */

        t19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog19 = new Dialog(ActivityThaiConsonant.this);
                dialog19.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog19.setContentView(R.layout.popup_video);
                textclose = (TextView) dialog19.findViewById(R.id.textclose);

                textclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog19.dismiss();
                    }
                });
                dialog19.show();
                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog19.getWindow().getAttributes());
                dialog19.getWindow().setAttributes(lp);
                dialog19.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog19.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_horhib);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiConsonant.this,R.raw.s_horhib);
                audioPlay.start();

                ActivityThaiConsonant.this.audioPlay = (Button) dialog19.findViewById(R.id.audio1);
                ActivityThaiConsonant.this.audioPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        audioPlay.start();
                    }
                });

                videoPlay = (Button) dialog19.findViewById(R.id.video1);
                videoPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                    }
                });

                loopPlay = (Button) dialog19.findViewById(R.id.loop1);
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
            Button Twenty
                        */

        t20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog20 = new Dialog(ActivityThaiConsonant.this);
                dialog20.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog20.setContentView(R.layout.popup_video);
                textclose = (TextView) dialog20.findViewById(R.id.textclose);

                textclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog20.dismiss();
                    }
                });
                dialog20.show();
                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog20.getWindow().getAttributes());
                dialog20.getWindow().setAttributes(lp);
                dialog20.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog20.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_hornokhook);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiConsonant.this,R.raw.s_hornokhook);
                audioPlay.start();

                ActivityThaiConsonant.this.audioPlay = (Button) dialog20.findViewById(R.id.audio1);
                ActivityThaiConsonant.this.audioPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        audioPlay.start();
                    }
                });

                videoPlay = (Button) dialog20.findViewById(R.id.video1);
                videoPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                    }
                });

                loopPlay = (Button) dialog20.findViewById(R.id.loop1);
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
            Button Ten
                        */

        t21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog21 = new Dialog(ActivityThaiConsonant.this);
                dialog21.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog21.setContentView(R.layout.popup_video);
                textclose = (TextView) dialog21.findViewById(R.id.textclose);

                textclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog21.dismiss();
                    }
                });
                dialog21.show();
                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog21.getWindow().getAttributes());
                dialog21.getWindow().setAttributes(lp);
                dialog21.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog21.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_borbaimai);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiConsonant.this,R.raw.s_borbaimai);
                audioPlay.start();

                ActivityThaiConsonant.this.audioPlay = (Button) dialog21.findViewById(R.id.audio1);
                ActivityThaiConsonant.this.audioPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        audioPlay.start();
                    }
                });

                videoPlay = (Button) dialog21.findViewById(R.id.video1);
                videoPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                    }
                });

                loopPlay = (Button) dialog21.findViewById(R.id.loop1);
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
            Button Twentytwo
                        */

        t22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog22 = new Dialog(ActivityThaiConsonant.this);
                dialog22.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog22.setContentView(R.layout.popup_video);
                textclose = (TextView) dialog22.findViewById(R.id.textclose);

                textclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog22.dismiss();
                    }
                });
                dialog22.show();
                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog22.getWindow().getAttributes());
                dialog22.getWindow().setAttributes(lp);
                dialog22.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog22.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_rorrua);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiConsonant.this,R.raw.s_rorrua);
                audioPlay.start();

                ActivityThaiConsonant.this.audioPlay = (Button) dialog22.findViewById(R.id.audio1);
                ActivityThaiConsonant.this.audioPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        audioPlay.start();
                    }
                });

                videoPlay = (Button) dialog22.findViewById(R.id.video1);
                videoPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                    }
                });

                loopPlay = (Button) dialog22.findViewById(R.id.loop1);
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
            Button Twentythree
                        */

        t23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog23 = new Dialog(ActivityThaiConsonant.this);
                dialog23.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog23.setContentView(R.layout.popup_video);
                textclose = (TextView) dialog23.findViewById(R.id.textclose);

                textclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog23.dismiss();
                    }
                });
                dialog23.show();
                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog23.getWindow().getAttributes());
                dialog23.getWindow().setAttributes(lp);
                dialog23.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog23.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_vorvan);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiConsonant.this,R.raw.s_vorvan);
                audioPlay.start();

                ActivityThaiConsonant.this.audioPlay = (Button) dialog23.findViewById(R.id.audio1);
                ActivityThaiConsonant.this.audioPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        audioPlay.start();
                    }
                });

                videoPlay = (Button) dialog23.findViewById(R.id.video1);
                videoPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                    }
                });

                loopPlay = (Button) dialog23.findViewById(R.id.loop1);
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
            Button Twentyfour
                        */

        t24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog24 = new Dialog(ActivityThaiConsonant.this);
                dialog24.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog24.setContentView(R.layout.popup_video);
                textclose = (TextView) dialog24.findViewById(R.id.textclose);

                textclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog24.dismiss();
                    }
                });
                dialog24.show();
                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog24.getWindow().getAttributes());
                dialog24.getWindow().setAttributes(lp);
                dialog24.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog24.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_dordek);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiConsonant.this,R.raw.s_dordek);
                audioPlay.start();

                ActivityThaiConsonant.this.audioPlay = (Button) dialog24.findViewById(R.id.audio1);
                ActivityThaiConsonant.this.audioPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        audioPlay.start();
                    }
                });

                videoPlay = (Button) dialog24.findViewById(R.id.video1);
                videoPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                    }
                });

                loopPlay = (Button) dialog24.findViewById(R.id.loop1);
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
            Button Twenty five
                        */

        t25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog25 = new Dialog(ActivityThaiConsonant.this);
                dialog25.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog25.setContentView(R.layout.popup_video);
                textclose = (TextView) dialog25.findViewById(R.id.textclose);

                textclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog25.dismiss();
                    }
                });
                dialog25.show();
                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog25.getWindow().getAttributes());
                dialog25.getWindow().setAttributes(lp);
                dialog25.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog25.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_dorchada);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiConsonant.this,R.raw.s_dorchada);
                audioPlay.start();

                ActivityThaiConsonant.this.audioPlay = (Button) dialog25.findViewById(R.id.audio1);
                ActivityThaiConsonant.this.audioPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        audioPlay.start();
                    }
                });

                videoPlay = (Button) dialog25.findViewById(R.id.video1);
                videoPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                    }
                });

                loopPlay = (Button) dialog25.findViewById(R.id.loop1);
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
            Button Twentysix
                        */

        t26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog26 = new Dialog(ActivityThaiConsonant.this);
                dialog26.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog26.setContentView(R.layout.popup_video);
                textclose = (TextView) dialog26.findViewById(R.id.textclose);

                textclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog26.dismiss();
                    }
                });
                dialog26.show();
                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog26.getWindow().getAttributes());
                dialog26.getWindow().setAttributes(lp);
                dialog26.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog26.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_forfan);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiConsonant.this,R.raw.s_forfan);
                audioPlay.start();

                ActivityThaiConsonant.this.audioPlay = (Button) dialog26.findViewById(R.id.audio1);
                ActivityThaiConsonant.this.audioPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        audioPlay.start();
                    }
                });

                videoPlay = (Button) dialog26.findViewById(R.id.video1);
                videoPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                    }
                });

                loopPlay = (Button) dialog26.findViewById(R.id.loop1);
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
            Button Twentyseven
                        */

        t27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog27 = new Dialog(ActivityThaiConsonant.this);
                dialog27.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog27.setContentView(R.layout.popup_video);
                textclose = (TextView) dialog27.findViewById(R.id.textclose);

                textclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog27.dismiss();
                    }
                });
                dialog27.show();
                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog27.getWindow().getAttributes());
                dialog27.getWindow().setAttributes(lp);
                dialog27.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog27.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_forfa);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiConsonant.this,R.raw.s_forfa);
                audioPlay.start();

                ActivityThaiConsonant.this.audioPlay = (Button) dialog27.findViewById(R.id.audio1);
                ActivityThaiConsonant.this.audioPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        audioPlay.start();
                    }
                });

                videoPlay = (Button) dialog27.findViewById(R.id.video1);
                videoPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                    }
                });

                loopPlay = (Button) dialog27.findViewById(R.id.loop1);
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
            Button Twentyeight
                        */

        t28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog28 = new Dialog(ActivityThaiConsonant.this);
                dialog28.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog28.setContentView(R.layout.popup_video);
                textclose = (TextView) dialog28.findViewById(R.id.textclose);

                textclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog28.dismiss();
                    }
                });
                dialog28.show();
                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog28.getWindow().getAttributes());
                dialog28.getWindow().setAttributes(lp);
                dialog28.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog28.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_rorring);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiConsonant.this,R.raw.s_rorring);
                audioPlay.start();

                ActivityThaiConsonant.this.audioPlay = (Button) dialog28.findViewById(R.id.audio1);
                ActivityThaiConsonant.this.audioPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        audioPlay.start();
                    }
                });

                videoPlay = (Button) dialog28.findViewById(R.id.video1);
                videoPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                    }
                });

                loopPlay = (Button) dialog28.findViewById(R.id.loop1);
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
            Button Twentynine
                        */

        t29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog29 = new Dialog(ActivityThaiConsonant.this);
                dialog29.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog29.setContentView(R.layout.popup_video);
                textclose = (TextView) dialog29.findViewById(R.id.textclose);

                textclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog29.dismiss();
                    }
                });
                dialog29.show();
                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog29.getWindow().getAttributes());
                dialog29.getWindow().setAttributes(lp);
                dialog29.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog29.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_rorjura);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiConsonant.this,R.raw.s_rorjura);
                audioPlay.start();

                ActivityThaiConsonant.this.audioPlay = (Button) dialog29.findViewById(R.id.audio1);
                ActivityThaiConsonant.this.audioPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        audioPlay.start();
                    }
                });

                videoPlay = (Button) dialog29.findViewById(R.id.video1);
                videoPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                    }
                });

                loopPlay = (Button) dialog29.findViewById(R.id.loop1);
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
            Button Thirty
                        */

        t30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog30 = new Dialog(ActivityThaiConsonant.this);
                dialog30.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog30.setContentView(R.layout.popup_video);
                textclose = (TextView) dialog30.findViewById(R.id.textclose);

                textclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog30.dismiss();
                    }
                });
                dialog30.show();
                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog30.getWindow().getAttributes());
                dialog30.getWindow().setAttributes(lp);
                dialog30.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog30.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_jorjan);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiConsonant.this,R.raw.s_jorjan);
                audioPlay.start();

                ActivityThaiConsonant.this.audioPlay = (Button) dialog30.findViewById(R.id.audio1);
                ActivityThaiConsonant.this.audioPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        audioPlay.start();
                    }
                });

                videoPlay = (Button) dialog30.findViewById(R.id.video1);
                videoPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                    }
                });

                loopPlay = (Button) dialog30.findViewById(R.id.loop1);
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
            Button Thirtyone
                        */

        t31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog31 = new Dialog(ActivityThaiConsonant.this);
                dialog31.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog31.setContentView(R.layout.popup_video);
                textclose = (TextView) dialog31.findViewById(R.id.textclose);

                textclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog31.dismiss();
                    }
                });
                dialog31.show();
                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog31.getWindow().getAttributes());
                dialog31.getWindow().setAttributes(lp);
                dialog31.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog31.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_yoryak);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiConsonant.this,R.raw.s_yoryak);
                audioPlay.start();

                ActivityThaiConsonant.this.audioPlay = (Button) dialog31.findViewById(R.id.audio1);
                ActivityThaiConsonant.this.audioPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        audioPlay.start();
                    }
                });

                videoPlay = (Button) dialog31.findViewById(R.id.video1);
                videoPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                    }
                });

                loopPlay = (Button) dialog31.findViewById(R.id.loop1);
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
            Button Thirtytwo
                        */

        t32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog32 = new Dialog(ActivityThaiConsonant.this);
                dialog32.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog32.setContentView(R.layout.popup_video);
                textclose = (TextView) dialog32.findViewById(R.id.textclose);

                textclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog32.dismiss();
                    }
                });
                dialog32.show();
                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog32.getWindow().getAttributes());
                dialog32.getWindow().setAttributes(lp);
                dialog32.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog32.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_yorying);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiConsonant.this,R.raw.s_yorying);
                audioPlay.start();

                ActivityThaiConsonant.this.audioPlay = (Button) dialog32.findViewById(R.id.audio1);
                ActivityThaiConsonant.this.audioPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        audioPlay.start();
                    }
                });

                videoPlay = (Button) dialog32.findViewById(R.id.video1);
                videoPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                    }
                });

                loopPlay = (Button) dialog32.findViewById(R.id.loop1);
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
            Button Ten
                        */

        t33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog33 = new Dialog(ActivityThaiConsonant.this);
                dialog33.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog33.setContentView(R.layout.popup_video);
                textclose = (TextView) dialog33.findViewById(R.id.textclose);

                textclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog33.dismiss();
                    }
                });
                dialog33.show();
                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog33.getWindow().getAttributes());
                dialog33.getWindow().setAttributes(lp);
                dialog33.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog33.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_morma);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiConsonant.this,R.raw.s_morma);
                audioPlay.start();

                ActivityThaiConsonant.this.audioPlay = (Button) dialog33.findViewById(R.id.audio1);
                ActivityThaiConsonant.this.audioPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        audioPlay.start();
                    }
                });

                videoPlay = (Button) dialog33.findViewById(R.id.video1);
                videoPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                    }
                });

                loopPlay = (Button) dialog33.findViewById(R.id.loop1);
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
            Button Thirtyfour
                        */

        t34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog34 = new Dialog(ActivityThaiConsonant.this);
                dialog34.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog34.setContentView(R.layout.popup_video);
                textclose = (TextView) dialog34.findViewById(R.id.textclose);

                textclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog34.dismiss();
                    }
                });
                dialog34.show();
                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog34.getWindow().getAttributes());
                dialog34.getWindow().setAttributes(lp);
                dialog34.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog34.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_nornoo);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiConsonant.this,R.raw.s_nornoo);
                audioPlay.start();

                ActivityThaiConsonant.this.audioPlay = (Button) dialog34.findViewById(R.id.audio1);
                ActivityThaiConsonant.this.audioPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        audioPlay.start();
                    }
                });

                videoPlay = (Button) dialog34.findViewById(R.id.video1);
                videoPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                    }
                });

                loopPlay = (Button) dialog34.findViewById(R.id.loop1);
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
            Button Thirtyfive
                        */

        t35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog35 = new Dialog(ActivityThaiConsonant.this);
                dialog35.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog35.setContentView(R.layout.popup_video);
                textclose = (TextView) dialog35.findViewById(R.id.textclose);

                textclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog35.dismiss();
                    }
                });
                dialog35.show();
                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog35.getWindow().getAttributes());
                dialog35.getWindow().setAttributes(lp);
                dialog35.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog35.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_nornean);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiConsonant.this,R.raw.s_nornean);
                audioPlay.start();

                ActivityThaiConsonant.this.audioPlay = (Button) dialog35.findViewById(R.id.audio1);
                ActivityThaiConsonant.this.audioPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        audioPlay.start();
                    }
                });

                videoPlay = (Button) dialog35.findViewById(R.id.video1);
                videoPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                    }
                });

                loopPlay = (Button) dialog35.findViewById(R.id.loop1);
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
            Button Thirtysix
                        */

        t36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog36 = new Dialog(ActivityThaiConsonant.this);
                dialog36.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog36.setContentView(R.layout.popup_video);
                textclose = (TextView) dialog36.findViewById(R.id.textclose);

                textclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog36.dismiss();
                    }
                });
                dialog36.show();
                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog36.getWindow().getAttributes());
                dialog36.getWindow().setAttributes(lp);
                dialog36.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog36.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_ngorngu);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiConsonant.this,R.raw.s_ngorngu);
                audioPlay.start();

                ActivityThaiConsonant.this.audioPlay = (Button) dialog36.findViewById(R.id.audio1);
                ActivityThaiConsonant.this.audioPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        audioPlay.start();
                    }
                });

                videoPlay = (Button) dialog36.findViewById(R.id.video1);
                videoPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                    }
                });

                loopPlay = (Button) dialog36.findViewById(R.id.loop1);
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
            Button Thirtyseven
                        */

        t37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog37 = new Dialog(ActivityThaiConsonant.this);
                dialog37.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog37.setContentView(R.layout.popup_video);
                textclose = (TextView) dialog37.findViewById(R.id.textclose);

                textclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog37.dismiss();
                    }
                });
                dialog37.show();
                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog37.getWindow().getAttributes());
                dialog37.getWindow().setAttributes(lp);
                dialog37.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog37.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_tortahan);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiConsonant.this,R.raw.s_tortahan);
                audioPlay.start();

                ActivityThaiConsonant.this.audioPlay = (Button) dialog37.findViewById(R.id.audio1);
                ActivityThaiConsonant.this.audioPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        audioPlay.start();
                    }
                });

                videoPlay = (Button) dialog37.findViewById(R.id.video1);
                videoPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                    }
                });

                loopPlay = (Button) dialog37.findViewById(R.id.loop1);
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
            Button Thirtyeight
                        */

        t38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog38 = new Dialog(ActivityThaiConsonant.this);
                dialog38.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog38.setContentView(R.layout.popup_video);
                textclose = (TextView) dialog38.findViewById(R.id.textclose);

                textclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog38.dismiss();
                    }
                });
                dialog38.show();
                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog38.getWindow().getAttributes());
                dialog38.getWindow().setAttributes(lp);
                dialog38.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog38.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_tor_tong);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiConsonant.this,R.raw.s_tortao);
                audioPlay.start();

                ActivityThaiConsonant.this.audioPlay = (Button) dialog38.findViewById(R.id.audio1);
                ActivityThaiConsonant.this.audioPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        audioPlay.start();
                    }
                });

                videoPlay = (Button) dialog38.findViewById(R.id.video1);
                videoPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                    }
                });

                loopPlay = (Button) dialog38.findViewById(R.id.loop1);
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
            Button Thirtynine
                        */

        t39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog39 = new Dialog(ActivityThaiConsonant.this);
                dialog39.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog39.setContentView(R.layout.popup_video);
                textclose = (TextView) dialog39.findViewById(R.id.textclose);

                textclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog39.dismiss();
                    }
                });
                dialog39.show();
                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog39.getWindow().getAttributes());
                dialog39.getWindow().setAttributes(lp);
                dialog39.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog39.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_chorching);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiConsonant.this,R.raw.s_chorching);
                audioPlay.start();

                ActivityThaiConsonant.this.audioPlay = (Button) dialog39.findViewById(R.id.audio1);
                ActivityThaiConsonant.this.audioPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        audioPlay.start();
                    }
                });

                videoPlay = (Button) dialog39.findViewById(R.id.video1);
                videoPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                    }
                });

                loopPlay = (Button) dialog39.findViewById(R.id.loop1);
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
            Button Fourty
                        */

        t40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog40 = new Dialog(ActivityThaiConsonant.this);
                dialog40.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog40.setContentView(R.layout.popup_video);
                textclose = (TextView) dialog40.findViewById(R.id.textclose);

                textclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog40.dismiss();
                    }
                });
                dialog40.show();
                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog40.getWindow().getAttributes());
                dialog40.getWindow().setAttributes(lp);
                dialog40.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog40.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_chorchang);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiConsonant.this,R.raw.s_chorchang);
                audioPlay.start();

                ActivityThaiConsonant.this.audioPlay = (Button) dialog40.findViewById(R.id.audio1);
                ActivityThaiConsonant.this.audioPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        audioPlay.start();
                    }
                });

                videoPlay = (Button) dialog40.findViewById(R.id.video1);
                videoPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                    }
                });

                loopPlay = (Button) dialog40.findViewById(R.id.loop1);
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
            Button Fourtyone
                        */

        t41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog41 = new Dialog(ActivityThaiConsonant.this);
                dialog41.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog41.setContentView(R.layout.popup_video);
                textclose = (TextView) dialog41.findViewById(R.id.textclose);

                textclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog41.dismiss();
                    }
                });
                dialog41.show();
                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog41.getWindow().getAttributes());
                dialog41.getWindow().setAttributes(lp);
                dialog41.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog41.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_chorkacher);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiConsonant.this,R.raw.s_chorkacher);
                audioPlay.start();

                ActivityThaiConsonant.this.audioPlay = (Button) dialog41.findViewById(R.id.audio1);
                ActivityThaiConsonant.this.audioPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        audioPlay.start();
                    }
                });

                videoPlay = (Button) dialog41.findViewById(R.id.video1);
                videoPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                    }
                });

                loopPlay = (Button) dialog41.findViewById(R.id.loop1);
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
            Button Ten
                        */

        t42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog42 = new Dialog(ActivityThaiConsonant.this);
                dialog42.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog42.setContentView(R.layout.popup_video);
                textclose = (TextView) dialog42.findViewById(R.id.textclose);

                textclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog42.dismiss();
                    }
                });
                dialog42.show();
                WindowManager.LayoutParams lp = new
                        WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
                lp.copyFrom(dialog42.getWindow().getAttributes());
                dialog42.getWindow().setAttributes(lp);
                dialog42.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                videoPOPUP = (VideoView) dialog42.findViewById(R.id.videoPopup);
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v_aorang);
                videoPOPUP.setVideoURI(uri);
                videoPOPUP.start();

                final MediaPlayer audioPlay = MediaPlayer.create(ActivityThaiConsonant.this,R.raw.s_aorang);
                audioPlay.start();

                ActivityThaiConsonant.this.audioPlay = (Button) dialog42.findViewById(R.id.audio1);
                ActivityThaiConsonant.this.audioPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        audioPlay.start();
                    }
                });

                videoPlay = (Button) dialog42.findViewById(R.id.video1);
                videoPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoPOPUP.start();
                    }
                });

                loopPlay = (Button) dialog42.findViewById(R.id.loop1);
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
