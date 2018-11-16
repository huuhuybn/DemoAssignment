package vn.edu.poly.demoassignment.view;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

import java.util.Locale;

public class RegularTextView extends AppCompatTextView {


    public RegularTextView(Context context) {
        super(context);
        setFont(context);

    }

    public RegularTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFont(context);
    }

    public RegularTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFont(context);
    }


    public void setFont(Context context){

        AssetManager am = context.getApplicationContext().getAssets();

        Typeface typeface = Typeface.createFromAsset(am,
                String.format(Locale.US, "fonts/%s", "OpenSans-Regular.ttf"));

        setTypeface(typeface);

    }
}
