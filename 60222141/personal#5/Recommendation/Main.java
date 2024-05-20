public class Main {
    public static void main(String[] args) {
        RecommendationBuilder builder = new ConcreteRecommendationBuilder();
        Recommendation recommendation = builder
            .setRecommendationID("...")
            .setUserID("...")
            .setClothingItemID("...")
            .setReason("...")
            .build();

        System.out.println("Recommendation ID: " + recommendation.getRecommendationID());
        System.out.println("User ID: " + recommendation.getUserID());
        System.out.println("Clothing Item ID: " + recommendation.getClothingItemID());
        System.out.println("Reason: " + recommendation.getReason());
    }
}
