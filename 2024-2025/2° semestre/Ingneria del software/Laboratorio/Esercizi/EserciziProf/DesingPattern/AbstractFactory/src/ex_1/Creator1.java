package ex_1;

public class Creator1 implements Creator{
    public Icon getIcon() {
        return new Circle();
    }
    public Text getText() {
        return new Japanese();
    }
}