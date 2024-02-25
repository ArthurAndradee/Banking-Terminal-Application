import java.util.ArrayList;
import java.util.Scanner;

public class Atm {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        int NUM_ACCOUNTS = 0;
        boolean userHasAccount = false;

        ArrayList<BankAccount> bankAccounts = new ArrayList<BankAccount>();

        System.out.println("Hello, do you already have an account? \n1.Yes\n2.No");
        Integer userInput= read.nextInt();

        switch (userInput) {
            case 2:            
                NUM_ACCOUNTS++;
                BankAccount u = new BankAccount();

                System.out.println("Please state your name");
                String name = read.next();

                System.out.println("Please enter your password (Only numbers)");
                Integer password = read.nextInt();

                System.out.println("Please deposit any amount of money");
                Float money = read.nextFloat();

                u.setName(name);
                u.setPassword(password);
                u.setoney(money);    
                bankAccounts.add(u);
                read.nextLine();

                System.out.println("Current user: \n" + u);

                userHasAccount = true ;

                System.out.println("Please state your name");
                String nameLogin = read.next();
                System.out.println("Please enter your password (Only numbers)");
                Integer passwordLogin = read.nextInt();

                u.getName();

                if (u.getName().equals(nameLogin) && u.getPassword() == (passwordLogin)) {
                    System.out.println("Login successful");
                }

            case 1:
                
            break;
        
            default:
                System.out.println("Please enter a valid option \n1. Yes\n2.No");
                userInput= read.nextInt();
            break;
        }

        read.close();
    }
}