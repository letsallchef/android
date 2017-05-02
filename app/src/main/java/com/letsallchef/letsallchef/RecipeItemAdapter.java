package com.letsallchef.letsallchef;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by qubin on 29/4/17.
 */
public class RecipeItemAdapter extends ArrayAdapter<RecipeItem> {

    private Context context;
    int resource;
    public RecipeItemAdapter(Context context, int resource, ArrayList<RecipeItem> recipe) {
        super(context, resource, recipe);
        this.context=context;
        this.resource=resource;
    }

    //TO DO Add code
}
