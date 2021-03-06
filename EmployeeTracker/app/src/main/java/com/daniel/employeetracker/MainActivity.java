package com.daniel.employeetracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button employeeBtn, employerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        employeeBtn = (Button) findViewById(R.id.employeeBtn);
        employerBtn = (Button) findViewById(R.id.employerBtn);

        employeeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, EmployeeLoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

        employerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, EmployerLoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
