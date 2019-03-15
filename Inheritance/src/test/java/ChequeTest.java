import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChequeTest {

    @Test
    public void showAccDetails() {
        Accounts Gareth = new Cheque(32146,5000, 2000);
        Assert.assertEquals("Account: 32146 Balance: 5000 Over Draft: 2000", Gareth.showAccDetails());
    }

    @Test
    public void getAccBal() {
        Accounts Gareth = new Cheque(32146,5000, 2000);
        Assert.assertEquals(5000,Gareth.getAccBal());
    }

    @Test
    public void getOverDraft() {
        Accounts Gareth = new Cheque(32146,5000, 2000);
        Assert.assertEquals(2000,((Cheque) Gareth).getOverDraft());
    }

    @Test
    public void deposit() {
        Accounts Gareth = new Cheque(32146,5000, 2000);
        Gareth.Deposit(4000);
        Assert.assertEquals(9000,Gareth.getAccBal());
    }

    @Test
    public void withdrawal() {
        Accounts Gareth = new Cheque(32146,5000, 2000);
        Gareth.withdrawal(4000);
        Assert.assertEquals(1000,Gareth.getAccBal());
    }

    @Test
    public void withdrawFromOverDraft() {
        Accounts Gareth = new Cheque(32146,5000, 2000);
        ((Cheque) Gareth).WithdrawFromOverDraft(1000);
        Assert.assertEquals(1000,((Cheque) Gareth).getOverDraft());
    }

    @Test
    public void payOverDraft() {
        Accounts Gareth = new Cheque(32146,5000, 2000);
        ((Cheque) Gareth).payOverDraft(500);
        Assert.assertEquals(1500,((Cheque) Gareth).getOverDraft());
    }
}