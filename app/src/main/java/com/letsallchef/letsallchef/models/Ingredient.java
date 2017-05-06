
package com.letsallchef.letsallchef.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ingredient {

    @SerializedName("grocery")
    @Expose
    private Grocery grocery;
    @SerializedName("metric_quantity")
    @Expose
    private int metricQuantity;
    @SerializedName("metric_unit")
    @Expose
    private String metricUnit;
    @SerializedName("note")
    @Expose
    private String note;

    public Grocery getGrocery() {
        return grocery;
    }

    public void setGrocery(Grocery grocery) {
        this.grocery = grocery;
    }

    public int getMetricQuantity() {
        return metricQuantity;
    }

    public void setMetricQuantity(int metricQuantity) {
        this.metricQuantity = metricQuantity;
    }

    public String getMetricUnit() {
        return metricUnit;
    }

    public void setMetricUnit(String metricUnit) {
        this.metricUnit = metricUnit;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}
