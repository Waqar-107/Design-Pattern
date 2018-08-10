import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Item> items;

    public ShoppingCart() {
        items=new ArrayList<>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    public int calcTotal(){
        int sum=0;
        for(Item i : items)
            sum+=i.getPrice();

        return sum;
    }

    public void pay(PaymentStrategy paymentStrategy){
        paymentStrategy.pay(calcTotal());
    }
}
