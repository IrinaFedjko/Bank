package bank;

public class UserData {

    private int accountNumber;
    private double balance;
    private String name;
    private boolean man;
    private int usersId;

    public UserData(int accountNumber, double balance, String name, boolean man, int usersId) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.man = man;
        this.usersId = usersId;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMan() {
        return man;
    }

    public void setMan(boolean man) {
        this.man = man;
    }

    public int getUsersId() {
        return usersId;
    }

    public void setUsersId(int usersId) {
        this.usersId = usersId;
    }
}
