public class Student implements Observer {

    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void getNotification(String msg) {
        System.out.println("("+name+","+id+") received message : "+msg);
    }
}
