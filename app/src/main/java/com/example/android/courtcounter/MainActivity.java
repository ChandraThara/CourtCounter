package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //displayForTeamA(0);
    }
    public void addthreeForA( View view ){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }
    public void addtwoForA( View view ){
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }
    public void addoneForA( View view ){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    public void addthreeForB( View view ){
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }
    public void addtwoForB( View view ){
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }
    public void addoneForB( View view ){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    public void displayForTeamA(int  scoreTeamAs){
        TextView scoreTeamAView = (TextView)findViewById(R.id.team_a_score);
        scoreTeamAView.setText(""+scoreTeamAs);
    }
    public void displayForTeamB(int  scoreTeamBs){
        TextView scoreTeamAView = (TextView)findViewById(R.id.team_b_score);
        scoreTeamAView.setText(""+scoreTeamBs);
    }
    public void resetScores( View view ){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
