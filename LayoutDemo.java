import java.awt.*;
public class LayoutDemo {
    public static void main(String[] args){
        Frame f = new Frame();
        Button b2 = new Button("b2");
        Button b3 = new Button("b3");
        Button b4 = new Button("b4");
        Button b1 = new Button("b1");
        Button b33= new Button("b33");

        f.setLayout(new GridLayout(3,2));
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b33);
        f.setSize(300,300);
        f.setVisible(true);


    }
    
}
