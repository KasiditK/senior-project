package kasidit94.cskku.dev.thaisignlanguage;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;



public class ActivityMain extends AppCompatActivity {

    CardView cardViewOne, cardViewTwo, cardViewThree, cardViewFour;
    ImageView img1;

    Typeface fontMorkhor;
    TextView menuOne;

    Dialog dialogPopup = null;
    LinearLayout btnOnSelectMenu1, btnOnSelectMenu2, btnOnSelectMenu3;

    FloatingActionButton fabSetting,fabDownload,fabAbout;
    boolean hide = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        onClickMenu();
        onClickFAB();


    }

    private void init() {
        img1 = (ImageView) findViewById(R.id.image1);

        cardViewOne = (CardView) findViewById(R.id.cardView1);
        cardViewTwo = (CardView) findViewById(R.id.cardView2);
//        cardViewThree = (CardView) findViewById(R.id.cardView3);
//        cardViewFour = (CardView) findViewById(R.id.cardView4);

        btnOnSelectMenu1 = (LinearLayout) findViewById(R.id.btnSelect1);
        btnOnSelectMenu2 = (LinearLayout) findViewById(R.id.btnSelect2);
        btnOnSelectMenu3 = (LinearLayout) findViewById(R.id.btnSelect3);

        dialogPopup = new Dialog(this);

        fabSetting = (FloatingActionButton) findViewById(R.id.fab_setting);
        fabAbout = (FloatingActionButton) findViewById(R.id.fab_about);
        fabDownload = (FloatingActionButton) findViewById(R.id.fab_download);

//        menuOne = (TextView) findViewById(R.id.menu1);
//        fontMorkhor = Typeface.createFromAsset(this.getAssets(),"fonts/MorKhor1.ttf");
//        menuOne.setTypeface(fontMorkhor);

    }

    private void onClickFAB(){
        fabSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hide == false){
                    Hidden();
                    hide = true;
                }else {
                    UnHidกen();
                    hide = false;
                }
            }
        });

        fabDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMain.this, ActivityDownload.class);
                startActivity(intent);
            }
        });
    }

    private void Hidden(){
        fabDownload.show();
        fabAbout.show();
    }

    private void UnHidกen(){
        fabDownload.hide();
        fabAbout.hide();
    }

    public void onClickMenu() {

        /*
            CardView 1
        */
        cardViewOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ActivityMain.this, ActivityMainTSL.class);
                startActivity(intent);

            }
        });

        /*
        CardView 2
        */

        cardViewTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (dialogPopup != null) {
                    dialogPopup = new Dialog(ActivityMain.this);
                    dialogPopup.requestWindowFeature(Window.FEATURE_NO_TITLE);
                    dialogPopup.setContentView(R.layout.popup_select_consonant);

                    btnOnSelectMenu1 = (LinearLayout) dialogPopup.findViewById(R.id.btnSelect1);
                    btnOnSelectMenu1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i = new Intent(getApplicationContext(), ActivityThaiConsonant.class);
                            startActivity(i);
                            dialogPopup.dismiss();


                        }
                    });

                    btnOnSelectMenu2 = (LinearLayout) dialogPopup.findViewById(R.id.btnSelect2);
                    btnOnSelectMenu2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i = new Intent(getApplicationContext(), ActivityThaiTone.class);
                            startActivity(i);
                            dialogPopup.dismiss();


                        }
                    });


                    dialogPopup.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    dialogPopup.show();
                }

            }
        });

        /*
        CardView 3
        */

//        cardViewThree.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(ActivityMain.this, ActivityDownload.class);
//                startActivity(intent);
//            }
//        });



    }


}
