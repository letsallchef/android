package com.letsallchef.letsallchef;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class GroceriesActivity extends AppCompatActivity {

    private ListView groceryListView;
    ArrayList<GroceryItem> grocery;

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

                Call<ArrayList<GroceryItem>> call=client.groceryList();
                call.enqueue(new Callback<ArrayList<GroceryItem>>() {

                    @Override
                    public void onResponse(Call<ArrayList<GroceryItem>> call, Response<ArrayList<GroceryItem>> response) {
                        grocery = response.body();
                        GroceryItemAdapter adapter = new GroceryItemAdapter(getApplicationContext(),R.layout.row,grocery);
                        groceryListView.setAdapter(adapter);
                    }

                    @Override
                    public void onFailure(Call<ArrayList<GroceryItem>> call, Throwable t) {

                    }
                });

    }
}
