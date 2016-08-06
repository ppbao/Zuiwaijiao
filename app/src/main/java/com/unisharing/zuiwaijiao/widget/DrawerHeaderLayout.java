package com.unisharing.zuiwaijiao.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by Bruce Liu on 2/08/2016.
 */
public class DrawerHeaderLayout  extends LinearLayout implements View.OnClickListener{

    public DrawerHeaderLayout(Context context){
        this(context,null);
    }
    public DrawerHeaderLayout(Context context, AttributeSet attrs){
        this(context,attrs,0);
    }
    public DrawerHeaderLayout(Context context,AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs,defStyleAttr );
    }

    @Override
    public void onClick(View view) {

    }
}
