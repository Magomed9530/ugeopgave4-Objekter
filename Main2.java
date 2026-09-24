/*Opgave 2
public class Main {
    public static void main(String[] args) {

        // Opretter 4 produkter
        Product product1 = new Product("Laptop", 7999.99, new String[]{"electronics", "computer", "work"});
        Product product2 = new Product("T-shirt", 199.99, new String[]{"clothing", "sale", "new"});
        Product product3 = new Product("Headphones", 899.99, new String[]{"electronics", "music", "new"});
        Product product4 = new Product("Coffee Mug", 99.99, new String[]{"kitchen", "sale"});

        // Putters produkterne i et array
        Product[] products = {product1, product2, product3, product4};

        // Finder alle produkter med "sale" tag
        System.out.println("Produkter med sale tag:");

        for (Product product : products) {
            if (product.hasTag("sale")) {
                product.printInfo();
            }
        }

        // Finder det dyreste produkt
        Product mostExpensive = products[0];

        for (Product product : products) {
            if (product.price > mostExpensive.price) {
                mostExpensive = product;
            }
        }

        System.out.println("Dyreste produkt:");
        mostExpensive.printInfo();
    }
}
*/