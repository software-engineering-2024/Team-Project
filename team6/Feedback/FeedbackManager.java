import java.util.ArrayList;
import java.util.List;

public class FeedbackManager {
    private List<Feedback> feedbackList;

    public FeedbackManager() {
        feedbackList = new ArrayList<>();
    }

    public void execute(Command command) {
        command.execute();
    }

    public void addFeedback(Feedback feedback) {
        feedbackList.add(feedback);
    }

    public Feedback[] getFeedback(String userID) {
        List<Feedback> userFeedback = new ArrayList<>();
        for (Feedback feedback : feedbackList) {
            if (feedback.getUserID().equals(userID)) {
                userFeedback.add(feedback);
            }
        }
        return userFeedback.toArray(new Feedback[0]);
    }
}
