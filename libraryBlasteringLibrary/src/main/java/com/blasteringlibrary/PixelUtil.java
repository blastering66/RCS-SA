package com.blasteringlibrary;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;

public class PixelUtil {
	
	 public static int dpToPx(Context context, int dp) {
         Resources r = context.getResources();
         float px = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics());
         return (int) px;
     }
 
     public static int pxToDp(Context context, int px) {
         Resources resources = context.getResources();
         DisplayMetrics metrics = resources.getDisplayMetrics();
         float dp = px / (metrics.densityDpi / 160f);
         return (int) dp;
     }

}
