package src.main.com.checkout.domain;

import java.util.List;
import java.util.Optional;
import java.util.Locale.Category;

public interface ReadOnlyMenu {
    Optional<MenuItem> getItemById(String itemID);

    List<MenuItem> listActiveItems();

    List<MenuItem> getItemsByCategory(String categoryId);

    List<Category> listActiveCategoriesOrdered();

    List<MenuItem> findItemsByName(String name);
}
