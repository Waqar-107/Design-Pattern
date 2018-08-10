public class TipiHouseBuilder implements HouseBuilder {

    private House house;

    @Override
    public void buildBasement() {
        this.house.setBasement("wooden poles");
    }

    @Override
    public void buildRoof() {
        this.house.setRoof("Wood, caribou and seal skins");
    }

    @Override
    public void buildStructure() {
        this.house.setStructure("wood and ice");
    }

    @Override
    public void buildInterior() {
        this.house.setInterior("fire wood");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
