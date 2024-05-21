package ProductSearchEngine;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class CategorySearch extends SearchStrategy {
    public List<Product> search(String category, List<Product> products) {
        return products.stream()
            .filter(p -> p.getCategory().equalsIgnoreCase(category))
            .collect(Collectors.toList());
    }
}
