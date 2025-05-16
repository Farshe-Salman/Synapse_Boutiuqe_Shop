//clicked from Interface Class
package Classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class Womentraditional extends JFrame implements MouseListener//,ActionListener
{
	Color c1=new Color(237,231,246);
	Border b1=BorderFactory.createLineBorder(new Color(120,120,120),3,true);

	JButton back,donate,languages,customercare,kimono,hanbok,dirndl,abaya,sari,flamenco,kaftan,facebook,insta,twiter;
	JLabel logo,title,search,cart,subtitle;
	JTextField searchT;
	
	public Womentraditional()
	{
		super("Womentraditional Section");
		this.setSize(1200,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
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
		back.addMouseListener(this);
		back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(ae.getSource()==back)
				{
					Interface i=new Interface();
					Womentraditional.this.setVisible(false);
					i.setVisible(true);
				}
			}
		});
		panel.add(back);
		
		JButton logo=new JButton(new ImageIcon("images/mainlogod.png"));
		logo.setBounds(1080,-5,100,100);
		logo.setOpaque(true);
		logo.setBackground(c1);
		logo.setBorder(null);
		logo.setCursor(new Cursor(Cursor.HAND_CURSOR));
		panel.add(logo);
		logo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (ae.getSource() == logo) {
					Interface i=new Interface();
					Womentraditional.this.setVisible(false);
					i.setVisible(true);
				}
			}
		});
		
		JLabel donatepic=new JLabel(new ImageIcon("images/donatepic.png"));
		donatepic.setBounds(377,22,16,16);
		panel.add(donatepic);
		
		donate=new JButton("Synapse Donate");
		donate.setBounds(395,20,150,20);
		donate.setFont(new Font("Garamond",Font.BOLD,20));
		donate.addMouseListener(this);
		donate.setBackground(c1);
		donate.addMouseListener(this);
		donate.setBorder(null);
		panel.add(donate);
		
		JLabel customercarepic=new JLabel(new ImageIcon("images/ccare.png"));
		customercarepic.setBounds(550,22,16,16);
		panel.add(customercarepic);
		
		customercare=new JButton("Customer Care");
		customercare.setBounds(570,20,135,20);
		customercare.setFont(new Font("Garamond",Font.BOLD,20));
		customercare.setBackground(c1);
		customercare.setBorder(null);
		customercare.addMouseListener(this);
		panel.add(customercare);
		
		JLabel languagepic=new JLabel(new ImageIcon("images/lpic.png"));
		languagepic.setBounds(710,22,16,16);
		panel.add(languagepic);
		
		languages=new JButton("Languages");
		languages.setBounds(735,20,100,25);
		languages.setFont(new Font("Garamond",Font.BOLD,20));
		languages.setBackground(c1);
		languages.setBorder(null);
		languages.addMouseListener(this);
		panel.add(languages);
		
		title = new JLabel("WOMEN");
		title.setBounds(80,10,200,40);
		title.setFont(new Font("Garamond",Font.PLAIN+Font.BOLD,45));
		title.setForeground(new Color(60,80,110));
		title.setOpaque(true);
		panel.add(title);
		
		subtitle=new JLabel("T R A D I T I O N A L");
		subtitle.setBounds(10,55,400,45);
		subtitle.setFont(new Font("Garamond",Font.PLAIN+Font.BOLD,35));
		subtitle.setForeground(new Color(60,80,110));
		subtitle.setOpaque(false);
		panel.add(subtitle);
		
		facebook=new JButton(new ImageIcon("images/facebook.png"));
		facebook.setBounds(400,60,42,42);
		facebook.setBackground(c1);
		facebook.setBorder(null);
		facebook.addMouseListener(this);
		panel.add(facebook);
		
		insta=new JButton(new ImageIcon("images/insta.png"));
		insta.setBounds(450,60,42,42);
		insta.setBackground(c1);
		insta.setBorder(null);
		insta.addMouseListener(this);
		panel.add(insta);
		
		twiter=new JButton(new ImageIcon("images/twitter.png"));
		twiter.setBounds(496,60,42,42);
		twiter.setBackground(c1);
		twiter.setBorder(null);
		twiter.addMouseListener(this);
		panel.add(twiter);
		
		searchT=new JTextField();
		searchT.setBounds(620,60,400,30);
		searchT.setBackground(c1);
		searchT.setBorder(b1);
		panel.add(searchT);
		
		search=new JLabel(new ImageIcon("images/search.png"));
		search.setBounds(575,57,40,40);
		search.addMouseListener(this);
		search.setBackground(new Color(237, 231, 246));;
		search.setOpaque(true);
		search.setBorder(null);
		panel.add(search);
		
		cart = new JLabel(new ImageIcon("images/cart.png"));
		cart.setBounds(1030,53,45,45);
		cart.setBorder(null);
		cart.setBackground(new Color(237, 231, 246));;
		cart.setOpaque(true);
		cart.addMouseListener(this);
		panel.add(cart);
		
		JLabel line1=new JLabel("_______________________________________________");
		line1.setBounds(4,65,1200,50);
		line1.setForeground(new Color(60,80,110));
		line1.setFont(new Font("Garamond",Font.BOLD,50));
		panel.add(line1);
		
		kimono=new JButton(new ImageIcon("images/kimono.png"));
		kimono.setBounds(120,140,175,200);
		kimono.setBackground(c1);
		kimono.addMouseListener(this);
		kimono.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(ae.getSource()==kimono)
				{
					Kimono b=new Kimono();
					Womentraditional.this.setVisible(false);
					b.setVisible(true);
				}
			}
		});
		kimono.setBorder(null);
		panel.add(kimono);
		
		JLabel kimono1=new JLabel("K I M O N O");
		kimono1.setBounds(150,350,150,30);
		kimono1.setForeground(new Color(60,80,110));
		kimono1.setFont(new Font("Garamond",Font.PLAIN,20));
		kimono1.setOpaque(false);
		panel.add(kimono1);
		
		hanbok=new JButton(new ImageIcon("images/hanbok.png"));
		hanbok.setBounds(380,140,175,200);
		hanbok.setBackground(c1);
		hanbok.addMouseListener(this);
		hanbok.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(ae.getSource()==hanbok)
				{
					Hanbok g=new Hanbok();
					Womentraditional.this.setVisible(false);
					g.setVisible(true);
				}
			}
		});
		hanbok.setBorder(null);
		panel.add(hanbok);
		
		JLabel hanbokl=new JLabel("H A N B O K");
		hanbokl.setBounds(400,350,150,30);
		hanbokl.setForeground(new Color(60,80,110));
		hanbokl.setFont(new Font("Garamond",Font.PLAIN,20));
		hanbokl.setOpaque(false);
		panel.add(hanbokl);
		
		dirndl=new JButton(new ImageIcon("images/dirndl.png"));
		dirndl.setBounds(595,140,175,200);
		dirndl.setBackground(c1);
		dirndl.addMouseListener(this);
		dirndl.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(ae.getSource()==dirndl)
				{
					Dirndl d=new Dirndl();
					Womentraditional.this.setVisible(false);
					d.setVisible(true);
				}
			}
		});
		dirndl.setBorder(null);
		panel.add(dirndl);
		
		JLabel dirndlL=new JLabel("D I R N D L");
		dirndlL.setBounds(635,350,200,30);
		dirndlL.setForeground(new Color(60,80,110));
		dirndlL.setFont(new Font("Garamond",Font.PLAIN,20));
		dirndlL.setOpaque(false);
		panel.add(dirndlL);
		
		abaya=new JButton(new ImageIcon("images/abaya.png"));
		abaya.setBounds(825,140,175,200);
		abaya.setBackground(c1);
		abaya.addMouseListener(this);
		abaya.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(ae.getSource()==abaya)
				{
					Womentraditional.this.setVisible(false);
					Abaya b=new Abaya();
					b.setVisible(true);
				}
			}
		});
		abaya.setBorder(null);
		panel.add(abaya);
		
		JLabel abayal=new JLabel("A B A Y A");
		abayal.setBounds(880,350,200,30);
		abayal.setForeground(new Color(60,80,110));
		abayal.setFont(new Font("Garamond",Font.PLAIN,20));
		abayal.setOpaque(false);
		panel.add(abayal);
		
		sari=new JButton(new ImageIcon("images/sari.png"));
		sari.setBounds(250,400,175,200);
		sari.setBackground(c1);
		sari.addMouseListener(this);
		sari.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(ae.getSource()==sari)
				{
					Womentraditional.this.setVisible(false);
					Saree b=new Saree();
					b.setVisible(true);
				}
			}
		});
		sari.setBorder(null);
		panel.add(sari);
		
		JLabel saril=new JLabel("S A R E E");
		saril.setBounds(280,610,250,30);
		saril.setForeground(new Color(60,80,110));
		saril.setFont(new Font("Garamond",Font.PLAIN,20));
		saril.setOpaque(false);
		panel.add(saril);
		
		flamenco=new JButton(new ImageIcon("images/flamenco.png"));
		flamenco.setBounds(490,400,175,200);
		flamenco.setBackground(c1);
		flamenco.addMouseListener(this);
		flamenco .addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(ae.getSource()==flamenco )
				{
					Womentraditional.this.setVisible(false);
					Flamenco  b=new Flamenco ();
					b.setVisible(true);
				}
			}
		});
		flamenco.setBorder(null);
		panel.add(flamenco);
		
		JLabel flamencol=new JLabel("F L A M E N C O");
		flamencol.setBounds(510,610,250,30);
		flamencol.setForeground(new Color(60,80,110));
		flamencol.setFont(new Font("Garamond",Font.PLAIN,20));
		flamencol.setOpaque(false);
		panel.add(flamencol);

		kaftan=new JButton(new ImageIcon("images/kaftan.png"));
		kaftan.setBounds(760,400,175,200);
		kaftan.setBackground(c1);
		kaftan.addMouseListener(this);
		kaftan.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(ae.getSource()==kaftan)
				{
					Womentraditional.this.setVisible(false);
					Kaftan b=new Kaftan();
					b.setVisible(true);
				}
			}
		});
		kaftan.setBorder(null);
		panel.add(kaftan);
		
		JLabel kaftanl=new JLabel("K A F T A N");
		kaftanl.setBounds(800,610,120,30);
		kaftanl.setForeground(new Color(60,80,110));
		kaftanl.setFont(new Font("Garamond",Font.PLAIN,20));
		kaftanl.setOpaque(false);
		panel.add(kaftanl);
		
		
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
		else if(me.getSource()==insta)
		{
			insta.setBorder(b1);
		}
		else if(me.getSource()==twiter)
		{
			twiter.setBorder(b1);
		}
		else if(me.getSource()==facebook)
		{
			facebook.setBorder(b1);
		}
		else if(me.getSource()==kimono)
		{
			kimono.setBorder(b1);
		}
		else if(me.getSource()==hanbok)
		{
			hanbok.setBorder(b1);
		}
		else if(me.getSource()==dirndl)
		{
			dirndl.setBorder(b1);
		}
		else if(me.getSource()==abaya)
		{
			abaya.setBorder(b1);
		}
		else if(me.getSource()==sari)
		{
			sari.setBorder(b1);
		}
		else if(me.getSource()==flamenco )
		{
			flamenco .setBorder(b1);
		}
		else if(me.getSource()==kaftan)
		{
			kaftan.setBorder(b1);
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
		else if(me.getSource()==insta)
		{
			insta.setBorder(null);
		}
		else if(me.getSource()==twiter)
		{
			twiter.setBorder(null);
		}
		else if(me.getSource()==facebook)
		{
			facebook.setBorder(null);
		}
		else if(me.getSource()==kimono)
		{
			kimono.setBorder(null);
		}
		else if(me.getSource()==hanbok)
		{
			hanbok.setBorder(null);
		}
		else if(me.getSource()==dirndl)
		{
			dirndl.setBorder(null);
		}
		else if(me.getSource()==abaya)
		{
			abaya.setBorder(null);
		}
		else if(me.getSource()==sari)
		{
			sari.setBorder(null);
		}
		else if(me.getSource()==flamenco )
		{
			flamenco .setBorder(null);
		}
		else if(me.getSource()==kaftan)
		{
			kaftan.setBorder(null);
		}
	}
	
	// public static void main(String [] args)
	// {
	// 	Womentraditional w=new Womentraditional();
	// 	w.setVisible(true);
	// }
}