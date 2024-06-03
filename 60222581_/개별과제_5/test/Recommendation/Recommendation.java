public class Recommendation {
    private String recommendationID;
    private String userID;
    private String clothingItemID;
    private String reason;

    public Recommendation(String recommendationID, String userID, String clothingItemID, String reason) {
        this.recommendationID = recommendationID;
        this.userID = userID;
        this.clothingItemID = clothingItemID;
        this.reason = reason;
    }

    public String getRecommendationID() {
        return recommendationID;
    }

    public String getUserID() {
        return userID;
    }

    public String getClothingItemID() {
        return clothingItemID;
    }

    public String getReason() {
        return reason;
    }
}

