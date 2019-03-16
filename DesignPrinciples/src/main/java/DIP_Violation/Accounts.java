package DIP_Violation;

public class Accounts {

    private ChequeAccount Cheque = new ChequeAccount();
    private SavingsAccount Savings = new SavingsAccount();

    public void createAccounts(){
        Cheque.OpenAccount("Gareth","Abrahams","123456",2000);
        Savings.OpenAccount("Gareth","Abrahams","321654",1000);
    }
}
