package ProductSearchEngine;

public class Product {
    private String name;
    private double price;
    private String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public void setPrice(double price) {
        this.price = price;
    }
  
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return name.equals(product.name) && category.equals(product.category);
    }

    public int hashCode() {
        return 31 * name.hashCode() + category.hashCode();
    }

    public String toString() {
        return String.format("Product{name='%s', price=%.2f, category='%s'}", name, price, category);
    }
}
