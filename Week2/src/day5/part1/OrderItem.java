package day5.part1;

/**
 * ccb
 **/
public class OrderItem {
    private String itemId;//编号
    private String itemName;//名称
    //toString

    @Override
    public String toString() {
        return "OrderItem{" +
                "itemId='" + itemId + '\'' +
                ", itemName='" + itemName + '\'' +
                '}';
    }

    //constructor

    public OrderItem() {
    }

    public OrderItem(String itemId, String itemName) {
        this.itemId = itemId;
        this.itemName = itemName;
    }

    //getter and setter

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
