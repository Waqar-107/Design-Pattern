/**
 * Created by 1505107 on 6/23/2018.
 */

public class ItemInsufficient implements VMStates {
    VendingMachine vm;

    public ItemInsufficient(VendingMachine vm) {
        this.vm = vm;
    }

    @Override
    public void doAction() {
        if(vm.itemQuantity(vm.getDrinkCode())>0){
            System.out.println("item sufficient :)");
            vm.setCurrentState(vm.getMoneyInsufficient());
        }

        else{
            System.out.println("sorry, product is not available the machine");
            vm.setCurrentState(vm.getInsertCoin());
        }
    }
}
