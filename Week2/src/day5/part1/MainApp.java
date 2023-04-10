package day5.part1;

/**
 * ccb
 **/
public class MainApp {
    public static void main(String[] args) {
        Orders orders = new Orders();
        OrderItem orderItem =new OrderItem("1000001","铅笔");
        OrderItem orderItem1 =new OrderItem("200001","橡皮");
        OrderItem orderItem2 =new OrderItem("300001","笔记本");
        OrderItem orderItem3 =new OrderItem("4000001","圆规");
        OrderItem orderItem4 =new OrderItem("100002","水笔");
        OrderItem orderItem5 =new OrderItem("100002aaaa","水笔");
        System.out.println(orders.getOrderItemCount());
        orders.addItems(orderItem);
        orders.addItems(orderItem1);
        orders.addItems(orderItem2);
        orders.addItems(orderItem3);
        orders.addItems(orderItem4);
        orders.addItems(orderItem5);
        for (int i = 0; i < orders.getOrderItemCount(); i++) {
            System.out.println(orders.orderItems[i]);
        }
        orders.delOrderItem();
        System.out.println("————————删除项目编号长度为6的订单项目后——————");
        for (int i = 0; i < orders.getOrderItemCount(); i++) {
            System.out.println(orders.orderItems[i]);
        }
    }
}
