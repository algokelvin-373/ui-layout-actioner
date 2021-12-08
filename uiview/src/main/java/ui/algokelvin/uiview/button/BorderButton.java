package ui.algokelvin.uiview.button;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class BorderButton extends androidx.appcompat.widget.AppCompatTextView {
    private int borderColor = Color.BLACK;
    private int padding = 4;

    public BorderButton(Context context) {
        super(context);
        init(context, null);
    }

    public BorderButton(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public BorderButton(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    @Override
    public void setBackground(Drawable background) {
        super.setBackground(background);
    }

    private void init(Context context, AttributeSet attrs) {
        setTextColor(Color.BLACK);
        setBackgroundColor(Color.GRAY);
        setPadding(16, 16, 16, 16);
    }

}
