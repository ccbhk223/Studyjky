package day2.part3.T2;

/**
 * ccb
 **/
public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("ccb123123","01");
        Account account2 = new Account();
        account1.delNum();
        account2.delNum();
        System.out.println(account1.getAccountName());
        System.out.println(account2.getAccountName());
    }
}
