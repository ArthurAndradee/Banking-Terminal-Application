public class BankAccount {

    private String name;
    private Integer password;
    private Integer money;

    String devName = "Arthur";
    Integer devPassword = 1620;
    Integer devMoney = 2000;

    public String devName() {
        return devName;
    }

    public Integer devPassword() {
        return devPassword;
    }

    public Integer devMoney() {
        return devMoney;
    }


    public String getName() {
        return name;
    }

    public Integer getPassword() {
        return password;
    }

    public Integer getMoney() {
        return money;
    }

    //In case user wants to create a new account
    
    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return  "Name:" + name + '\n' +
                "Password:" + password + '\n' +
                "Savings:" + money;
    }
}