import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FeedbackFormTest {

    private FeedbackForm feedbackForm;

    @BeforeEach
    public void setUp() {
        feedbackForm = new FeedbackForm("form1", "user1", "This is feedback content");
    }

    @Test
    public void testGetFormID() {
        assertEquals("form1", feedbackForm.getFormID());
    }

    @Test
    public void testSetFormID() {
        feedbackForm.setFormID("form2");
        assertEquals("form2", feedbackForm.getFormID());
    }

    @Test
    public void testGetUserID() {
        assertEquals("user1", feedbackForm.getUserID());
    }

    @Test
    public void testSetUserID() {
        feedbackForm.setUserID("user2");
        assertEquals("user2", feedbackForm.getUserID());
    }

    @Test
    public void testGetContent() {
        assertEquals("This is feedback content", feedbackForm.getContent());
    }

    @Test
    public void testSetContent() {
        feedbackForm.setContent("Updated feedback content");
        assertEquals("Updated feedback content", feedbackForm.getContent());
    }
}

