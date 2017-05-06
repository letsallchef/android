package com.letsallchef.letsallchef;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.letsallchef.letsallchef.models.Comment;
import com.letsallchef.letsallchef.models.RecipeItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qubin on 29/4/17.
 */
public class RecipeItemAdapter extends ArrayAdapter<Comment> {

    private Context context;
    int resource;
    public RecipeItemAdapter(Context context, int resource, List<Comment> comments) {
        super(context, resource, comments);
        this.context=context;
        this.resource=resource;
    }
    public View getView(int position, View convertView, ViewGroup parent) {

        // Get the data item for this position
        Comment comment = getItem(position);

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
        tvGroceryTitle.setText(comment.getUser().getUsername());
        tvGroceryDesc.setText(comment.getBody());
        return convertView;
    }
}
