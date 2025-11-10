package src.main.com.checkout.domain;

import java.util.List;
import java.util.Optional;
import java.util.Map;
import java.util.HashMap;

public class Menu implements ReadOnlyMenu {

    private Map<String, MenuItem> itemsById = new HashMap<>();

    public boolean addItem(MenuItem item) {
        if (item == null) {
            return false;
        }

        String itemID = item.getItemID();
        if (itemID == null || itemID.trim().isEmpty()) {
            return false;
        } else if (itemsById.containsKey(itemID)) {
            return false;
        } else if (item.getPrice() == null || item.getPrice() < 0) {
            return false;
        } else if (item.getCategory() == null || item.getCategory().isEmpty()) {
            return false;
        } else {
            itemsById.put(itemID, item);
            return true;
        }
    }

    public boolean removeItem(MenuItem item) {

        if (item == null) {
            return false;
        }

        String itemID = item.getItemID();

        if (itemID == null || itemID.trim().isEmpty()) {
            return false;
        }

        if (itemsById.containsKey(itemID)) {
            itemsById.remove(itemID);
            return true;
        } else {
            return false;
        }
    }

    public boolean updateItem(MenuItem item) {
        if (item == null) {
            return false;
        }

        String itemID = item.getItemID();

        if (itemID == null || itemID.trim().isEmpty()) {
            return false;
        } else if (!itemsById.containsKey(itemID)) {
            return false;
        } else if (item.getPrice() == null || item.getPrice() < 0) {
            return false;
        } else if (item.getCategory() == null || item.getCategory().isEmpty()) {
            return false;
        } else {
            itemsById.replace(itemID, item);
            return true;
        }
    }

    public

    @Override public Optional<MenuItem> getItemById(String itemID) {
        MenuItem itID = new MenuItem(itemID, itemID, null, itemID);

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
