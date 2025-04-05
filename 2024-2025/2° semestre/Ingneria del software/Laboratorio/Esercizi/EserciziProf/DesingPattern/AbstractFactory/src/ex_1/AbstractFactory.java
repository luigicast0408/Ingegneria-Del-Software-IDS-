package ex_1;

public class AbstractFactory {
    public static void main(String[] args) {
        Creator creator = new Creator1();
        Icon icon = creator.getIcon();
        Text text = creator.getText();
        icon.draw();
        text.tell();
    }
}