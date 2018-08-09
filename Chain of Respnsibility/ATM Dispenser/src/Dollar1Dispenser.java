public class Dollar1Dispenser implements DispenseChain {
    private DispenseChain chain;

    public Dollar1Dispenser() {
        this.chain=null;
    }

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain.setNextChain(nextChain);
    }

    @Override
    public void dispense(Currency currency) {
        System.out.println("Dispensing "+currency.getAmount()+" 1$ notes");
    }
}
