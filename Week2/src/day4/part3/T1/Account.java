package day4.part3.T1;

public class Account {
    //私有属性
    private double money;//余额

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Account(double money) {
        this.money = money;
    }

    public Account() {
    }
    //自定义行为  取款

    public Account  quKuan(double money){
        //判断余额是否够，够取款；不够打印余额不足
        if (this.money>=money){
            this.money -= money;
        }
        return this;
    }

    @Override   //重写Object的toString
    public String toString() {
        return "账户余额："+ money ;
    }
    //自定义行为  存款
    public void cunKuan(double money){
        this.money+=money;
    }
}
