package com.forcpdlm.bio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b,b1;
    EditText ed1,ed2,ed3,ed4,ed5,ed6;
    String getname,getplace,getemail,getnum,getuname,getpass;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.but4);
        b1=(Button)findViewById(R.id.but5);
        ed1=(EditText) findViewById(R.id.name);
        ed2= (EditText) findViewById(R.id.pl);
        ed3=(EditText)findViewById(R.id.email);
        ed4=(EditText)findViewById(R.id.num);
        ed5=(EditText)findViewById(R.id.uname);
        ed6=(EditText)findViewById(R.id.pass);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toast.makeText(getApplicationContext(),"hai",Toast.LENGTH_LONG).show();
                getname=ed1.getText().toString();
                getplace=ed2.getText().toString();
                getemail=ed3.getText().toString();
                getnum=ed4.getText().toString();
                getuname=ed4.getText().toString();
                getpass=ed4.getText().toString();
                Toast.makeText(getApplicationContext(), getname + " "+getplace+ " "+getemail+ " "+getnum+" "+getuname+" "+getpass,Toast.LENGTH_LONG).show();
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),loginactivity.class);
                startActivity(i);

            }
        });

    }
}





