public abstract class Computer {
    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    @Override
    public String toString(){
        String s="RAM: "+this.getRAM()+"\nHDD: "+this.getHDD()+"\nCPU: "+this.getCPU();
        return s;
    }
}
