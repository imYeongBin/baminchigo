package org.techtown.baminchigo;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class regMember extends AppCompatActivity {
    lctnGradeListviewAdapter adapter;
    private String selectedItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_member);

        final Context context = this;

        ListView listview ;

        EditText lotId_input = (EditText) findViewById(R.id.iptName);  // EditText 객체 찾아서

        lotId_input.setPrivateImeOptions("defaultInputmode=korean; ");  // 설정

        // Adapter 생성
        adapter = new lctnGradeListviewAdapter() ;



        // 리스트뷰 참조 및 Adapter달기
        listview = (ListView) findViewById(R.id.lctnGradeListview);
        listview.setAdapter(adapter);

        // 첫 번째 아이템 추가.
        adapter.addItem("마곡실내체육관",
                "타지역") ;
        // 첫 번째 아이템 추가.
        adapter.addItem("계냠체육관",
                "타지역") ;
        // 첫 번째 아이템 추가.
        adapter.addItem("서운간이체육관",
                "타지역") ;
        // 첫 번째 아이템 추가.
        adapter.addItem("강서구체육관",
                "타지역") ;
        // 첫 번째 아이템 추가.
        adapter.addItem("양천구체육관",
                "타지역") ;
        // 첫 번째 아이템 추가.
        adapter.addItem("신월체육관",
                "타지역") ;
        // 첫 번째 아이템 추가.
        adapter.addItem("목동구체육관",
                "타지역") ;
        // 첫 번째 아이템 추가.
        adapter.addItem("부평구체육관",
                "타지역") ;
        // 첫 번째 아이템 추가.
        adapter.addItem("공항초등학교",
                "타지역") ;
 




        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                // get item
                final lctnGradeListview item = (lctnGradeListview) parent.getItemAtPosition(position) ;

                String name = item.getLctnNm() ;
                String grade = item.getGrade() ;

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                        context);

                // 제목셋팅
                alertDialogBuilder.setTitle("선택 목록 대화 상자");

                final CharSequence[] items = { "타지역", "지역구민", "인근거주자", "회원","무료" };

                alertDialogBuilder.setItems(items,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int id) {

                                selectedItem = (String)items[id];
                                this.toString();
                                //Toast.makeText(getApplicationContext()," this : "+this,Toast.LENGTH_LONG).show();
                                // 프로그램을 종료한다
                                dialog.dismiss();
                                item.setGrade(selectedItem);
                                adapter.notifyDataSetChanged();
                            }
                        });



                // 다이얼로그 생성
                AlertDialog alertDialog = alertDialogBuilder.create();

                // 다이얼로그 보여주기
                alertDialog.show();
            }

        }) ;//end of onClickListener;



    }



    public void onBackClicked(View v) {
        finish();
    }













}



