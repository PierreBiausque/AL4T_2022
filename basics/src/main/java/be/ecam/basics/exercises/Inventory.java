package be.ecam.basics.exercises;

import java.util.List;
import java.util.Objects;

public class Inventory {
    public static class Item {
        private final String sku;
        public Item(String sku) { this.sku = sku; }
        public String getSku() { return sku; }
    }

    public static boolean hasSku(List<Item> items, String sku) {
        if (items == null || items.isEmpty()) return false;
        for (Item it : items) {
            if (it != null && Objects.equals(it.getSku(), sku)) {
                return true;
            }
        }
        return false;
    }
}
