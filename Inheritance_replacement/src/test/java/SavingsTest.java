import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SavingsTest {

    @Test
    public void showAccDetails() {
        Accounts Gareth = new Savings(123456,5000);
        Assert.assertEquals("Account: 123456 Balance: 5000",Gareth.showAccDetails());
    }

    @Test
    public void getAccBal() {
        Accounts Gareth = new Savings(123456,5000);
        Assert.assertEquals(5000,Gareth.getAccBal());
    }

    @Test
    public void deposit() {
        Accounts Gareth = new Savings(123456,5000);
        Gareth.Deposit(500);
        Assert.assertEquals(5500,Gareth.getAccBal());
    }

    @Test
    public void withdrawal() {
        Accounts Gareth = new Savings(123456,5000);
        Gareth.withdrawal(500);
        Assert.assertEquals(4500,Gareth.getAccBal());
    }
}