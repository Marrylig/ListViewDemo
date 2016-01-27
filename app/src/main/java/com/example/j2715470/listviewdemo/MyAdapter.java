package com.example.j2715470.listviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by J2715470 on 2015-12-04.
 */
public class MyAdapter extends BaseAdapter {
    private Context context;
    private List<MyData> myDataList;
    private LayoutInflater layoutInflater;

    public static class DataHolder{
        public TextView data;
        public TextView value;
        public ImageView image;
    }

    public MyAdapter(Context context,List<MyData> list){
        context=context;
        myDataList=list;
        layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return myDataList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        DataHolder dataHolder= null;
        if(convertView==null){
            convertView=layoutInflater.inflate(R.layout.layout1,null);
            dataHolder=new DataHolder();
            dataHolder.data=(TextView)convertView.findViewById(R.id.text_data);
            dataHolder.value=(TextView)convertView.findViewById(R.id.text_value);
            dataHolder.image=(ImageView)convertView.findViewById(R.id.img);
            convertView.setTag(dataHolder);
        }else {
            dataHolder=(DataHolder)convertView.getTag();
        }
        dataHolder.data.setText(myDataList.get(position).getData());
        dataHolder.value.setText(myDataList.get(position).getValue());
        dataHolder.image.setImageResource(R.drawable.ic_launcher);
        return convertView;
    }

    public void addItem(MyData myData){
        if(myData==null){
            return;
        }
        myDataList.add(myData);
        notifyDataSetChanged();
    }

    public  void remove(int position){
        myDataList.remove(position);
        notifyDataSetChanged();
    }

    public void modify(int position,String value){
        MyData myData=myDataList.get(position);
        myData.setValue(value);
        notifyDataSetChanged();
    }
}
