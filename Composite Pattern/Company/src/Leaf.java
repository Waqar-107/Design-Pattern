public class Leaf implements Employee {
    private String name;
    private int id;
    private String position;

    public Leaf(String name, int id, String position) {
        this.name = name;
        this.id = id;
        this.position = position;
    }

    @Override
    public void showDetails() {

        System.out.println("Name: "+name+", ID: "+id+", Position: "+position);
    }
}
