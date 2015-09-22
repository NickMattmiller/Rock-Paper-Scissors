package com.nickmattmiller.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    public enum Moves{PAPER, ROCK, SCISSORS};
    public enum Outcomes{WIN, LOSS, TIE};

    private Moves humanChoice ;
    private Moves computerChoice;
    private Outcomes winningMove;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rockButton = (Button)findViewById(R.id.btnRock);
        rockButton.setOnClickListener(this);

        Button paperButton = (Button)findViewById(R.id.btnPaper);
        paperButton.setOnClickListener(this);

        Button scissorImage = (Button)findViewById(R.id.btnScissors);
        scissorImage.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){
        switch (v.getId())
        {
            case R.id.btnRock:
                humanChoice = Moves.ROCK;
                break;
            case R.id.btnPaper:
                humanChoice = Moves.PAPER;
                break;
            case R.id.btnScissors:
                humanChoice = Moves.SCISSORS;
                break;
        }
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
}
