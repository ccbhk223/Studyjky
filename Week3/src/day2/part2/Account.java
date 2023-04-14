package day2.part2;

/**
 * ccb
 **/
public class Account {
    private String ID;
    private String Name;
    private String Pwd;//密码
    private String IDCard;//身份证号码
    private double money;//余额默认0

    //methods


    //存款
    public void cunKuan(double money) {
        this.money += money;
        System.out.println("存款成功！您目前余额为：" + this.money);
    }

    //取款
    public Account quKuan(double money) {
        //判断余额是否够，够取款；不够打印余额不足
        if (this.money >= money) {
            this.money -= money;
            System.out.println("取款成功,当前用户的余额为：" + this.money);
        } else System.out.println("当前账户余额不足！取款失败！");
        return this;
    }
    //constructor

    public Account(String name, String pwd, String IDCard, double money) {
        Name = name;
        Pwd = pwd;
        this.IDCard = IDCard;
        this.money = money;
        setID(Bank.getId());
    }

    //toString
    @Override
    public String toString() {
        if (ID == null) return "1111";
        return "Account{" +
                "ID='" + Bank.getId() + '\'' +
                ", Name='" + Name + '\'' +
                ", Pwd='" + Pwd + '\'' +
                ", IDCard='" + IDCard + '\'' +
                ", money=" + money +
                '}';
    }


    //get set

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPwd() {
        return Pwd;
    }

    public void setPwd(String pwd) {
        Pwd = pwd;
    }

    public String getIDCard() {
        return IDCard;
    }

    public void setIDCard(String IDCard) {
        this.IDCard = IDCard;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
