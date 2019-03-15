public class Account {

    private int AccNum;
    private int AccBal;

    public Account(int accNum, int accBal) {
        AccNum = accNum;
        AccBal = accBal;
    }

    public String showAccDetails(){
        String Str = "account: "+AccNum+" Balance: "+AccBal;
        return Str;
    }

    public void Deposit(int dep){
        AccBal = AccBal+dep;
    }

    public void withdrawal(int cash) {
        AccBal = AccBal-cash;
    }
}
