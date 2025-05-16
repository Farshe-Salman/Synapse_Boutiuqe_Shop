package Classes;
import java.lang.*;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Thankyou extends JFrame{
    JFrame frame;
    JPanel panel;
    ImageIcon icon;
    JLabel label1;
    JButton jbutton1,jbutton2,jbutton3;
    


    public Thankyou(){
        super("Thankyou");
        frame = new JFrame();
        frame.setSize(600,700);
        
        icon = new ImageIcon("images/mainlogoN.png"); //Console Icon
        frame.setIconImage(icon.getImage());
        
        label1 = new JLabel(); //Background Image
        label1.setIcon(new ImageIcon("images/Thankyou.png"));
        Dimension size = label1.getPreferredSize();
        label1.setBounds(0,0,size.width,size.height);
        label1.setOpaque(true);

        // jbutton1 = new JButton(); //Back Icon
        // jbutton1.setIcon(new ImageIcon("images/Back.png"));
        // jbutton1.setBounds(0,0,50,50);
        // jbutton1.setBorder(null);
        // jbutton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        // jbutton1.setContentAreaFilled(false);
        // frame.add(jbutton1);


        jbutton2 = new JButton();
        jbutton2.setBounds(175,566,254,65);
        jbutton2.setContentAreaFilled(false);
        jbutton2.setBorder(null);
        jbutton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        frame.add(jbutton2);



        frame.add(label1);

        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);

        // jbutton1.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent ae){
        //         if(ae.getSource() == jbutton1){
        //             //new AdminLogin();
        //             frame.setVisible(false);
        //         }
        //     }
        // });

        jbutton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                if(ae.getSource() == jbutton2){
                    Interface i = new Interface();
                    i.setVisible(true);
                    frame.setVisible(false);
                }
            }
        });
    }


           public static void main(String[] args) {
            new Thankyou();
    }
}