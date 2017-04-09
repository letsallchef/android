package com.letsallchef.letsallchef;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by qubin on 5/4/17.
 */
public interface GitHubClient {
    String ENDPOINT = "https://api.github.com";
    @GET("/users")
    Call<ArrayList<User>> userList();
}
