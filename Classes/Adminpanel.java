package Classes;
import java.lang.*;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Adminpanel extends JFrame implements MouseListener{
    JFrame frame;
    JPanel panel;
    ImageIcon icon;
    JLabel label1;
    JCheckBox checkbox;
    JButton jbutton1,jbutton2,jbutton3,jbutton4,jbutton5,jbutton6,jbutton7,jbutton8,jbutton9;
    


    public Adminpanel(){
        super("Admin Panel");
        frame = new JFrame();
        frame.setSize(1200,700);
        
        icon = new ImageIcon("images/mainlogo.png"); //Console Icon
        frame.setIconImage(icon.getImage());
        
        label1 = new JLabel(); //Background Image
        label1.setIcon(new ImageIcon("images/AdminBackground.jpg"));
        Dimension size = label1.getPreferredSize();
        label1.setBounds(0,0,size.width,size.height);
        label1.setOpaque(true);

        jbutton1 = new JButton(); //Back Icon
        jbutton1.setIcon(new ImageIcon("images/Back2.png"));
        jbutton1.setBounds(0,0,50,50);
        jbutton1.setBorder(null);
        jbutton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jbutton1.setContentAreaFilled(false);
        frame.add(jbutton1);

        jbutton2 = new JButton(); //User Information
        jbutton2.setIcon(new ImageIcon("images/User Info.png"));
        jbutton2.setBounds(200,70,200,200);
        jbutton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jbutton2.setBorder(null);
        jbutton2.setContentAreaFilled(false);
        frame.add(jbutton2);

        jbutton3 = new JButton("USER INFORMATION"); 
        jbutton3.setBounds(180,270,250,40);
        jbutton3.setFont(new Font("Segoe UI", Font.BOLD, 22));
        jbutton3.setOpaque(false);
        jbutton3.setForeground(Color.WHITE);
        jbutton3.setBorder(null);
        jbutton3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jbutton3.setContentAreaFilled(false);
        jbutton3.addMouseListener(this);
        frame.add(jbutton3);

        jbutton9 = new JButton(); //Add User
        jbutton9.setIcon(new ImageIcon("images/Add User.png"));
        jbutton9.setBounds(760,70,200,200);
        jbutton9.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jbutton9.setBorder(null);
        jbutton9.setContentAreaFilled(false);
        frame.add(jbutton9);

        jbutton4 = new JButton("ADD USER");
        jbutton4.setBounds(760,270,180,40);
        jbutton4.setFont(new Font("Segoe UI", Font.BOLD, 22));
        jbutton4.setOpaque(false);
        jbutton4.setForeground(Color.WHITE);
        jbutton4.setBorder(null);
        jbutton4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jbutton4.setContentAreaFilled(false);
        jbutton4.addMouseListener(this);
        frame.add(jbutton4);

        jbutton5 = new JButton(); //Admin Information
        jbutton5.setIcon(new ImageIcon("images/Admin Info.png"));
        jbutton5.setBounds(180,365,200,200);
        jbutton5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jbutton5.setBorder(null);
        jbutton5.setContentAreaFilled(false);
        frame.add(jbutton5);

        jbutton6 = new JButton("ADMIN INFORMATION");
        jbutton6.setBounds(180,565,280,40);
        jbutton6.setFont(new Font("Segoe UI", Font.BOLD, 22));
        jbutton6.setOpaque(false);
        jbutton6.setForeground(Color.WHITE);
        jbutton6.setBorder(null);
        jbutton6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jbutton6.setContentAreaFilled(false);
        jbutton6.addMouseListener(this);
        frame.add(jbutton6);

        jbutton7 = new JButton(); //Add admin
        jbutton7.setIcon(new ImageIcon("images/Add Admin.png"));
        jbutton7.setBounds(760,365,200,200);
        jbutton7.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jbutton7.setBorder(null);
        jbutton7.setContentAreaFilled(false);
        frame.add(jbutton7);

        jbutton8 = new JButton("ADD ADMIN");
        jbutton8.setBounds(770,565,180,40);
        jbutton8.setFont(new Font("Segoe UI", Font.BOLD, 22));
        jbutton8.setOpaque(false);
        jbutton8.setForeground(Color.WHITE);
        jbutton8.setBorder(null);
        jbutton8.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jbutton8.setContentAreaFilled(false);
        jbutton8.addMouseListener(this);
        frame.add(jbutton8);


        frame.add(label1);

        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);

        jbutton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                if(ae.getSource() == jbutton1){
                    new AdminLogin();
                    frame.setVisible(false);
                }
            }
        });
        jbutton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                if(ae.getSource() == jbutton2){
                    new Userinformation();
                    frame.setVisible(false);
                }
            }
        });
        jbutton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                if(ae.getSource() == jbutton3){
                    new Userinformation();
                    frame.setVisible(false);
                }
            }
        });

        jbutton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                if(ae.getSource() == jbutton5){
                    new AdminInformation();
                    frame.setVisible(false);
                }
            }
        });
        jbutton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                if(ae.getSource() == jbutton6){
                    new AdminInformation();
                    frame.setVisible(false);
                }
            }
        });
        
        jbutton9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                if(ae.getSource() == jbutton9){
                    new AdminAddUser();
                    frame.setVisible(false);
                }
            }
        });
        
        jbutton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                if(ae.getSource() == jbutton4){
                    new AdminAddUser();
                    frame.setVisible(false);
                }
            }
        });

        jbutton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                if(ae.getSource() == jbutton7){
                    new AddAdmin();
                    frame.setVisible(false);
                }
            }
        });
        jbutton8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                if(ae.getSource() == jbutton8){
                    new AddAdmin();
                    frame.setVisible(false);
                }
            }
        });
        
    }


    public void mouseClicked(MouseEvent me){}
    public void mousePressed(MouseEvent me){}
    public void mouseReleased(MouseEvent me){}
    public void mouseEntered(MouseEvent me){
        if(me.getSource() == jbutton3){
            jbutton3.setFont(new Font("Segoe UI", Font.BOLD, 24));
        }
        else if(me.getSource() == jbutton4){
            jbutton4.setFont(new Font("Segoe UI", Font.BOLD, 24));
        }
        else if(me.getSource() == jbutton6){
            jbutton6.setFont(new Font("Segoe UI", Font.BOLD, 24));
        }
        else if(me.getSource() == jbutton8){
            jbutton8.setFont(new Font("Segoe UI", Font.BOLD, 24));
        }
    }
    public void mouseExited(MouseEvent me){
        if(me.getSource() == jbutton3){
            jbutton3.setFont(new Font("Segoe UI", Font.BOLD, 22));
        }
        else if(me.getSource() == jbutton4){
            jbutton4.setFont(new Font("Segoe UI", Font.BOLD, 22));
        }
        else if(me.getSource() == jbutton6){
            jbutton6.setFont(new Font("Segoe UI", Font.BOLD, 22));
        }
        else if(me.getSource() == jbutton8){
            jbutton8.setFont(new Font("Segoe UI", Font.BOLD, 22));
        }
    }

    public static void main(String[] args) {
        new Adminpanel();
    }
}
