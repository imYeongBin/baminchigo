package org.techtown.baminchigo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);

    }

    //회원관리 페이지
    public void goMngMember (View v){
        Intent intent  = new Intent(this,mngMember.class);
        startActivity(intent);

    }

    //참가관리 페이지
    public void goMngAttend (View v){
        Intent intent  = new Intent(this,mngAttend.class);
        startActivity(intent);

    }

    //기타관리 페이지
    public void goMngEtc (View v){
        Intent intent  = new Intent(this,mngEtc.class);
        startActivity(intent);

    }


}
