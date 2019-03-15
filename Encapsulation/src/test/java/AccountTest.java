import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {

    @Test
    public void showAccDetails(){
        Account Gareth = new Account(321654,5000);
        Assert.assertEquals("account: 321654 Balance: 5000",Gareth.showAccDetails());
    }

    @Test
    public void deposit() {
        Account Gareth = new Account(321654,5000);
        Gareth.Deposit(1000);
        Assert.assertEquals("account: 321654 Balance: 6000",Gareth.showAccDetails());
    }

    @Test
    public void withdrawal() {
        Account Gareth = new Account(321654,5000);
        Gareth.withdrawal(2000);
        Assert.assertEquals("account: 321654 Balance: 3000",Gareth.showAccDetails());
    }
}