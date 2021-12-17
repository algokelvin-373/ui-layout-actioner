package ui.algokelvin.uiview.textview;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

public class TextViewStylish {
    private final Context context;

    public TextViewStylish(Context context) {
        this.context = context;
    }

    // Set Attribute TextView: Size, Color, Alignment, and Style
    public void setTextStylish(
            TextView textView,
            float size,
            int color,
            int gravity,
            Typeface style
    ) {
        textView.setTextSize(size);
        textView.setTextColor(ContextCompat.getColor(context, color));
        textView.setGravity(gravity);
        textView.setTypeface(style);
    }

    private void sizeText() {

    }
}
