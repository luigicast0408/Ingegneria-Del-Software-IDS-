package example_1;

public class Label  extends LabelServer implements ILabel{

    public Label(String prefix){
        super(prefix);
    }

    public String getNextLabel(){
        return nextLabelServer();
    }
}
