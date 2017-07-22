package com.wzh.androidflavors;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etUsername = null;
    private EditText etPassword = null;
    private Button btnLogin = null;

    private String username = "";
    private String password = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = (EditText) findViewById(R.id.etRegisterSwrydm);
        etPassword = (EditText) findViewById(R.id.etRegisterPhone);
        btnLogin = (Button) findViewById(R.id.btnRegister);

        btnLogin.setOnClickListener(btnListener);

    }

    /**
     * button监听
     */
    private View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            username = etUsername.getText().toString();
            password = etPassword.getText().toString();

            String result = ModuleManager.login(username, password);

            Snackbar snackbar = Snackbar.make(view, result, Snackbar.LENGTH_LONG);
            View mView = snackbar.getView();
            mView.setBackgroundColor(Color.LTGRAY);
            snackbar.show();
        }
    };

    @Override
    protected void onStop() {
        super.onStop();
        this.finish();
    }
}
