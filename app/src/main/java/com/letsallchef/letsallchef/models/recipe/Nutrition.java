
package com.letsallchef.letsallchef.models.recipe;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Nutrition {

    @SerializedName("calorie")
    @Expose
    private int calorie;
    @SerializedName("sugar")
    @Expose
    private int sugar;
    @SerializedName("fat")
    @Expose
    private int fat;
    @SerializedName("protein")
    @Expose
    private int protein;

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

}
