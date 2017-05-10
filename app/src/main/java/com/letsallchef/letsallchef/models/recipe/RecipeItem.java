
package com.letsallchef.letsallchef.models.recipe;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RecipeItem {

    @SerializedName("_id")
    @Expose
    private String id;

    @SerializedName("cover")
    @Expose
    private String cover;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("url")
    @Expose
    private String url;

    @SerializedName("course")
    @Expose
    private String course;

    @SerializedName("cuisine")
    @Expose
    private String cuisine;

    @SerializedName("category")
    @Expose
    private String category;

    @SerializedName("yield_number")
    @Expose
    private int yieldNumber;

    @SerializedName("yield_unit")
    @Expose
    private String yieldUnit;

    @SerializedName("prep_time")
    @Expose
    private int prepTime;

    @SerializedName("ease")
    @Expose
    private int ease;

    @SerializedName("sub_category")
    @Expose
    private String subCategory;

    @SerializedName("rating")
    @Expose
    private int rating;

    @SerializedName("__v")
    @Expose
    private int v;

    @SerializedName("comments")
    @Expose
    private List<Comment> comments = null;

    @SerializedName("variants_of_recipe")
    @Expose
    private List<Object> variantsOfRecipe = null;

    @SerializedName("combinations")
    @Expose
    private List<Object> combinations = null;

    @SerializedName("nutrition")
    @Expose
    private Nutrition nutrition;

    @SerializedName("instructions")
    @Expose
    private List<Instruction> instructions = null;

    @SerializedName("ingredients")
    @Expose
    private List<Ingredient> ingredients = null;

    @SerializedName("utensils")
    @Expose
    private List<Object> utensils = null;

    @SerializedName("tags")
    @Expose
    private List<String> tags = null;

    @SerializedName("images")
    @Expose
    private List<Object> images = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getYieldNumber() {
        return yieldNumber;
    }

    public void setYieldNumber(int yieldNumber) {
        this.yieldNumber = yieldNumber;
    }

    public String getYieldUnit() {
        return yieldUnit;
    }

    public void setYieldUnit(String yieldUnit) {
        this.yieldUnit = yieldUnit;
    }

    public int getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(int prepTime) {
        this.prepTime = prepTime;
    }

    public int getEase() {
        return ease;
    }

    public void setEase(int ease) {
        this.ease = ease;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Object> getVariantsOfRecipe() {
        return variantsOfRecipe;
    }

    public void setVariantsOfRecipe(List<Object> variantsOfRecipe) {
        this.variantsOfRecipe = variantsOfRecipe;
    }

    public List<Object> getCombinations() {
        return combinations;
    }

    public void setCombinations(List<Object> combinations) {
        this.combinations = combinations;
    }

    public Nutrition getNutrition() {
        return nutrition;
    }

    public void setNutrition(Nutrition nutrition) {
        this.nutrition = nutrition;
    }

    public List<Instruction> getInstructions() {
        return instructions;
    }

    public void setInstructions(List<Instruction> instructions) {
        this.instructions = instructions;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Object> getUtensils() {
        return utensils;
    }

    public void setUtensils(List<Object> utensils) {
        this.utensils = utensils;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<Object> getImages() {
        return images;
    }

    public void setImages(List<Object> images) {
        this.images = images;
    }

}
