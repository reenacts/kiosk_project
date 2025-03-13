package level5;

public class MenuItem {
    private String name;
    private double price;
    private String description;

    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // 캡슐화
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String setName() {
        return this.name;
    }

    public double setPrice() {
        return this.price;
    }

    public String setDescription() {
        return this.description;
    }




    @Override
    public String toString() {
        return String.format("%-15s | %-5.0f원 | %s", name, price, description);
    }
}
