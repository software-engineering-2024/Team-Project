import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTest {

    private User user;

    @BeforeEach
    public void setUp() {
        user = new User("user1", "John Doe");
    }

    @Test
    public void testGetUserID() {
        assertEquals("user1", user.getUserID(), "User ID should be 'user1'");
    }

    @Test
    public void testSetUserID() {
        user.setUserID("user2");
        assertEquals("user2", user.getUserID(), "User ID should be 'user2'");
    }

    @Test
    public void testGetUserName() {
        assertEquals("John Doe", user.getUserName(), "User name should be 'John Doe'");
    }

    @Test
    public void testSetUserName() {
        user.setUserName("Jane Doe");
        assertEquals("Jane Doe", user.getUserName(), "User name should be 'Jane Doe'");
    }

    @Test
    public void testUserConstructor() {
        User newUser = new User("user3", "Alice");
        assertEquals("user3", newUser.getUserID(), "User ID should be 'user3'");
        assertEquals("Alice", newUser.getUserName(), "User name should be 'Alice'");
    }
}
