public class IglooHouseBuilder implements HouseBuilder {

    private House house;

    public IglooHouseBuilder() {
        this.house=new House();
    }

    @Override
    public void buildBasement() {
        this.house.setBasement("ice bars");
    }

    @Override
    public void buildRoof() {
        this.house.setRoof("ice dome");
    }

    @Override
    public void buildStructure() {
        this.house.setStructure("ice blocks");
    }

    @Override
    public void buildInterior() {
        this.house.setInterior("ice carvings");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
