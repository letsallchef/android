package com.letsallchef.letsallchef;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by qubin on 22/4/17.
 */
public class GroceryItemAdapter extends ArrayAdapter<GroceryListItem> {
    private Context context;
    int resource;
    public GroceryItemAdapter(Context context, int resource, ArrayList<GroceryListItem> grocery) {
        super(context, resource, grocery);
        this.context=context;
        this.resource=resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Get the data item for this position
        GroceryListItem groceryListItem = getItem(position);

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
        tvGroceryTitle.setText(groceryListItem.title);
        tvGroceryDesc.setText(groceryListItem._id);
        return convertView;
    }
}
