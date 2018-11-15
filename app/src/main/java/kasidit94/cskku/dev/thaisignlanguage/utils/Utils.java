package kasidit94.cskku.dev.thaisignlanguage.utils;

import android.content.Context;
import android.os.Environment;
import android.support.v4.content.ContextCompat;

import java.io.File;
import java.util.Locale;

public class Utils {

    private Utils(){

    }
    public static String getRootDirPath(Context context){
        if (Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState())){
            File file = ContextCompat.getExternalFilesDirs(context.getApplicationContext(),
                    null)[0];
            return file.getAbsolutePath();
        }else {
            return context.getApplicationContext().getFilesDir().getAbsolutePath();
        }
    }

    public static String getProgressDisplayLine(long currentBytes, long totalBytes){
        return getByesToMBString(currentBytes) + "/" + getByesToMBString(totalBytes);
    }

    public static String getByesToMBString(long bytes){
        return String.format(Locale.ENGLISH,"%.2fMb",bytes / (1024.00 * 1024.00));
    }
}
