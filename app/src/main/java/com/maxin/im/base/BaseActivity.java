package com.maxin.im.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by shkstart on 2017/7/1.
 */

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);

        initView();

        initData();

        initListener();


    }

    public abstract void initListener();

    public abstract void initData();

    public void initView() {

    }

    public abstract int getLayoutId();

    @Override
    public void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }
}
