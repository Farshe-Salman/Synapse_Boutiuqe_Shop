package Classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Contribution extends JFrame {
    JFrame frame;
    ImageIcon icon,HomeIcon;
    JLabel label1;
    JButton jbutton1;

    public Contribution(){
        super("Contribution");
        frame = new JFrame();
        frame.setSize(1200,700);
        
        icon = new ImageIcon("images/mainlogo.png"); //Console Icon
        frame.setIconImage(icon.getImage());

        label1 = new JLabel();
        label1.setIcon(new ImageIcon("images/Contribution.jpg")); //Background Image
        Dimension size = label1.getPreferredSize();
        label1.setBounds(0,0,1200,700);
        


        jbutton1 = new JButton(); //Back Icon
        jbutton1.setIcon(new ImageIcon("images/Back.png"));
        jbutton1.setBounds(0,0,50,50);
        jbutton1.setBorder(null);
        jbutton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jbutton1.setContentAreaFilled(false);
        frame.add(jbutton1);

        

        frame.add(label1);

        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);

        jbutton1.addActionListener(new ActionListener(){
            public void  actionPerformed(ActionEvent ae){
                if(ae.getSource() == jbutton1){
                    new Home();
                    frame.setVisible(false);
                }
            }
        });
    }
    public static void main(String[] args) {
        new Contribution();
    }
}
