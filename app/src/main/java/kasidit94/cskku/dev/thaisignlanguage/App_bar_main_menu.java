package kasidit94.cskku.dev.thaisignlanguage;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.reflect.Type;

public class App_bar_main_menu extends AppCompatActivity {


    Typeface fontMorKhor;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_bar_main_menu);


        textView = (TextView) findViewById(R.id.app_bar_main_menu);
        fontMorKhor = Typeface.createFromAsset(this.getAssets(),"fonts/MorKhor1.ttf");

        textView.setTypeface(fontMorKhor);

    }

}
