package Classes;
import java.lang.*;
import javax.swing.*;

import Classes.Thankyou;

import java.awt.*;
import java.awt.event.*;

public class bankTransfer extends JFrame implements MouseListener
{
	JLabel front,second, imgLabel, userLabel,cvv, experation, serLabel, upload, payment, front1, second1,name, upload1, payment1;
	JTextField u1,u2,u3,u4;
	Color c1=new Color(228,225,217);
	JPanel panel;
	Color myColor1, myColor2;
	Font myFont, myFont1, myFont2, myFont3;
	ImageIcon img;
	JButton proceed;
	JComboBox date, month, year;
	JFrame frame;
	
	public bankTransfer()
	{
		super("PAYMENT HOME");
		frame = new JFrame();
		frame.setSize(1200,700);
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myColor1 = new Color(228,225,217);
		myColor2 = new Color(6, 54, 61);
		myFont = new Font("Cambria", Font.BOLD, 20);
		myFont1 = new Font("Cambria", Font.BOLD, 40);
		myFont3 = new Font("Cambria", Font.BOLD, 25);
		
		panel= new JPanel();
		panel.setBackground(myColor1);
		panel.setLayout(null);
		
		front= new JLabel("BANK TRANSFER");
		front.setBounds(730,30,500,50);
		//front.setBackground(Color.ORANGE);
		front.setOpaque(false);
		front.setForeground(Color.BLACK);
		front.setFont(myFont1);
		frame.add(front);
		
		/*
		JButton back=new JButton(new ImageIcon("images/back.png"));
		back.setBackground(c1);
		back.setOpaque(false);
		back.setBorder(null);
		back.setBounds(2,10,32,32);
		back.addMouseListener(this);
		back.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.add(back);
		*/
		img = new ImageIcon("image/bank.png");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(0, 0, 620, 700);
		frame.add(imgLabel);
		
		img = new ImageIcon("image/bankk.png");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(680, 100, 425, 100);
		frame.add(imgLabel);
		
		
		
		
		payment= new JLabel("*Card Number");
		payment.setBounds(700,210,300,40);
		//payment.setBackground(Color.ORANGE);
	    payment.setOpaque(false);
		//payment.setForeground(Color.BLACK);
		payment.setFont(myFont);
		frame.add(payment);
		
		
		u1 = new JTextField();
		u1.setBounds(710, 245, 350, 30);
		u1.setBackground(Color.WHITE);
		frame.add(u1);
		
		name= new JLabel("*Name on card");
		name.setBounds(700,280,250,40);
		//payment.setBackground(Color.ORANGE);
	    name.setOpaque(false);
		//payment.setForeground(Color.BLACK);
		name.setFont(myFont);
		frame.add(name);
		
		u2 = new JTextField();
		u2.setBounds(710, 315, 350, 30);
		u2.setBackground(Color.WHITE);
		frame.add(u2);
		
		experation= new JLabel("*Expiration Date");
		experation.setBounds(700,350,350,40);
		//payment.setBackground(Color.ORANGE);
	    experation.setOpaque(false);
		//payment.setForeground(Color.BLACK);
		experation.setFont(myFont);
		frame.add(experation);
		
		
		String items[] = {"DATE", "1", "2", "3", "4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		date = new JComboBox(items);
		date.setBounds(710, 385, 100, 30);
		date.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.add(date);
		
		String months[] = {"MONTH", "January", "February", "March", "April", "May", "June", "July", "September", "October", "Novemver", "December"};
		month = new JComboBox(months);
		month.setBounds(830, 385, 100, 30);
		month.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.add(month);
		
		String years[] = {"YEARS", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030"};
		year = new JComboBox(years);
		year.setBounds(950, 385, 100, 30);
		year.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.add(year);
		
		cvv= new JLabel("*CVV");
		cvv.setBounds(700,420,350,40);
		//payment.setBackground(Color.ORANGE);
	    cvv.setOpaque(false);
		//payment.setForeground(Color.BLACK);
		cvv.setFont(myFont);
		frame.add(cvv);
		
		u4 = new JTextField();
		u4.setBounds(710, 455, 350, 30);
		u4.setBackground(Color.WHITE);
		frame.add(u4);
		

		proceed = new JButton(new ImageIcon("image/payment.png"));
		//proceed.setBounds(835, 500, 100, 100);
		proceed.setBounds(825, 500, 118, 118);
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
			proceed.setBounds(820, 500, 125, 125);
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource()==proceed)
		{
			proceed.setBounds(825, 500, 118, 118);
		}
	}
	
	public static void main(String args[])
	{
	     new bankTransfer();
	}
	
}