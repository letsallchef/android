package com.letsallchef.letsallchef;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by qubin on 29/4/17.
 */
public class RestaurantItemAdapter extends ArrayAdapter<RestaurantItem> {

    private Context context;
    int resource;
    public RestaurantItemAdapter(Context context, int resource, ArrayList<RestaurantItem> restaurant) {
        super(context, resource, restaurant);
        this.context=context;
        this.resource=resource;
    }

    //TO DO Add code
}
