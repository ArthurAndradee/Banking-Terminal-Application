public class BankAccount {

    private String name;
    private int password;
    private float money;

    
    public String getName() {
        return name;
    }

    public float getPassword() {
        return password;
    }

    public float getMoney() {
        return money;
    }

    //In case user wants to create a new account
    
    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public void setoney(float money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return  "Name:" + name + '\n' +
                "Password:" + password + '\n' +
                "Savings:" + money;
    }
}