import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SavingsTest {

    @Test
    public void showAccDetails() {
        Account Gareth = new Savings(32146,5000);
        Assert.assertEquals("Account: 32146 Balance: 5000", Gareth.showAccDetails());
    }

    @Test
    public void getAccBal() {
        Account Gareth = new Savings(32146,5000);
        Assert.assertEquals(5000.00,Gareth.getAccBal());
    }

    @Test
    public void deposit() {
        Account Gareth = new Savings(32146,5000);
        Gareth.Deposit(1000);
        Assert.assertEquals(6000,Gareth.getAccBal());
    }

    @Test
    public void withdrawal() {
        Account Gareth = new Savings(32146,5000);
        Gareth.withdrawal(2000);
        Assert.assertEquals(3000,Gareth.getAccBal());
    }
}