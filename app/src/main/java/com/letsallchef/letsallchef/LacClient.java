package com.letsallchef.letsallchef;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by qubin on 22/4/17.
 */
public interface LacClient {
    String ENDPOINT = "https://api.myjson.com";
    @GET("/bins/heplj")
    Call<ArrayList<GroceryItem>> groceryList();

    @GET("")
    Call<ArrayList<RecipeItem>> recipeList();

    @GET("")
    Call<ArrayList<RestaurantItem>> restaurantList();
}
