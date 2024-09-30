package com.example.tp1ex1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tp1ex1.R;

public class MainActivity extends AppCompatActivity {

    private Button button1,button2;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        button1=findViewById(R.id.toastBtn);
        button2=findViewById(R.id.button2);
        textView=findViewById(R.id.textView3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello Toast !!", Toast.LENGTH_LONG).show();

            }
        });

        button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int currentValue=Integer.parseInt(textView.getText().toString());
                        currentValue++;
                        textView.setText(String.valueOf(currentValue));
                    }
                }
        );


    }
}