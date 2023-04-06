package day2.part3.T2;

/**
 * ccb
 **/
public class Account {
    private String accountName;
    private String accountId;
    public Account(){}
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    public void setAccountId(String accountId){
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getAccountId() {
        return accountId;
    }

    public Account(String accountName, String accountId){
        this.accountName = accountName;
        this.accountId = accountId;
        System.out.println("姓名："+accountName+" ID:"+accountId);
    }
    public void delNum(){
        char[] str = this.accountName.toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (str[i]>='0'&&str[i]<='9') accountName =accountName.replace(str[i]+"","");
        }
        this.accountName =accountName;
//        System.out.println(accountName);
    }
}
