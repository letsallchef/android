package com.letsallchef.letsallchef;

import com.letsallchef.letsallchef.models.RecipeItem;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by qubin on 22/4/17.
 */
public interface LacClient {
    String ENDPOINT = "https://api.myjson.com";
    @GET("/bins/heplj")
    Call<ArrayList<GroceryListItem>> groceryList();

    @GET("/bins/g8hrx")
    Call<RecipeItem> recipeList();

    @GET("")
    Call<ArrayList<RestaurantListItem>> restaurantList();

//    @GET("")
//    Call<ArrayList<RecipeItem>> commentList();
}
