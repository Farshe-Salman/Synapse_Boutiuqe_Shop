//clicked from Interface class
package Classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
public class Womenformal extends JFrame implements MouseListener//, ActionListener
{
	Color c1=new Color(237,231,246);
	Border b1=BorderFactory.createLineBorder(new Color(120,120,120),3,true);
	
	JButton back,donate,languages,customercare,blazer,gown,blacktie,ballgown,sheath,fitandflare,aline,facebook,insta,twiter;
	JLabel logo,title,subtitle,search,cart;
	JTextField searchT;
	Font f1=new Font("Garamond",Font.PLAIN,20);
	
	
	public Womenformal()
	{
		super("Womenformal Section");
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
		back.addMouseListener(this);
		back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(ae.getSource()==back)
				{
					Interface i=new Interface();
					Womenformal.this.setVisible(false);
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
					Womenformal.this.setVisible(false);
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
		
		
		
		title = new JLabel("WOMEN");
		title.setBounds(82,10,220,40);
		title.setFont(new Font("Garamond",Font.PLAIN+Font.BOLD,50));
		title.setForeground(new Color(60,80,110));
		title.setOpaque(true);
		panel.add(title);
		
		subtitle=new JLabel("F O R M A L");
		subtitle.setBounds(45,55,500,45);
		subtitle.setFont(new Font("Garamond",Font.PLAIN+Font.BOLD,55));
		subtitle.setForeground(new Color(50,80,110));
		subtitle.setOpaque(false);
		panel.add(subtitle);	
		
		JLabel line1=new JLabel("_______________________________________________");
		line1.setBounds(4,65,1200,50);
		line1.setForeground(new Color(60,80,110));
		line1.setFont(new Font("Garamond",Font.BOLD,50));
		panel.add(line1);
		
		blazer=new JButton(new ImageIcon("images/blazer.png"));
		blazer.setBounds(120,140,175,200);
		blazer.setBackground(c1);
		blazer.addMouseListener(this);
		blazer.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(ae.getSource()==blazer)
				{
					Blazer b=new Blazer();
					Womenformal.this.setVisible(false);
					b.setVisible(true);
				}
			}
		});
		blazer.setBorder(null);
		panel.add(blazer);
		
		JLabel blazerl=new JLabel("B L A Z E R");
		blazerl.setBounds(160,350,150,30);
		blazerl.setForeground(new Color(60,80,110));
		blazerl.setFont(new Font("Garamond",Font.PLAIN,20));
		blazerl.setOpaque(false);
		panel.add(blazerl);
		
		gown=new JButton(new ImageIcon("images/gown.png"));
		gown.setBounds(380,140,175,200);
		gown.setBackground(c1);
		gown.addMouseListener(this);
		gown.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(ae.getSource()==gown)
				{
					Gown g=new Gown();
					Womenformal.this.setVisible(false);
					g.setVisible(true);
				}
			}
		});
		gown.setBorder(null);
		panel.add(gown);
		
		JLabel gownl=new JLabel("G O W N");
		gownl.setBounds(420,350,150,30);
		gownl.setForeground(new Color(60,80,110));
		gownl.setFont(new Font("Garamond",Font.PLAIN,20));
		gownl.setOpaque(false);
		panel.add(gownl);
		
		blacktie=new JButton(new ImageIcon("images/blacktie.png"));
		blacktie.setBounds(595,140,175,200);
		blacktie.setBackground(c1);
		blacktie.addMouseListener(this);
		blacktie.setBorder(null);
		blacktie.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(ae.getSource()==blacktie)
				{
					Blacktie b=new Blacktie();
					Womenformal.this.setVisible(false);
					b.setVisible(true);
					
				}
			}
		});
		panel.add(blacktie);
		
		JLabel blacktieL=new JLabel("B L A C K T I E");
		blacktieL.setBounds(615,350,200,30);
		blacktieL.setForeground(new Color(60,80,110));
		blacktieL.setFont(new Font("Garamond",Font.PLAIN,20));
		blacktieL.setOpaque(false);
		panel.add(blacktieL);
		
		ballgown=new JButton(new ImageIcon("images/ballgown.png"));
		ballgown.setBounds(825,140,175,200);
		ballgown.setBackground(c1);
		ballgown.addMouseListener(this);
		ballgown.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(ae.getSource()==ballgown)
				{
					Womenformal.this.setVisible(false);
					Ballgown b=new Ballgown();
					b.setVisible(true);
				}
			}
		});
		ballgown.setBorder(null);
		panel.add(ballgown);
		
		JLabel ballgownl=new JLabel("B A L L G O W N");
		ballgownl.setBounds(850,350,200,30);
		ballgownl.setForeground(new Color(60,80,110));
		ballgownl.setFont(new Font("Garamond",Font.PLAIN,20));
		ballgownl.setOpaque(false);
		panel.add(ballgownl);
		
		sheath=new JButton(new ImageIcon("images/sheath.png"));
		sheath.setBounds(250,400,175,200);
		sheath.setBackground(c1);
		sheath.addMouseListener(this);
		sheath.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(ae.getSource()==sheath)
				{
					Womenformal.this.setVisible(false);
					Sheathdress b=new Sheathdress();
					b.setVisible(true);
				}
			}
		});
		sheath.setBorder(null);
		panel.add(sheath);
		
		JLabel sheathl=new JLabel("S H E A T H D R E S S");
		sheathl.setBounds(240,610,250,30);
		sheathl.setForeground(new Color(60,80,110));
		sheathl.setFont(new Font("Garamond",Font.PLAIN,20));
		sheathl.setOpaque(false);
		panel.add(sheathl);
		
		fitandflare=new JButton(new ImageIcon("images/fitandflare.png"));
		fitandflare.setBounds(490,400,175,200);
		fitandflare.setBackground(c1);
		fitandflare.addMouseListener(this);
		fitandflare.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(ae.getSource()==fitandflare)
				{
					Womenformal.this.setVisible(false);
					Fitandflare b=new Fitandflare();
					b.setVisible(true);
				}
			}
		});
		fitandflare.setBorder(null);
		panel.add(fitandflare);
		
		JLabel fitandflarel=new JLabel("F I T A N D F L A R E");
		fitandflarel.setBounds(480,610,250,30);
		fitandflarel.setForeground(new Color(60,80,110));
		fitandflarel.setFont(new Font("Garamond",Font.PLAIN,20));
		fitandflarel.setOpaque(false);
		panel.add(fitandflarel);
		
		aline=new JButton(new ImageIcon("images/aline22.png"));
		aline.setBounds(700,400,175,200);
		aline.setBackground(c1);
		aline.addMouseListener(this);
		aline.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(ae.getSource()==aline)
				{
					Womenformal.this.setVisible(false);
					Aline b=new Aline();
					b.setVisible(true);
				}
			}
		});
		aline.setBorder(null);
		panel.add(aline);
		
		JLabel alinel=new JLabel("A L I N E");
		alinel.setBounds(740,610,120,30);
		alinel.setForeground(new Color(60,80,110));
		alinel.setFont(new Font("Garamond",Font.PLAIN,20));
		alinel.setOpaque(false);
		panel.add(alinel);
		
		
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
		else if(me.getSource()==blazer)
		{
			blazer.setBorder(b1);
		}
		else if(me.getSource()==gown)
		{
			gown.setBorder(b1);
		}
		else if(me.getSource()==blacktie)
		{
			blacktie.setBorder(b1);
		}
		else if(me.getSource()==ballgown)
		{
			ballgown.setBorder(b1);
		}
		else if(me.getSource()==sheath)
		{
			sheath.setBorder(b1);
		}
		else if(me.getSource()==fitandflare)
		{
			fitandflare.setBorder(b1);
		}
		else if(me.getSource()==aline)
		{
			aline.setBorder(b1);
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
		else if(me.getSource()==blazer)
		{
			blazer.setBorder(null);
		}
		else if(me.getSource()==gown)
		{
			gown.setBorder(null);
		}
		else if(me.getSource()==blacktie)
		{
			blacktie.setBorder(null);
		}
		else if(me.getSource()==ballgown)
		{
			ballgown.setBorder(null);
		}
		else if(me.getSource()==sheath)
		{
			sheath.setBorder(null);
		}
		else if(me.getSource()==fitandflare)
		{
			fitandflare.setBorder(null);
		}
		else if(me.getSource()==aline)
		{
			aline.setBorder(null);
		}
		
	}
	/*
	public void actionPerformed(ActionEvent ae)
	{
		 if(back==ae.getSource())
		{
			Interface i=new Interface();
			this.setVisible(false);
			i.setVisible(true);
		}
		else if (blazer==ae.getSource())
		{
			Blazer b=new Blazer();
			this.setVisible(false);
			b.setVisible(true);
		}
		else if(gown==ae.getSource())
		{
			Gown g=new Gown();
			this.setVisible(false);
			g.setVisible(true);
		}
		
	}
	public static void main(String [] args)
	{
		Womenformal w=new Womenformal();
		w.setVisible(true);
	}
	*/
}