package day2.part3.T2;

/**
 * ccb
 **/
public class Account {
    private String accountName;
    private String accountId;

    public Account() {
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getAccountId() {
        return accountId;
    }

    public Account(String accountName, String accountId) {
        this.accountName = accountName;
        this.accountId = accountId;
//        System.out.println("姓名：" + accountName + " ID:" + accountId);
    }

    public void delNum(Account account) {
        char[] str = account.getAccountName().toCharArray();
        for (char c : str) {
            if (c >= '0' && c <= '9') accountName = accountName.replace(c + "", "");
        }
//        account.setAccountName(accountName) ;
//        System.out.println(accountName);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountName='" + accountName + '\'' +
                ", accountId='" + accountId + '\'' +
                '}';
    }
}
