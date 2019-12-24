package com.wangyi.personal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.wangyi.annotation.ARouter;
import com.wangyi.annotation.Parameter;
import com.wangyi.common.RecordPathManager;
import com.wangyi.common.utils.Cons;
@ARouter(path = "/personal/Personal_MainActivity")
public class Personal_MainActivity extends AppCompatActivity {
    @Parameter
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_activity_main);
        if (getIntent() != null) {
//            String content = getIntent().getStringExtra("name");
//            Log.e(Cons.TAG, "接收参数值：" + content);
            new Personal_MainActivity$$Parameter().loadParameter(this);
            Log.e(Cons.TAG, "接收参数值：" + name);
        }
    }

    public void jumpApp(View view) {
//        try {
//            Class<?> target = Class.forName("com.wangyi.arouter.MainActivity");
//            Intent intent = new Intent(this, target);
//            intent.putExtra("name","simon >>Personal_MainActivity");
//            startActivity(intent);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

        // 类加载跳转，用map封装。如果类太多太繁琐
        Class<?> targetClass = RecordPathManager.getTargetClass("app", "MainActivity");
        Intent intent = new Intent(this, targetClass);
        intent.putExtra("name","simon >>Personal_MainActivity");
        startActivity(intent);
    }

    public void jumpOrder(View view) {
//        try {
//            Class<?> target = Class.forName("com.wangyi.order.Order_MainActivity");
//            Intent intent = new Intent(this, target);
//            intent.putExtra("name","simon >>Personal_MainActivity");
//            startActivity(intent);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

        // 类加载跳转，用map封装。如果类太多太繁琐
        Class<?> targetClass = RecordPathManager.getTargetClass("order", "Order_MainActivity");
        Intent intent = new Intent(this, targetClass);
        intent.putExtra("name","simon >>Personal_MainActivity");
        startActivity(intent);
    }
}
