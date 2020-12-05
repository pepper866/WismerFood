import java.util.ArrayList;
public class Order{
    ArrayList<Item> order;
    public Order(){
        order = new ArrayList<Item>();
    }

    public void addItem(String name, String custom, double price){
        Item item = new Item(name,custom,price);
        order.add(item);
    }

}