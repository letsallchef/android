package com.letsallchef.letsallchef;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.letsallchef.letsallchef.models.Comment;
import com.letsallchef.letsallchef.models.RecipeItem;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class GroceriesActivity extends AppCompatActivity {

    private ListView groceryListView;
//    ArrayList<GroceryListItem> grocery;
    RecipeItem grocery;
    List<Comment> comments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groceries);

        groceryListView = (ListView) findViewById(R.id.groceriesListView);

        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                .create();

        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(LacClient.ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create(gson));

        Retrofit retrofit = builder.build();
        final LacClient client = retrofit.create(LacClient.class);

//        Call<ArrayList<GroceryListItem>> call=client.groceryList();
//        call.enqueue(new Callback<ArrayList<GroceryListItem>>() {
//
//            @Override
//            public void onResponse(Call<ArrayList<GroceryListItem>> call, Response<ArrayList<GroceryListItem>> response) {
//                grocery = response.body();
//                GroceryItemAdapter adapter = new GroceryItemAdapter(getApplicationContext(),R.layout.row,grocery);
//                groceryListView.setAdapter(adapter);
//            }
//
//            @Override
//            public void onFailure(Call<ArrayList<GroceryListItem>> call, Throwable t) {
//
//            }
//        });


        Call<RecipeItem> call=client.recipeList();
        call.enqueue(new Callback<RecipeItem>() {

            @Override
            public void onResponse(Call<RecipeItem> call, Response<RecipeItem> response) {
                grocery = response.body();
                comments = grocery.getComments();
//                GroceryItemAdapter adapter = new GroceryItemAdapter(getApplicationContext(),R.layout.row,grocery);
                RecipeItemAdapter adapter = new RecipeItemAdapter(getApplicationContext(),R.layout.row,comments);
                groceryListView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<RecipeItem> call, Throwable t) {

            }
        });


    }
}
