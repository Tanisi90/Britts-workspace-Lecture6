

public class PiggyBank {
    public double amount;
    public boolean broken;
    // String name;

    public PiggyBank(){
        //this.variableName; - refers to the current class variable.
        //this() - refers to a current class constructor
        //this.methodName()- refers to a current class method.  
        this.amount = 0;
        this.broken = false;

    }

    public PiggyBank(double amountValue){
        this.amount = amountValue;
        this.broken = false;
    }
 
}
