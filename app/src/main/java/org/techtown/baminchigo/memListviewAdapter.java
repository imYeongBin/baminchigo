package org.techtown.baminchigo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class memListviewAdapter extends BaseAdapter {

    private ArrayList<memListview>  memListviewList = new ArrayList<>();

    public memListviewAdapter(){

    }

    @Override
    public int getCount() {
        return memListviewList.size() ;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();

        // "listview_item" Layout을 inflate하여 convertView 참조 획득.
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.listview_mem, parent, false);
        }

        // 화면에 표시될 View(Layout이 inflate된)으로부터 위젯에 대한 참조 획득
        TextView nameTextView = (TextView) convertView.findViewById(R.id.name) ;
        TextView phoneNoTextView = (TextView) convertView.findViewById(R.id.phoneNo) ;
        TextView priceTextView = (TextView) convertView.findViewById(R.id.price) ;

        // Data Set(listViewItemList)에서 position에 위치한 데이터 참조 획득
        memListview listViewItem = memListviewList.get(position);

        // 아이템 내 각 위젯에 데이터 반영
        nameTextView.setText(listViewItem.getName());
        phoneNoTextView.setText(listViewItem.getPhoneNo());
        priceTextView.setText(listViewItem.getPrice());

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
        return memListviewList.get(position) ;
    }

    // 아이템 데이터 추가를 위한 함수. 개발자가 원하는대로 작성 가능.
    public void addItem(String name, String phoneNo, String price) {
        memListview item = new memListview();

        item.setName(name);
        item.setPhoneNo(phoneNo);
        item.setPrice(price);

        memListviewList.add(item);
    }

}
