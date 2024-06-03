import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FeedbackTest {

    private Feedback feedback;

    @BeforeEach
    public void setUp() {
        feedback = new Feedback("fb1", "user1", "item1", "Great product!");
    }

    @Test
    public void testGetFeedbackID() {
        assertEquals("fb1", feedback.getFeedbackID());
    }

    @Test
    public void testSetFeedbackID() {
        feedback.setFeedbackID("fb2");
        assertEquals("fb2", feedback.getFeedbackID());
    }

    @Test
    public void testGetUserID() {
        assertEquals("user1", feedback.getUserID());
    }

    @Test
    public void testSetUserID() {
        feedback.setUserID("user2");
        assertEquals("user2", feedback.getUserID());
    }

    @Test
    public void testGetContent() {
        assertEquals("Great product!", feedback.getContent());
    }

    @Test
    public void testSetContent() {
        feedback.setContent("Good service!");
        assertEquals("Good service!", feedback.getContent());
    }

    @Test
    public void testGetItem() {
        assertEquals("item1", feedback.getItem());
    }

    @Test
    public void testSetItem() {
        feedback.setItem("item2");
        assertEquals("item2", feedback.getItem());
    }
}


