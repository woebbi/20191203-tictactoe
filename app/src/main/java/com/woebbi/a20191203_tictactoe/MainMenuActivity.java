package com.woebbi.a20191203_tictactoe;

import android.content.Intent;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.LinearLayoutCompat;



public class MainMenuActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayoutCompat mmOuterLayout;
    private LinearLayoutCompat mmInnerLayout;
    private AppCompatButton mmStart;
    private AppCompatButton mmHighscore;
    private AppCompatButton mmSettings;
    private AppCompatButton mmAbout;
    private TextView mmHeadline;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);
        mmHeadline = findViewById(R.id.mmHeadline);
        mmOuterLayout = findViewById(R.id.mmOuterLayout);
        mmInnerLayout = findViewById(R.id.mmInnerLayout);
        mmStart = findViewById(R.id.mmStart);
        mmHighscore = findViewById(R.id.mmHighscore);
        mmSettings = findViewById(R.id.mmSettings);
        mmAbout = findViewById(R.id.mmAbout);


        mmStart.setOnClickListener(this);
        mmHighscore.setOnClickListener(this);
        mmSettings.setOnClickListener(this);
        mmAbout.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.mmStart: //START BUTTON
                Toast.makeText(this, "Start", Toast.LENGTH_LONG).show();
                Intent nig = new Intent(this,GameActivity.class);
                startActivity(nig);
                break;
            case R.id.mmHighscore: //Highscore BUTTON
                Toast.makeText(this, "Highscore", Toast.LENGTH_LONG).show();
                Intent nih = new Intent(this,HighscoreActivity.class);
                startActivity(nih);
                break;
            case R.id.mmSettings: //Settings BUTTON
                Toast.makeText(this, "Settings", Toast.LENGTH_LONG).show();
                Intent nis = new Intent(this, SettingsActivity.class);
                startActivity(nis);
                break;
            case R.id.mmAbout: //About BUTTON
                Toast.makeText(this, "About", Toast.LENGTH_LONG).show();
                Intent nia = new Intent(this,AboutActivity.class);
                startActivity(nia);
                break;
            default:
                Toast.makeText(this, "Default", Toast.LENGTH_LONG).show();
                break;
        }
    }


}
