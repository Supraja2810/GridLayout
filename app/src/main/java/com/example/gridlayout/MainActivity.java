package com.example.gridlayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public CardView card1,card2,card3,card4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card1 = (CardView)findViewById(R.id.card1);
        card2 = (CardView)findViewById(R.id.card2);
        card3 = (CardView)findViewById(R.id.card3);
        card4 = (CardView)findViewById(R.id.card4);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){
        Intent i;
        switch (v.getId()){
            case R.id.card1:
                i = new Intent(this,home.class);
                startActivity(i);
                break;
            case R.id.card2:
                i = new Intent(this,settings.class);
                startActivity(i);
                break;
            case R.id.card3:
                i = new Intent(this,favourites.class);
                startActivity(i);
                break;
            case R.id.card4:
                i = new Intent(this,help.class);
                startActivity(i);
                break;

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent i;
        switch (item.getItemId())
        {
            case R.id.feedback:
                i = new Intent(this,feedback.class);
                startActivity(i);
                return true;
            case R.id.history:
                i = new Intent(this,history.class);
                startActivity(i);
                return true;
            case R.id.dark:
                i = new Intent(this,dark.class);
                startActivity(i);
                return true;
            case R.id.light:
                i = new Intent(this,light.class);
                startActivity(i);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}


