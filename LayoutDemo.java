import java.awt.*;
public class LayoutDemo {
    public static void main(String[] args){
        Frame f = new Frame();
        Button b2 = new Button("b2");
        Button b3 = new Button("b3");
        Button b4 = new Button("b4");
        Button b1 = new Button("b1");
        Button b33= new Button("b33");

        f.setLayout(new BorderLayout(15,15));
        f.add(b1,BorderLayout.EAST);
        f.add(b2,BorderLayout.WEST);
        f.add(b3,BorderLayout.CENTER);
        f.add(b4,BorderLayout.NORTH);
        f.add(b33,BorderLayout.SOUTH);
        f.setSize(500,500);
        f.setVisible(true);


    }
    
}
