package com.zaxcler.common.tools;

import android.content.Context;

/**
 * Created by zaxcler on 16-5-30.
 */
public class ScreenTools {
    /**
     * dip2px
     */
    public static int dip2px(Context context, float dipValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dipValue * scale + 0.5f);
    }

    /**
     *  px2dip
     */
    public static int px2dip(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }
}
