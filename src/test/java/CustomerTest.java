import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import zero.Customer;

public class CustomerTest {

    @BeforeEach
    void setUp() {

    }


    @Test
    void customerTest() {
        Customer c1 = new Customer("John", "Wick");
        Assertions.assertEquals("John", c1.getFirstName());
        Assertions.assertEquals("Wick", c1.getLastName());
    }

    @Test
    void customerEqualsTest() {

        Customer c1 = new Customer("Joe", "Shmoe");
        Customer c2 = new Customer("Joe", "Shmoe");
        Assertions.assertEquals(true, c1.equals(c2));

        Customer c3 = new Customer("Joe", "Know");
        Assertions.assertEquals(false, c1.equals(c3));

        Object o = new Object();
        Assertions.assertEquals(false, c1.equals(o));

        Customer c4 = null;
        Assertions.assertEquals(false, c1.equals(c4));

        Assertions.assertEquals(true, c1.equals(c1));
    }
}
