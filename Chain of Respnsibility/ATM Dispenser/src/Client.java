import java.util.Scanner;

public class Client {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);

        DispenseChain uno=new Dollar50Dispenser();
        DispenseChain dos=new Dollar20Dispenser();
        DispenseChain tres=new Dollar10Dispenser();
        DispenseChain quattro=new Dollar1Dispenser();

        uno.setNextChain(dos);
        dos.setNextChain(tres);
        tres.setNextChain(quattro);

        while (true)
        {
            System.out.println("Enter amount to dispense");
            int n=in.nextInt();

            uno.dispense(new Currency(n));
        }
    }
}
