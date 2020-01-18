package org.techtown.baminchigo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class mngAttend extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mng_attend);

        ListView listview ;
        attendListviewAdapter adapter;

        // Adapter 생성
        adapter = new attendListviewAdapter() ;

        // 리스트뷰 참조 및 Adapter달기
        listview = (ListView) findViewById(R.id.attendListview);
        listview.setAdapter(adapter);

        // 첫 번째 아이템 추가.
        adapter.addItem("2020-01-01","마곡실내체육관","20","100,000");
        adapter.addItem("2020-01-03","마곡실내체육관","21","110,000");
        adapter.addItem("2020-01-04","서운간이체육관","24","150,000");
        adapter.addItem("2020-01-05","계남체육관","16","90,000");
        adapter.addItem("2020-01-06","마곡실내체육관","6","76,000");
        adapter.addItem("2020-01-11","마곡실내체육관","9","84,000");
        adapter.addItem("2020-01-18","마곡실내체육관","10","100,000");
        adapter.addItem("2020-01-18","마곡실내체육관","10","100,000");
        adapter.addItem("2020-01-18","마곡실내체육관","10","100,000");
        adapter.addItem("2020-01-18","마곡실내체육관","10","100,000");
        adapter.addItem("2020-01-18","마곡실내체육관","10","100,000");
        adapter.addItem("2020-01-18","마곡실내체육관","10","100,000");



        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                // get item
                attendListview item = (attendListview) parent.getItemAtPosition(position) ;

                String attendDt = item.getAttendDt() ;
                String memCount = item.getMemCount();
                String place = item.getPlace();
                String totalFee = item.getTotalFee();

            }
        }) ;


    }

    public void onBackClicked (View v){
        finish();
    }

    //참가관리 페이지
    public void goRegAttend (View v){
        Intent intent  = new Intent(this,regAttendee.class);
        startActivity(intent);

    }


}
