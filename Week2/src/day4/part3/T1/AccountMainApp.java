package day4.part3.T1;

public class AccountMainApp {
    public static void main(String[] args) {
        //实例化一个信用账户对象
        Account account = new SavingAccount(5000);
        //实例化一个存储账户对象
        Account account1 = new CreditAccount(2000, 1000);
        //调用取款方法
        Account account2 = account1.quKuan(2100);
        System.out.println(account1);
        System.out.println(account2 == account1);
        account2.cunKuan(5000);
        System.out.println(account2);
    }
}
