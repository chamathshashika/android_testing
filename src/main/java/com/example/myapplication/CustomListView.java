package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class CustomListView extends AppCompatActivity {

    ListView list;

    String[] mainTitle = {
            "Title 1", "Title 2",
            "Title 3", "Title 4",
            "Title 5","Title 6"
    };

    String[] subtitle = {
            "Sub Title 1", "Sub Title 2",
            "Sub Title 3", "Sub Title 4",
            "Sub Title 5","Sub Title 6"
    };

    Integer[] imgid = {
            R.drawable.iconfinder_1,
            R.drawable.iconfinder_2,
            R.drawable.iconfinder_3,
            R.drawable.iconfinder_4,
            R.drawable.iconfinder_5,
            R.drawable.iconfinder_6
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        MyListAdapter adapter = new MyListAdapter(this, mainTitle, subtitle, imgid);

        list = (ListView) findViewById(R.id.customlist);

        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {

                    Toast.makeText(getApplicationContext(), "Place Your First Option Code", Toast.LENGTH_SHORT).show();
                } else if (position == 1) {

                    Toast.makeText(getApplicationContext(), "Place Your Second Option Code", Toast.LENGTH_SHORT).show();
                } else if (position == 2) {

                    Toast.makeText(getApplicationContext(), "Place Your Third Option Code", Toast.LENGTH_SHORT).show();
                } else if (position == 3) {

                    Toast.makeText(getApplicationContext(), "Place Your Forth Option Code", Toast.LENGTH_SHORT).show();
                } else if (position == 4) {

                    Toast.makeText(getApplicationContext(), "Place Your Fifth Option Code", Toast.LENGTH_SHORT).show();
                }else if (position == 5) {

                    Toast.makeText(getApplicationContext(), "Place Your Sixth Option Code", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
