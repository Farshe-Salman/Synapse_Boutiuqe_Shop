package Classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileReader;

public class Login extends JFrame{
    JFrame frame;
    ImageIcon icon;
    JLabel label,label1,label2,label3,label4,label5,label6,label7,label8,label9,label10;
    JRadioButton rbutton1,rbutton2,rbutton3;
    ButtonGroup bg1;
    JCheckBox checkbox;
    JButton jbutton1,jbutton2,jbutton3,jbutton4;
    JPasswordField pass;

    public Login(String s1,String s2){
    
        super("Log In");
        frame = new JFrame();
        frame.setSize(1200,700);
        
        icon = new ImageIcon("images/mainlogo.png"); //Console Icon
        frame.setIconImage(icon.getImage());

        // JPanel panel = new JPanel();
        // panel.setBounds(0,0,1200,700);
        // panel.setBackground(new Color(228, 225, 217));

        label = new JLabel();
        label.setIcon(new ImageIcon("images/SignupBackground2.jpg")); //BackGround Image
        Dimension size2 = label.getPreferredSize();
        label.setBounds(0,0,size2.width,size2.height);
        label.setOpaque(true);

        
        label1 = new JLabel("Log In"); //Login headline
        label1.setBounds(835,150,200,60);
        label1.setForeground(Color.black);
        label1.setFont(new Font("Segoe UI",Font.BOLD,35));
        frame.add(label1);

        label2 = new JLabel("Welcome! To Synapse");
        label2.setBounds(790,185,200,60);
        label2.setForeground(Color.black);
        label2.setFont(new Font("Segoe UI",Font.PLAIN,20));
        frame.add(label2);

        // rbutton1 = new JRadioButton("Admin Login"); //Admin rediobutton
        // rbutton1.setBounds(772,200,130,30);
        // rbutton1.setOpaque(false);
        // rbutton1.setFont(new Font("Segoe UI",Font.BOLD,15));
        // rbutton1.setForeground(Color.black);
        // rbutton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        // rbutton1.setFocusPainted(false);
        // frame.add(rbutton1);

        // rbutton2 = new JRadioButton("User Login"); //User radiobutton
        // rbutton2.setBounds(892,200,130,30);
        // rbutton2.setOpaque(false);
        // rbutton2.setFont(new Font("Segoe UI",Font.BOLD,15));
        // rbutton2.setForeground(Color.black);
        // rbutton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        // rbutton2.setFocusPainted(false);
        // frame.add(rbutton2);

        // bg1 = new ButtonGroup();
        // bg1.add(rbutton1);
        // bg1.add(rbutton2);


        /*JButton j3 = new JButton(new ImageIcon("/imagesicon.png"));
        //l3.setIcon());
        j3.setBorder(null);
        j3.setBounds(800,300,80,80);
        j3.setBackground(new Color(228, 225, 217));
        //l3.setForeground(Color.black);
        //l3.setFont(new Font("Segoe UI", Font.PLAIN, 25));
        frame.add(j3);*/
        
        /*l3 = new JLabel();
        l3.setIcon(new ImageIcon("images/icon.phng"));
        l3.setBounds(800,300,80,80);
        l3.setForeground(Color.black);
        l3.setFont(new Font("Segoe UI", Font.PLAIN, 25));
        frame.add(l3);*/

        try {
            label3 = new JLabel();
            label3.setIcon(new ImageIcon("images/user.png")); //incon
            label3.setBounds(750, 240, 80, 80);
            frame.add(label3);
        } catch (Exception e) {
            e.printStackTrace();
        }

        label4 = new JLabel("_______________________________________________________");
        label4.setBounds(790,255,200,60);
        label4.setForeground(Color.black);
        label4.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        frame.add(label4);

        label5 = new JLabel("User Name"); //User text
        label5.setBounds(840,283,150,40);
        label5.setForeground(Color.black);
        label5.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        frame.add(label5);

        JTextField tx = new JTextField(); //user textfield
        tx.setBounds(795,255,180,40);
        tx.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        tx.setForeground(Color.BLACK);
        tx.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        tx.setOpaque(false);
        tx.setBorder(null);
        frame.add(tx);


        try {
            label6 = new JLabel();
            label6.setIcon(new ImageIcon("images/passicon.png")); //icon
            label6.setBounds(750, 320, 80, 80);
            frame.add(label6);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        label7 = new JLabel("Password"); //Password Text
        label7.setBounds(840,362,150,40);
        label7.setForeground(Color.black);
        label7.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        frame.add(label7);
        
        label8 = new JLabel("_______________________________________________________");
        label8.setBounds(790,335,200,60);
        label8.setForeground(Color.black);
        label8.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        frame.add(label8);

        pass = new JPasswordField(); //Password Field
        pass.setBounds(795,340,180,25);
        pass.setFont(new Font("Segoe UI", Font.BOLD, 23));
        pass.setForeground(Color.BLACK);
        pass.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        pass.setOpaque(false);
        pass.setBorder(null);
        frame.add(pass);


        checkbox = new JCheckBox("Remember me"); //Remember Checkbox
        checkbox.setBounds(720,400,150,40);
        checkbox.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        checkbox.setOpaque(false);
        checkbox.setForeground(Color.BLACK);
        checkbox.setBorder(null);
        checkbox.setCursor(new Cursor(Cursor.HAND_CURSOR));
        checkbox.setFocusPainted(false);
        frame.add(checkbox);

        jbutton1 = new JButton("Forgot Password?"); //Forgot password button
        jbutton1.setBounds(900,400,150,40);
        jbutton1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        jbutton1.setOpaque(false);
        jbutton1.setForeground(Color.BLACK);
        jbutton1.setBorder(null);
        jbutton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jbutton1.setContentAreaFilled(false);
        frame.add(jbutton1);

        
        jbutton2 = new JButton();
        jbutton2.setIcon(new ImageIcon("images/login2.png")); //Login Button
        jbutton2.setBounds(805,460,150,40);
        jbutton2.setBorder(null);
        jbutton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jbutton2.setContentAreaFilled(false);
        frame.add(jbutton2);

        label9 = new JLabel("Don't Have any account?");
        label9.setBounds(730,510,205,40);
        label9.setForeground(Color.black);
        label9.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        frame.add(label9);

        jbutton3 = new JButton("Sign Up"); //Signup button
        jbutton3.setBounds(893,510,150,40);
        jbutton3.setFont(new Font("Segoe UI", Font.BOLD, 18));
        jbutton3.setOpaque(false);
        jbutton3.setForeground(Color.BLACK);
        jbutton3.setBorder(null);
        jbutton3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jbutton3.setContentAreaFilled(false);
        frame.add(jbutton3);

        label10 = new JLabel();
        label10.setIcon(new ImageIcon("images/mainlogoN.png")); //Left Frame Image
        Dimension size = label10.getPreferredSize();
        label10.setBounds(50,80,size.width,size.height);
        frame.add(label10);
		
		jbutton4 = new JButton(); //Back Icon
        jbutton4.setIcon(new ImageIcon("images/Back.png"));
        jbutton4.setBounds(0,0,50,50);
        jbutton4.setBorder(null);
        jbutton4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jbutton4.setContentAreaFilled(false);
        frame.add(jbutton4);
		

    
        

        frame.add(label);
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
        jbutton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                if(ae.getSource() == jbutton4){
                    new Home();
                    frame.setVisible(false);
                }
            }
        });

        jbutton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                if(ae.getSource() == jbutton3){
                    new Signup("s5","s6","s4","s7","s9");
                    frame.setVisible(false);
                }
            }
        });

        jbutton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                String s1 = tx.getText().toLowerCase(); // User Name
                String s2 = pass.getText(); //Password

                if(s1.isEmpty() && s2.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please Fll Up","Message",JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    FileRead fileRead = new FileRead();
                    fileRead.matchUser(s1, s2);

                    if(fileRead.flag == 2){
                        frame.setVisible(false);
                        //new Adminpanel();
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Wrong input. Please check your username or password.", "Message", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        
    }



    public static void main(String[] args) {
        new Login("s1","s2");
    }

}