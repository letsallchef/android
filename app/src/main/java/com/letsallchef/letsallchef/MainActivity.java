package com.letsallchef.letsallchef;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button groceriesButton, recipesButton, restaurantsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        groceriesButton = (Button)findViewById(R.id.groceriesbutton);
        groceriesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent(getApplicationContext(),GroceriesActivity.class);
                startActivity(i);
            }
        });

        recipesButton = (Button)findViewById(R.id.recipesbutton);
        recipesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent(getApplicationContext(),RecipesActivity.class);
                startActivity(i);
            }
        });

        restaurantsButton = (Button)findViewById(R.id.restaurantsbutton);
        restaurantsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent(getApplicationContext(),RestaurantsActivity.class);
                startActivity(i);
            }
        });
    }
}
