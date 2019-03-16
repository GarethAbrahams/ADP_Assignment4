package ISP_Correction;

public class Swimmers implements SwimmingAthletes {

    @Override
    public void swim() {
        System.out.println("Busy swimming the 100m freestyle");
    }

    @Override
    public void compete() {
        System.out.println("Busy Competing");
    }
}
