package Classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RecoveryCode extends JFrame {
    JFrame frame;
    JPanel panel;
    ImageIcon icon;
    JLabel label1,label2,label3,label4,label5;
    JButton jbutton1,jbutton2,jbutton3,jbutton4;
    JTextField textfield;

    
    public RecoveryCode(){
        super("Forgot Password");
        frame = new JFrame();
        frame.setSize(1200,700);
        
        icon = new ImageIcon("images/mainlogo.png"); //Console Icon
        frame.setIconImage(icon.getImage());
        
        label1 = new JLabel(); //Background Image
        label1.setIcon(new ImageIcon("images/SignupBackground.png"));
        Dimension size = label1.getPreferredSize();
        label1.setBounds(0,0,size.width,size.height);
        label1.setOpaque(true);

        panel = new JPanel();
        panel.setBounds(335,25,520,610);
        panel.setBackground(new Color(255,255,255));

        jbutton1 = new JButton(); //Back Icon
        jbutton1.setIcon(new ImageIcon("images/Back.png"));
        jbutton1.setBounds(0,0,50,50);
        jbutton1.setBorder(null);
        jbutton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jbutton1.setContentAreaFilled(false);
        frame.add(jbutton1);
        
        
        label2 = new JLabel("Enter Recovery Code");
        label2.setBounds(345, 170, 300, 40);
        label2.setForeground(Color.black);
        label2.setFont(new Font("Segoe UI", Font.BOLD, 20));
        frame.add(label2);

        label3 = new JLabel("Check your email. You must recieve an Email with recovery code for  ");
        label3.setBounds(345, 230, 500, 60);
        label3.setForeground(Color.black);
        label3.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        frame.add(label3);

        label4 = new JLabel("password reset");
        label4.setBounds(345, 248, 500, 60);
        label4.setForeground(Color.black);
        label4.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        frame.add(label4);

        textfield = new JTextField();
        textfield.setBounds(345, 298, 200, 20);
        textfield.setCursor(new Cursor(Cursor.HAND_CURSOR));
        frame.add(textfield);

        label5 = new JLabel("Didn't recieve code ?");
        label5.setBounds(345, 328, 200, 20);
        label5.setForeground(Color.black);
        label5.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        frame.add(label5);

        jbutton2 = new JButton("Send again");
        jbutton2.setBounds(470, 330, 100, 20);
        jbutton2.setForeground(Color.black);
        jbutton2.setBorderPainted(false);
        jbutton2.setContentAreaFilled(false);
        jbutton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        frame.add(jbutton2);

        jbutton3 = new JButton("Submit");
        jbutton3.setBounds(345, 355, 100, 20);
        jbutton3.setBackground(Color.cyan);
        jbutton3.setForeground(Color.black);
        jbutton3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jbutton3.setBorder(null);
        //jbutton3.setVisible(false);
        frame.add(jbutton3);


        frame.add(panel);
        frame.add(label1);

        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);

        jbutton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                if(ae.getSource() == jbutton1){
                    new ForgotPassword();
                    frame.setVisible(false);
                }
            }
        });

        jbutton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == jbutton2) {

                    JOptionPane.showMessageDialog(null, "Recovery Code resend succesful");

                }
            }
        });


        // textfield.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent ae){
        //         if(ae.getSource() == textfield){
        //             if(textfield.getText().equals("")){
        //                 jbutton3.setVisible(false);
        //             }
        //             else{
        //                 jbutton3.setVisible(true);
        //             }
        //         }
        //     }
        // });

        jbutton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                if(ae.getSource() == jbutton3){
                    new NewPassword();
                    frame.setVisible(false);
                }
            }
        });


    }

    

    public static void main(String[] args) {
        new RecoveryCode();
    }
}