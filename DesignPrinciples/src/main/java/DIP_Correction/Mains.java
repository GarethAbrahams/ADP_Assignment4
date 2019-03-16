package DIP_Correction;

public class Mains {

    private Accounts Cheque = new ChequeAccount();
    private Accounts Saving = new SavingsAccount();

    public void createAccounts(){
        Cheque.OpenAccount("Gareth","Abrahams","123456",2000);
        Saving.OpenAccount("Gareth","Abrahams","321654",1000);
    }

}
