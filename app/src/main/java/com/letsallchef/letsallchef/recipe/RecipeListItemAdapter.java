package com.letsallchef.letsallchef.recipe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.letsallchef.letsallchef.R;
import com.letsallchef.letsallchef.models.recipelist.RecipeListItem;

import java.util.List;

/**
 * Created by qubin on 29/4/17.
 */
public class RecipeListItemAdapter extends ArrayAdapter<RecipeListItem> {

    private Context context;
    int resource;
    public RecipeListItemAdapter(Context context, int resource, List<RecipeListItem> recipeListItems) {
        super(context, resource, recipeListItems);
        this.context=context;
        this.resource=resource;
    }
    public View getView(int position, View convertView, ViewGroup parent) {

        // Get the data item for this position
        RecipeListItem recipeListItem = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.row, parent, false);
        }

        // Lookup view for data population
        ImageView ivCover = (ImageView) convertView.findViewById(R.id.GroceryCover);
        TextView tvGroceryTitle = (TextView) convertView.findViewById(R.id.GroceryTitle);
        TextView tvGroceryDesc = (TextView) convertView.findViewById(R.id.GroceryDesc);

        // Populate the data into the template view using the data object
//        ivCover.setI
        tvGroceryTitle.setText(recipeListItem.getTitle());
        tvGroceryDesc.setText(recipeListItem.getDescription());
        return convertView;
    }
}
