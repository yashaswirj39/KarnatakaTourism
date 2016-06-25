package com.example.yashaswimehta.karnatakatourism;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Signup extends AppCompatActivity implements View.OnClickListener{
    private EditText name;
    private EditText username;
    private EditText password;
    private EditText confirmpassword;
    private EditText email;
    private Button signupbtn;
    String str_name, str_username, str_password, str_confirmpassword, str_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        SignupButton();
    }

    public void SignupButton(){
        name = (EditText)findViewById(R.id.name);
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        confirmpassword = (EditText)findViewById(R.id.confirmpassword);
        email = (EditText)findViewById(R.id.email);
        signupbtn = (Button)findViewById(R.id.signupbtn);
        signupbtn.setOnClickListener(this);
        name.setTextColor(getResources().getColor(R.color.Black));
        username.setTextColor(getResources().getColor(R.color.Black));
        password.setTextColor(getResources().getColor(R.color.Black));
        confirmpassword.setTextColor(getResources().getColor(R.color.Black));
        email.setTextColor(getResources().getColor(R.color.Black));

    }
    public void onReg(){
        str_name = name.getText().toString();
        str_username = username.getText().toString();
        str_password = password.getText().toString();
        str_confirmpassword = confirmpassword.getText().toString();
        str_email = email.getText().toString();
        String type = "signup";
        if(str_password.matches(str_confirmpassword)) {
            BackgroundWorker backgroundWorker = new BackgroundWorker(this);
            backgroundWorker.execute(type, str_name, str_username, str_password, str_confirmpassword, str_email);
        }
        else{
            //handle  the error
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.signupbtn:

                //ProgressDialog prBuilder=new ProgressDialog(Signup.this);
                //prBuilder.setMessage("Loging in");
                //prBuilder.setCancelable(false);
                //prBuilder.show();
                //for(int i=0;i<50000;i++);


                onReg();


                //         prBuilder.dismiss();
                Intent intent = new Intent(Signup.this,Trinfo.class);
                startActivity(intent);
                break;
        }
    }
}


