/**
 * Created by 1505107 on 6/23/2018.
 */

public class MoneyInsufficient implements VMStates{
    VendingMachine vm;

    public MoneyInsufficient(VendingMachine vm) {
        this.vm = vm;
    }

    @Override
    public void doAction() {
        int coin=vm.getCoinDeposited();
        Drinks drink=vm.getDrinks(vm.getDrinkCode());

        if(drink.getPrice()>coin){
            System.out.println("please deposite sufficient money :)");
            System.out.println(coin+" delivered to user");
            vm.setCurrentState(vm.getInsertCoin());
        }

        else if(drink.getPrice()==coin){
            System.out.println("sufficient money!!!");
            vm.itemQuantityDec(vm.getDrinkCode());
            vm.setCurrentState(vm.getDrinkAndNoChange());
        }

        else{
            System.out.println("more than sufficient money!!!");
            vm.itemQuantityDec(vm.getDrinkCode());
            vm.setCurrentState(vm.getDrinkAndChange());
        }
    }
}
