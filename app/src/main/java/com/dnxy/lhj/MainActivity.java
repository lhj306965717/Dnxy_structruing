package com.dnxy.lhj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.dnxy.lhj.aop.AOPActivity;
import com.dnxy.lhj.builder.Builder;
import com.dnxy.lhj.builder.BuilderActivity;
import com.dnxy.lhj.factory.AndroidFactory;
import com.dnxy.lhj.factory.IFactory;
import com.dnxy.lhj.factory.StudentEnum;
import com.dnxy.lhj.factory.StudentFactory;
import com.dnxy.lhj.factory.TestFactory;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

//        TestFactory.run();
    }

    private void initView() {
        findViewById(R.id.bt_aop).setOnClickListener(this);
        findViewById(R.id.bt_builder).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent = null;

        switch (v.getId()) {
            case R.id.bt_aop:
                intent = new Intent(getApplicationContext(), AOPActivity.class);
                break;
            case R.id.bt_builder:
                intent = new Intent(getApplicationContext(), BuilderActivity.class);
                break;
        }

        if(intent != null){
            startActivity(intent);
        }
    }
}
