public interface RecommendationBuilder {
    RecommendationBuilder setRecommendationID(String recommendationID);
    RecommendationBuilder setUserID(String userID);
    RecommendationBuilder setClothingItemID(String clothingItemID);
    RecommendationBuilder setReason(String reason);
    Recommendation build();
}
