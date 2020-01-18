package org.techtown.baminchigo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class mngMember extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mng_member);

        ListView listview ;
        memListviewAdapter adapter;

        // Adapter 생성
        adapter = new memListviewAdapter() ;

        // 리스트뷰 참조 및 Adapter달기
        listview = (ListView) findViewById(R.id.memListView);
        listview.setAdapter(adapter);

        // 첫 번째 아이템 추가.
        adapter.addItem("임영빈",
                "010-4199-3679", "5,000") ;
        // 두 번째 아이템 추가.
        adapter.addItem("김남훈",
                "010-4444-7777", "20,000") ;
        // 세 번째 아이템 추가.
        adapter.addItem("장재건",
                "010-1111-2222", "15,000") ;
        // 세 번째 아이템 추가.
        adapter.addItem("정혜민",
                "010-1111-2222", "0") ;
        // 세 번째 아이템 추가.
        adapter.addItem("박지인",
                "010-1111-2222", "100,000") ;
        // 세 번째 아이템 추가.
        adapter.addItem("최지영",
                "010-1111-2222", "5,000") ;
        // 세 번째 아이템 추가.
        adapter.addItem("최소미",
                "010-1111-2222", "4,000") ;
        // 세 번째 아이템 추가.
        adapter.addItem("최소미",
                "010-1111-2222", "4,000") ;
        // 세 번째 아이템 추가.
        adapter.addItem("최소미",
                "010-1111-2222", "4,000") ;
        // 세 번째 아이템 추가.
        adapter.addItem("최소미",
                "010-1111-2222", "4,000") ;
        // 세 번째 아이템 추가.
        adapter.addItem("최소미",
                "010-1111-2222", "4,000") ;




        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                // get item
                memListview item = (memListview) parent.getItemAtPosition(position) ;

                String name = item.getName() ;
                String phoneNo = item.getPhoneNo() ;
                String price = item.getPrice() ;

                Toast.makeText(getApplicationContext(),name+"("+phoneNo+") | 잔여회비 : "+price,Toast.LENGTH_LONG).show();
            }
        }) ;


    }



    //메인페이지로 이동
    public void onBackClicked (View v){
        finish();
    }

    //회원등록하기(regMember) 페이지로 이동
    public void goRegMember(View v){
        Intent intent  = new Intent(this,regMember.class);
        startActivity(intent);
    }

}
