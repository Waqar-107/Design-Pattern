public class PCFactory extends ComputerAbstractFactory {

    public String ram;
    public String hdd;
    public String cpu;

    public PCFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new PC(ram,hdd,cpu);
    }
}
