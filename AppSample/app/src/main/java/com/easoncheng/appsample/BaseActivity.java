package com.easoncheng.appsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by 子勋 on 2016/9/13.
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initAll();
    }
    private void initAll(){
        initView();
        initListener();
        initData();
    }
    public abstract void initView();
    public abstract void initListener();
    public abstract void initData();
}
