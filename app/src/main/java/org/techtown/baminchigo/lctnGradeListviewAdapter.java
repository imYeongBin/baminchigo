package org.techtown.baminchigo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class lctnGradeListviewAdapter extends BaseAdapter {

    private ArrayList<lctnGradeListview>  lctnGradeListviewList = new ArrayList<>();

    View rootView;
    public lctnGradeListviewAdapter(){

    }

    @Override
    public int getCount() {
        return lctnGradeListviewList.size() ;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();

        // "listview_item" Layout을 inflate하여 convertView 참조 획득.
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.listview_lctn_grade, parent, false);


        // 화면에 표시될 View(Layout이 inflate된)으로부터 위젯에 대한 참조 획득
        TextView lctnNmTextView = (TextView) convertView.findViewById(R.id.lctnNm) ;
        TextView gradeTextView = (TextView) convertView.findViewById(R.id.grade) ;


        // Data Set(listViewItemList)에서 position에 위치한 데이터 참조 획득
        lctnGradeListview listViewItem = lctnGradeListviewList.get(position);

        // 아이템 내 각 위젯에 데이터 반영
        lctnNmTextView.setText(listViewItem.getLctnNm());
        gradeTextView.setText(listViewItem.getGrade());

        return convertView;


    }



    // 지정한 위치(position)에 있는 데이터와 관계된 아이템(row)의 ID를 리턴. : 필수 구현
    @Override
    public long getItemId(int position) {
        return position ;
    }

    // 지정한 위치(position)에 있는 데이터 리턴 : 필수 구현
    @Override
    public Object getItem(int position) {
        return lctnGradeListviewList.get(position) ;
    }

    // 아이템 데이터 추가를 위한 함수. 개발자가 원하는대로 작성 가능.
    public void addItem(String lctnNm, String grade) {
        lctnGradeListview item = new lctnGradeListview();

        item.setLctnNm(lctnNm);
        item.setGrade(grade);

        lctnGradeListviewList.add(item);
    }

}
