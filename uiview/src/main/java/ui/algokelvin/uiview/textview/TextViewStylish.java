package ui.algokelvin.uiview.textview;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Html;
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

    // Single TextView with Two Colors Different
    public void setColorCustom(
            TextView textView,
            String[] textVw,
            String[] colorTxt
    ) {
        StringBuilder txt = new StringBuilder();
        for (int x = 0; x < textVw.length - 1; x++)
            txt.append(getColorTextSpanned(textVw[x], colorTxt[x]));
        textView.setText(Html.fromHtml(txt.toString()));
    }

    private String getColorTextSpanned(String text, String color) {
        return "<font color=" + color + ">" + text + "</font>";
    }
}
