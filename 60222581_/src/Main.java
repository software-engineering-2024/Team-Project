public class Main {
    public static void main(String[] args) {
        RecommendationBuilder builder = new ConcreteRecommendationBuilder();
        Recommendation recommendation = builder
            .setRecommendationID("rec1")
            .setUserID("user1")
            .setClothingItemID("clothing1")
            .setReason("Looks great!")
            .build();

        System.out.println("Recommendation ID: " + recommendation.getRecommendationID());
        System.out.println("User ID: " + recommendation.getUserID());
        System.out.println("Clothing Item ID: " + recommendation.getClothingItemID());
        System.out.println("Reason: " + recommendation.getReason());
    }
}
