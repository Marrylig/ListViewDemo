package com.example.j2715470.listviewdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    private List<MyData> list=new ArrayList<MyData>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyData myData=new MyData();
        myData.setData("1001");
        myData.setValue("ol");
        list.add(myData);

        myData=new MyData();
        myData.setData("1002");
        myData.setValue("oll");
        list.add(myData);

        myData=new MyData();
        myData.setData("1003");
        myData.setValue("olll");
        list.add(myData);

        myData=new MyData();
        myData.setData("1004");
        myData.setValue("olplp");
        list.add(myData);

        myData=new MyData();
        myData.setData("1005");
        myData.setValue("olodkf");
        list.add(myData);

        ListView listView=(ListView)findViewById(R.id.listView);
        MyAdapter myAdapter=new MyAdapter(this,list);
        listView.setAdapter(myAdapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
