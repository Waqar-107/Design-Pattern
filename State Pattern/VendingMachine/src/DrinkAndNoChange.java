/**
 * Created by 1505107 on 6/23/2018.
 */
public class DrinkAndNoChange implements VMStates{
    VendingMachine vm;

    public DrinkAndNoChange(VendingMachine vm) {
        this.vm = vm;
    }

    @Override
    public void doAction() {
        Drinks d=vm.getDrinks(vm.getDrinkCode());
        System.out.println(d.getName()+" delivered to the use :)");
        vm.setCurrentState(vm.getInsertCoin());
    }
}
