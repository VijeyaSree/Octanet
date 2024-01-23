import java.util.*;
public class App{
    public static void main(String[] args){
        int pin = 1234;
        int balance = 10000;
        int AddAmount = 0;
        int TakeAmount = 0;
        String name;
        Scanner atm = new Scanner(System.in);
        //we have to take an input by an user
         System.out.println("Enter your pin number");

         int password = atm.nextInt();
        //code arrangement shift+alt+f

         if(password==pin)
         {
            System.out.println("Enter your name");
            name = atm.next();
            System.out.println("Welcome "+ name);

            while(true)
            {
                System.out.println("Press 1 to check your balance");
                System.out.println("Press 2 to add amount");
                System.out.println("Press 3 to take amount");
                System.out.println("Press 4 to take resipt");
                System.out.println("Press 5 to Exit");


                int opt = atm.nextInt();
                switch(opt)
                {
                    case 1:
                    System.out.println("Your current balance is "+ balance);
                    break;

                    case 2:
                    System.out.println("How much amount did you want to ADD to your account");
                    AddAmount = atm.nextInt();
                    System.out.println("Successfully credited");
                    balance = AddAmount + balance;
                    //10000=100+10000
                    //10100=balance;
                    break;

                    case 3:
                    System.out.println("How much amount did you want to take ");
                    TakeAmount = atm.nextInt();
                    if(TakeAmount>balance)
                    {
                        System.out.println("Your Balance is insufficient");
                        System.out.println("Try less than your available balance");
                    }
                    else
                    {
                        System.out.println("Successfully Taken");
                        balance = balance - TakeAmount;
                        // balance = 10100 = 10100-100
                        //balance = 10000
                    }
                    break;
                    case 4:
                    System.out.println("Welcome to All in One mini ATM");
                    System.out.println("Available balance is "+ balance);
                    System.out.println("Amount deposited "+ AddAmount);
                    System.out.println("Amount taken "+ TakeAmount);
                    System.out.println("Thank You");
                    break;

                    default:
                    System.out.println("Press th number below 5");
                    break;
                }
                if(opt == 5)
                {
                    System.out.println("Thankyou");
                    break;
                }
            }
         }
         else{
            System.out.println("Wrong pin number");
         }
    }
}