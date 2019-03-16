package DIP_Correction;

public class SavingsAccount implements Accounts{

    String Name, Surname, AccountNum;
    double Balance;

    public SavingsAccount() {
    }

    @Override
    public void OpenAccount (String name, String surname, String accountNum, double balance) {
        Name = name;
        Surname = surname;
        AccountNum = accountNum;
        Balance = balance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getAccountNum() {
        return AccountNum;
    }

    public void setAccountNum(String accountNum) {
        AccountNum = accountNum;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

}
