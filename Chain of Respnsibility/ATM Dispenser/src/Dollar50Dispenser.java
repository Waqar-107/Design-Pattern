public class Dollar50Dispenser implements DispenseChain{
    private DispenseChain chain;

    public Dollar50Dispenser() {
        this.chain=null;
    }

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain=nextChain;
    }

    @Override
    public void dispense(Currency currency) {

        //possible to dispense some 50$ notes
        if(currency.getAmount()>=50){
            int q=currency.getAmount()/50;
            int r=currency.getAmount()%50;

            System.out.println("dispensing "+q+" 50$ notes");

            if(r!=0)
                this.chain.dispense(new Currency(r));
        }

        else
            this.chain.dispense(currency);
    }
}
