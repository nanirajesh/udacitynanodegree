package com.nanodegree.udacity.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener{
    Button spotify;
    Button score;
    Button library;
    Button buildit;
    Button xyzreader;
    Button capstone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spotify= (Button) findViewById(R.id.spotify);
        score= (Button) findViewById(R.id.score);
        library= (Button) findViewById(R.id.library);
        buildit= (Button) findViewById(R.id.buildit);
        xyzreader= (Button) findViewById(R.id.xyzreader);
        capstone= (Button) findViewById(R.id.capstone);

        spotify.setOnClickListener(this);
        score.setOnClickListener(this);
        library.setOnClickListener(this);
        buildit.setOnClickListener(this);
        xyzreader.setOnClickListener(this);
        capstone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

      if(v.getId()==R.id.spotify){
          Toast.makeText(this, "This Button will redirect to Spotify App ", Toast.LENGTH_SHORT).show();
      }
      else  if(v.getId()==R.id.score){
            Toast.makeText(this, "This Button will redirect to Score App ", Toast.LENGTH_SHORT).show();
        }
      else  if(v.getId()==R.id.library){
            Toast.makeText(this, "This Button will redirect to Library App ", Toast.LENGTH_SHORT).show();
        }
      else  if(v.getId()==R.id.buildit){
            Toast.makeText(this, "This Button will redirect to Buildit App ", Toast.LENGTH_SHORT).show();
        }
       else if(v.getId()==R.id.xyzreader){
          Toast.makeText(this, "This Button will redirect to xyzreader App ", Toast.LENGTH_SHORT).show();
      }else{
            Toast.makeText(this, "This Button will redirect to Capstone App ", Toast.LENGTH_SHORT).show();
        }
    }
}