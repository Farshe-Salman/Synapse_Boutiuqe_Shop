package Classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Home extends JFrame {
    JFrame frame;
    ImageIcon icon,HomeIcon;
    JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11;
    JRadioButton rbutton1,rbutton2,rbutton3;
    ButtonGroup bg1;
    JCheckBox checkbox;
    JButton jbutton1,jbutton2,jbutton3,jbutton4,jbutton5,jbutton6,jbutton7;
    JPasswordField pass;

    public Home(){
        super("Home");
        frame = new JFrame();
        frame.setSize(1200,700);
        
        icon = new ImageIcon("images/mainlogo.png"); //Console Icon
        frame.setIconImage(icon.getImage());

        // JPanel panel = new JPanel();
        // panel.setBounds(0,0,1200,700);
        // panel.setBackground(new Color(228, 225, 217));
        

        label1 = new JLabel();
        label1.setIcon(new ImageIcon("images/HomeBackground.jpg")); //BackGround Image
        Dimension size = label1.getPreferredSize();
        label1.setBounds(0,0,size.width,size.height);
        label1.setOpaque(true);
        

        // jbutton1 = new JButton("Get Ready To Glow"); //Button
        // jbutton1.setBounds(760,340,245,40);
        // jbutton1.setFont(new Font("Segoe UI",Font.BOLD,23));
        // // jbutton1.setBackground(new Color(0,0,0,10));
        // jbutton1.setBackground(new Color(228, 225, 217));
        // jbutton1.setForeground(Color.BLACK);
        // jbutton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        // jbutton1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        // jbutton1.setFocusPainted(false);
        // // jb.addActionListener(this);
        // frame.add(jbutton1);

        label2 = new JLabel();
        label2.setIcon(new ImageIcon("images/Getready2.png")); //BackGround Image
        Dimension size2 = label1.getPreferredSize();
        label2.setBounds(680,150,500,400);
        label2.setOpaque(false);
        
        

        
        jbutton2 = new JButton("Contribution"); //Button
        jbutton2.setBounds(1030,570,120,30);
        jbutton2.setFont(new Font("Segoe UI",Font.BOLD,18));
        jbutton2.setBackground(new Color(0Xdddf85));
        // jbutton2.setBackground(new Color(0,0,0,1));
        jbutton2.setForeground(Color.BLACK);
        jbutton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jbutton2.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        jbutton2.setFocusPainted(false);
        jbutton2.setBorder(null);
        frame.add(jbutton2);

        jbutton3 = new JButton();
        jbutton3.setBounds(1120,610,40,40);
        jbutton3.setIcon(new ImageIcon("images/linkdin.png"));
        jbutton3.setBorder(null);
        jbutton3.setContentAreaFilled(false);
        jbutton3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        frame.add(jbutton3);

        jbutton4 = new JButton();
        jbutton4.setBounds(1070,610,40,40);
        jbutton4.setIcon(new ImageIcon("images/InstaN.png"));
        jbutton4.setBorder(null);
        jbutton4.setContentAreaFilled(false);
        jbutton4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        frame.add(jbutton4);
        
        jbutton5 = new JButton();
        jbutton5.setBounds(1020,610,40,40);
        jbutton5.setIcon(new ImageIcon("images/Fb.png"));
        jbutton5.setBorder(null);
        jbutton5.setContentAreaFilled(false);
        jbutton5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        frame.add(jbutton5);

        jbutton6 = new JButton();
        jbutton6.setBounds(690,383,125,60);
        jbutton6.setContentAreaFilled(false);
        jbutton6.setBorder(null);
        jbutton6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        frame.add(jbutton6);
        
        jbutton7 = new JButton();
        jbutton7.setBounds(998,388,125,60);
        jbutton7.setContentAreaFilled(false);
        jbutton7.setBorder(null);
        jbutton7.setCursor(new Cursor(Cursor.HAND_CURSOR));
        frame.add(jbutton7);
        

        frame.add(label2);
        frame.add(label1);
        

        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);

        // jbutton1.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent ae){
        //         if(ae.getSource() == jbutton1){
        //             new Login();
        //             frame.setVisible(false);
                    
        //         }
        //     }
        // });


        jbutton2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if(ae.getSource() == jbutton2){
                    new Contribution();
                    frame.setVisible(false);
                }
            }
        });

        jbutton5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if(ae.getSource() == jbutton5){
                    try {
                        opeLink("https://web.facebook.com/mostafizurrahaman.nafis.3");
                    } catch (URISyntaxException e) {
                        e.printStackTrace();
                    }
            }
            }
        });
        jbutton4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if(ae.getSource() == jbutton4){
                    try {
                        opeLink("https://www.instagram.com/mostafi_nafis/");
                    } catch (URISyntaxException e) {
                        e.printStackTrace();
                    }
            }
            }
        });
        jbutton3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if(ae.getSource() == jbutton3){
                    try {
                        opeLink("https://www.linkedin.com/authwall?trk=qf&original_referer=https://www.linkedin.com/checkpoint/lg/login-submit&sessionRedirect=https%3A%2F%2Fwww.linkedin.com%2F");
                    } catch (URISyntaxException e) {
                        e.printStackTrace();
                    }
            }
            }
        });

        jbutton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                if(ae.getSource() == jbutton6){
                    new AdminLogin();
                    frame.setVisible(false);
                }
            }
        });

        jbutton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                if(ae.getSource() == jbutton7){
                    new Login("s1","s2");
                    frame.setVisible(false);
                }
            }
        });

    }



    // public void actionPerformed(ActionEvent ae){
    //     String command = ae.getActionCommand();
    //     if(jb.getText().equals(command)){
    //         Login l1 = new Login();
    //         l1.setVisible(true);
    //         frame.setVisible(false);
    //     }
    // }



    public void opeLink(String url) throws URISyntaxException{
        try{
            Desktop.getDesktop().browse(new URI(url));
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        new Home();
    }
}