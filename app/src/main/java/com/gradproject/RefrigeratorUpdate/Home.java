package com.gradproject.RefrigeratorUpdate;

import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        LinearLayout button1 = (LinearLayout) findViewById(R.id.button1);
        LinearLayout button2 = (LinearLayout) findViewById(R.id.button2);
        LinearLayout button3 = (LinearLayout) findViewById(R.id.button3);
        LinearLayout button4 = (LinearLayout) findViewById(R.id.button4);

        //시작 프레그먼트 지정

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_place, new Fridge()).commit(); // 냉장고
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //레시피

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_place, new Recipe()).commit();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 위치
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_place, new Place()).commit();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //쇼핑 목록
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_place, new Shopping_list()).commit();
            }
        });
    }
}



