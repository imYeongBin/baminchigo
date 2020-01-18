package org.techtown.baminchigo;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class regAttendee extends AppCompatActivity {
    attendeeListviewAdapter adapter;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_attendee);

        ListView listview ;


        // Adapter 생성
        adapter = new attendeeListviewAdapter() ;

        // 리스트뷰 참조 및 Adapter달기
        listview = (ListView) findViewById(R.id.attendeeListview);
        listview.setAdapter(adapter);

        if(adapter.getCount()==0){

            Toast.makeText(getApplicationContext(),"등록된 참가자가 없습니다. 참가자를 등록해주세요.",Toast.LENGTH_LONG).show();

        }else{


        }
/*

        // 첫 번째 아이템 추가.
        adapter.addItem("임영빈","타지역","5000","010-4199-3679") ;
        // 두 번째 아이템 추가.
        adapter.addItem("김남훈","회원","3000","010-4199-3679") ;
        // 두 번째 아이템 추가.
        adapter.addItem("이성호","회원","3000","010-4199-3679") ;
        // 두 번째 아이템 추가.
        adapter.addItem("장재건","인근거주자","4000","010-4199-3679") ;
        // 두 번째 아이템 추가.
        adapter.addItem("최지영","타지역","5000","010-4199-3679") ;
        // 두 번째 아이템 추가.
        adapter.addItem("박지인","타지역","5000","010-4199-3679") ;
        // 두 번째 아이템 추가.
        adapter.addItem("반종민","타지역","5000","010-4199-3679") ;
        // 두 번째 아이템 추가.
        adapter.addItem("정정윤","타지역","5000","010-4199-3679") ;
        // 두 번째 아이템 추가.
        adapter.addItem("김효선","타지역","5000","010-4199-3679") ;
        // 두 번째 아이템 추가.
        adapter.addItem("최소민","타지역","5000","010-4199-3679") ;

        */



        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                // get item
                attendeeListview item = (attendeeListview) parent.getItemAtPosition(position) ;


                String name = item.getName() ;
                String grade = item.getGrade();
                String fee = item.getFee();
                String phoneNo = item.getPhoneNo();

            }
        }) ;


    }

    public void onBackClicked (View v){

        finish();
    }

    public void onRegAttendee (View v){

        adapter.addItem("임영빈","타지역","5000","010-4199-3679") ;
        adapter.notifyDataSetChanged();
    }

}
