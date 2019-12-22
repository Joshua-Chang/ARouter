package com.wangyi.order;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.wangyi.common.utils.Cons;

public class Order_MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_activity_main);
        if (getIntent() != null) {
            String content = getIntent().getStringExtra("name");
            Log.e(Cons.TAG, "接收参数值：" + content);
        }
    }

    public void jumpApp(View view) {
        try {
            Class<?> target = Class.forName("com.wangyi.arouter.MainActivity");
            Intent intent = new Intent(this, target);
            intent.putExtra("name","simon >>Order_MainActivity");
            startActivity(intent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void jumpPersonal(View view) {
        try {
            Class<?> target = Class.forName("com.wangyi.personal.Personal_MainActivity");
            Intent intent = new Intent(this, target);
            intent.putExtra("name","simon >>Order_MainActivity");
            startActivity(intent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
