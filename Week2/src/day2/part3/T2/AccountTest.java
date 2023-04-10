package day2.part3.T2;

/**
 * ccb
 **/
public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("c1111cb123123","01");
        Account account2 = new Account();
        account2.setAccountName("b2b1c345");
        account2.setAccountId("02");
        System.out.println(account1.toString());
        System.out.println(account2.toString());
        account1.delNum(account1);
        account2.delNum(account2);
        System.out.println(account1.getAccountName());
        System.out.println(account2.getAccountName());
    }
}
