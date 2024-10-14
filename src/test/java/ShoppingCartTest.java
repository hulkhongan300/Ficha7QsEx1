import org.example.Product;
import org.example.ProductNotFoundException;
import org.example.ShoppingCart;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingCartTest {




    @Test
    public void addItemsTest(){
        ShoppingCart shoppingCart = new ShoppingCart();
        Product p = new Product("Water",9.00);
        shoppingCart.addItem(p);

    }

    @Test
    public void removeItemsTest() throws ProductNotFoundException {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product p = new Product("Water",9.00);
        shoppingCart.addItem(p);
        shoppingCart.removeItem(p);
    }
    @RepeatedTest(100)
    public void getBalanceTest(){
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(new Product(
                "Water",
                9.00
        ));
        double tes = shoppingCart.getBalance();
        assertEquals(tes,9.00);
    }

    @Test
    public void getItemCountTest(){
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(new Product("water",9.00));
        int i = shoppingCart.getItemCount();
        assertEquals(i,1);

    }
    @Test
    public void emptyTest(){
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.empty();

    }

}
