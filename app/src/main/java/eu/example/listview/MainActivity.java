package eu.example.listview;

import android.content.Intent;

import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button btnArrayAdapter;
    Button btnCustomAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnArrayAdapter = (Button) findViewById(R.id.btnArrayAdapter);
        btnArrayAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ArrayAdapterActivity.class);
                startActivity(intent);
            }
        });
        btnCustomAdapter = (Button) findViewById(R.id.btnCustomAdapter);
        btnCustomAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CustomAdapterActivity.class);
                startActivity(intent);
            }
        });
    }
    //Button btnCustomAdapter;

}