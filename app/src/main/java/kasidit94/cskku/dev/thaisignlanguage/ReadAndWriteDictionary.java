package kasidit94.cskku.dev.thaisignlanguage;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
  * This program demonstrates how to read characters from a text file.
  * @author www.codejava.net
  *
  */
public class ReadAndWriteDictionary extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String data="";
        StringBuffer stringBuffer = new StringBuffer();
        InputStream inputStream = this.getResources().openRawResource(R.raw.lexitron);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        if (inputStream != null){
            try {
                while ((data = bufferedReader.readLine()) != null){
                    stringBuffer.append(data);
                }

                System.out.print(data);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}