package example_1;

public class LabelServer {
    private int numberLabel = 1;
     protected String labelPrefix;

    public LabelServer(String prefix){
        labelPrefix = prefix;
    }

    public String nextLabelServer(){
        return labelPrefix +numberLabel ++;
    }
}
