package cn.ixuehu.phone;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //找到界面上的按钮
        View view = findViewById(R.id.bt_call);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //点击事件
                System.out.println("给110打电话");
                //松耦合
                //机器代码-->c语言-->c++--->java(c+++)--->c#-->自然语言
                //意图。Intent
                //泡茶 泡妞 打人 打酱油
                Intent intent = new Intent();
                //设置动作 拨打电话的动作
                intent.setAction(Intent.ACTION_CALL);
                //设置数据Uri 统一资源标识符  URL统一资源定位符 网络路径 http ftp rstp
                //itheima://56
                intent.setData(Uri.parse("tel://110"));
                //激活动作
                startActivity(intent);
            }
        });
    }
}
