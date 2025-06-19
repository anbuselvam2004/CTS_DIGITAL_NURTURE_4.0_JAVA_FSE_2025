import java.util.Arrays;

public class Main {
     public static Product linearSearch(Product[] products, int targetId) {
        for (Product p : products) {
            if (p.productId == targetId)
                return p;
        }
        return null;
    }

    // Binary Search (requires sorted array by productId)
    public static Product binarySearch(Product[] products, int targetId) {
        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (products[mid].productId == targetId)
                return products[mid];
            else if (products[mid].productId < targetId)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(103, "T-Shirt", "Apparel"),
            new Product(102, "Phone", "Electronics"),
            new Product(104, "Shoes", "Footwear")
        };

        // Linear Search (unsorted)
        System.out.println("Linear Search Result:");
        Product result1 = linearSearch(products, 103);
        System.out.println(result1 != null ? result1 : "Product not found");

        // Sort before binary search
        Arrays.sort(products);

        // Binary Search (sorted by productId)
        System.out.println("Binary Search Result:");
        Product result2 = binarySearch(products, 103);
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}
