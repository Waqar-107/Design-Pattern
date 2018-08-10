import java.util.Scanner;

/**
 * Created by 1505107 on 6/23/2018.
 */

public class InsertCoin implements VMStates{
    VendingMachine vm;

    public InsertCoin(VendingMachine vm) {
        this.vm = vm;
    }

    @Override
    public void doAction() {

        vm.showItem();

        //the machine waits for the user to insert a coin
        Scanner in=new Scanner(System.in);

        System.out.println("please insert coins:");
        int coin=in.nextInt();

        vm.setCoinDeposited(coin);
        vm.setCurrentState(vm.getSelectDrink());
    }
}
