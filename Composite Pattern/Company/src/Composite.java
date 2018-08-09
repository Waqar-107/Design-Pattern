import java.util.ArrayList;

public class Composite implements Employee {
    private ArrayList<Employee> employees;
    private String name;
    private int id;
    private String position;

    public Composite(String name, int id, String position) {
        this.name = name;
        this.id = id;
        this.position = position;

        this.employees=new ArrayList<>();
    }

    @Override
    public void showDetails() {
        System.out.println("Name: "+name+", ID: "+id+", Position: "+position);
        for(Employee e : employees) {
            e.showDetails();
        }
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }
}
