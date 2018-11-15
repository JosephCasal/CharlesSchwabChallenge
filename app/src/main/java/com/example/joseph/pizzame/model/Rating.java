
package com.example.joseph.pizzame.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Rating implements Serializable
{

    private String averageRating;
    private String totalRatings;
    private String totalReviews;
    private Object lastReviewDate;
    private Object lastReviewIntro;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -7454011806975374234L;

    public String getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(String averageRating) {
        this.averageRating = averageRating;
    }

    public String getTotalRatings() {
        return totalRatings;
    }

    public void setTotalRatings(String totalRatings) {
        this.totalRatings = totalRatings;
    }

    public String getTotalReviews() {
        return totalReviews;
    }

    public void setTotalReviews(String totalReviews) {
        this.totalReviews = totalReviews;
    }

    public Object getLastReviewDate() {
        return lastReviewDate;
    }

    public void setLastReviewDate(Object lastReviewDate) {
        this.lastReviewDate = lastReviewDate;
    }

    public Object getLastReviewIntro() {
        return lastReviewIntro;
    }

    public void setLastReviewIntro(Object lastReviewIntro) {
        this.lastReviewIntro = lastReviewIntro;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
