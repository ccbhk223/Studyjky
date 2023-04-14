package day2.part2;

/**
 * ccb
 **/
public class Bank implements BankService {//业务实现层
    static Account[] accounts;//类数组等同于数据库，存放已经开户的那些用户的信息
    private static String id = "1";
    static int accountCount = 0;

    //methods
    //开户
    // 需求：一个人只能在本银行开相同类型的账户一次
    @Override
    public Account register(String type, String name, String IDCard, String pwd) {
        Account account = null;
        boolean isregister = false;
        for (int i = 0; i < accountCount; i++) {
            Account everyAccount = accounts[i];
            if (IDCard.equals(everyAccount.getIDCard()) && type.equals("0") && everyAccount instanceof SavingAccount) {
                isregister = true;
                System.out.println("开通储蓄卡失败！您已经在该行开户过储蓄卡");
                break;
            } else if (IDCard.equals(everyAccount.getIDCard()) && type.equals("1") && everyAccount instanceof CreditAccount) {
                isregister = true;
                System.out.println("开通信用卡失败！您已经在该行开户过信用卡");
                break;
            }
        }
        if (!isregister) {
            if (type.equals("0")) {
                account = new SavingAccount(name, pwd, IDCard, 0);
                System.out.println("储蓄账户开通成功！");
                accounts[accountCount] = account;
                accountCount++;
                Bank.id = (Integer.parseInt(Bank.id) + 1) + "";
            } else if (type.equals("1")) {
                account = new CreditAccount(name, pwd, IDCard, 0);
                System.out.println("信用账户开通成功！帐户初始信用额度为：" + 1000);
                accounts[accountCount] = account;
                accountCount++;
                Bank.id = (Integer.parseInt(Bank.id) + 1) + "";
            } else System.out.println("开通帐户类型操作有误！");
        }
        return account;
    }

    @Override
    //到类数组中根据id和password查找用户信息，找到后打印相关信息，如果是信用账户，打印信用额度
    public Account login(String id, String pwd) {
        Account account = null;
        boolean isFind = false;
        for (int i = 0; i < accountCount; i++) {
//            System.out.println(accounts[i].getID());
//            System.out.println(accounts[i]);
            Account everyAccount = accounts[i];
            if (id.equals(everyAccount.getID()) && pwd.equals(everyAccount.getPwd())) {
                account = accounts[i];
                isFind = true;
                break;
            }
        }
        if (isFind) {
            System.out.println("登入账户成功!");
        }
        return account;
    }

    //转账
    public static void transfer(double money, Account selfAccount, String targetID) {
        Account targetAccount = null;
        boolean isFind = false;
        for (int i = 0; i < accountCount; i++) {//寻找需要转账的帐户
            if (targetID.equals(accounts[i].getID())) {
                targetAccount = accounts[i];
                isFind = true;
                break;
            }
        }
        if (isFind) {
            if (selfAccount.getMoney() > money) {
                selfAccount.setMoney(selfAccount.getMoney() - money);
                targetAccount.setMoney(targetAccount.getMoney()+money);
                System.out.println("成功转账给用户 （" + targetAccount.getID() +","+targetAccount.getName()+","+targetAccount.getIDCard()+
                        "）,您当前用户的余额为：" + selfAccount.getMoney());
                System.out.println(targetAccount);
            } else System.out.println("当前账户余额不足！转账失败！(转账只支持实际余额交易)");
        }else System.out.println("转账失败！未在本银行找到此转账帐户");
    }
    //constructor
    public Bank() {
        if (accounts == null) accounts = new Account[100];  //创建一个帐户数量最大100的帐户单
    }

    //get set
    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        Bank.id = id;
    }
}
