package ex_1;

public class Box implements Icon{
    @Override
    public void draw() {
        System.out.println("[ ]");
    }

    @Override
    public void fill() {
        System.out.println("[X]");
    }
}
