
package com.letsallchef.letsallchef.models.grocery;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GroceryItem {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("also_known_as")
    @Expose
    private String alsoKnownAs;
    @SerializedName("cover")
    @Expose
    private String cover;
    @SerializedName("metric_units")
    @Expose
    private List<String> metricUnits = null;
    @SerializedName("categories")
    @Expose
    private List<String> categories = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAlsoKnownAs() {
        return alsoKnownAs;
    }

    public void setAlsoKnownAs(String alsoKnownAs) {
        this.alsoKnownAs = alsoKnownAs;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public List<String> getMetricUnits() {
        return metricUnits;
    }

    public void setMetricUnits(List<String> metricUnits) {
        this.metricUnits = metricUnits;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

}
