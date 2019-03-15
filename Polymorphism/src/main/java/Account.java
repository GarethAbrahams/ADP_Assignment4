public interface Account {

    int AccNum = 0;
    int AccBal = 0;

    public String showAccDetails();

    public int getAccBal();

    public void Deposit(int dep);

    public void withdrawal(int cash);

}