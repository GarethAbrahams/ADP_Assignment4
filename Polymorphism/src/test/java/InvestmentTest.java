import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class InvestmentTest {

    @Test
    public void interest() {
        Account Gareth = new Investment(123456,5000);
        ((Investment) Gareth).interest();
        Assert.assertEquals(5500,((Investment) Gareth).getNewBal(),5000);
    }

    //checking that the methods from the Savings class still work
    @Test
    public void withdraw(){
        Account Gareth = new Investment(123456,5000);
        Gareth.withdrawal(1000);
        Assert.assertEquals(4000,Gareth.getAccBal(),4000);
    }
}

