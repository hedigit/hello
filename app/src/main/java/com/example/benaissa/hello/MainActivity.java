package com.example.benaissa.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.btn_);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editTitle = findViewById(R.id.edt_tiltle);
                String editvalue = editTitle.getText().toString();
                Toast.makeText(MainActivity.this, "Hello to You " + editvalue, Toast.LENGTH_LONG).show();
            }
        });

    }
}
