package com.example.practice_firstday;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnclick;
    TextView text_view ;
    EditText edit1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnclick = findViewById(R.id.btnclick);
        edit1 = findViewById(R.id.edit1);

        //-------------SetOnClickListener--Put_there----------->
        btnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater lf = getLayoutInflater();
                view = lf.inflate(R.layout.inflate_xml_file, findViewById(R.id.inflate_xml_file));
                text_view = view.findViewById(R.id.text_view);
                String str = edit1.getText().toString();
                text_view.setText(str+" ");
                Toast t = new Toast(getApplicationContext());
                t.setDuration(Toast.LENGTH_LONG);
                t.setView(view);
                t.show();
            }
        });

    }
}