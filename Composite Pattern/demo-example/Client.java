public class Client {
    public static void main(String[] args){
        Drawing d=new Drawing();

        Triangle t=new Triangle();
        Circle c=new Circle();

        d.addShape(t);
        d.addShape(c);
        d.draw("blue");

        d.removeShape(c);
        d.draw("red");
    }
}
