public class House implements HousePlan{

    private String basement;
    private String interior;
    private String roof;
    private String structure;

    public House() {
    }

    public String getBasement() {
        return basement;
    }

    public String getInterior() {
        return interior;
    }

    public String getRoof() {
        return roof;
    }

    public String getStructure() {
        return structure;
    }

    @Override
    public void setBasement(String basement) {
        this.basement=basement;
    }

    @Override
    public void setInterior(String interior) {
        this.interior=interior;
    }

    @Override
    public void setRoof(String roof) {
        this.roof=roof;
    }

    @Override
    public void setStructure(String structure) {
        this.structure=structure;
    }
}
