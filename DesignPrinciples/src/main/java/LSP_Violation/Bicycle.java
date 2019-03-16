package LSP_Violation;

public class Bicycle extends Transportation{

    @Override
    public void startEngine(){ //Violation
        this.engine = "no engine";
    }
}
