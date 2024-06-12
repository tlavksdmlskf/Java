package bank;

public class Account {
    int balance= 0;

    void deposit(int amount){
        balance += amount;
    }
    void withdraw(int amount){
        if (amount <= balance){
            balance -= amount;
        }else{
            System.out.println("잔액 부족");
        }
    }
}
