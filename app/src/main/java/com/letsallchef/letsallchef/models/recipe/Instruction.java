
package com.letsallchef.letsallchef.models.recipe;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Instruction {

    @SerializedName("inst_method")
    @Expose
    private String instMethod;
    @SerializedName("time_taken")
    @Expose
    private int timeTaken;
    @SerializedName("inst_body")
    @Expose
    private String instBody;

    public String getInstMethod() {
        return instMethod;
    }

    public void setInstMethod(String instMethod) {
        this.instMethod = instMethod;
    }

    public int getTimeTaken() {
        return timeTaken;
    }

    public void setTimeTaken(int timeTaken) {
        this.timeTaken = timeTaken;
    }

    public String getInstBody() {
        return instBody;
    }

    public void setInstBody(String instBody) {
        this.instBody = instBody;
    }

}
