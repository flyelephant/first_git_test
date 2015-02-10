package safeng.com.mycustomtextview.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by fengjigang on 15/2/9.
 */
public class CusTextView extends TextView {
    private static final String TAG = "fengjigang";

    public CusTextView(Context context) {
        super(context);
    }

    public CusTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CusTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Log.i(TAG,"width="+widthMeasureSpec);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
