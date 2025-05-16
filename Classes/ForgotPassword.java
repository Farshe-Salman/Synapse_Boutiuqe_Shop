package Classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;


public class ForgotPassword extends JFrame {
    JFrame frame;
    JPanel panel;
    ImageIcon icon;
    JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,
            label10,label11;
    JButton jbutton1,jbutton2,jbutton3,jbutton4;
    JTextField username,answer,email;
    JComboBox security;
    


    public ForgotPassword(){
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
        
        

        label2 = new JLabel("Forgot Password");
        label2.setBounds(470, 45, 300, 40);
        label2.setForeground(Color.black);
        label2.setFont(new Font("Segoe UI", Font.BOLD, 32));
        frame.add(label2);
        
        label10 = new JLabel("________________________________");
        label10.setBounds(470, 55, 300, 42);
        label10.setForeground(Color.black);
        label10.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        label10.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        frame.add(label10);
       
        
        label11 = new JLabel("________________________________");
        label11.setBounds(470, 59, 300, 42);
        label11.setForeground(Color.black);
        label11.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        label11.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        frame.add(label11);

        label3 = new JLabel("User Name :");
        label3.setBounds(350, 140, 200, 40);
        label3.setForeground(Color.black);
        label3.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        frame.add(label3);

        label4 = new JLabel("____________________________________");
        label4.setBounds(350, 170, 290, 40);
        label4.setForeground(Color.black);
        label4.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        label4.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        frame.add(label4);

        username = new JTextField(); //User name TextFiled
        username.setBounds(355,170,285,30);
        username.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        username.setBorder(null);
        frame.add(username);

        label5 = new JLabel("Security Question");
        label5.setBounds(350, 210, 200, 40);
        label5.setForeground(Color.black);
        label5.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        frame.add(label5);

        String item2[] = {"Choose a Security Question...", "what's your father's name?", "what's your mother's name?",
        "whats your favourite pet name?", "what's your favorite sports?", "what's your favourite movie?"};
        security = new JComboBox(item2);
        security.setBounds(530,220,210,25);
        security.setBackground(Color.white);
        security.setBorder(null);
        security.setCursor(new Cursor(Cursor.HAND_CURSOR));
        frame.add(security);

    
        label6 = new JLabel("Write your Answer");
        label6.setBounds(350, 250, 200, 40);
        label6.setForeground(Color.black);
        label6.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        frame.add(label6);
        

        label7 = new JLabel("____________________________________");
        label7.setBounds(350, 290, 290, 40);
        label7.setForeground(Color.black);
        label7.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        label7.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        frame.add(label7);

        answer = new JTextField(); //Security TextFiled
        answer.setBounds(355,290,285,30);
        answer.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        answer.setBorder(null);
        frame.add(answer);

        label8 = new JLabel("Recovry Email or Phone");
        label8.setBounds(350, 330, 200, 40);
        label8.setForeground(Color.black);
        label8.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        frame.add(label8);
        

        label9 = new JLabel("____________________________________");
        label9.setBounds(350, 370, 290, 40);
        label9.setForeground(Color.black);
        label9.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        label9.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        frame.add(label9);

        email = new JTextField(); //Email TextFiled
        email.setBounds(355,370,285,30);
        email.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        email.setBorder(null);
        frame.add(email);
        
        jbutton2 = new JButton();
        jbutton2.setIcon(new ImageIcon("images/ResetPass.png")); //Login Button
        jbutton2.setBounds(520,450,150,150);
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
                    new Login("s1","s2");
                    frame.setVisible(false);
                }
            }
        });

        jbutton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                String s1 = username.getText();
                String s2 = String.valueOf(security.getSelectedItem());
                String s3 = answer.getText();
                String s4 = email.getText();

                if(s1.isEmpty() || s2.isEmpty() || s3.isEmpty() || s4.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please Fill Up All The Ghap","Warning!",JOptionPane.WARNING_MESSAGE);
                }
                else{
                    try{
                        String username = "User Name : "+s1;
                        String question = "Security Question: "+s2;
                        String answer = "Security Answer : "+s3;
                        String email = "Email or Phone : "+s4;

                        BufferedReader buffreader = new BufferedReader(new FileReader(".\\Data\\User.txt"));

                        int totalline=0;
                        while(buffreader.readLine() != null){
                            totalline++;
                        }
                        buffreader.close();

                        int flag = 0;

                        for(int i = 0; i < totalline; i++){
                            String line = Files.readAllLines(Paths.get(".\\Data\\User.txt")).get(i);
                            if(line.equals(username)){
                                String line2 = Files.readAllLines(Paths.get(".\\Data\\User.txt")).get(i+2);
                                if(line2.equals(email)){
                                    String line3 = Files.readAllLines(Paths.get(".\\Data\\User.txt")).get(i+3);
                                    if(line3.equals(question)){
                                        String line4 = Files.readAllLines(Paths.get(".\\Data\\User.txt")).get(i+4);
                                        if(line4.equals(answer)){
                                            new RecoveryCode();
                                            frame.setVisible(false);
                                            flag = 1;
                                        }
                                    }
                                }
                            }
                        }

                        if(flag == 0){
                            JOptionPane.showMessageDialog(null,"User Not Found.Please Try Agmin","!Warning",JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }
        });

    }

    

    public static void main(String[] args) {
        new ForgotPassword();
    }
}