public class Feedback {
    private String feedbackID;
    private String userID;
    private String item;
    private String content;

    public Feedback(String feedbackID, String userID, String item, String content) {
        this.feedbackID = feedbackID;
        this.userID = userID;
        this.item = item;
        this.content = content;
    }

    // Getter and Setter methods
    public String getFeedbackID() {
        return feedbackID;
    }

    public void setFeedbackID(String feedbackID) {
        this.feedbackID = feedbackID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
