package Classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mobileBanking extends JFrame implements MouseListener
{
	JLabel front,second, imgLabel, userLabel,Password, experation, serLabel, upload, OTP, front1, second1,number, upload1, OTP1;
	JTextField u1,u2,u3,u4;
	Color c1=new Color(228,225,217);
	JPanel panel;
	Color myColor1, myColor2;
	Font myFont, myFont1, myFont2, myFont3, myFont4;
	ImageIcon img;
	JButton proceed;
	JComboBox date, month, year;
	JFrame frame;
	JRadioButton r1, r2, r3, r4, r5, r6;
	
	public mobileBanking()
	{
		super("OTP HOME");
		frame = new JFrame();
		frame.setSize(1200,700);
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myColor1 = new Color(228,225,217);
		myColor2 = new Color(6, 54, 61);
		myFont = new Font("Cambria", Font.BOLD, 20);
		myFont4 = new Font("Cambria", Font.BOLD, 16);
		myFont1 = new Font("Cambria", Font.BOLD, 40);
		myFont3 = new Font("Cambria", Font.BOLD, 25);
		
		panel= new JPanel();
		panel.setBackground(myColor1);
		panel.setLayout(null);
		
		front= new JLabel("MOBILE BANKING");
		front.setBounds(730,30,500,50);
		//front.setBackground(Color.ORANGE);
		front.setOpaque(false);
		front.setForeground(Color.BLACK);
		front.setFont(myFont1);
		frame.add(front);
		
		// JButton back=new JButton(new ImageIcon("images/back.png"));
		// back.setBackground(c1);
		// back.setOpaque(false);
		// back.setBorder(null);
		// back.setBounds(2,10,32,32);
		// back.addMouseListener(this);
		// back.setCursor(new Cursor(Cursor.HAND_CURSOR));
		// frame.add(back);
		
		
		img = new ImageIcon("image/bkash.png");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(0, 0, 620, 700);
		frame.add(imgLabel);
		
		img = new ImageIcon("image/bkashh.png");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(680, 100, 425, 100);
		frame.add(imgLabel);
		
		
		JLabel payment=new JLabel("*Payment Mathod");
		payment.setBounds(700,220,250,30);
		payment.setOpaque(false);
		payment.setFont(myFont);		
		frame.add(payment);
		
		r1 = new JRadioButton("BKASH");
		r1.setBounds(750, 255, 90, 20);
		r1.setOpaque(false);
		r1.setFont(myFont4);
		r1.setBorder(null);
		r1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.add(r1);
		
		
		r2 = new JRadioButton("M CASH");
		r2.setBounds(750, 285, 90, 20);
		r2.setOpaque(false);
		r2.setFont(myFont4);
		r2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		r2.setBorder(null);
		// r2.setBackground(Color.PINK);
		frame.add(r2);
		
		r3 = new JRadioButton("NAGAD");
		r3.setBounds(860, 255, 100, 20);
		r3.setOpaque(false);
		r3.setFont(myFont4);
		r3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		r3.setBorder(null);
		frame.add(r3);
		
		r4 = new JRadioButton("IFIC");
		r4.setBounds(860, 285, 100, 20);
		r4.setOpaque(false);
		r4.setFont(myFont4);
		r4.setBorder(null);
		r4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.add(r4);
		
		r5 = new JRadioButton("ROCKET");
		r5.setBounds(970, 255, 100, 20);
		r5.setOpaque(false);
		r5.setFont(myFont4);
		r5.setBorder(null);
		r5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.add(r5);
		
		r6 = new JRadioButton("My CASH");
		r6.setBounds(970, 285, 100, 20);
		r6.setOpaque(false);
		r6.setFont(myFont4);
		r6.setBorder(null);
		r6.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.add(r6);
		
		
		number= new JLabel("*Mobile Number");
		number.setBounds(700,310,250,40);
		//OTP.setBackground(Color.ORANGE);
	    number.setOpaque(false);
		//OTP.setForeground(Color.BLACK);
		number.setFont(myFont);
		frame.add(number);
		
		u1 = new JTextField();
		u1.setBounds(710, 345, 350, 30);
		u1.setBackground(Color.WHITE);
		frame.add(u1);
		
		OTP= new JLabel("*OTP");
		OTP.setBounds(700,380,350,40);
		//OTP.setBackground(Color.ORANGE);
	    OTP.setOpaque(false);
		//OTP.setForeground(Color.BLACK);
		OTP.setFont(myFont);
		frame.add(OTP);
		
		
		u2 = new JTextField();
		u2.setBounds(710, 415, 350, 30);
		u2.setBackground(Color.WHITE);
		frame.add(u2);
		
		Password= new JLabel("*Password");
		Password.setBounds(700,450,350,40);
		//OTP.setBackground(Color.ORANGE);
	    Password.setOpaque(false);
		//OTP.setForeground(Color.BLACK);
		Password.setFont(myFont);
		frame.add(Password);
		
		u4 = new JTextField();
		u4.setBounds(710, 485, 350, 30);
		u4.setBackground(Color.WHITE);
		frame.add(u4);
		

		proceed = new JButton(new ImageIcon("image/payment.png"));
		//proceed.setBounds(835, 500, 100, 100);
		proceed.setBounds(825, 530, 118, 118);
		proceed.setBackground(Color.GREEN);
		proceed.setOpaque(false);
		proceed.setFont(myFont3);
		proceed.setBorder(null);
		proceed.setCursor(new Cursor(Cursor.HAND_CURSOR));
		proceed.addMouseListener(this);
		frame.add(proceed);
		
		frame.add(panel);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false);
		
		


		proceed.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                if(ae.getSource() ==	proceed){
                    new Thankyou();
                    frame.setVisible(false);
                }
            }
        });
		
	}
	
	public void mouseClicked(MouseEvent me)
	{
		
	}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource()==proceed)
		{
			proceed.setBounds(820, 530, 125, 125);
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource()==proceed)
		{
			proceed.setBounds(825, 530, 118, 118);
		}
	}
	
	public static void main(String args[])
	{
	     new mobileBanking();
	}
	
}