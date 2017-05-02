package com.letsallchef.letsallchef;

/**
 * Created by qubin on 22/4/17.
 */
public class GroceryItem {
    public String _id,title,description;
    public String[] categories;

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public String[] getCategories() {
        return categories;
    }

}
