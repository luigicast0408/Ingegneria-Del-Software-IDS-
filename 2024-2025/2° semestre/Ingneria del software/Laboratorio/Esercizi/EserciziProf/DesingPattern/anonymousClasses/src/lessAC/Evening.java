package lessAC;

public class Evening {
    private final Hello myh;

    public Evening(Hello h) {
        myh = h;
    }

    public Evening(AC.Hello hello, Hello myh) {
        this.myh = myh;
    }

    public void saluti() {
        myh.greetings("buonasera");
    }
}