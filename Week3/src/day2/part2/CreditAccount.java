package day2.part2;

/**
 * ccb
 **/
public class CreditAccount extends Account {//信用账户
    private double ceilMoney;//信用额度
    private final static double defaultCeilMoney =1000;//初始信用账户信用额度

    //methods
    //信用账户取款
    @Override
    public Account quKuan(double money) {
        if (this.getMoney() + this.ceilMoney < money) {//存款+信用余额都不够取款金额
            System.out.println("当前账户余额与信用余额不足！取款失败！");
        } else if (this.getMoney() >= money) {//实际余额足够取款，不用使用信用额度
            this.setMoney(this.getMoney()-money) ;
            System.out.println("取款成功！当前用户的实际余额为："+this.getMoney()+",信用余额为："+this.ceilMoney);
        } else {//实际余额不够，要使用信用额度
            System.out.println("取款成功！帐户余额不足透支信用余额："+(money-this.getMoney()));
            this.setCeilgMoney(this.getCeilgMoney() - (money - this.getMoney()));
            this.setMoney(0);
            System.out.println("当前用户的实际余额为："+this.getMoney()+",信用余额为："+this.ceilMoney);
        }
        return this;
    }
    //信用帐户存款
    @Override
    public void cunKuan(double money) {
        if (this.ceilMoney < defaultCeilMoney) {
            if (money + this.ceilMoney > defaultCeilMoney) {//存款额度足够还清信用余额
                System.out.println("存款成功！信用卡透支余额已还清");
                super.cunKuan(money + this.ceilMoney-defaultCeilMoney);
                this.setCeilgMoney(defaultCeilMoney);
                System.out.println("当前用户的实际余额为：" + this.getMoney() + ",信用余额为：" + this.ceilMoney);
            } else {//存款额度不足够还清信用余额
                System.out.println("存款成功！信用卡透支余额已减少");
                this.ceilMoney += money;
                System.out.println("当前用户的实际余额为：" + this.getMoney() + ",信用余额为：" + this.ceilMoney);
            }
        } else {//信用余额已还清，直接操作实际额度
            super.cunKuan(money);
            System.out.println("当前用户的实际余额为：" + this.getMoney() + ",信用余额为：" + this.ceilMoney);
        }
    }

    //constructor
    public CreditAccount(String name, String pwd, String IDCard, double money) {
        super(name, pwd, IDCard, money);
        this.ceilMoney = defaultCeilMoney;
    }

    //toString
    @Override
    public String toString() {
        return "账户信息（" +
                "账户类型：信用卡 " +
                "ID：" + super.getID() +
                ", 姓名：" + super.getName() +
                ", 密码：" + super.getPwd() +
                ", 身份证号码：" + super.getIDCard() +
                ", 余额：" + super.getMoney() +
                ", 信用余额：" + ceilMoney +
                '）';
    }

    //get set
    public double getCeilgMoney() {
        return ceilMoney;
    }

    public void setCeilgMoney(double ceilgMoney) {
        this.ceilMoney = ceilgMoney;
    }
}
