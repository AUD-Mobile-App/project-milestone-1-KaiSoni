package com.example.a1508027853.audbucketlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    // Initalize the variables to be used
    private static EditText username;
    private static EditText password;
    private static Button login_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Begins LoginButton function
        LoginButton();
    }

    // LoginButton function defined
    public void LoginButton() {

        // Define the variables to be used
        username = (EditText) findViewById(R.id.editText_user);
        password = (EditText) findViewById(R.id.editText_password);
        login_btn = (Button) findViewById(R.id.button_login);

        // When login button is button will check login details
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // If username and password are entered correctly according to string value will open ListActivity Page
                if (username.getText().toString().equals("admin") && password.getText().toString().equals("123456")) {
                    Intent intent = new Intent(LoginActivity.this, ListActivity.class);
                    startActivity(intent);
                } else {
                    // If details entered incorrectly then will show toast
                    Toast.makeText(LoginActivity.this, "User and Password is not correct",
                            Toast.LENGTH_SHORT).show();

                }
            }});

    }
}
