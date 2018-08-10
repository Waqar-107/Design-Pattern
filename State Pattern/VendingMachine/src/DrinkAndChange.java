/**
 * Created by 1505107 on 6/23/2018.
 */
public class DrinkAndChange implements VMStates{
    VendingMachine vm;

    public DrinkAndChange(VendingMachine vm) {
        this.vm = vm;
    }

    @Override
    public void doAction() {
        int coin=vm.getCoinDeposited();
        Drinks d=vm.getDrinks(vm.getDrinkCode());
        System.out.println(d.getName()+" delivered to the user with a change of "+(coin-d.getPrice()));
        vm.setCurrentState(vm.getInsertCoin());
    }
}
