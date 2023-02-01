import java.util.Scanner;

public class PiggyBankService {
    //this object will be null because we haven't instantiated
    //meaning we haven't actually created a space in memory for it. 
    PiggyBank bank;

    public PiggyBankService(){
       bank = new PiggyBank();
    }

    public PiggyBankService(PiggyBank pb){
        this.bank = pb;
    }


    //We haven't broken the bank we have piggybank intact. Now I would like that
    //when the user type deposit it deposits a quarter. 

    public void depositQuarter(){
        if(bank.broken == false){
            double oldAmount = bank.amount;
            double newAmount = oldAmount + .25;
            bank.amount = newAmount;
        }
    }

    //Now I need the logic for breaking the bank!
    public double breakBank(){
        bank.broken = true;
        return bank.amount;
    }

    public void decision(Scanner sc){
        bank = new PiggyBank(3.50);

        PiggyBankService pbd = new PiggyBankService(bank);
        while(true){
           System.out.println("Would you like to deposit or break the bank?");
           String input = sc.nextLine();
           if(input.equalsIgnoreCase("deposit")){
            pbd.depositQuarter();
           } else if(input.equalsIgnoreCase("break")){
                double balance = pbd.breakBank();
                System.out.println(balance);
                break;
           }
        }
    }
    
}
