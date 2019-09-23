package com.forcpdlm.bio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginactivity extends AppCompatActivity {
    Button b,b1;
    String getname,getpass;
    EditText ed1,ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);
        ed1=(EditText)findViewById(R.id.name);
        ed2=(EditText)findViewById(R.id.pass);
        b=(Button)findViewById(R.id.but4);
        b1=(Button)findViewById(R.id.but5);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getname=ed1.getText().toString();
                getpass=ed2.getText().toString();
                if(getname.equals("admin")& getpass.equals("12345"))
                {
                 Intent e=new Intent(getApplicationContext(),WElcomeActivity.class);
                 startActivity(e);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"invalid username or password",Toast.LENGTH_SHORT).show();

                }
               // Toast.makeText(getApplicationContext(),getname+" "+getpass,Toast.LENGTH_SHORT).show();

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(a);

            }
        });

        }




        }

