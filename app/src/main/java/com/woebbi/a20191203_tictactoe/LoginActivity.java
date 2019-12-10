package com.woebbi.a20191203_tictactoe;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText lAPasswordInput;
    private TextView lAPasswordText;
    private EditText lAUsernameInput;
    private TextView lAUsernameText;
    private Button lAButtonSend;
    private Button lAButtonAbort;
    private boolean firstRun = true;
    private String validUser = "b";
    private String validPassword = "b";

    private SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sp = getSharedPreferences("com.woebbi.a20191203_tictactoe", Context.MODE_PRIVATE);

        firstRun = sp.getBoolean("firstrun",true);
        if(firstRun) {
            setContentView(R.layout.activity_login);
            lAPasswordInput = findViewById(R.id.loginActivityPasswordInput);
            lAPasswordText = findViewById(R.id.loginActivityPasswordText);
            lAUsernameInput = findViewById(R.id.loginActivityUsernameInput);
            lAUsernameText = findViewById(R.id.loginActivityUsernameText);
            lAButtonSend = findViewById(R.id.loginActivityButtonSend);
            lAButtonAbort = findViewById(R.id.loginActivityButtonAbort);

            lAButtonSend.setOnClickListener(this);
            lAButtonAbort.setOnClickListener(this);
        }else{
            setContentView(R.layout.activity_mainmenu);
        }

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.loginActivityButtonSend: //LOGIN BUTTON
                String username = lAUsernameInput.getText().toString();
                String password = lAPasswordInput.getText().toString();
                if(username.equals(validUser) && password.equals(validPassword)){
                    firstRun = false;
                    SharedPreferences.Editor spe = sp.edit();
                    spe.putBoolean("firstRun",firstRun);
                    spe.putString("user",username);
                    spe.apply();

                    Intent ni = new Intent(this, MainMenuActivity.class);
                    startActivity(ni);
                    finish();
                }else{
                    Toast.makeText(this, "Benutzername oder Passwort falsch", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.loginActivityButtonAbort: //Abort BUTTON
                Toast.makeText(this, "Abort", Toast.LENGTH_LONG).show();
                break;
            default:
                Toast.makeText(this, "HÖÖ", Toast.LENGTH_LONG).show();
                break;
        }
    }

}
