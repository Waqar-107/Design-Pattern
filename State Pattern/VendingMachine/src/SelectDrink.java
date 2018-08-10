import java.util.Scanner;

/**
 * Created by lenovo on 6/23/2018.
 */

public class SelectDrink implements VMStates {
    VendingMachine vm;

    public SelectDrink(VendingMachine vm) {
        this.vm = vm;
    }

    @Override
    public void doAction() {
        System.out.println("enter code no. please");

        Scanner in=new Scanner(System.in);
        int code=in.nextInt();

        vm.setDrinkCode(code);
        vm.setCurrentState(vm.getItemInsufficient());
    }
}
