package src.main.com.checkout.domain;

import java.util.List;
import java.util.Optional;
import java.util.Map;
import java.util.HashMap;

public class Menu implements ReadOnlyMenu {

    private String itemID;
    private String itemName;
    private double price;
    private String category;
    private boolean active;

    private Map<String, MenuItem> itemsById = new HashMap<>();

    public Menu(String iD, String name, Double cost, String cate) {
        this.itemID = iD;
        this.itemName = name;
        this.price = cost;
        this.category = cate;
    }

    public void addItem(MenuItem item)) {
        if (!itemsById.containsValue(item)) {
            itemsById.put(item.getId(), item);
        } 
    }

    @Override
    public Optional<MenuItem> getItemById(String itemID) {

    }

    @Override
    public List<MenuItem> listActiveItems() {

    }

    @Override
    public List<MenuItem> getItemsByCategory(String categoryId) {

    }

    @Override
    public List<Category> listActiveCategoriesOrdered() {

    }

    @Override
    public List<MenuItem> findItemsByName(String name) {

    }

}

public MenuItem() {

}
