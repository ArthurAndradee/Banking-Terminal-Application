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
                BankAccount currentUser = new BankAccount();

                System.out.println("Please state your name");
                String name = read.next();

                System.out.println("Please enter your password (Only numbers)");
                Integer password = read.nextInt();

                System.out.println("Please deposit any amount of money");
                Integer money = read.nextInt();

                currentUser.setName(name);
                currentUser.setPassword(password);
                currentUser.setMoney(money);    
                bankAccounts.add(currentUser);
                read.nextLine();

                System.out.println("Current user: \n" + currentUser);

                userHasAccount = true ;

                System.out.println("Please state your name");
                String nameLogin = read.next();
                System.out.println("Please enter your password (Only numbers)");
                Integer passwordLogin = read.nextInt();

                currentUser.getName();
                currentUser.getPassword();

                if (currentUser.getName().equals(nameLogin) && currentUser.getPassword() == (passwordLogin)) {
                    System.out.println("Login successful");
                } else {
                    System.out.println("Login unsuccessful");
                }

            case 1:
                currentUser = new BankAccount();

                System.out.println("Please state your name");
                nameLogin = read.next();
                System.out.println("Please enter your password (Only numbers)");
                passwordLogin = read.nextInt();

                if (nameLogin.equals(currentUser.devName) && passwordLogin.equals(currentUser.devPassword) ) {
                    System.out.println("Login successful!");

                    System.out.println("What would you like to do?\n1.Withdraw\n2.Deposit\n3.Transfer\n4.Close");
                    userInput = read.nextInt();

                    switch (userInput) {
                        case 1:
                            System.out.println("How much would you like to withdraw?");
                            userInput = read.nextInt();

                            currentUser.setMoney(currentUser.devMoney - userInput);

                            System.out.println("Current balance:" + currentUser.getMoney());
                        break;

                        case 2:
                            System.out.println("How much would you like to deposit?");
                            userInput = read.nextInt();

                            currentUser.setMoney(currentUser.devMoney + userInput);

                            System.out.println("Current balance:" + currentUser.getMoney());
                        break;

                        case 3:
                            System.out.println("How much would you like to withdraw?");
                            userInput = read.nextInt();
                            currentUser.setMoney(currentUser.devMoney - userInput);
                            System.out.println("Current balance:" + currentUser.getMoney());
                        break;

                        default:

                        break;
                }} else {
                    System.out.println("Login unsuccessful");
                }
                
            break;
        
            default:
                System.out.println("Please enter a valid option \n1. Yes\n2.No");
                userInput= read.nextInt();
            break;
        }

        read.close();
    }
}