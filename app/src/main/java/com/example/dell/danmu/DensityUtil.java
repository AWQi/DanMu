package com.example.dell.danmu;

import android.content.Context;

/**
 *
 *   px   dip 转换
 */
public class DensityUtil {

    /**
     *   根据手机分辨率  dip 转 px
     */
    static  public  int dip2px(Context context,float dpValue){
        final  float scale = context.getResources().getDisplayMetrics().density;
        return  (int) (dpValue*scale+0.5f);
    }
    /**
     *   根据手机分辨率  px 转 dip
     */
    static  public  int px2dip(Context context, float pxValue){
        final  float scale = context.getResources().getDisplayMetrics().density;
        return  (int)(pxValue/scale+0.5f);
    }
}
