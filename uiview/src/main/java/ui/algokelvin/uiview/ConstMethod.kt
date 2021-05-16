package ui.algokelvin.uiview

import android.content.Context
import android.graphics.Typeface
import android.widget.TextView
import androidx.core.content.ContextCompat

object ConstMethod {
    fun TextView.setTextStylish(context: Context, size: Float? = null, color: Int? = null, gravity: Int? = null, style: Typeface? = null) {
        if (size != null) {
            this.textSize = size
        }
        if (color != null) {
            this.setTextColor(ContextCompat.getColor(context, color))
        }
        if (gravity != null) {
            this.gravity = gravity
        }
        this.typeface = style
    }
}