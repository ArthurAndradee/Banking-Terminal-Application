import java.util.ArrayList;
import java.util.Scanner;

public class Atm {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        ArrayList<BankAccount> bankAccounts = new ArrayList<BankAccount>();

        BankAccount currentUser = new BankAccount();
        currentUser.setName("Arthur");
        currentUser.setPassword(1102);
        currentUser.setMoney(2000);    
        bankAccounts.add(currentUser);

        System.out.println("Hello, would you like to create an account? \n1.Yes\n2.No");
        Integer userInput= read.nextInt();

        if (userInput == 1) {        
            currentUser = new BankAccount();

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

            System.out.println("Please state your name");
            String nameLogin = read.next();
            System.out.println("Please enter your password (Only numbers)");
            Integer passwordLogin = read.nextInt();

            if (currentUser.getName().equals(nameLogin) && currentUser.getPassword().equals(passwordLogin)) {

                System.out.println("Login successful");

                while (userInput !=5) {
                    System.out.println("What would you like to do?\n1.Withdraw\n2.Deposit\n3.Transfer\n4.Check balance.\n5.Close");

                    userInput = read.nextInt();
    
                    switch (userInput) {
                        case 1:
                            System.out.println("\n" + "How much would you like to withdraw?");
                            userInput = read.nextInt();
    
                            if (currentUser.getMoney() >= userInput) {
                                currentUser.setMoney(currentUser.getMoney() - userInput);
                                System.out.println("Current balance: " + currentUser.getMoney());
                            } else {
                                System.out.println("\n" + "Not enough balance\n");
                            }
                            
                            System.out.println("\n" + "Current balance:" + currentUser.getMoney());

                        break;
    
                        case 2:
                            System.out.println("\n" + "How much would you like to deposit?");
                            userInput = read.nextInt();

                            currentUser.setMoney(currentUser.getMoney() + userInput);
                            System.out.println("\n" + "Current balance: " + currentUser.getMoney() + "\n");

                        break;
    
                        case 3:
                            System.out.println("\n" + "How much would you like to transfer?");
                            userInput = read.nextInt();
                            if (currentUser.getMoney() >= userInput) {
                                currentUser.setMoney(currentUser.getMoney() - userInput);
                                System.out.println("\n" +"And to what account?");
                            } else {
                                System.out.println("\n" +"Not enough balance");
                            }
                            System.out.println("\n" + "Current balance: " + currentUser.getMoney() + "\n");
    
                        break;
    
                        case 4:
                            System.out.println("Current balance: " + currentUser.getMoney() + "\n");

                        break;

                        case 5:
                            System.out.println("Goodbye!");

                        break;
    
                        default:
                            System.out.println("Invalid character");
                        break;}
                }
            } else {
                System.out.println("Login Unsuccessful");
            }
        } else {
            System.out.println("Please enter your name");
            String nameLogin = read.next();
            
            System.out.println("Please enter your password");
            Integer passwordLogin = read.nextInt();

            if (currentUser.getName().equals(nameLogin) && currentUser.getPassword().equals(passwordLogin)) {
                System.out.println("Login successful!");

                while (userInput !=5) {
                    System.out.println("What would you like to do?\n1.Withdraw\n2.Deposit\n3.Transfer\n4.Check balance.\n5.Close");
                
                    userInput = read.nextInt();
                
                    switch (userInput) {
                        case 1:
                            System.out.println("\n" + "How much would you like to withdraw?");
                            userInput = read.nextInt();
                
                            if (currentUser.getMoney() >= userInput) {
                                currentUser.setMoney(currentUser.getMoney() - userInput);
                                System.out.println("Current balance: " + currentUser.getMoney());
                            } else {
                                System.out.println("\n" + "Not enough balance\n");
                            }
                            
                            System.out.println("\n" + "Current balance:" + currentUser.getMoney());
                
                        break;
                
                        case 2:
                            System.out.println("\n" + "How much would you like to deposit?");
                            userInput = read.nextInt();
                
                            currentUser.setMoney(currentUser.getMoney() + userInput);
                            System.out.println("\n" + "Current balance: " + currentUser.getMoney() + "\n");
                
                        break;
                
                        case 3:
                            System.out.println("\n" + "How much would you like to transfer?");
                            userInput = read.nextInt();
                            if (currentUser.getMoney() >= userInput) {
                                currentUser.setMoney(currentUser.getMoney() - userInput);
                                System.out.println("\n" +"And to what account?");
                            } else {
                                System.out.println("\n" +"Not enough balance");
                            }
                            System.out.println("\n" + "Current balance: " + currentUser.getMoney() + "\n");
                
                        break;
                
                        case 4:
                            System.out.println("Current balance: " + currentUser.getMoney() + "\n");
                
                        break;
                
                        case 5:
                            System.out.println("Goodbye!");
                
                        break;
                
                        default:
                            System.out.println("Invalid character");
                        break;}
                }
            }
        }
        read.close();
    }
}