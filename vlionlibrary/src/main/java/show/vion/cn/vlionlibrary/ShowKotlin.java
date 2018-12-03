package show.vion.cn.vlionlibrary;

import android.content.Context;
import android.widget.Toast;

public class ShowKotlin {
    private final String TAG = "ShowKotlin";

    public final String getTAG() {
        return this.TAG;
    }

    public final void showAarVersion( Context context) {
        Toast.makeText(context, "kotlin版本1.0.5", Toast.LENGTH_SHORT).show();
    }
}
