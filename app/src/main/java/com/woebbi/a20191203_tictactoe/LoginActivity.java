package com.woebbi.a20191203_tictactoe;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener  {

    private EditText lAPasswordInput;
    private TextView lAPasswordText;
    private EditText lAUsernameInput;
    private TextView lAUsernameText;
    private Button lAButtonSend;
    private Button lAButtonAbort;
    private boolean firstRun = true;

    private SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sp = getSharedPreferences("com.woebbi.a20191203_tictactoe", Context.MODE_PRIVATE);

        firstRun = sp.getBoolean("firstrun",true);
        if(firstRun) {
            lAPasswordInput = findViewById(R.id.loginActivityPasswordInput);
            lAPasswordText = findViewById(R.id.loginActivityPasswordText);
            lAUsernameInput = findViewById(R.id.loginActivityUsernameInput);
            lAUsernameText = findViewById(R.id.loginActivityUsernameText);
            lAButtonSend = findViewById(R.id.loginActivityButtonSend);
            lAButtonAbort = findViewById(R.id.loginActivityButtonAbort);

            lAButtonSend.setOnClickListener((this);
            lAButtonAbort.setOnClickListener(this);
        }else{
            setContentView(R.layout.activity_login);
        }

    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
