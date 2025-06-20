package search;
import java.util.Arrays;
import java.util.Comparator;
public class ProductSearch {
public static Product linearSearch(Product[] products, int targetId) {
        for (Product p : products) {
            if (p.productId == targetId) {
                return p;
            }
        }
        return null;
    }
    public static Product binarySearch(Product[] products, int targetId) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (products[mid].productId == targetId) {
                return products[mid];
            } else if (products[mid].productId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Product[] products = {
            new Product(105, "Shoes", "Footwear"),
            new Product(102, "Laptop", "Electronics"),
            new Product(108, "Watch", "Accessories"),
            new Product(101, "T-shirt", "Clothing")
        };
        Product result1 = linearSearch(products, 108);
        System.out.println("Linear Search Result: " + result1);
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));
        Product result2 = binarySearch(products, 108);
        System.out.println("Binary Search Result: " + result2);
    }
}
