import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by 1505107 on 6/23/2018.
 */

public class VendingMachine {

    //states
    private InsertCoin insertCoin;
    private SelectDrink selectDrink;
    private ItemInsufficient itemInsufficient;
    private MoneyInsufficient moneyInsufficient;
    private DrinkAndChange drinkAndChange;
    private DrinkAndNoChange drinkAndNoChange;

    private VMStates currentState;

    //money inserted and drink selected
    private int coinDeposited;
    private int drinkCode;

    //storage will have <item_code,quantity>
    private HashMap<Integer,Integer> storage;

    //list of drinks to show
    private ArrayList<Drinks> arr;

    //find and get the drinks detail from code of the item
    private HashMap<Integer,Drinks> drinkDetail;

    public VendingMachine() {
        insertCoin=new InsertCoin(this);
        selectDrink=new SelectDrink(this);
        itemInsufficient=new ItemInsufficient(this);
        moneyInsufficient=new MoneyInsufficient(this);
        drinkAndChange=new DrinkAndChange(this);
        drinkAndNoChange=new DrinkAndNoChange(this);

        currentState=insertCoin;
        addItems();
    }

    void doAction(){
        currentState.doAction();
    }

    //--------------------------------------------------------------
    //current state
    public void setCurrentState(VMStates currentState) {
        this.currentState = currentState;
    }
    //--------------------------------------------------------------

    //--------------------------------------------------------------
    //internal states
    public InsertCoin getInsertCoin() {
        return insertCoin;
    }

    public SelectDrink getSelectDrink() {
        return selectDrink;
    }

    public ItemInsufficient getItemInsufficient() {
        return itemInsufficient;
    }

    public MoneyInsufficient getMoneyInsufficient() {
        return moneyInsufficient;
    }

    public DrinkAndChange getDrinkAndChange() {
        return drinkAndChange;
    }

    public DrinkAndNoChange getDrinkAndNoChange() {
        return drinkAndNoChange;
    }
    //--------------------------------------------------------------

    //--------------------------------------------------------------
    //coin
    public int getCoinDeposited() {
        return coinDeposited;
    }

    public void setCoinDeposited(int coinDeposited) {
        this.coinDeposited = coinDeposited;
    }

    //drink code

    public int getDrinkCode() {
        return drinkCode;
    }

    public void setDrinkCode(int drinkCode) {
        this.drinkCode = drinkCode;
    }
    //--------------------------------------------------------------

    private void addItems(){
        storage=new HashMap<>();
        arr=new ArrayList<>();
        drinkDetail=new HashMap<>();

        //--------------------------------
        //insert some drinks with arbitrary price
        Drinks d1=new Drinks("7Up",1,25);
        Drinks d2=new Drinks("sprite",2,30);
        Drinks d3=new Drinks("mirinda",3,30);
        Drinks d4=new Drinks("cokacola",4,25);
        Drinks d5=new Drinks("appy-fizz",5,45);
        Drinks d6=new Drinks("RedBull",6,150);

        //store 2 of each
        for(int i=1;i<=5;i++){
            storage.put(i,2);
        }

        //red-bull
        storage.put(6,1);

        //detailed drink
        drinkDetail.put(1,d1);
        drinkDetail.put(2,d2);
        drinkDetail.put(3,d3);
        drinkDetail.put(4,d4);
        drinkDetail.put(5,d5);
        drinkDetail.put(6,d6);

        //list of drinks
        arr.add(d1);
        arr.add(d2);
        arr.add(d3);
        arr.add(d4);
        arr.add(d5);
        arr.add(d6);
        //-------------------------------
    }

    void showItem(){

        System.out.println("--------------------------------------------");
        System.out.println("name    price   code");

        for(Drinks d : arr){
            System.out.println(d.getName()+"    "+d.getPrice()+"    "+d.getCode());
        }

        System.out.println("--------------------------------------------");
    }

    int itemQuantity(int drinkCode){
        return storage.get(drinkCode);
    }

    void itemQuantityDec(int drinkCode){
        int x=storage.get(drinkCode);
        storage.replace(drinkCode,x,x-1);
    }

    Drinks getDrinks(int code){
        return drinkDetail.get(drinkCode);
    }

    void dbg(){
        for(int i=1;i<=6;i++)
        {
            System.out.println(drinkDetail.get(i).getName());
        }
    }
}
