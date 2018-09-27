package com.sixin.breadmvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements AddEditTaskContract.View{

    //TODO 针对于具体的业务设计接口
    //TODO model层的职责是负责数据的操作，如何设计model层，这儿需要具体写一个列子出来，主要目的是为了切换成RxJava
    //TODO 基于简书收藏的例子，设计警务通登录的UML类图
    //TODO 如何接入RxJava,MVP+RxJava存在的内存泄漏问题
    //TODO 简书收藏的RxJava的操作符
    //TODO 实现断点续传的功能模块

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void showEmptyTaskError() {

    }

    @Override
    public void showTasksList() {

    }

    @Override
    public void setTitle(String title) {

    }

    @Override
    public void setDescription(String description) {

    }

    @Override
    public boolean isActive() {
        return false;
    }

    @Override
    public void setPresenter(AddEditTaskContract.Presenter presenter) {

    }
}
