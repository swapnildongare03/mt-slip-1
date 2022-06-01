package com.example.practicalslip1registrationvalidation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button regBtn;
    EditText inptFirstName,inptLastName,inptUsername,inptPassword,inptRePassword,inptEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        regBtn = (Button)findViewById(R.id.regBtn);
        inptFirstName = (EditText) findViewById(R.id.inptFirstName);
        inptLastName = (EditText) findViewById(R.id.inptLastName);
        inptUsername = (EditText) findViewById(R.id.inptUsername);
        inptPassword = (EditText) findViewById(R.id.inptPassword);
        inptRePassword = (EditText) findViewById(R.id.inptRePassword);
        inptEmail = (EditText) findViewById(R.id.inptEmail);
 
        regBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), " hi thrtrt   " +  inptFirstName.getText().toString() ,Toast.LENGTH_LONG).show();
                if(inptFirstName.getText().toString().length() == 0)
                {
                    inptFirstName.setError("First name is required");
                    inptFirstName.requestFocus();
                }else if(inptLastName.getText().toString().length() == 0)
                {
                    inptLastName.setError("Last name is required");
                    inptLastName.requestFocus();
                }else if(inptUsername.getText().toString().length() == 0)
                {
                    inptUsername.setError("username name is required");
                    inptUsername.requestFocus();
                }else if(inptPassword.getText().toString().length() == 0)
                {
                    inptPassword.setError("password is required");
                    inptPassword.requestFocus();
                }else if(!inptPassword.getText().toString().equals(inptRePassword.getText().toString()))
                {
                    inptRePassword.setError("Password did not match");
                    inptRePassword.requestFocus();
                }else if(inptEmail.getText().toString().length() == 0)
                {
                    inptEmail.setError("email name is required");
                    inptEmail.requestFocus();
                }else{
                    Toast.makeText(getApplicationContext(), " Registered Success ! " +  inptFirstName.getText().toString() ,Toast.LENGTH_LONG).show();
                }
            }
        });
    }


}