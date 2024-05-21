public class FeedbackForm {
    private String formID;
    private String userID;
    private String content;

    public FeedbackForm(String formID, String userID, String content) {
        this.formID = formID;
        this.userID = userID;
        this.content = content;
    }

    // Getter and Setter methods
    public String getFormID() {
        return formID;
    }

    public void setFormID(String formID) {
        this.formID = formID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
