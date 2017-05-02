package com.letsallchef.letsallchef;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RecipesActivity extends AppCompatActivity {

    private ListView recipeListView;
    ArrayList<RecipeItem> recipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);

        recipeListView = (ListView) findViewById(R.id.recipesListView);

        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                .create();

        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(LacClient.ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create(gson));

        Retrofit retrofit = builder.build();
        final LacClient client = retrofit.create(LacClient.class);

        Call<ArrayList<RecipeItem>> call=client.recipeList();
        call.enqueue(new Callback<ArrayList<RecipeItem>>() {

            @Override
            public void onResponse(Call<ArrayList<RecipeItem>> call, Response<ArrayList<RecipeItem>> response) {
                recipe = response.body();
                RecipeItemAdapter adapter = new RecipeItemAdapter(getApplicationContext(),R.layout.row, recipe); //Needs Edit
                recipeListView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<ArrayList<RecipeItem>> call, Throwable t) {

            }
        });

    }
}
