import java.util.ArrayList;
import java.util.List;

//CreatorPool is an ConcreteCreator and implement an Object Pool
public class CreatorPool {
    private List<Shape> pool = new ArrayList<>();

    public Shape getShape(){
        return  pool.size() >0 ? pool.remove(0) : new Circle();
    }

    public void relaseShape(Shape shape){
        pool.add(shape);
    }
}
