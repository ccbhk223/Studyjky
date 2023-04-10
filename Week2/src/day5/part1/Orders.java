package day5.part1;

/**
 * ccb
 **/
public class Orders {
    OrderItem[] orderItems;
    private int OrderItemCount = 0;
    //getter and setter

    public int getOrderItemCount() {
        return OrderItemCount;
    }

    public void setOrderItemCount(int OrderItemCount) {
        OrderItemCount = OrderItemCount;
    }

    //constructor
    public Orders() {
        orderItems = new OrderItem[10];
    }
    //methods
        //添加订单项操作，如果订单编号中长度是大于20位同时值中有字母不允许添加
    public void addItems(OrderItem orderItem){
        String ordeItemId = orderItem.getItemId();
        boolean isHasLetter = false;
        for (int i = 0; i < ordeItemId.length(); i++) {
            char c = ordeItemId.charAt(i);
            if (c>='a'&&c<='z'||c>='A'&&c<='Z'){
                isHasLetter = true;
                break;
            }
        }
        if (!isHasLetter&&ordeItemId.length()<=20){
            orderItems[this.getOrderItemCount()] = orderItem;
            this.OrderItemCount++;
        }else {
            System.out.println("订单编号 "+ordeItemId+" 有误，无法添加到订单中。");
        }
    }
        //删除订单项操作：删除订单项编号长度是6的订单项信息
    public void delOrderItem(){
//        System.out.println("订单项数目：" + this.getOrderItemCount());
        for (int i = 0; i < getOrderItemCount(); i++) {
//            System.out.println("每个订单项：" + orderItems[i]);
            String orderItemId = orderItems[i].getItemId();
            if (orderItemId.length()==6){
                System.out.println("项目编号"+orderItemId+"长度为6，已删除");
                orderItems[i]=orderItems[this.OrderItemCount-1];
                orderItems[this.OrderItemCount-1] = null;
                this.OrderItemCount--;
                i--;
            }
        }
    }
}
