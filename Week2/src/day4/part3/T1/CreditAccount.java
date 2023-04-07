package day4.part3.T1;

public class CreditAccount extends Account {
    private double ceilgMoney;//信用额度

    public double getCeilgMoney() {
        return ceilgMoney;
    }

    public void setCeilgMoney(double ceilgMoney) {
        this.ceilgMoney = ceilgMoney;
    }

    public CreditAccount() {
    }

    public CreditAccount(double money, double ceilgMoney) {
        super(money);//父类的有参构造
        this.ceilgMoney = ceilgMoney;
    }

    @Override
    public Account quKuan(double money) {
        //信用额度可以参与取款的：money只要在money+ceilgMoney范围内都是允许取款
        if (ceilgMoney + super.getMoney() >= money) {
            super.setMoney(super.getMoney()-money);
        }
        /*Account account = new CreditAccount();*/
        return this;//this是信用卡对象
    }
}
