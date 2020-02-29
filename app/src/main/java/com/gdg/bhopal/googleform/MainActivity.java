package com.gdg.bhopal.googleform;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button submitBtn;
    EditText name,email;//,clg,vol,experience;
    SeekBar ageSB;
    //RadioButton gender;
    CheckBox agree;//,area,lang,specialization;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
       try {
           super.onCreate(savedInstanceState);
           setContentView(R.layout.activity_main);
           Toolbar toolbar = findViewById(R.id.toolbar);
           name = (EditText) findViewById(R.id.name);
           ageSB = (SeekBar) findViewById(R.id.age);
           email = (EditText) findViewById(R.id.email);
           agree = (CheckBox) findViewById(R.id.consent);
           setSupportActionBar(toolbar);
           submitBtn = (Button) findViewById(R.id.sub);
           // if(agree.isChecked()) {
           submitBtn.setOnClickListener(new View.OnClickListener() {
                                            public void onClick(View view) {
                                                String n1 = name.getText().toString();
                                                int age1 = ageSB.getProgress();
                                                String a = String.valueOf(age1);
                                                Intent i = new Intent(MainActivity.this, Registration.class);
                                                if(agree.isChecked()){
                                                i.putExtra("name", n1);
                                                i.putExtra("age", a);
                                                i.putExtra("mail", email.getText().toString());
                                                    startActivity(i);
                                                }

                                                else{

                                                    Toast.makeText(getApplicationContext(),"Error Occur !!",Toast.LENGTH_LONG).show();
                                                }
                                            }
                                        }
           );
       }catch (Exception e)
        {
            Log.e("MainActivity",e.toString());
            Toast.makeText(getApplicationContext(),"Error Occur !!",Toast.LENGTH_LONG).show();
        }
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
