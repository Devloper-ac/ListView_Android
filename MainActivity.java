package com.igc.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView lstContacts;

    String[] names ={"chaitanya","Mahesh","Murtuja"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstContacts = findViewById(R.id.lstContacts);
        ArrayAdapter<String> adp = new ArrayAdapter<String>(MainActivity.this,R.layout.my_activity,R.id.txtinput,names);
        lstContacts.setAdapter(adp);

        lstContacts.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                TextView txtExp = (TextView) view.findViewById(R.id.txtinput);
                Toast.makeText(MainActivity.this, "Index = "+position+"\nnames ="+txtExp.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
