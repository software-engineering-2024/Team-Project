public class Main {
    public static void main(String[] args) {
        // FeedbackManager 생성
        FeedbackManager manager = new FeedbackManager();

        // FeedbackForm 생성
        FeedbackForm form = new FeedbackForm("form1", "user1", "This is feedback content");

        // Command 생성
        Command command = new ConcreteCommand();

        // Command 실행
        manager.execute(command);

        // Feedback 생성 및 추가
        Feedback feedback = new Feedback("fb1", "user1", "item1", "Great product!");
        manager.addFeedback(feedback);

        // 사용자 피드백 가져오기
        Feedback[] feedbacks = manager.getFeedback("user1");
        for (Feedback fb : feedbacks) {
            System.out.println("Feedback ID: " + fb.getFeedbackID());
            System.out.println("User ID: " + fb.getUserID());
            System.out.println("Item: " + fb.getItem());
            System.out.println("Content: " + fb.getContent());
        }
    }
}
