package entities;

public class Account {
    private  int number;
    private  String holder;
    private Double balance;

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, Double initialDeposity) {
        this.number = number;
        this.holder = holder;
       deposit(initialDeposity);
    }

    public int getNumber() {
        return number;
    }


    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(Double amout){
        balance += amout;
    }
    public void  withdraw (Double amout){
        balance -= amout + 5.0;
    }

    @Override
    public String
    toString() {
        return "Account{" +
                "number=" + number +
                ", holder='" + holder + '\'' +
                ", balance=" + balance +
                '}';
    }
}
