package ProductSearchEngine;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.HashMap;

public class ProductSearchEngine {
    private Map<String, SearchStrategy> strategies;
    private List<Product> products;
    public ProductSearchEngine() {
        this.strategies = new HashMap<>();
        this.products = new ArrayList<>();
        this.strategies.put("category", new CategorySearch());
        this.strategies.put("keyword", new KeywordSearch());
        initializeProducts();
    }

    // 초기 제품 목록을 설정하는 메서드
    private void initializeProducts() {
        this.products.add(new Product("Laptop", 999.99, "Electronics"));
        this.products.add(new Product("Smartphone", 499.99, "Electronics"));
        this.products.add(new Product("Book", 29.99, "Books"));
        this.products.add(new Product("Headphones", 59.99, "Electronics"));
    }

    // 카테고리로 제품을 검색하는 메서드
    public List<Product> searchByCategory(String category) {
        return this.strategies.get("category").search(category, this.products);
    }

    // 키워드로 제품을 검색하는 메서드
    public List<Product> searchByKeyword(String keyword) {
        return this.strategies.get("keyword").search(keyword, this.products);
    }

    // 새로운 제품을 추가하는 메서드
    public void addProduct(Product product) {
        this.products.add(product);
    }

    // 제품을 삭제하는 메서드
    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    // 가격 범위로 제품을 필터링하는 메서드
    public List<Product> filterProductsByPrice(double minPrice, double maxPrice) {
        return this.products.stream()
            .filter(p -> p.getPrice() >= minPrice && p.getPrice() <= maxPrice)
            .collect(Collectors.toList());
    }

    // 카테고리와 가격 범위로 제품을 필터링하는 메서드
    public List<Product> filterProductsByCategoryAndPrice(String category, double minPrice, double maxPrice) {
        return this.products.stream()
            .filter(p -> p.getCategory().equals(category) && p.getPrice() >= minPrice && p.getPrice() <= maxPrice)
            .collect(Collectors.toList());
    }

    // 제품의 가격을 업데이트하는 메서드
    public void updateProductPrice(Product product, double newPrice) {
        Product foundProduct = this.products.stream()
            .filter(p -> p.equals(product))
            .findFirst()
            .orElse(null);
        if (foundProduct != null) {
            foundProduct.setPrice(newPrice);
        }
    }

    // 모든 제품을 반환하는 메서드
    public List<Product> getAllProducts() {
        return new ArrayList<>(this.products);
    }

    // 제품을 이름으로 검색하는 메서드
    public List<Product> searchByName(String name) {
        return this.products.stream()
            .filter(p -> p.getName().equalsIgnoreCase(name))
            .collect(Collectors.toList());
    }

    // 여러 카테고리로 제품을 검색하는 메서드
    public List<Product> searchByMultipleCategories(List<String> categories) {
        return this.products.stream()
            .filter(p -> categories.contains(p.getCategory()))
            .collect(Collectors.toList());
    }

    // 제품을 가격순으로 정렬하여 반환하는 메서드
    public List<Product> sortProductsByPrice(boolean ascending) {
        return this.products.stream()
            .sorted((p1, p2) -> ascending ? Double.compare(p1.getPrice(), p2.getPrice()) : Double.compare(p2.getPrice(), p1.getPrice()))
            .collect(Collectors.toList());
    }

    // 카테고리별 제품 수를 반환하는 메서드
    public Map<String, Long> countProductsByCategory() {
        return this.products.stream()
            .collect(Collectors.groupingBy(Product::getCategory, Collectors.counting()));
    }

    // 특정 가격 범위 내의 제품 이름을 반환하는 메서드
    public List<String> getProductNamesByPriceRange(double minPrice, double maxPrice) {
        return this.products.stream()
            .filter(p -> p.getPrice() >= minPrice && p.getPrice() <= maxPrice)
            .map(Product::getName)
            .collect(Collectors.toList());
    }

    // 카테고리별 평균 가격을 계산하는 메서드
    public Map<String, Double> calculateAveragePriceByCategory() {
        return this.products.stream()
            .collect(Collectors.groupingBy(Product::getCategory, Collectors.averagingDouble(Product::getPrice)));
    }

    // 두 가격 범위 사이의 제품을 검색하는 메서드
    public List<Product> searchByPriceRange(double minPrice, double maxPrice) {
        return this.products.stream()
            .filter(p -> p.getPrice() >= minPrice && p.getPrice() <= maxPrice)
            .collect(Collectors.toList());
    }

    // 특정 카테고리의 제품들을 이름순으로 정렬하여 반환하는 메서드
    public List<Product> sortProductsByNameInCategory(String category) {
        return this.products.stream()
            .filter(p -> p.getCategory().equalsIgnoreCase(category))
            .sorted((p1, p2) -> p1.getName().compareToIgnoreCase(p2.getName()))
            .collect(Collectors.toList());
    }

    // 특정 키워드를 포함하는 제품들의 평균 가격을 계산하는 메서드
    public double calculateAveragePriceByKeyword(String keyword) {
        return this.products.stream()
            .filter(p -> p.getName().toLowerCase().contains(keyword.toLowerCase()))
            .collect(Collectors.averagingDouble(Product::getPrice));
    }
}
