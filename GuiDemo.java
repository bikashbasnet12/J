import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
public class GuiDemo extends JFrame{
    GuiDemo(){
        JLabel lbl,lbl1,lbl2;
        JTextField txtname;
        JTextArea txtarea;
        JPasswordField pw;
        JCheckBox cbox,cbox1,cbox2;
        JRadioButton rdbtn,rdbtn1;
        JButton btn;
        setSize(500,500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        lbl = new JLabel("Username:");
        txtname = new JTextField(20);
        txtname.setBounds(200,100,90,30);
        lbl.setBounds(100,100,100,50);
        add(lbl);
        add(txtname);
        lbl1 = new JLabel("PAssword");
        pw = new JPasswordField(20);
        lbl1.setBounds(100,150,100,50);
        pw.setBounds(200,150,90,30);
        add(pw);
        add(lbl1);
        lbl2 = new JLabel("hobbies");
        cbox = new JCheckBox("dancing");
        cbox1 = new JCheckBox("singing",true);
        cbox2 = new JCheckBox("Reading");
        lbl2.setBounds(100,200,100,40);
        cbox.setBounds(200,200,100,30);
        cbox1.setBounds(300,200,100,30);
        cbox2.setBounds(390,200,100,30);
        add(lbl2);
        add(cbox);
        add(cbox1);
        add(cbox2);
        btn = new JButton("Save");
        btn.setBounds(150,300,100,30);
        add(btn);

        setVisible(true);

    }
        public static  void main(String[] args){
        new GuiDemo();
    }
}
