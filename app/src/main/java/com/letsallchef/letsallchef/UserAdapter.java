package com.letsallchef.letsallchef;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by qubin on 7/4/17.
 */
public class UserAdapter extends ArrayAdapter<User> {
    private Context context;
    int resource;
    public UserAdapter(Context context, int resource, ArrayList<User> users) {
        super(context, resource, users);
        this.context=context;
        this.resource=resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Get the data item for this position
        User user = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.row, parent, false);
        }

        // Lookup view for data population
//        TextView tvLogin = (TextView) convertView.findViewById(R.id.tvLogin);
//        TextView tvUrl = (TextView) convertView.findViewById(R.id.tvUrl);

        // Populate the data into the template view using the data object
//        tvLogin.setText(user.login);
//        tvUrl.setText(user.url);
        return convertView;
    }
}
