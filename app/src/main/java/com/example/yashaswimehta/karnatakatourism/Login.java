package com.example.yashaswimehta.karnatakatourism;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity implements View.OnClickListener{
    private EditText username;
    private EditText password;
    private Button login_btn;
    private Button signupbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        LoginButton();
        SignupButton();
    }

    public void LoginButton() {
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        login_btn = (Button) findViewById(R.id.loginbtn);

        login_btn.setOnClickListener(this);
        username.setTextColor(getResources().getColor(R.color.Black));
        password. setTextColor(getResources().getColor(R.color.Black));
    }
    public void SignupButton(){
        signupbtn = (Button) findViewById(R.id.signupbtn);
        signupbtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.loginbtn :

                //ProgressDialog prBuilder=new ProgressDialog(getApplicationContext());
                //prBuilder.setMessage("Loging in");
                //prBuilder.setCancelable(false);
                //prBuilder.show();
                //for(int i=0;i<50000;i++);
                /*

                database connection and verification code

                 */
                //         prBuilder.dismiss();
                Intent intent=new Intent( Login.this,Signup.class);
                startActivity(intent);
                break;
            case R.id.signupbtn:
                Intent intenti = new Intent(Login.this,Signup.class);
                startActivity(intenti);
                break;
        }
    }
}
