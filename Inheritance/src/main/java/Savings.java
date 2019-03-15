public class Savings implements Accounts{

    private int AccBal;
    private int AccNum;

    public Savings(int accNum, int accBal) {
        AccBal = accBal;
        AccNum = accNum;
    }

    @Override
    public String showAccDetails() {
        String Str = "Account: " + AccNum + " Balance: " + AccBal;
        return Str;
    }

    @Override
    public int getAccBal() {
        return AccBal;
    }

    @Override
    public void Deposit(int dep) {
        AccBal=AccBal+dep;
    }

    @Override
    public void withdrawal(int cash) {
        AccBal=AccBal-cash;
    }
}
