public class Dollar20Dispenser implements DispenseChain{
    private DispenseChain chain;

    public Dollar20Dispenser() {
        this.chain=null;
    }

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain=nextChain;
    }

    @Override
    public void dispense(Currency currency) {

        //possible to dispense some 20$ notes
        if(currency.getAmount()>=20){
            int q=currency.getAmount()/20;
            int r=currency.getAmount()%20;

            System.out.println("dispensing "+q+" 20$ notes");

            if(r!=0)
                this.chain.dispense(new Currency(r));
        }

        else
            this.chain.dispense(currency);
    }
}
