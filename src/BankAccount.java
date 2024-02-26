public class BankAccount {

    private String name;
    private Integer password;
    private Integer money;
    
    public String getName() {
        return name;
    }

    public Integer getPassword() {
        return password;
    }

    public Integer getMoney() {
        return money;
    }
    
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

class devAccount extends BankAccount {
        
}