package com.letsallchef.letsallchef;

import com.letsallchef.letsallchef.models.grocery.GroceryItem;
import com.letsallchef.letsallchef.models.recipelist.RecipeListItem;
import com.letsallchef.letsallchef.models.restaurantlist.RestaurantListItem;

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

//    @GET("/bins/g8hrx")
//    Call<ArrayList<RecipeListItem>> recipeList();

    @GET("/bins/1afaup")
    Call<ArrayList<RecipeListItem>> recipeList();

    @GET("/bins/1hicy9")
    Call<ArrayList<RestaurantListItem>> restaurantList();

//    @GET("")
//    Call<ArrayList<RecipeItem>> commentList();
}
