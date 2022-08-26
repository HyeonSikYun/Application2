package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SubActivity4 extends AppCompatActivity {

    private Button next_btn;
    RadioGroup radio_group;
    int change_num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub4);

        next_btn=findViewById(R.id.next_btn);
        radio_group=findViewById((R.id.radio_group));

        radio_group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i)
                {
                    case R.id.c_box:
                    {
                        change_num=1;
                        Toast.makeText(getApplicationContext(),"1",
                                Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.cpp_box:
                    {
                        change_num=2;
                        Toast.makeText(getApplicationContext(),"2",
                                Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.java_box:
                        change_num=3;
                        Toast.makeText(getApplicationContext(),"3",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.python_box:
                        change_num=4;
                        Toast.makeText(getApplicationContext(),"4",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.chash_box:
                        change_num=5;
                        Toast.makeText(getApplicationContext(),"5",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.game_box:
                    {
                        change_num=6;
                        Toast.makeText(getApplicationContext(),"6",
                                Toast.LENGTH_SHORT).show();
                        break;
                    }
                }
            }
        });
        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (change_num)
                {
                    case 1:
                    {
                        Intent intent=new Intent(SubActivity4.this,C_Activity.class);
                        startActivity(intent);
                        break;
                    }
                    case 2:
                    {
                        Intent intent=new Intent(SubActivity4.this,CPP_Activity.class);
                        startActivity(intent);
                        break;
                    }
                    case 3:
                    {
                        Intent intent=new Intent(SubActivity4.this,JAVA_Activity.class);
                        startActivity(intent);
                        break;
                    }
                    case 4:
                    {
                        Intent intent=new Intent(SubActivity4.this,PYTHON_Activity.class);
                        startActivity(intent);
                        break;
                    }
                    case 5:
                    {
                        Intent intent=new Intent(SubActivity4.this,CHASH_Activity.class);
                        startActivity(intent);
                        break;
                    }
                    case 6:
                    {
                        Intent intent=new Intent(SubActivity4.this,GAME_Activity.class);
                        startActivity(intent);
                        break;
                    }

                }
            }
        });

    }
}