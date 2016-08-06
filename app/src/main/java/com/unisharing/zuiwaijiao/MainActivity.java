package com.unisharing.zuiwaijiao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.unisharing.zuiwaijiao.widget.DrawerHeaderLayout;

public class MainActivity extends AppCompatActivity
        implements Drawer.OnDrawerItemClickListener{

    private Drawer drawer;
    private DrawerHeaderLayout drawerHeaderLayout;

    public MainActivity() {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
        return false;
    }
}
