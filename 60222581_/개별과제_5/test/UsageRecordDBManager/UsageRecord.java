import static org.junit.Assert.*;
import org.junit.*;
import java.util.Date;

public class UsageRecordTest {

    private UsageRecord record;

    @Before
    public void setUp() {
        record = new UsageRecord();
    }

    @Test
    public void getRecordDetails_ReturnsEmptyStringWhenNoDetailsSet() {
        assertEquals("", record.getRecordDetails());
    }

    @Test
    public void getRecordDetails_ReturnsDetailsAfterSetting() {
        record.setRecordID("1");
        record.setUserID("user123");
        record.setItemID("item1");
        record.setTimestamp(new Date());
        record.setAction("Action");

        assertEquals("Record ID: 1, User ID: user123, Item ID: item1, Timestamp: [timestamp], Action: Action", record.getRecordDetails());
    }

    @Test
    public void setRecordID_SetsRecordIDCorrectly() {
        record.setRecordID("1");
        assertEquals("1", record.getRecordID());
    }

    @Test
    public void setUserID_SetsUserIDCorrectly() {
        record.setUserID("user123");
        assertEquals("user123", record.getUserID());
    }

    @Test
    public void setItemID_SetsItemIDCorrectly() {
        record.setItemID("item1");
        assertEquals("item1", record.getItemID());
    }
}


