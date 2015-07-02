package com.example.android.courtcounter;

import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize scores
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);

        //hide action bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void plusThreePointsA(View view){
        teamAScore = teamAScore + 3;
        displayForTeamA(teamAScore);
    }

    public void plusTwoPointsA(View view){
        teamAScore = teamAScore + 2;
        displayForTeamA(teamAScore);
    }

    public void plusOnePointA(View view){
        teamAScore = teamAScore + 1;
        displayForTeamA(teamAScore);
    }

    public void plusThreePointsB(View view){
        teamBScore = teamBScore + 3;
        displayForTeamB(teamBScore);
    }

    public void plusTwoPointsB(View view){
        teamBScore = teamBScore + 2;
        displayForTeamB(teamBScore);
    }

    public void plusOnePointB(View view){
        teamBScore = teamBScore + 1;
        displayForTeamB(teamBScore);
    }
}
