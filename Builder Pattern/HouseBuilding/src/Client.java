public class Client {
    public static void main(String[] args){
        HouseBuilder builder=new IglooHouseBuilder();
        CivilEngineer engi=new CivilEngineer(builder);

        engi.buildHouse();

        House h=engi.getHouse();
        System.out.println("Basement: "+h.getBasement()+"\nStructure: "+h.getStructure()+"\nRoof: "+h.getRoof()+"\nInterior:"+h.getInterior());
    }
}
