public class Dollar10Dispenser implements DispenseChain{
    private DispenseChain chain;

    public Dollar10Dispenser() {
        this.chain=null;
    }

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain=nextChain;
    }

    @Override
    public void dispense(Currency currency) {

        //possible to dispense some 10$ notes
        if(currency.getAmount()>=10){
            int q=currency.getAmount()/10;
            int r=currency.getAmount()%10;

            System.out.println("dispensing "+q+" 10$ notes");

            if(r!=0)
                this.chain.dispense(new Currency(r));
        }

        else
            this.chain.dispense(currency);
    }
}
