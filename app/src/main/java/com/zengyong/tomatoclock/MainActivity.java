package com.zengyong.tomatoclock;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.tv_todo_list)
    public void onTvTodoListClicked() {
    }

    @OnClick(R.id.tv_todo)
    public void onTvTodoClicked() {
    }

    @OnClick(R.id.tv_record)
    public void onTvRecordClicked() {
    }
}
