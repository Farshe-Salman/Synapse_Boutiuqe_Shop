//clicked from Womenformal class
package Classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
public class Hanbok extends JFrame implements MouseListener//, ActionListener
{
	Color c1=new Color(237,231,246);
	Color c2=new Color(215, 204, 200);
	Color c3=new Color(60,80,110);
	Border b1=BorderFactory.createLineBorder(new Color(120,120,120),1,true);
	Border b2=BorderFactory.createLineBorder(new Color(0, 105, 92),2,true);
	Font f1=new Font("Garamond",Font.PLAIN,20);
	
	JButton back,donate,languages,customercare,facebook,insta,twiter,addtocart,image1,red,sky,black,plus,minus,option1,wishlist;
	JLabel logo,title,subtitle,line2,count,colorbg,name;
	JButton msaree,mfitandflare;
	JRadioButton r1,r2,r3,r4;
	ButtonGroup bg1;
	
	private String product_hanbok="HANBOK DRESS CASUAL";
	private String proPrice="175";
	private String quantity1="1";
	
	public Hanbok()
	{
		super("Hanbok Section");
		this.setSize(1200,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
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
					Womentraditional w=new Womentraditional();
					Hanbok.this.setVisible(false);
					w.setVisible(true);
				}
			}
		});
		panel.add(back);
		
		title =new JLabel("H A N B O K");
		title.setBounds(75,5,300,50);
		title.setBackground(c1);
		title.setForeground(new Color(60,80,110));
		title.setFont(new Font("Garamond",Font.BOLD,40));
		title.setOpaque(true);
		panel.add(title);
		
		logo=new JLabel(new ImageIcon("images/mainlogod.png"));
		logo.setBounds(1080,-5,100,100);
		panel.add(logo);
		
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
		facebook.setBounds(860,15,42,42);
		facebook.setBackground(c1);
		facebook.setBorder(null);
		facebook.addMouseListener(this);
		panel.add(facebook);
		
		insta=new JButton(new ImageIcon("images/insta.png"));
		insta.setBounds(910,15,42,42);
		insta.setBackground(c1);
		insta.setBorder(null);
		insta.addMouseListener(this);
		panel.add(insta);
		
		twiter=new JButton(new ImageIcon("images/twitter.png"));
		twiter.setBounds(960,15,42,42);
		twiter.setBackground(c1);
		twiter.setBorder(null);
		twiter.addMouseListener(this);
		panel.add(twiter);
		
		JLabel line1=new JLabel("__________________________________________");
		line1.setBounds(6,20,1050,50);
		line1.setForeground(new Color(60,80,110));
		line1.setFont(new Font("Garamond",Font.BOLD,50));
		panel.add(line1);
		
		image1 =new JButton(new ImageIcon("images/skyhanbok.png"));
		image1.setBounds(35,90,300,470);
		image1.setBackground(c1);
		image1.setOpaque(true);
		image1.setBorder(null);
		image1.addMouseListener(this);
		/*
		image1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(ae.getSource()==image1)
				{
					addtocart.setBackground(new Color(240, 170, 120));
					addtocart.setForeground(Color.BLACK);
					image1.setBorder(b1);
				}
				else if(ae.getSource()==image1)
				{
					addtocart.setBackground(c2);
					addtocart.setForeground(Color.BLACK);
					image1.setBorder(null);
				}	
				
			}
		});*/
		//String s1=String.valueOf(image1.SelectdItem())
		panel.add(image1);
		
		red=new JButton(new ImageIcon("images/red.png"));
		red.setBounds(110,560,36,36);
		red.setBorder(null);
		red.setOpaque(false);
		red.setBackground(c1);
		red.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(ae.getSource()==red)
				{
					image1.setIcon(new ImageIcon("images/redhanbok.png"));
					image1.setBounds(20,90,300,470);
				}
						
			}
		});
		panel.add(red);
		
		sky=new JButton(new ImageIcon("images/sky.png"));
		sky.setBounds(150,560,36,36);
		sky.setBorder(null);
		sky.setOpaque(false);
		sky.setBackground(c1);
		sky.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(ae.getSource()==sky)
				{
					image1.setIcon(new ImageIcon("images/skyhanbok.png"));
					image1.setBounds(50,90,300,470);
				}
			}
		});
		panel.add(sky);
		
		black=new JButton(new ImageIcon("images/black.png"));
		black.setBounds(190,560,36,36);
		black.setBorder(null);
		black.setOpaque(false);
		black.setBackground(c1);
		black.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(ae.getSource()==black)
				{
					image1.setIcon(new ImageIcon("images/blackHanbok.png"));
					image1.setBounds(20,90,300,470);
				}
			}
		});
		panel.add(black);
		
		line2=new JLabel(new ImageIcon("images/line.png"));
		line2.setBounds(900,90,3,496);
		panel.add(line2);
		
		name=new JLabel(product_hanbok);
		name.setBounds(460,100,420,40);
		name.setForeground(c3);
		name.setOpaque(false);
		name.setFont(new Font("Garamond",Font.BOLD,30));
		name.setBorder(null);
		panel.add(name);
		
		JLabel name2=new JLabel("Korean Fashion");
		name2.setBounds(460,140,420,40);
		name2.setForeground(new Color(60,80,110));
		name2.setOpaque(false);
		name2.setFont(new Font("Garamond",Font.BOLD,28));
		name2.setBorder(null);
		panel.add(name2);
		
		JLabel name3=new JLabel("Black/sky/Red");
		name3.setBounds(460,180,420,40);
		name3.setForeground(new Color(150, 220, 220));
		name3.setOpaque(false);
		name3.setFont(new Font("Garamond",Font.BOLD,25));
		name3.setBorder(null);
		panel.add(name3);
		
		JLabel price=new JLabel("$"+proPrice);
		price.setBounds(460,230,150,50);
		price.setFont(new Font("Garamond",Font.BOLD,40));
		price.setOpaque(false);
		price.setBorder(null);
		panel.add(price);
		
		JLabel rating=new JLabel(new ImageIcon("images/rating.png"));
		rating.setBounds(710,190,128,128);
		panel.add(rating);
		
		JLabel extra1=new JLabel("(22)");
		extra1.setBounds(850,245,50,20);
		extra1.setFont(new Font("Garamond",Font.BOLD,20));
		panel.add(extra1);
		
		JLabel sign1=new JLabel(new ImageIcon("images/correct.png"));
		sign1.setBounds(460,290,24,24);
		panel.add(sign1);
		
		JTextArea terms=new JTextArea("Free delivery within 5 days over £50 and free returns");
		terms.setBounds(490,290,420,25);
		terms.setOpaque(false);
		terms.setLineWrap(true);
		terms.setWrapStyleWord(true);
		terms.setEditable(false);
		terms.setBorder(null);
		terms.setFont(new Font("Garamond",Font.BOLD,18));
		panel.add(terms);
		
		JLabel sign2=new JLabel(new ImageIcon("images/correct.png"));
		sign2.setBounds(460,315,24,24);
		panel.add(sign2);
		
		JTextArea terms2=new JTextArea("Free Click & Collect over £30 and free returns");
		terms2.setBounds(490,315,380,30);
		terms2.setOpaque(false);
		terms2.setLineWrap(true);
		terms2.setWrapStyleWord(true);
		terms2.setEditable(false);
		terms2.setFont(new Font("Garamond",Font.BOLD,18));
		panel.add(terms2);
		
		option1=new JButton("View Delivery, collection, returns option");
		option1.setBounds(510,350,340,30);
		option1.setFont(new Font("Garamond",Font.BOLD,18));
		option1.setForeground(Color.BLACK);
		option1.setBackground(Color.WHITE);
		option1.setOpaque(true);
		option1.addMouseListener(this);
		option1.setBorder(null);
		panel.add(option1);
		
		JLabel extra2=new JLabel(new ImageIcon("images/lineh.png"));
		extra2.setBounds(510,375,340,10);
		panel.add(extra2);
		
		JLabel love=new JLabel(new ImageIcon("images/love.png"));
		love.setBounds(575,400,24,24);
		panel.add(love);
		
		wishlist=new JButton("Add to wishlist");
		wishlist.setBounds(610,395,150,30);
		wishlist.setFont(new Font("Garamond",Font.BOLD,22));
		wishlist.setBackground(Color.WHITE);
		wishlist.setBorder(b1);
		wishlist.addMouseListener(this);
		panel.add(wishlist);
		
		JLabel size=new JLabel("Sizes:");
		size.setBounds(470,420,100,40);
		size.setFont(new Font("Garamond",Font.BOLD,26));
		panel.add(size);
		
		r1=new JRadioButton("M");
		r1.setBounds(530,460,80,30);
		r1.setFont(new Font("Garamond",Font.BOLD,20));
		r1.setBackground(Color.WHITE);
		panel.add(r1);
		
		r2=new JRadioButton("L");
		r2.setBounds(610,460,80,30);
		r2.setFont(new Font("Garamond",Font.BOLD,20));
		r2.setBackground(Color.WHITE);
		panel.add(r2);
		
		r3=new JRadioButton("XL");
		r3.setBounds(690,460,80,30);
		r3.setFont(new Font("Garamond",Font.BOLD,20));
		r3.setBackground(Color.WHITE);
		panel.add(r3);
		
		r4=new JRadioButton("XXL");
		r4.setBounds(770,460,80,30);
		r4.setFont(new Font("Garamond",Font.BOLD,20));
		r4.setBackground(Color.WHITE);
		panel.add(r4);
		
		
		
		bg1=new ButtonGroup();
		bg1.add(r1);
		bg1.add(r2);
		bg1.add(r3);
		bg1.add(r4);
		
		
		JLabel quantity=new JLabel("Quantity:");
		quantity.setBounds(600,525,120,35);
		quantity.setForeground(Color.BLACK);
		quantity.setBackground(c2);
		quantity.setFont(new Font("Garamond",Font.BOLD,23));
		panel.add(quantity);
		
		String s1 = "1";
		count = new JLabel(s1);
		count.setBounds(750, 520, 50, 50);
		count.setFont(new Font("Garamond", Font.BOLD, 25));
		count.setBorder(b1);
		count.setHorizontalAlignment(JLabel.CENTER);
		panel.add(count);
		int[] clickCount = {0}; // Create an array to hold the click count
		
		plus = new JButton("+");
		plus.setBounds(800, 520, 40, 50);
		plus.setFont(new Font("Garamond", Font.PLAIN, 30));
		plus.setForeground(Color.BLACK);
		plus.setBackground(c1);
		plus.setBorder(null);
		plus.setOpaque(true);
		plus.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae) 
			{
				if (clickCount[0]<10) 
				{
					clickCount[0]++;
					quantity1=Integer.toString(1 + clickCount[0]);
					count.setText(quantity1);
					//quantity1=1+clickCount[0];
				}
			}
		});
		panel.add(plus);
		
		minus = new JButton("-");
		minus.setBounds(710, 520, 40, 50);
		minus.setFont(new Font("Garamond", Font.PLAIN, 40));
		minus.setForeground(Color.BLACK);
		minus.setBackground(c1);
		minus.setBorder(null);
		minus.setOpaque(true);
		minus.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae)
			{
				if (clickCount[0]>0)
				{
					clickCount[0]--;
					quantity1=Integer.toString(1 + clickCount[0]);
					count.setText(quantity1);
					//quantity1=1+clickCount[0];
				}
			}});
		panel.add(minus);
		
		colorbg = new JLabel(new ImageIcon("images/colorbg1.png"));
		colorbg.setBounds(450,95,440,480);
		panel.add(colorbg);
		
		JLabel l1=new JLabel("You may Also Like");
		l1.setBounds(940,100,210,40);
		l1.setFont(new Font("Garamond",Font.BOLD,25));
		panel.add(l1);
		
		msaree=new JButton(new ImageIcon("images/msaree.png"));
		msaree.setBounds(915,150,250,160);
		msaree.setBorder(null);
		msaree.setOpaque(false);
		msaree.setBorder(null);
		msaree.addMouseListener(this);
		msaree.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(ae.getSource()==msaree)
				{
					Saree f=new Saree();
					Hanbok.this.setVisible(false);
					f.setVisible(true);
				}
			}
		});
		msaree.setBackground(c1);
		panel.add(msaree);
		
		JLabel msareeL=new JLabel("S A R E E");
		msareeL.setBounds(990,310,250,30);
		msareeL.setForeground(new Color(60,80,110));
		msareeL.setFont(new Font("Garamond",Font.PLAIN,22));
		msareeL.setOpaque(false);
		panel.add(msareeL);
		
		mfitandflare=new JButton(new ImageIcon("images/mfitandflare.png"));
		mfitandflare.setBounds(915,370,250,160);
		mfitandflare.setBorder(null);
		mfitandflare.setOpaque(false);
		mfitandflare.setBorder(null);
		mfitandflare.addMouseListener(this);
		mfitandflare.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(ae.getSource()==mfitandflare)
				{
					Fitandflare f=new Fitandflare();
					Hanbok.this.setVisible(false);
					f.setVisible(true);
				}
			}
		});
		mfitandflare.setBackground(c1);
		panel.add(mfitandflare);
		
		JLabel mfitandflareL=new JLabel("F I T A N D F L A R E");
		mfitandflareL.setBounds(960,540,200,30);
		mfitandflareL.setForeground(new Color(60,80,110));
		mfitandflareL.setFont(new Font("Garamond",Font.PLAIN,22));
		mfitandflareL.setOpaque(false);
		panel.add(mfitandflareL);
		
		JLabel extra3=new JLabel(new ImageIcon("images/lineh.png"));
		extra3.setBounds(930,140,220,3);
		panel.add(extra3);
		
		addtocart=new JButton("Proceed to Purchase");
		addtocart.setBounds(0,613,1200,50);
		addtocart.setHorizontalAlignment(JButton.CENTER);
		addtocart.setBackground(c2);
		addtocart.setForeground(Color.WHITE);
		addtocart.setFont(new Font("Garamond",Font.BOLD,28));
		addtocart.setBorder(null);
		addtocart.addMouseListener(this);
		addtocart.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(ae.getSource()==addtocart)
				{
					Purchase p=new Purchase(product_hanbok,proPrice,quantity1);
					Hanbok.this.setVisible(false);
					p.setVisible(true);
				}
			}
		});
		panel.add(addtocart);
		
		
		
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
		else if(me.getSource()==mfitandflare)
		{
			mfitandflare.setBorder(b1);
		}
		else if(me.getSource()==msaree)
		{
			msaree.setBorder(b1);
		}
		else if(me.getSource()==addtocart)
		{
			addtocart.setBackground(new Color(152, 251, 152));
			addtocart.setForeground(Color.BLACK);
		}
		
		else if(me.getSource()==option1)
		{
			option1.setBackground(c2);
		}
		else if(me.getSource()==wishlist)
		{
			wishlist.setBorder(b2);
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
		else if(me.getSource()==mfitandflare)
		{
			mfitandflare.setBorder(null);
		}
		else if(me.getSource()==msaree)
		{
			msaree.setBorder(null);
		}
		else if(me.getSource()==addtocart)
		{
			addtocart.setBackground(c2);
			addtocart.setForeground(Color.WHITE);
		}
		else if (me.getSource()==option1)
		{
			option1.setBackground(Color.WHITE);
		}
		else if(me.getSource()==wishlist)
		{
			wishlist.setBorder(b1);
		}
	}
	/*
	public static void main(String [] args)
	{
		Hanbok b=new Hanbok();
		b.setVisible(true);
	}*/
}