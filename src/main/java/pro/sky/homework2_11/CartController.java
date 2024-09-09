package pro.sky.homework2_11;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/store/order")
public class CartController {
    @PostMapping("/add")
    public void addItem(@RequestParam(value = "itemsIds") Integer[] itemIds, HttpSession session) {
        Cart cart = (Cart) session.getAttribute("cart");
        if (cart == null) {
            cart = new Cart();
            session.setAttribute("cart", cart);
        }
        for (Integer itemId : itemIds) {
            cart.addItem(itemId);
        }
    }

    @GetMapping("/get")
    public List<Integer> getItems(HttpSession session) {
        Cart cart = (Cart) session.getAttribute("cart");
        return cart != null ? cart.getItems() : new ArrayList<>();
    }
}
