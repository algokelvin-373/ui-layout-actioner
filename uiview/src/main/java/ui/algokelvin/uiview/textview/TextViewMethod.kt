package ui.algokelvin.uiview.textview

import android.content.Context
import android.graphics.Typeface
import android.text.Html
import android.widget.TextView
import androidx.core.content.ContextCompat

object TextViewMethod {
    // Set Attribute TextView: Size, Color, Alignment, and Style
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

    // Single TextView with Two Colors Different
    fun TextView.setColorCustom(textVw: Array<String>, colorTxt: Array<String>) {
        var txt = ""
        for(x in 0..textVw.size-1)
            txt += getColorTextSpanned(textVw[x], colorTxt[x])
        this.text = Html.fromHtml(txt)
    }
    private fun getColorTextSpanned(text: String, color: String): String {
        return "<font color=$color>$text</font>"
    }
}