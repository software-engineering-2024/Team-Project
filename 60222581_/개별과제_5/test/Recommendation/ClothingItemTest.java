import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClothingItemTest {

    private ClothingItem clothingItem;

    @BeforeEach
    public void setUp() {
        clothingItem = new ClothingItem("item1", "T-Shirt");
    }

    @Test
    public void testGetItemID() {
        assertEquals("item1", clothingItem.getItemID(), "Item ID should be 'item1'");
    }

    @Test
    public void testSetItemID() {
        clothingItem.setItemID("item2");
        assertEquals("item2", clothingItem.getItemID(), "Item ID should be 'item2'");
    }

    @Test
    public void testGetItemName() {
        assertEquals("T-Shirt", clothingItem.getItemName(), "Item name should be 'T-Shirt'");
    }

    @Test
    public void testSetItemName() {
        clothingItem.setItemName("Sweater");
        assertEquals("Sweater", clothingItem.getItemName(), "Item name should be 'Sweater'");
    }

    @Test
    public void testClothingItemConstructor() {
        ClothingItem newItem = new ClothingItem("item3", "Jeans");
        assertEquals("item3", newItem.getItemID(), "Item ID should be 'item3'");
        assertEquals("Jeans", newItem.getItemName(), "Item name should be 'Jeans'");
    }
}

