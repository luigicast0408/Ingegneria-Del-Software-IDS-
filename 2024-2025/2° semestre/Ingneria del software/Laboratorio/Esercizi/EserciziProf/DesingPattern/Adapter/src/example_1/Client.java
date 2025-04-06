package example_1;

public class Client {
    public static void main(String[] args) {
        ILabel server = new Label("Label");
        String label = server.getNextLabel();
        System.out.println(label);

        if (label.equals("Label1")){
            System.out.println("Test 1:Passed");
        }else {
            System.out.println("Test1:Failed");
        }
    }
}
