public class Investment extends Savings {

    private double newBal;
    private double interestBal, interest=0.1;

    public Investment(int accNum, int accBal) {
        super(accNum, accBal);
    }

    public void interest(){
        interestBal = getAccBal()*interest;
        newBal=getAccBal()+interestBal;
    }

    public double getNewBal(){
        return newBal;
    }
}
