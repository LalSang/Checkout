package src.main.com.checkout.domain;

public class MenuItem {

    private String itemID;
    private String itemName;
    private double price;
    private String category;
    private boolean active;

    public MenuItem(String iD, String name, Double cost, String cate) {
        this.itemID = iD;
        this.itemName = name;
        this.price = cost;
        this.category = cate;
        this.active = true;
    }

    public String getItemID() {
        return itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public Double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public boolean isActive() {
        return active;
    }

    // If admin ever needs to deactivate an item.
    public void deactivate() {
        this.active = false;
    }
}
