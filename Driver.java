import java.util.Scanner;

public class Driver{
    public static void main(String[] args){
    //  PiggyBank pb =  new PiggyBank();
    //  System.out.println(pb.amount);
    //  System.out.println(pb.broken);

    //  PiggyBank pb2 = new PiggyBank(3.50);
    //  System.out.println(pb2.amount);

    Scanner sc = new Scanner(System.in);
    PiggyBankService piggyService = new PiggyBankService();
    piggyService.decision(sc);
    }

    //super - can refer to the parent class instance of a constructor
    //super();
    //super.methodName(); - refers to the parent class method
    //super.variableName; - refers to the parent class variable. 
    // public Driver(){
    //     super();
    // }
}