//clicked from Womenformal class
package Classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
public class Purchase extends JFrame implements MouseListener
{
	Color c1=new Color(255, 255, 224);
	Color c2=new Color(215, 204, 200);
	Color c3=new Color(60,80,110);
	Border b1=BorderFactory.createLineBorder(new Color(120,120,120),3,true);
	Border b2=BorderFactory.createLineBorder(new Color(0, 105, 92),2,true);
	Font f1=new Font("Garamond",Font.PLAIN,20);
	
	JButton payto,back;
	String name,price,quantity;
	String subtotal;
	JRadioButton r1,r2,r3;
	int sc=0;
	
	public Purchase(String name,String price,String quantity)
	{
		super("Purchase page");
		this.setSize(900,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		this.name=name;this.price=price;this.quantity=quantity;
		
		JPanel panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(255, 255, 224));
		this.add(panel);
		
		ImageIcon icon = new ImageIcon("images/mainlogo.png"); //Console Icon
        this.setIconImage(icon.getImage());
		
		JLabel title=new JLabel("Delivery Details and Payment Method");
		title.setBounds(170,3,620,50);
		title.setFont(new Font("Garamond",Font.BOLD,35));
		//title.setBorder(b1);
		panel.add(title);
		
		JLabel titleh=new JLabel("_________________________________");
		titleh.setBounds(158,20,620,40);
		titleh.setFont(new Font("Garamond",Font.PLAIN,35));
		panel.add(titleh);
		
		back=new JButton(new ImageIcon("images/back.png"));
		back.setBackground(new Color(255, 255, 224));;
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
					switch(name)
					{
						case "BOHEMIAN KAFTAN":
						Kaftan k=new Kaftan();
						Purchase.this.setVisible(false);
						k.setVisible(true);
						break;
						
						case "FLAMENCA ESTEPONA DRESS":
						Flamenco f=new Flamenco();
						Purchase.this.setVisible(false);
						f.setVisible(true);
						break;
						
						case "MALHOTRA'S SAREE S6701":
						Saree s=new Saree();
						Purchase.this.setVisible(false);
						s.setVisible(true);
						break;
						
						case "CLASSICAL ABAYA":
						Abaya a=new Abaya();
						Purchase.this.setVisible(false);
						a.setVisible(true);
						break;
						
						case "DIRNDL DRESS D6034":
						Dirndl d=new Dirndl();
						Purchase.this.setVisible(false);
						d.setVisible(true);
						break;
						
						case "HANBOK DRESS CASUAL":
						Hanbok h=new Hanbok();
						Purchase.this.setVisible(false);
						h.setVisible(true);
						break;
						
						case "KIMONO ROBE":
						Kimono kim=new Kimono();
						Purchase.this.setVisible(false);
						kim.setVisible(true);
						break;
						
						case "WOMEN BLAZER":
						Blazer bl=new Blazer();
						Purchase.this.setVisible(false);
						bl.setVisible(true);
						break;
						
						case "COMFORTABLE GOWN":
						Gown gn=new Gown();
						Purchase.this.setVisible(false);
						gn.setVisible(true);
						break;
						
						case "PHASE EIGHT BLACKTIE":
						Blacktie btie=new Blacktie();
						Purchase.this.setVisible(false);
						btie.setVisible(true);
						break;
						
						case "LONG GLITTER BALLGOWN":
						Ballgown bgown=new Ballgown();
						Purchase.this.setVisible(false);
						bgown.setVisible(true);
						break;
						
						case "WOMEN'S SHEATH DRESS":
						Sheathdress sdr=new Sheathdress();
						Purchase.this.setVisible(false);
						sdr.setVisible(true);
						break;
						
						case "SYNAPSE FITANDFLARE":
						Fitandflare fir=new Fitandflare();
						Purchase.this.setVisible(false);
						fir.setVisible(true);
						break;
						
						case "SYNAPSE A-LINE 4701":
						Aline aline=new Aline();
						Purchase.this.setVisible(false);
						aline.setVisible(true);
						break;
					}
				}
			}
		});
		panel.add(back);
		
		JLabel info=new JLabel("Your Information");
		info.setBounds(120,60,250,40);
		info.setFont(new Font("Garamond",Font.BOLD,28));
		panel.add(info);
		
		JLabel lineh3=new JLabel(new ImageIcon("images/lineh.png"));
		lineh3.setBounds(100,102,265,2);
		panel.add(lineh3);
		
		JLabel Yname=new JLabel("Name:");
		Yname.setBounds(30,110,80,40);
		Yname.setFont(new Font("Garamond",Font.BOLD,25));
		panel.add(Yname);
		
		JTextField YnameT=new JTextField();
		YnameT.setBounds(160,110,300,32);
		YnameT.setFont(new Font("Garamond",Font.BOLD,25));
		YnameT.setBorder(b2);
		panel.add(YnameT);
		
		JLabel Yemail=new JLabel("Email:");
		Yemail.setBounds(30,165,80,40);
		Yemail.setFont(new Font("Garamond",Font.BOLD,25));
		panel.add(Yemail);
		
		JTextField YemailT=new JTextField();
		YemailT.setBounds(160,165,300,32);
		YemailT.setFont(new Font("Garamond",Font.BOLD,25));
		YemailT.setBorder(b2);
		panel.add(YemailT);
		
		JLabel Yphone=new JLabel("Phone:");
		Yphone.setBounds(30,220,80,40);
		Yphone.setBorder(null);
		Yphone.setFont(new Font("Garamond",Font.BOLD,25));
		panel.add(Yphone);
		
		JTextField YphoneT=new JTextField();
		YphoneT.setBounds(160,220,300,32);
		YphoneT.setFont(new Font("Garamond",Font.BOLD,25));
		YphoneT.setBorder(b2);
		panel.add(YphoneT);
		
		JLabel Address=new JLabel("Address:");
		Address.setBounds(30,262,120,40);
		Address.setFont(new Font("Garamond",Font.BOLD,25));
		Address.setBorder(null);
		panel.add(Address);
		
		JLabel lineh4=new JLabel(new ImageIcon("images/lineh.png"));
		lineh4.setBounds(20,295,122,2);
		panel.add(lineh4);
		
		JLabel country=new JLabel("Country:");
		country.setBounds(30,305,70,32);
		country.setFont(new Font("Garamond",Font.BOLD,17));
		panel.add(country);
		
		JTextField countryT=new JTextField();
		countryT.setBounds(105,305,120,25);
		countryT.setFont(new Font("Garamond",Font.BOLD,20));
		countryT.setBorder(b2);
		panel.add(countryT);
	
		JLabel city=new JLabel("City:");
		city.setBounds(240,305,50,32);
		city.setFont(new Font("Garamond",Font.BOLD,17));
		panel.add(city);
		
		JTextField cityT=new JTextField();
		cityT.setBounds(290,305,120,32);
		cityT.setFont(new Font("Garamond",Font.BOLD,20));
		cityT.setBorder(b2);
		panel.add(cityT);
		
		JLabel house=new JLabel("House Info:");
		house.setBounds(30,350,120,32);
		house.setFont(new Font("Garamond",Font.BOLD,17));
		panel.add(house);
		
		JTextField houseT=new JTextField();
		houseT.setBounds(135,350,300,32);
		houseT.setFont(new Font("Garamond",Font.BOLD,20));
		houseT.setBorder(b2);
		panel.add(houseT);
		
		JLabel payment=new JLabel("Payment Method");
		payment.setBounds(30,405,250,40);
		payment.setFont(new Font("Garamond",Font.BOLD,25));
		panel.add(payment);
		
		r1=new JRadioButton("Credit/Debit Card");
		r1.setBounds(100,450,220,32);
		r1.setFont(new Font("Garamond",Font.BOLD,22));
		r1.setBackground(c1);
		panel.add(r1);
		
		r2=new JRadioButton("Mobile Banking");
		r2.setBounds(320,450,190,32);
		r2.setFont(new Font("Garamond",Font.BOLD,22));
		r2.setBackground(c1);
		panel.add(r2);
		
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		
		JLabel line2=new JLabel(new ImageIcon("images/line.png"));
		line2.setBounds(510,80,3,420);
		panel.add(line2);
		
		JLabel summary=new JLabel("Your Order Summary");
		summary.setBounds(580,90,300,30);
		summary.setFont(new Font("Garamond",Font.BOLD,25));
		panel.add(summary);
		
		JLabel lineh1=new JLabel(new ImageIcon("images/lineh.png"));
		lineh1.setBounds(560,120,267,2);
		panel.add(lineh1);
		
		JLabel proname=new JLabel("Product:-");
		proname.setBounds(535,145,100,30);
		proname.setFont(new Font("Garamond",Font.BOLD,20));
		proname.setBorder(null);
		panel.add(proname);
		
		JLabel productname=new JLabel(name);
		productname.setBounds(650,145,250,30);
		productname.setFont(new Font("Garamond",Font.BOLD,15));
		productname.setBorder(null);
		panel.add(productname);
		
		JLabel proprice=new JLabel("Price:-");
		proprice.setBounds(535,195,80,30);
		proprice.setFont(new Font("Garamond",Font.BOLD,20));
		proprice.setBorder(null);
		panel.add(proprice);
		
		JLabel proprices=new JLabel("$"+price);
		proprices.setBounds(720,195,70,30);
		proprices.setFont(new Font("Garamond",Font.BOLD,20));
		proprices.setBorder(null);
		panel.add(proprices);
		
		
		
		JLabel quant=new JLabel("Quantity:-");
		quant.setBounds(535,240,100,30);
		quant.setFont(new Font("Garamond",Font.BOLD,20));
		quant.setBorder(null);
		panel.add(quant);
		
		JLabel quants=new JLabel(quantity);
		quants.setBounds(720,240,70,30);
		quants.setFont(new Font("Garamond",Font.BOLD,20));
		quants.setBorder(null);
		panel.add(quants);
		
		JLabel TotalL=new JLabel("Total");
		TotalL.setBounds(535,285,100,30);
		TotalL.setFont(new Font("Garamond",Font.BOLD,20));
		TotalL.setBorder(null);
		panel.add(TotalL);
		
		JLabel Totalc=new JLabel("$"+price+" * "+quantity);
		Totalc.setBounds(720,285,120,30);
		Totalc.setFont(new Font("Garamond",Font.BOLD,20));
		Totalc.setBorder(null);
		panel.add(Totalc);
		
		JLabel del=new JLabel("Delivery Fee");
		del.setBounds(535,330,150,30);
		del.setFont(new Font("Garamond",Font.BOLD,20));
		del.setBorder(null);
		panel.add(del);
		
		JLabel delL=new JLabel("$0");
		delL.setBounds(720,330,100,30);
		delL.setFont(new Font("Garamond",Font.BOLD,20));
		delL.setBorder(null);
		panel.add(delL);
		
		int priceint = Integer.parseInt(price);
		int quantityint = Integer.parseInt(quantity);
		int multiplication = priceint * quantityint;
		float vat = 0.05f * multiplication;
		int vat1 = (int) vat;
		int totalAmount = multiplication + vat1;
		
		JLabel VAT = new JLabel("VAT");
		VAT.setBounds(535, 370, 100, 30);
		VAT.setFont(new Font("Garamond", Font.BOLD, 20));
		VAT.setBorder(null);
		panel.add(VAT);
		
		JLabel VATl = new JLabel("$"+vat + "(5%)");
		VATl.setBounds(720, 370, 100, 30);
		VATl.setFont(new Font("Garamond", Font.BOLD, 20));
		VATl.setBorder(null);
		panel.add(VATl);
		
		JLabel lineh2 = new JLabel(new ImageIcon("images/lineh.png"));
		lineh2.setBounds(535, 405, 267, 2);
		panel.add(lineh2);
		
		JLabel total = new JLabel("SubTotal:-");
		total.setBounds(535, 408, 100, 30);
		total.setFont(new Font("Garamond", Font.BOLD, 20));
		total.setBorder(null);
		panel.add(total);
		
		JLabel subtotalL = new JLabel("$"+totalAmount);
		subtotalL.setBounds(720, 408, 100, 30);
		subtotalL.setFont(new Font("Garamond", Font.BOLD, 20));
		subtotalL.setBorder(null);
		panel.add(subtotalL);

		JLabel colorbg = new JLabel(new ImageIcon("images/colorbg2.png"));
		colorbg.setBounds(523,80,350,420);
		panel.add(colorbg);
		
		payto=new JButton("Proceed to Pay");
		payto.setBounds(0,512,900,50);
		payto.setHorizontalAlignment(JButton.CENTER);
		payto.setBackground(c2);
		payto.setForeground(Color.WHITE);
		payto.setFont(new Font("Garamond",Font.BOLD,28));
		payto.setBorder(null);
		payto.addMouseListener(this);
		panel.add(payto);
		
		r1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == r1) {
                    sc = 1;
                }
            }
        });

        r2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == r2) {
                    sc = 2;
                }
            }
        });
		
		payto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (ae.getSource() == payto) {
					if(sc==1){
					new bankTransfer();
					Purchase.this.setVisible(false);
					}
					else if(sc==2){
						new mobileBanking();
					Purchase.this.setVisible(false);
					}
					else{
						JOptionPane.showMessageDialog(null,"Choose a payment mathod");
					}
				}
			}
		});
		
	}
	public void mouseClicked(MouseEvent me){};
	public void mousePressed(MouseEvent me){};
	public void mouseReleased(MouseEvent me){};
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource()==payto)
		{
			payto.setBackground(new Color(152, 251, 152));
			payto.setForeground(Color.BLACK);
		}
		else if(me.getSource()==back)
		{
			back.setBorder(b1);
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource()==payto)
		{
			payto.setBackground(c2);
			payto.setForeground(Color.WHITE);
		}
		else if(me.getSource()==back)
		{
			back.setBorder(null);
		}
	}
	/*
	public static void main(String [] args)
	{
		Purchase p=new Purchase("1","2","3");
		p.setVisible(true);
	}*/
	
}