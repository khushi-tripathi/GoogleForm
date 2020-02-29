package com.gdg.bhopal.googleform;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
TextView nam,age ,email;

        nam = (TextView)findViewById(R.id.name1);
        email= (TextView)findViewById(R.id.email1);
        age = (TextView)findViewById(R.id.age1);

        String n1 = getIntent().getStringExtra("name");
        String e1 = getIntent().getStringExtra("mail");
        String a1 = getIntent().getStringExtra("age");
        nam.setText(nam.getText()+" "+n1);
        age.setText(age.getText()+" "+a1);
        email.setText(email.getText()+" "+e1);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
