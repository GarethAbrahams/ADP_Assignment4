package ISP_Violation;

public class Swimmer implements Athlete {
    @Override
    public void compete() {
        System.out.println("Busy Competing");
    }

    @Override
    public void swim() {
        System.out.println("Busy swimming the 100m freestyle");
    }

    @Override
    public void highJump() {
        //not applicable
    }

    @Override
    public void longJump() {
        //not applicable
    }
}
