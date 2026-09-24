/*Opgave 2
public class Product {

    String name;
    double price;
    String[] tags;

    // Constructor
    public Product(String name, double price, String[] tags) {
        this.name = name;
        this.price = price;
        this.tags = tags;
    }

    // Udskriver produktets info
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);

        System.out.println("Tags:");
        for (String tag : tags) {
            System.out.println("- " + tag);
        }
    }

    // Tjekker om produktet har et bestemt tag
    public boolean hasTag(String tag) {
        for (String t : tags) {
            if (t.equals(tag)) {
                return true;
            }
        }

        return false;
    }
}
*/