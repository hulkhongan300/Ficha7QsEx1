import org.example.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {
    @Test
    public void getEqualsTest(){
        Product p = new Product("water",9.00);
        boolean equals = p.equals(p);
        boolean equals2 = p.equals(0);
        assertEquals(equals,true);
        assertEquals(equals2,false);
    }
}
