public class Savings extends Accounts{

    int AccNum, AccBal;

    public Savings(int accNum, int accBal) {
        AccNum = accNum;
        AccBal = accBal;
    }

    @Override
    public String showAccDetails() {
        return "Account: "+AccNum+" Balance: "+AccBal;
    }

    @Override
    public int getAccBal() {
        return AccBal;
    }

    @Override
    public void Deposit(int dep) {
        AccBal = AccBal+dep;
    }

    @Override
    public void withdrawal(int cash) {
        AccBal = AccBal-cash;
    }
}
