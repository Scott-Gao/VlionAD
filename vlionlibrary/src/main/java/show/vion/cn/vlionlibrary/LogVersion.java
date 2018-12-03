package show.vion.cn.vlionlibrary;

import android.util.Log;

public class LogVersion {
    private final String TAG = "LogVersion";

    public String getTAG() {
        return this.TAG;
    }

    public void showAarVersion() {
        Log.e("TAG", "arr的版本是：1.0.5");
    }


}
