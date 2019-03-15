public class Cheque implements Accounts {

    private int AccNum,AccBal,OverDraft;

    public Cheque(int accNum, int accBal, int overDraft) {
        AccNum = accNum;
        AccBal = accBal;
        OverDraft = overDraft;
    }

    @Override
    public String showAccDetails() {
        return "Account: "+AccNum+" Balance: "+AccBal+" Over Draft: "+OverDraft;
    }

    @Override
    public int getAccBal() {
        return AccBal;
    }

    public int getOverDraft() {
        return OverDraft;
    }

    @Override
    public void Deposit(int dep) {
        AccBal = AccBal+dep;
    }

    @Override
    public void withdrawal(int cash) {
        AccBal = AccBal-cash;
    }

    public void WithdrawFromOverDraft(int withdraw){
        OverDraft = OverDraft-withdraw;
    }

    public void payOverDraft(int payment){
        OverDraft = OverDraft-payment;
    }
}
