package day2.part2;

import java.util.Scanner;
import java.util.Timer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ccb
 **/
public class BankTest {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Timer timer = new Timer();
        Bank bank = new Bank();
        BankService bankService = new Bank();
        Account account = bankService.register("0", "ccb", "0315", "aabbcc");
//        System.out.println(account);
        Account account1 = bankService.register("0", "bbc", "0316", "aabbcc");
//        System.out.println(account1);
        Account account2 = bankService.register("1", "hk", "0317", "aabbcc");
//        System.out.println(account2);
        Account account3 = bankService.register("0", "ccb", "0315", "aabbcc");
//        System.out.println(Arrays.toString(Bank.accounts));
//        System.out.println("——————————————————————");
        Bank bank1 = new Bank();
//        System.out.println(Arrays.toString(Bank.accounts));
        Account account4 = bankService.register("0", "a", "0310", "aabbcc");
//        System.out.println(Bank.accountCount);
//        System.out.println("——————————————————————");
//        System.out.println(bank.login("3", "aabbcc"));
//        System.out.println(bank.login("5", "aabbcc"));
        System.out.println("\t\t* * * * * * * * * * * * * *\t*");
        System.out.println("\t\t*                       \t*");
        System.out.println("\t\t*     欢迎进入取款机界面   \t*");
        System.out.println("\t\t*                       \t*");
        System.out.println("\t\t* * * * * * * * * * * * * *\t*");
        BankSystem:
        while (true) {//直到用户选择退出，则退出取款机系统
            System.out.println("请选择你的操作：1. 注册用户 2.登入用户 3.退出系统");
            int key = sc.nextInt();
            switch (key) {//注册、登入、退出
                case 1://register
                    System.out.println("——————成功进入注册页面——————");
                    while (true) {//直到用户选择退出，则退出注册页面到主系统
                        System.out.println("请依次输入 开户类型（0.储蓄 1.信用） 用户姓名 身份证号码 用户密码");
                        String type = sc.next();
                        String name = sc.next();
                        String IDCard = sc.next();
                        String pwd = sc.next();
                        if (isRegisterFormat(name, IDCard, pwd)) {
                            Account account5 = bankService.register(type, name, IDCard, pwd);
                            if (account5 != null) { //注册成功输出用户信息
                                System.out.println(account5);
                            }
                        }
                        System.out.println("是否继续注册0.是 其他.否");
                        int i = sc.nextInt();
                        if (i != 0) {
                            System.out.println("退出注册页面成功");
                            break;
                        }
                    }
                    break;
                case 2://login
                    System.out.println("——————成功进入登入页面——————");
                    int loginCount = 3;
                    LoginCount:
                    while (loginCount != 0) {//三次输入ID和密码的机会
                        System.out.println("请依次输入 账户卡ID  用户密码");
                        String ID = sc.next();
                        String pwd = sc.next();
                        Account loginAccount = bank.login(ID, pwd);
                        if (loginAccount != null) {
                            //登入成功
                            System.out.println("————————————————————————————————————————————————————————");
                            System.out.println("当前登入帐户信息：" + loginAccount);
                            System.out.println("————————————————————————————————————————————————————————");
                            loginingSystem:
                            while (true) {
                                System.out.println("请选择你的操作：1. 存款 2.取款 3.转账 4.退出登录系统");
                                int key1 = sc.nextInt();
                                switch (key1) {
                                    case 1:
                                        while (true) {
                                            System.out.println("输入存款的金额：");
                                            double saveMoney = sc.nextDouble();
                                            loginAccount.cunKuan(saveMoney);
                                            System.out.println("是否继续存取款操作（1.是/其他.否）");
                                            int key3 = sc.nextInt();
                                            if (key3 != 1) {
                                                System.out.println("退出存款页面成功！");
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        while (true) {
                                            System.out.println("输入取款的金额：");
                                            double withdrawMoney = sc.nextDouble();
                                            loginAccount.quKuan(withdrawMoney);
                                            System.out.println("是否继续取款操作（1.是/其他.否）");
                                            int key3 = sc.nextInt();
                                            if (key3 != 1) {
                                                System.out.println("退出存款页面成功！");
                                                break;
                                            }
                                        }
                                        break;
                                    case 3:
                                        while (true) {
                                            System.out.println("输入转账帐户的ID：");
                                            String targetID = sc.next();
                                            System.out.println("输入转账的金额：");
                                            double transferMoney = sc.nextDouble();
                                            Bank.transfer(transferMoney,loginAccount,targetID);
                                            System.out.println("是否继续转账操作（1.是/其他.否）");
                                            int key3 = sc.nextInt();
                                            if (key3 != 1) {
                                                System.out.println("退出转账页面成功！");
                                                break;
                                            }
                                        }
                                        break;
                                    case 4:
                                        System.out.println("正在退出帐户······");
                                        Thread.sleep(2000);
                                        System.out.println("退出成功！帐户已退出至主页面");
                                        break LoginCount;
                                    default:
                                        System.out.println("输入格式错误!请重新输入");
                                        break;
                                }
                            }
                        } else {
                            loginCount--;
                            System.out.println("登入帐户失败！" +
                                    "帐户ID或密码不正确！还剩 " + (loginCount) +
                                    " 次输入机会");
                        }
                    }
                    break;
                case 3://exit
                {
                    System.out.println("正在退出系统······");
                    Thread.sleep(2000);
                    System.out.println("退出系统成功！");
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("输入格式错误!请重新输入");
                    break;
            }
        }
    }

    public static boolean isRegisterFormat(String name, String IDCard, String pwd) throws InterruptedException {//注册格式判断
        Pattern pattern = Pattern.compile("^[\\u4e00-\\u9fa5]{2,}$");//至少两个中文
        Pattern pattern1 = Pattern.compile("^\\d{18,}$");//只能是18位数字
        Pattern pattern2 = Pattern.compile("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,16}$");//必须是包含大小写字母和数字的组合，不能使用特殊字符，长度在8-10之间
        Matcher matcher = pattern.matcher(name);
        Matcher matcher1 = pattern1.matcher(IDCard);
        Matcher matcher2 = pattern2.matcher(pwd);
        boolean key = false;
        if (matcher.find()) {//密码、身份证、姓名都符合格式返回true
            if (matcher1.find()) {
                if (matcher2.find()) {
                    return true;
                } else System.out.println("密码必须是含有大小写字母和数字，并且不含有特殊字符的长度为6-16的组合！");
            } else System.out.println("身份证号码只能是18位数字！");
        } else System.out.println("姓名只能是中文！");
        return false;
    }
}
