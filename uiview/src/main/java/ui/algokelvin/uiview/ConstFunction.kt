package ui.algokelvin.uiview

object ConstFunction {
    fun getSizeDp(resource: Resources, dp: Int): Float {
        val scale = resource.displayMetrics.density
        return dp * scale + 0.5f
    }
}