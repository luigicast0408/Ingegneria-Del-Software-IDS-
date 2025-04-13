package AC;

public class Main {
    public static void main(String[] args) {
        Evening evening = new Evening(new Hello() {
            @Override
            public void greetings(String s) {
                System.out.println("Ciao, " + s);
            }
        });
        evening.saluti();
    }
}