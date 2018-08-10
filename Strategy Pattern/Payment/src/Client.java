public class Client {
    public static void main(String[] args){
        ShoppingCart cart=new ShoppingCart();

        Item item1=new Item("chips02",19);
        Item item2=new Item("choclate007",37);

        cart.addItem(item1);
        cart.addItem(item2);

        //paypal
        cart.pay(new PaypalStrategy("email@gmail.com","*****"));

        //credit card
        cart.pay(new CreditCardStrategy("xyz","*****","***","**"));
    }
}
