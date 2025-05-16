package Classes;
import java.lang.*;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminAddUser extends JFrame {
    JFrame frame;
    JPanel panel;
    ImageIcon icon;
    JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,
            label10,label11,label12,label13,label14,label15,label16,label17,
            label18,label19,label20,label21,label22,label23,label24,label25;
    JRadioButton rbutton1,rbutton2,rbutton3;
    ButtonGroup bg1;
    JCheckBox checkbox;
    JButton jbutton1,jbutton2,jbutton3,jbutton4;
    JPasswordField userpass,repass;
    JTextField firstname,lastname,birth,email,username,answer,captcha;
    JComboBox religion,security;
    


    public AdminAddUser(){
        super("Admin Add User");
        frame = new JFrame();
        frame.setSize(1200,700);
        
        icon = new ImageIcon("images/mainlogo.png"); //Console Icon
        frame.setIconImage(icon.getImage());
        
        label1 = new JLabel(); //Background Image
        label1.setIcon(new ImageIcon("images/AdminBlur.png"));
        Dimension size = label1.getPreferredSize();
        label1.setBounds(0,0,size.width,size.height);
        label1.setOpaque(true);

        panel = new JPanel();
        panel.setBounds(335,25,520,610);
        panel.setBackground(new Color(224, 224, 224));

        jbutton1 = new JButton(); //Back Icon
        jbutton1.setIcon(new ImageIcon("images/Back2.png"));
        jbutton1.setBounds(0,0,50,50);
        jbutton1.setBorder(null);
        jbutton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jbutton1.setContentAreaFilled(false);
        frame.add(jbutton1);
        
        

        label2 = new JLabel("Add New User");
        label2.setBounds(490, 25, 300, 40);
        label2.setForeground(Color.black);
        label2.setFont(new Font("Segoe UI", Font.BOLD, 32));
        frame.add(label2);
        
        label21 = new JLabel("___________________________");
        label21.setBounds(490, 35, 300, 40);
        label21.setForeground(Color.black);
        label21.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        label21.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        frame.add(label21);

        label3 = new JLabel("First Name :");
        label3.setBounds(350, 70, 200, 40);
        label3.setForeground(Color.black);
        label3.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        frame.add(label3);

        label4 = new JLabel("_______________________");
        label4.setBounds(350, 100, 200, 40);
        label4.setForeground(Color.black);
        label4.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        label4.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        frame.add(label4);

        firstname = new JTextField(); //Firast name TextFiled
        firstname.setBounds(355,100,180,30);
        firstname.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        firstname.setBorder(null);
        firstname.setOpaque(false);
        frame.add(firstname);


        label5 = new JLabel("Last Name :");
        label5.setBounds(630, 70, 200, 40);
        label5.setForeground(Color.black);
        label5.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        frame.add(label5);

        label6 = new JLabel("_______________________");
        label6.setBounds(630, 100, 200, 40);
        label6.setForeground(Color.black);
        label6.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        label6.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        frame.add(label6);

        lastname = new JTextField(); //Last name text Filed
        lastname.setBounds(635,100,180,30);
        lastname.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        lastname.setBorder(null);
        lastname.setOpaque(false);
        frame.add(lastname);

        label7 = new JLabel("Date Of Birth(dd/mm/yyyy)");
        label7.setBounds(350, 127, 400, 40);
        label7.setForeground(Color.black);
        label7.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        frame.add(label7);

        
        label8 = new JLabel("______________________________");
        label8.setBounds(350, 160, 250, 40);
        label8.setForeground(Color.black);
        label8.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        label8.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        frame.add(label8);

        birth = new JTextField(); //Bithday TextFiled
        birth.setBounds(355,160,230,30);
        birth.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        birth.setBorder(null);
        birth.setOpaque(false);
        frame.add(birth);

        String items[] ={"Choose Religion", "Islam", "Hinduism","Christianity", "Sikhism", "Buddhism"};
        religion = new JComboBox(items);
        religion.setBounds(670,170,120,25);
        religion.setBackground(Color.white);
        religion.setBorder(null);
        religion.setCursor(new Cursor(Cursor.HAND_CURSOR));
        frame.add(religion);

        label9 = new JLabel("Gender");
        label9.setBounds(350, 200, 200, 40);
        label9.setForeground(Color.black);
        label9.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        frame.add(label9);

        rbutton1 =  new JRadioButton("Male");
        rbutton1.setBounds(460,200,100,40);
        rbutton1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        rbutton1.setContentAreaFilled(false);
        rbutton1.setFocusPainted(false);
        frame.add(rbutton1);
        
        rbutton2 =  new JRadioButton("Female");
        rbutton2.setBounds(550,200,100,40);
        rbutton2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        rbutton2.setContentAreaFilled(false);
        rbutton2.setFocusPainted(false);
        frame.add(rbutton2);
        
        rbutton3 =  new JRadioButton("Other");
        rbutton3.setBounds(640,200,100,40);
        rbutton3.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        rbutton3.setContentAreaFilled(false);
        rbutton3.setFocusPainted(false);
        frame.add(rbutton3);

        bg1 = new ButtonGroup();
        bg1.add(rbutton1);
        bg1.add(rbutton2);
        bg1.add(rbutton3);
        
        label10 = new JLabel("Email or Phone");
        label10.setBounds(350, 240, 200, 40);
        label10.setForeground(Color.black);
        label10.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        frame.add(label10);

        label8 = new JLabel("______________________________");
        label8.setBounds(350, 270, 250, 40);
        label8.setForeground(Color.black);
        label8.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        label8.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        frame.add(label8);

        email = new JTextField(); //Email TextFiled
        email.setBounds(355,270,230,30);
        email.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        email.setBorder(null);
        email.setOpaque(false);
        frame.add(email);

        label11 = new JLabel("User Name :");
        label11.setBounds(350, 300, 200, 40);
        label11.setForeground(Color.black);
        label11.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        frame.add(label11);

        label12 = new JLabel("_______________________");
        label12.setBounds(350, 330, 200, 40);
        label12.setForeground(Color.black);
        label12.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        label12.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        frame.add(label12);

        username = new JTextField(); //Username TextFiled
        username.setBounds(355,330,180,30);
        username.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        username.setBorder(null);
        username.setOpaque(false);
        frame.add(username);

        label13 = new JLabel("Password :");
        label13.setBounds(630, 300, 200, 40);
        label13.setForeground(Color.black);
        label13.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        frame.add(label13);

        label14 = new JLabel("_______________________");
        label14.setBounds(630, 330, 200, 40);
        label14.setForeground(Color.black);
        label14.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        label14.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        frame.add(label14);

        userpass = new JPasswordField(); //Last name text Filed
        userpass.setBounds(635,330,180,30);
        userpass.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        userpass.setBorder(null);
        userpass.setOpaque(false);
        frame.add(userpass);

        label15 = new JLabel("Security Question");
        label15.setBounds(350, 370, 200, 40);
        label15.setForeground(Color.black);
        label15.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        frame.add(label15);

        String item2[] = {"Choose a Security Question...", "what's your father's name?", "what's your mother's name?",
        "whats your favourite pet name?", "what's your favorite sports?", "what's your favourite movie?"};
        security = new JComboBox(item2);
        security.setBounds(530,380,210,25);
        security.setBackground(Color.white);
        security.setBorder(null);
        security.setCursor(new Cursor(Cursor.HAND_CURSOR));
        frame.add(security);

        label16 = new JLabel("Write your Answer");
        label16.setBounds(350, 400, 200, 40);
        label16.setForeground(Color.black);
        label16.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        frame.add(label16);

        label17 = new JLabel("_____________________________");
        label17.setBounds(350, 430, 250, 40);
        label17.setForeground(Color.black);
        label17.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        label17.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        frame.add(label17);

        answer = new JTextField(); //Security name TextFiled
        answer.setBounds(355,430,230,30);
        answer.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        answer.setBorder(null);
        answer.setOpaque(false);
        frame.add(answer);

        label18 = new JLabel("Captcha");
        label18.setBounds(350, 470, 200, 40);
        label18.setForeground(Color.black);
        label18.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        frame.add(label18);

        Random random =  new Random(); //random number for captcha
        int a = random.nextInt(10);
        int b = random.nextInt(10);

        label19 = new JLabel(" "+a+"+"+b+"");
        label19.setBounds(430, 480, 40, 20);
        label19.setForeground(Color.black);
        label19.setBackground(new Color(228, 225, 217));
        label19.setOpaque(true);
        label19.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        frame.add(label19);

        label20 = new JLabel("_______________________");
        label20.setBounds(490, 465, 200, 40);
        label20.setForeground(Color.black);
        label20.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        label20.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        frame.add(label20);

        captcha = new JTextField(); //Chatcha textfield
        captcha.setBounds(495,465,180,30);
        captcha.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        captcha.setBorder(null);
        captcha.setOpaque(false);
        frame.add(captcha);


        jbutton2 = new JButton();
        jbutton2.setIcon(new ImageIcon("images/Adduser2.png")); //Login Button
        jbutton2.setBounds(500,520,180,100);
        jbutton2.setBorder(null);
        jbutton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jbutton2.setContentAreaFilled(false);
        frame.add(jbutton2);

        
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
                    new Adminpanel();
                    frame.setVisible(false);
                }
            }
        });

        jbutton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                String s1 = firstname.getText(); // First Name
                String s2 = lastname.getText(); //Last Name
                String s3 = birth.getText(); // Birthday
                String s4 = email.getText(); //Email or Phone
                String s5 = username.getText().toLowerCase(); //User Name
                String s6 = userpass.getText(); //User Password
                String s7 = answer.getText(); //Security Answer
                String s8 = captcha.getText(); // Captcha
                String s9 = String.valueOf(security.getSelectedItem()); // Security select 
                int result = 0;

                if(s1.isEmpty() || s2.isEmpty() || s3.isEmpty() || s4.isEmpty() || s5.isEmpty() || 
                s6.isEmpty() || s7.isEmpty() || s8.isEmpty() || ((religion.getSelectedIndex()) ==0) ||
                ((security.getSelectedIndex()) == 0)){
                    JOptionPane.showMessageDialog(null,"Please Fill Up All The Ghaps","Warning!" ,JOptionPane.WARNING_MESSAGE);
                }

                else{
                    int myint = 0;
                    try{
                        myint = Integer.parseInt(s8);
                    }
                    catch(Exception ef){
                        JOptionPane.showConfirmDialog(null,"Wrong Captcha Inpup");
                        ef.printStackTrace();
                    }
                    result = Integer.parseInt(s8);
                    if(result !=(a+b)){
                        JOptionPane.showMessageDialog(null,"Wrong Chapcha","Warning!",JOptionPane.WARNING_MESSAGE);
                    }
                    else {

                        DataInsert datainsert = new DataInsert();
                        datainsert.insert(s5,s6,s4,s7,s9);

                        if(datainsert.x == 1){
                            frame.setVisible(false);
                        }
                        
                        JOptionPane.showConfirmDialog(null,"New User Inserted","Message",-1);
                        new Adminpanel();
                    }
                }
            }
        });
    }

    

    public static void main(String[] args) {
        new AdminAddUser();
    }
}