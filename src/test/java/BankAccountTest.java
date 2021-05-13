import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import zero.Bank;
import zero.BankAccount;
import zero.Customer;

public class BankAccountTest {




    @Test
    void accountIdTest() {
        Customer john = new Customer("John", "Wick");
        int currentId = BankAccount.accountIdCounter + 1;
        BankAccount johnAccount = new BankAccount(john);
        Assertions.assertEquals(currentId, johnAccount.getAccountId());
    }

    @Test
    void bankAccountAddToBalanceTest() {
        Customer john = new Customer("John", "Wick");
        BankAccount johnAccount = new BankAccount(john);
        johnAccount.addToBalance(100.5);
        Assertions.assertEquals(100.5, johnAccount.getBalance());
    }

    @Test
    void bankAccountSubtractFromBalanceTest() {
        Customer john = new Customer("John", "Wick");
        BankAccount johnAccount = new BankAccount(john);
        johnAccount.addToBalance(100);
        johnAccount.subtractFromBalance(50.49);
        Assertions.assertEquals(49.51, johnAccount.getBalance());
    }


}
