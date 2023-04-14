package day2.part2;

/**
 * ccb
 **/
public class SavingAccount extends Account {//储蓄帐户
    public SavingAccount(String name, String pwd, String IDCard, double money) {
        super(name, pwd, IDCard, money);
    }
    //methods

    @Override
    public Account quKuan(double money) {
        return super.quKuan(money);
    }

    //toString

    @Override
    public String toString() {
        return "账户信息（" +
                "账户类型：储蓄卡 " +
                "ID：" + super.getID() +
                ", 姓名：" + super.getName() +
                ", 密码：" + super.getPwd() +
                ", 身份证号码：" + super.getIDCard() +
                ", 余额：" + super.getMoney() +
                '）';
    }
}
