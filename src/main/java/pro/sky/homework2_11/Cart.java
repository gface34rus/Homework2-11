package pro.sky.homework2_11;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Integer> itemIds;

    public Cart() {
        this.itemIds = new ArrayList<>();
    }

    public void addItem(Integer itemId) {
        itemIds.add(itemId);
    }

    public List<Integer> getItems() {
        return itemIds;
    }
}
