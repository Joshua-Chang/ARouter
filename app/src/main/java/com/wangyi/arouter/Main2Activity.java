package com.wangyi.arouter;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.wangyi.annotation.ARouter;
import com.wangyi.common.utils.Cons;
import com.wangyi.order.Order_MainActivity;
import com.wangyi.personal.Personal_MainActivity;

import androidx.appcompat.app.AppCompatActivity;

@ARouter(path = "/app/Main2Activity")
public class Main2Activity extends AppCompatActivity {

    private TextView mTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTv = findViewById(R.id.tv);
        mTv.setText("Main2Activity");
        if (BuildConfig.isRelease) {
            Log.e(Cons.TAG, "当前为：集成化模式，除app可运行，其他子模块都是Android Library");
        } else {
            Log.e(Cons.TAG, "当前为：组件化模式，app/order/personal子模块都可独立运行");
        }
    }

    public void jumpOrder(View view) {
        Intent intent = new Intent(this, Order_MainActivity.class);
        intent.putExtra("name", "simon");
        startActivity(intent);
    }

    public void jumpPersonal(View view) {
        Intent intent = new Intent(this, Personal_MainActivity.class);
        intent.putExtra("name", "simon");
        startActivity(intent);
    }
}
