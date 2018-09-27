package com.scoreboard.denis.footballscoreboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Integer firstTeamCounter = 0;
    private Integer secondTeamCounter = 0;
    private final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("firstTeamCounter", firstTeamCounter);
        outState.putInt("secondTeamCounter", secondTeamCounter);
        Log.d(TAG, "onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null && savedInstanceState.containsKey("firstTeamCounter") && savedInstanceState.containsKey("secondTeamCounter")) {
            firstTeamCounter = savedInstanceState.getInt("firstTeamCounter");
            secondTeamCounter = savedInstanceState.getInt("secondTeamCounter");
        }
        Log.d(TAG, "onRestoreInstanceState");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
        resetUI();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
        resetUI();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    private void resetUI() {
        ((TextView) findViewById(R.id.firstTeam)).setText(firstTeamCounter.toString());
        ((TextView) findViewById(R.id.secondTeam)).setText(secondTeamCounter.toString());
        Log.d(TAG, "resetUI");
    }

    public void onClickFirstTeamButton(View view) {
        firstTeamCounter++;
        TextView counterViev = (TextView) findViewById(R.id.firstTeam);
        counterViev.setText(firstTeamCounter.toString());
    }

    public void onClickSecondTeamButton(View view) {
        secondTeamCounter++;
        TextView counterViev = (TextView) findViewById(R.id.secondTeam);
        counterViev.setText(secondTeamCounter.toString());
    }

    public void onClickResetButton(View view) {
        firstTeamCounter = 0;
        secondTeamCounter = 0;
        TextView firstTeamViev = (TextView) findViewById(R.id.firstTeam);
        TextView secondTeamViev = (TextView) findViewById(R.id.secondTeam);
        firstTeamViev.setText(firstTeamCounter.toString());
        secondTeamViev.setText(secondTeamCounter.toString());
    }
}
