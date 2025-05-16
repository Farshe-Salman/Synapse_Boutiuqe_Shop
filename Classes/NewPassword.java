package Classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class NewPassword extends JFrame {
    JFrame frame;
    JPanel panel;
    ImageIcon icon;
    JLabel label1,label2,label4,label5,label6;
    JButton jbutton1,jbutton2,jbutton3,jbutton4;
    JTextField newpass,retypepass;
    

    
    public NewPassword(){
        super("New Password");
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
        
        
        label2 = new JLabel("Recovery Password");
        label2.setBounds(460, 155, 300, 40);
        label2.setForeground(Color.black);
        label2.setFont(new Font("Segoe UI", Font.BOLD, 28));
        frame.add(label2);

        label6 = new JLabel("________________________________");
        label6.setBounds(460, 165, 300, 42);
        label6.setForeground(Color.black);
        label6.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        label6.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        frame.add(label6);

        label4 = new JLabel("New Password :");
        label4.setBounds(360, 240, 200, 40);
        label4.setForeground(Color.black);
        label4.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        frame.add(label4);

        label5 = new JLabel("____________________________________");
        label5.setBounds(360, 270, 290, 40);
        label5.setForeground(Color.black);
        label5.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        label5.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        frame.add(label5);

        newpass = new JTextField(); //New Password TextFiled
        newpass.setBounds(365,270,285,30);
        newpass.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        newpass.setBorder(null);
        frame.add(newpass);
        frame.add(label6);

        label4 = new JLabel("Comfrim Password :");
        label4.setBounds(360, 330, 200, 40);
        label4.setForeground(Color.black);
        label4.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        frame.add(label4);

        label5 = new JLabel("____________________________________");
        label5.setBounds(360, 360, 290, 40);
        label5.setForeground(Color.black);
        label5.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        label5.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        frame.add(label5);

        retypepass = new JTextField(); //Comfrim Password TextFiled
        retypepass.setBounds(365,360,285,30);
        retypepass.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        retypepass.setBorder(null);
        frame.add(retypepass);


        jbutton2 = new JButton("Change Password"); //Change Password Button
        jbutton2.setBounds(470,490,230,35);
        jbutton2.setFont(new Font("Segoe UI",Font.BOLD,19));
        jbutton2.setBackground(new Color(231, 240, 228));
        jbutton2.setForeground(Color.BLACK);
        jbutton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jbutton2.setFocusPainted(false);
        jbutton2.setBorder(null);
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
                    new RecoveryCode();
                    frame.setVisible(false);
                }
            }
        });

        jbutton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){

                String s1 = newpass.getText();
                String s2 = retypepass.getText();

                if(ae.getSource() == jbutton2){
                    if(s1.isEmpty() || s2.isEmpty()){
                        JOptionPane.showMessageDialog(null,"Please Fill Up All The Ghap","Warning!",-1);
                    }
                    else{
                    JOptionPane.showMessageDialog(null,"Password Change");
                    new Login("s1","s2");
                    frame.setVisible(false);
                    }
                }
            }
        });

        


        // jbutton2.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent ae) {
        //         String s1 = newpass.getText();
        //         String s2 = retypepass.getText();
        
        //         if (ae.getSource() == jbutton2) {
        //             if (s1.isEmpty() || s2.isEmpty()) {
        //                 JOptionPane.showMessageDialog(null, "Please Fill Up All The Fields", "Warning!", -1);
        //             } else if (!s1.equals(s2)) {
        //                 JOptionPane.showMessageDialog(null, "Passwords do not match", "Warning!", -1);
        //             } else {
        //                 try {
        //                     File file = new File(".\\Data\\User.txt");
        //                     BufferedReader reader = new BufferedReader(new FileReader(file));
        //                     String line;
        //                     StringBuilder content = new StringBuilder();
        
        //                     while ((line = reader.readLine()) != null) {
        //                         if (line.startsWith("User Name : nafis")) {
        //                             line = "Password : " + s1;
        //                         }
        //                         content.append(line).append("\n");
        //                     }
        //                     reader.close();
        
        //                     FileWriter writer = new FileWriter(file);
        //                     writer.write(content.toString());
        //                     writer.close();
        
        //                     JOptionPane.showMessageDialog(null, "Password Changed");
        //                     new Login("s1", "s2");
        //                     frame.setVisible(false);
        //                 } catch (IOException e) {
        //                     e.printStackTrace();
        //                 }
        //             }
        //         }
        //     }
        // });
        

    }

    

    public static void main(String[] args) {
        new NewPassword();
    }
}
