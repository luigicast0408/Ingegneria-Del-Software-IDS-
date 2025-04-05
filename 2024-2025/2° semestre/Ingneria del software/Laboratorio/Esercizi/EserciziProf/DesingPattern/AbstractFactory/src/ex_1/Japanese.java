package ex_1;

public class Japanese  implements Text{
    @Override
    public void tell() {
        System.out.println("Youkoso. Konnichiwa! Hajimemashite");
    }

    @Override
    public void shout() {
        System.out.println("Shizuka ni shite kudasai ");
    }
}
