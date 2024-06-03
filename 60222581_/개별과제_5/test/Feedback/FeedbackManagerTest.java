import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FeedbackManagerTest {

    private FeedbackManager manager;
    private Feedback feedback1;
    private Feedback feedback2;

    @BeforeEach
    public void setUp() {
        manager = new FeedbackManager();
        feedback1 = new Feedback("fb1", "user1", "item1", "Great product!");
        feedback2 = new Feedback("fb2", "user1", "item2", "Not bad");
    }

    @Test
    public void testAddFeedback() {
        manager.addFeedback(feedback1);
        List<Feedback> feedbackList = getFeedbackList(manager);
        assertEquals(1, feedbackList.size());
        assertEquals("fb1", feedbackList.get(0).getFeedbackID());
    }

    @Test
    public void testGetFeedback() {
        manager.addFeedback(feedback1);
        manager.addFeedback(feedback2);
        Feedback[] feedbacks = manager.getFeedback("user1");
        assertEquals(2, feedbacks.length);
        assertEquals("fb1", feedbacks[0].getFeedbackID());
        assertEquals("fb2", feedbacks[1].getFeedbackID());
    }

    @Test
    public void testGetFeedbackForNonexistentUser() {
        Feedback[] feedbacks = manager.getFeedback("user2");
        assertEquals(0, feedbacks.length);
    }

    @Test
    public void testExecuteCommand() {
        Command command = new ConcreteCommand();
        manager.execute(command);
    }

    @Test
    public void testFeedbackListIsPrivate() {
        try {
            var field = FeedbackManager.class.getDeclaredField("feedbackList");
            assertFalse(field.canAccess(manager));
        } catch (NoSuchFieldException e) {
            fail("feedbackList field should exist");
        }
    }

    private List<Feedback> getFeedbackList(FeedbackManager manager) {
        try {
            var field = FeedbackManager.class.getDeclaredField("feedbackList");
            field.setAccessible(true);
            return (List<Feedback>) field.get(manager);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
