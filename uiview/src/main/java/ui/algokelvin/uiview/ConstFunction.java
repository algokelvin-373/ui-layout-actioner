package ui.algokelvin.uiview;

import android.content.res.Resources;

public class ConstFunction {
    public static float getSizeDp(Resources resources, int dp) {
        float scale = resources.getDisplayMetrics().density;
        return dp * scale + 0.5f;
    }
}
