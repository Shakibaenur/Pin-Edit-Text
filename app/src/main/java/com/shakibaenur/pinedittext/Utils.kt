package com.shakibaenur.pinedittext

import android.content.res.Resources

/**
 * Created by Shakiba E Nur on 11,February,2023
 */
object Utils {
    fun dpToPx(dp: Float): Float {
        return dp * Resources.getSystem().displayMetrics.density
    }
}