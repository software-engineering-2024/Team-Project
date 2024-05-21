public class Recommendation {
    // ①멤버 변수
    private String recommendationID;
    private String userID;
    private String clothingItemID;
    private String reason;

    // ②메서드의 함수 원형
    public Recommendation(String recommendationID, String userID, String clothingItemID, String reason) {
        this.recommendationID = recommendationID;
        this.userID = userID;
        this.clothingItemID = clothingItemID;
        this.reason = reason;
    }

    public String getRecommendationID() {
        return null;
    }

    public String getUserID() {
        return null;
    }

    public String getClothingItemID() {
        return null;
    }

    public String getReason() {
        return null;
    }
}