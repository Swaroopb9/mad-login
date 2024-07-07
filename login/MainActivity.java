package com.dem.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText ed,ed1;
    Button b;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
        ed=findViewById(R.id.username);
        ed1=findViewById(R.id.password);
        b=findViewById(R.id.btn);
        tv=findViewById(R.id.tex);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed.getText().toString().equals("nithya")&& ed1.getText().toString().equals("123")){
                    Toast.makeText(MainActivity.this, "login successfull", Toast.LENGTH_SHORT).show();
                    tv.setText("nithya sai");
                    Intent i=new Intent(MainActivity.this,another1.class);
                    startActivity(i);


                }
                else {
                    Toast.makeText(MainActivity.this, "login not successfull", Toast.LENGTH_SHORT).show();
                }
                ed.setText("");
                ed1.setText("");
            }
        });
    }
}