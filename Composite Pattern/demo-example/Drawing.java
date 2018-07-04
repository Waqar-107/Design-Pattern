import java.util.ArrayList;

public class Drawing implements Shape {

    private ArrayList<Shape> shapes;

    public Drawing() {
        shapes=new ArrayList<>();
    }

    @Override
    public void draw(String fillColor) {
        for(Shape shape : shapes){
            shape.draw(fillColor);
        }
    }

    public void addShape(Shape shape){
        shapes.add(shape);
    }

    public void removeShape(Shape shape){
        shapes.remove(shape);
    }

    public void clear(){
        this.shapes.clear();
    }
}
