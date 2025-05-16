//clicked from ---
package Classes;
import java.lang.*;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
public class Interface extends JFrame implements MouseListener//, ActionListener
{
	JButton back,menformal,donate,customercare,languages,mencasual,womenformal,womentraditional,menu;
	JLabel logo,search,cart,bg1,bg2,menformalL,mencasualL;
	JTextField searchT;
	
	Color c1=new Color(237, 231, 246);
	Border b1=BorderFactory.createLineBorder(new Color(120,120,120),3,true);
	public Interface()
	{
		super("Interface");
		this.setSize(1200,700);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		JPanel panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(c1);
		this.add(panel);
		
		ImageIcon icon = new ImageIcon("images/mainlogo.png"); //Console Icon
        this.setIconImage(icon.getImage());
		
		back=new JButton(new ImageIcon("images/back.png"));
		back.setBackground(new Color(237, 231, 246));;
		back.setOpaque(true);
		back.setBorder(null);
		back.setBounds(1,8,32,32);
		back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(ae.getSource()==back)
				{
					Login l=new Login("s1","s2");
					Interface.this.setVisible(false);
					l.setVisible(true);
				}
			}
		});
		back.addMouseListener(this);
		panel.add(back);
		
		menu=new JButton(new ImageIcon("images/menu.png"));
		menu.setBackground(new Color(237, 231, 246));;
		menu.setOpaque(true);
		menu.setBorder(null);
		menu.setBounds(5,55,35,35);
		menu.addMouseListener(this);
		panel.add(menu);
		
		JLabel title=new JLabel("Welcome");
		title.setBounds(65,10,200,40);
		title.setFont(new Font("Garamond",Font.PLAIN+Font.BOLD,45));
		title.setForeground(Color.BLACK);
		title.setOpaque(true);
		panel.add(title);
		
		JLabel subtitle=new JLabel("To Our Sell Page");
		subtitle.setBounds(60,55,400,45);
		subtitle.setFont(new Font("Garamond",Font.PLAIN+Font.BOLD,35));
		subtitle.setForeground(Color.BLACK);
		subtitle.setOpaque(false);
		panel.add(subtitle);
		
		JLabel donatepic=new JLabel(new ImageIcon("images/donatepic.png"));
		donatepic.setBounds(362,22,16,16);
		panel.add(donatepic);
		
		donate=new JButton("Synapse Donate");
		donate.setBounds(380,20,150,20);
		donate.setFont(new Font("Garamond",Font.BOLD,20));
		donate.addMouseListener(this);
		donate.setBackground(c1);
		donate.addMouseListener(this);
		donate.setBorder(null);
		panel.add(donate);
		
		JLabel customercarepic=new JLabel(new ImageIcon("images/ccare.png"));
		customercarepic.setBounds(362,50,16,16);
		panel.add(customercarepic);
		
		customercare=new JButton("Custome Care");
		customercare.setBounds(382,49,130,20);
		customercare.setFont(new Font("Garamond",Font.BOLD,20));
		customercare.setBackground(c1);
		customercare.setBorder(null);
		customercare.addMouseListener(this);
		panel.add(customercare);
		
		JLabel languagepic=new JLabel(new ImageIcon("images/lpic.png"));
		languagepic.setBounds(362,78,16,16);
		panel.add(languagepic);
		
		languages=new JButton("Languages");
		languages.setBounds(390,75,100,25);
		languages.setFont(new Font("Garamond",Font.BOLD,20));
		languages.setBackground(c1);
		languages.setBorder(null);
		languages.addMouseListener(this);
		panel.add(languages);
		
		logo=new JLabel(new ImageIcon("images/mainlogod.png"));
		logo.setBounds(1080,-5,100,100);
		panel.add(logo);
		
		searchT=new JTextField();
		searchT.setBounds(620,30,400,30);
		searchT.setBackground(c1);
		searchT.setBorder(b1);
		panel.add(searchT);
		
		search=new JLabel(new ImageIcon("images/search.png"));
		search.setBounds(575,27,40,40);
		search.addMouseListener(this);
		search.setBackground(new Color(237, 231, 246));
		search.setOpaque(true);
		search.setBorder(null);
		panel.add(search);
		
		cart = new JLabel(new ImageIcon("images/cart.png"));
		cart.setBounds(1030,23,45,45);
		cart.setBorder(null);
		cart.setBackground(new Color(237, 231, 246));;
		cart.setOpaque(true);
		cart.addMouseListener(this);
		panel.add(cart);
		
		Random random = new Random();
        
        int r = random.nextInt(Integer.MAX_VALUE);
		int rr=(r%5);
		if(rr==0)
		{
			JLabel advertise=new JLabel(new ImageIcon("images/banner7771.png"));
			advertise.setBounds(10,120,1160,200);
			advertise.setBorder(null);
			panel.add(advertise);
		}
		else if(rr==1)
		{
			JLabel advertise=new JLabel(new ImageIcon("images/111banner.png"));
			advertise.setBounds(10,120,1160,200);
			advertise.setBorder(null);
			panel.add(advertise);
		}
		else if(rr==2)
		{
			JLabel advertise=new JLabel(new ImageIcon("images/banner775.png"));
			advertise.setBounds(10,120,1160,200);
			advertise.setBorder(null);
			panel.add(advertise);
		}
		else if(rr==3)
		{
			JLabel advertise=new JLabel(new ImageIcon("images/banner78.png"));
			advertise.setBounds(10,120,1160,200);
			advertise.setBorder(null);
			panel.add(advertise);
		}
		else if(rr==4)
		{
			JLabel advertise=new JLabel(new ImageIcon("images/banner79.png"));
			advertise.setBounds(10,120,1160,200);
			advertise.setBorder(null);
			panel.add(advertise);
		}
		
		menformal=new JButton(new ImageIcon("images/rsz_1men_formal.png"));
		menformal.setBounds(50,335,200,270);
		menformal.setBackground(new Color(237, 231, 246));
		menformal.setOpaque(false);
		menformal.setBorder(null);
		menformal.addMouseListener(this);
		panel.add(menformal);
		
		menformalL=new JLabel("Men Formal");
		menformalL.setBounds(45,618,200,30);
		menformalL.setBackground(new Color(0,191,165));
		menformalL.setForeground(new Color(125,125,125));
		menformalL.setFont(new Font("Garamond",Font.PLAIN,23));
		menformalL.setHorizontalAlignment(JLabel.CENTER);
		menformalL.setBorder(null);
		menformalL.setOpaque(false);
		panel.add(menformalL);
		
		mencasual=new JButton(new ImageIcon("images/mencasual2.png"));
		mencasual.setBounds(310,335,200,280);
		mencasual.setBackground(new Color(237, 231, 246));
		mencasual.setBorder(null);
		mencasual.addMouseListener(this);
		mencasual.setOpaque(false);
		panel.add(mencasual);
		
		mencasualL=new JLabel("Men Casual");
		mencasualL.setBounds(310,618,200,30);
		mencasualL.setBackground(new Color(0,191,165));
		mencasualL.setForeground(new Color(125,125,125));
		mencasualL.setFont(new Font("Garamond",Font.PLAIN,23));
		mencasualL.setHorizontalAlignment(JLabel.CENTER);
		mencasualL.setBorder(null);
		mencasualL.setOpaque(false);
		panel.add(mencasualL);
		
		womenformal=new JButton(new ImageIcon("images/womenformal2.png"));
		womenformal.setBounds(610,335,200,270);
		womenformal.setBackground(new Color(237, 231, 246));
		womenformal.setOpaque(false);
		womenformal.setBorder(null);
		womenformal.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(womenformal == ae.getSource())
				{
					Womenformal m = new Womenformal();
					Interface.this.setVisible(false);
					m.setVisible(true);
				}
			}
		}
		);
		womenformal.addMouseListener(this);
		panel.add(womenformal);
		
		JLabel womenformalL=new JLabel("Women Formal");
		womenformalL.setBounds(617,618,200,30);
		womenformalL.setBackground(new Color(0,191,165));
		womenformalL.setForeground(new Color(125,125,125));
		womenformalL.setFont(new Font("Garamond",Font.PLAIN,23));
		womenformalL.setHorizontalAlignment(JLabel.CENTER);
		womenformalL.setBorder(null);
		womenformal.addMouseListener(this);
		womenformalL.setOpaque(false);
		panel.add(womenformalL);
		
		womentraditional=new JButton(new ImageIcon("images/womentraditional2.png"));
		womentraditional.setBounds(895,335,200,280);
		womentraditional.setBackground(new Color(237, 231, 246));
		womentraditional.setOpaque(false);
		womentraditional.setBorder(null);
		womentraditional.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(ae.getSource()==womentraditional)
				{
					Womentraditional w=new Womentraditional();
					Interface.this.setVisible(false);
					w.setVisible(true);
				}
			}
		});
		womentraditional.addMouseListener(this);
		panel.add(womentraditional);
		
		JLabel womentraditionalL=new JLabel("Women Traditional");
		womentraditionalL.setBounds(908,618,200,30);
		womentraditionalL.setBackground(new Color(0,191,165));
		womentraditionalL.setForeground(new Color(125,125,125));
		womentraditionalL.setFont(new Font("Garamond",Font.PLAIN,23));
		womentraditionalL.setHorizontalAlignment(JLabel.CENTER);
		womentraditionalL.setBorder(null);
		womentraditionalL.setOpaque(false);
		panel.add(womentraditionalL);
		
		/*
		bg2=new JLabel(new ImageIcon("c2.png"));
		bg2.setBounds(10,315,275,220);
		panel.add(bg2);
		
		bg1=new JLabel(new ImageIcon("c1.png"));
		bg1.setBounds(0,300,1200,250);
		panel.add(bg1);
		*/
		
		menformal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (ae.getSource() == menformal) {
					new gentsFormal();
					Interface.this.setVisible(false);
				}
			}
		});
		
		mencasual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (ae.getSource() == mencasual) {
					new gentsCasual();
					Interface.this.setVisible(false);
				}
			}
		});
		
		
	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource()==back)
		{
			back.setBorder(b1);
		}
		else if(me.getSource()==donate)
		{
			donate.setFont(new Font("Garamond",Font.BOLD,21));
		}
		else if(me.getSource()==languages)
		{
			languages.setFont(new Font("Garamond",Font.BOLD,21));
		}
		else if(me.getSource()==customercare)
		{
			customercare.setFont(new Font("Garamond",Font.BOLD,21));
		}
		else if(me.getSource()==menformal)
		{
			menformal.setBorder(b1);
		}
		else if(me.getSource()==mencasual)
		{
			mencasual.setBorder(b1);
		}
		else if(me.getSource()==search)
		{
			search.setBorder(b1);
		}
		else if(me.getSource()==cart)
		{
			cart.setBorder(b1);
		}
		else if(me.getSource()==womenformal)
		{
			womenformal.setBorder(b1);
		}
		else if(me.getSource()==womentraditional)
		{
			womentraditional.setBorder(b1);
		}
		else if(me.getSource()==menu)
		{
			menu.setBorder(b1);
		}
		
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource()==back)
		{
			back.setBorder(null);
		}
		else if(me.getSource()==donate)
		{
			donate.setFont(new Font("Garamond",Font.BOLD,20));
		}
		else if(me.getSource()==languages)
		{
			languages.setFont(new Font("Garamond",Font.BOLD,20));
		}
		else if(me.getSource()==customercare)
		{
			customercare.setFont(new Font("Garamond",Font.BOLD,20));
		}
		else if(me.getSource()==menformal)
		{
			menformal.setBorder(null);
		}
		else if(me.getSource()==mencasual)
		{
			mencasual.setBorder(null);
		}
		else if(me.getSource()==search)
		{
			search.setBorder(null);
		}
		else if(me.getSource()==cart)
		{
			cart.setBorder(null);
		}
		else if(me.getSource()==womenformal)
		{
			womenformal.setBorder(null);
		}
		else if(me.getSource()==womentraditional)
		{
			womentraditional.setBorder(null);
		}
		else if(me.getSource()==menu)
		{
			menu.setBorder(null);
		}
	}

}