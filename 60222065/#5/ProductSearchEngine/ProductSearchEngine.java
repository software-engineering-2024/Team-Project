package ProductSearchEngine;
import java.util.*;
public class ProductSearchEngine {
	public List<Product> searchByCategory(String category) {
        return getSearchStrategy("category").search(category);
    }

    public List<Product> searchByKeyword(String keyword) {
        return getSearchStrategy("keyword").search(keyword);
    }

    private SearchStrategy getSearchStrategy(String type) {
        if (type.equals("category")) {
            return new CategorySearch();
        } else {
            return new KeywordSearch();
        }
    }
}
