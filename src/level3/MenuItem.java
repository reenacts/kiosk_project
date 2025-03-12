package level3;

public class MenuItem {
    private String name;
    private double price;
    private String description;

    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("%-15s | %-5.0f원 | %s", name, price, description);
    }
}
