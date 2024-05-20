public class ConcreteRecommendationBuilder implements RecommendationBuilder {
    private String recommendationID;
    private String userID;
    private String clothingItemID;
    private String reason;

    @Override
    public RecommendationBuilder setRecommendationID(String recommendationID) {
        return this;
    }

    @Override
    public RecommendationBuilder setUserID(String userID) {
        return this;
    }

    @Override
    public RecommendationBuilder setClothingItemID(String clothingItemID) {
        return this;
    }

    @Override
    public RecommendationBuilder setReason(String reason) {
        return this;
    }

    @Override
    public Recommendation build() {
        return new Recommendation(recommendationID, userID, clothingItemID, reason);
    }
}

