import java.awt.*;
import java.awt.Color;
public class Awttest {
    public static void main(String[]args){
        Frame f = new Frame();
        Button b= new Button("click here");
        f.add(b);
        b.setBounds(30,60,90,40);
        f.setSize(300,200);
        f.setTitle("Frame by me");
        //f.setSize(20,30);
        b.setBackground(Color.GREEN);
        f.setLayout(null);
        f.setVisible(true);

    }
}
