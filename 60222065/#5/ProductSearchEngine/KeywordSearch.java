package ProductSearchEngine;
import java.util.List;
import java.util.stream.Collectors;

public class KeywordSearch extends SearchStrategy {
    public List<Product> search(String keyword, List<Product> products) {
        return products.stream()
            .filter(p -> p.getName().toLowerCase().contains(keyword.toLowerCase()))
            .collect(Collectors.toList());
    }
}
