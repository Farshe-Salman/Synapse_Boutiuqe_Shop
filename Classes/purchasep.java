package Classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import javax.swing.JOptionPane;

public class purchasep extends JFrame implements MouseListener
{
	JLabel logo;
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
	JFrame frame;
	JPanel panel; 
	int sc=0;
	 
	public purchasep(String name,String price,String quantity)
	{
		super("purchasepage page");
        frame = new JFrame();
        frame.setSize(900,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		ImageIcon icon = new ImageIcon("images/mainlogo.png"); // Console Icon
		frame.setIconImage(icon.getImage());
		
		this.name=name;this.price=price;this.quantity=quantity;
		
		
		panel = new JPanel();
		//panel.setLayout(null);
        panel.setBounds(0,0,1200,700);
        panel.setBackground(new Color(228,225,217));
		
		JLabel title=new JLabel("Delivery Details and Payment Method");
		title.setBounds(170,3,620,50);
		title.setFont(new Font("Garamond",Font.BOLD,35));
		//title.setBorder(b1);
		frame.add(title);
		
		back=new JButton(new ImageIcon("images/back.png"));
		back.setBackground(c1);
		back.setOpaque(true);
		back.setBorder(null);
		back.setBounds(7,8,32,32);
		//back.addMouseListener(this);
		back.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.add(back);
		
		logo=new JLabel(new ImageIcon("images/mainlogo.png"));
		logo.setBounds(1080,0,100,100);
		frame.add(logo);
		
		JLabel info=new JLabel("Your Information");
		info.setBounds(120,60,250,40);
		info.setFont(new Font("Garamond",Font.BOLD,28));
		frame.add(info);
		
		JLabel lineh3=new JLabel(new ImageIcon("images/lineh.png"));
		lineh3.setBounds(100,102,265,2);
		frame.add(lineh3);
		
		JLabel Yname=new JLabel("Name:");
		Yname.setBounds(30,110,80,40);
		Yname.setFont(new Font("Garamond",Font.BOLD,25));
		frame.add(Yname);
		
		JTextField YnameT=new JTextField();
		YnameT.setBounds(160,110,300,32);
		YnameT.setFont(new Font("Garamond",Font.BOLD,25));
		YnameT.setBorder(b2);
		frame.add(YnameT);
		
		JLabel Yemail=new JLabel("Email:");
		Yemail.setBounds(30,165,80,40);
		Yemail.setFont(new Font("Garamond",Font.BOLD,25));
		frame.add(Yemail);
		
		JTextField YemailT=new JTextField();
		YemailT.setBounds(160,165,300,32);
		YemailT.setFont(new Font("Garamond",Font.BOLD,25));
		YemailT.setBorder(b2);
		frame.add(YemailT);
		
		JLabel Yphone=new JLabel("Phone:");
		Yphone.setBounds(30,220,80,40);
		Yphone.setBorder(null);
		Yphone.setFont(new Font("Garamond",Font.BOLD,25));
		frame.add(Yphone);
		
		JTextField YphoneT=new JTextField();
		YphoneT.setBounds(160,220,300,32);
		YphoneT.setFont(new Font("Garamond",Font.BOLD,25));
		YphoneT.setBorder(b2);
		frame.add(YphoneT);
		
		JLabel Address=new JLabel("Address:");
		Address.setBounds(30,262,120,40);
		Address.setFont(new Font("Garamond",Font.BOLD,25));
		Address.setBorder(null);
		frame.add(Address);
		
		JLabel lineh4=new JLabel(new ImageIcon("images/lineh.png"));
		lineh4.setBounds(20,295,122,2);
		frame.add(lineh4);
		
		JLabel country=new JLabel("Country:");
		country.setBounds(30,305,70,32);
		country.setFont(new Font("Garamond",Font.BOLD,17));
		frame.add(country);
		
		JTextField countryT=new JTextField();
		countryT.setBounds(105,305,120,25);
		countryT.setFont(new Font("Garamond",Font.BOLD,20));
		countryT.setBorder(b2);
		frame.add(countryT);
	
		JLabel city=new JLabel("City:");
		city.setBounds(240,305,50,32);
		city.setFont(new Font("Garamond",Font.BOLD,17));
		frame.add(city);
		
		JTextField cityT=new JTextField();
		cityT.setBounds(290,305,120,32);
		cityT.setFont(new Font("Garamond",Font.BOLD,20));
		cityT.setBorder(b2);
		frame.add(cityT);
		
		JLabel house=new JLabel("House Info:");
		house.setBounds(30,350,120,32);
		house.setFont(new Font("Garamond",Font.BOLD,17));
		frame.add(house);
		
		JTextField houseT=new JTextField();
		houseT.setBounds(135,350,300,32);
		houseT.setFont(new Font("Garamond",Font.BOLD,20));
		houseT.setBorder(b2);
		frame.add(houseT);
		
		JLabel payment=new JLabel("Payment Method");
		payment.setBounds(30,405,250,40);
		payment.setFont(new Font("Garamond",Font.BOLD,25));
		frame.add(payment);
		
		r1=new JRadioButton("Credit/Debit Card");
		r1.setBounds(100,450,220,32);
		r1.setFont(new Font("Garamond",Font.BOLD,22));
		//r1.setBackground(c1);
		r1.setOpaque(false);
		frame.add(r1);
		
		r2=new JRadioButton("Mobile Banking");
		r2.setBounds(320,450,190,32);
		r2.setFont(new Font("Garamond",Font.BOLD,22));
		r2.setOpaque(false);
		//r2.setBackground(c1);
		frame.add(r2);
		
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		JLabel line2=new JLabel(new ImageIcon("images/line.png"));
		line2.setBounds(510,80,3,420);
		frame.add(line2);
		
		JLabel summary=new JLabel("Your Order Summary");
		summary.setBounds(580,90,300,30);
		summary.setFont(new Font("Garamond",Font.BOLD,25));
		frame.add(summary);
		
		JLabel lineh1=new JLabel(new ImageIcon("images/lineh.png"));
		lineh1.setBounds(560,120,267,2);
		frame.add(lineh1);
		
		JLabel proname=new JLabel("Product:-");
		proname.setBounds(535,145,100,30);
		proname.setFont(new Font("Garamond",Font.BOLD,20));
		proname.setBorder(null);
		frame.add(proname);
		
		JLabel productname=new JLabel(name);
		productname.setBounds(650,145,250,30);
		productname.setFont(new Font("Garamond",Font.BOLD,15));
		productname.setBorder(null);
		frame.add(productname);
		
		JLabel proprice=new JLabel("Price:-");
		proprice.setBounds(535,195,80,30);
		proprice.setFont(new Font("Garamond",Font.BOLD,20));
		proprice.setBorder(null);
		frame.add(proprice);
		
		JLabel proprices=new JLabel("$"+price);
		proprices.setBounds(720,195,70,30);
		proprices.setFont(new Font("Garamond",Font.BOLD,20));
		proprices.setBorder(null);
		frame.add(proprices);
		
		JLabel quant=new JLabel("Quantity:-");
		quant.setBounds(535,240,100,30);
		quant.setFont(new Font("Garamond",Font.BOLD,20));
		quant.setBorder(null);
		frame.add(quant);
		
		JLabel quants=new JLabel(quantity);
		quants.setBounds(720,240,70,30);
		quants.setFont(new Font("Garamond",Font.BOLD,20));
		quants.setBorder(null);
		frame.add(quants);
		
		JLabel TotalL=new JLabel("Total");
		TotalL.setBounds(535,285,100,30);
		TotalL.setFont(new Font("Garamond",Font.BOLD,20));
		TotalL.setBorder(null);
		frame.add(TotalL);
		
		JLabel Totalc=new JLabel("$"+price+" * "+quantity);
		Totalc.setBounds(720,285,120,30);
		Totalc.setFont(new Font("Garamond",Font.BOLD,20));
		Totalc.setBorder(null);
		frame.add(Totalc);
		
		JLabel del=new JLabel("Delivery Fee");
		del.setBounds(535,330,150,30);
		del.setFont(new Font("Garamond",Font.BOLD,20));
		del.setBorder(null);
		frame.add(del);
		
		JLabel delL=new JLabel("$0");
		delL.setBounds(720,330,100,30);
		delL.setFont(new Font("Garamond",Font.BOLD,20));
		delL.setBorder(null);
		frame.add(delL);
		
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
		frame.add(VAT);
		
		JLabel VATl = new JLabel("$"+vat + "(5%)");
		VATl.setBounds(720, 370, 100, 30);
		VATl.setFont(new Font("Garamond", Font.BOLD, 20));
		VATl.setBorder(null);
		frame.add(VATl);
		
		JLabel lineh2 = new JLabel(new ImageIcon("images/lineh.png"));
		lineh2.setBounds(535, 405, 267, 2);
		frame.add(lineh2);
		
		JLabel total = new JLabel("SubTotal:-");
		total.setBounds(535, 408, 100, 30);
		total.setFont(new Font("Garamond", Font.BOLD, 20));
		total.setBorder(null);
		frame.add(total);
		
		JLabel subtotalL = new JLabel("$"+totalAmount);
		subtotalL.setBounds(720, 408, 100, 30);
		subtotalL.setFont(new Font("Garamond", Font.BOLD, 20));
		subtotalL.setBorder(null);
		frame.add(subtotalL);

		JLabel colorbg = new JLabel(new ImageIcon("images/colorbg2.png"));
		colorbg.setBounds(523,80,350,420);
		frame.add(colorbg);
		
		payto=new JButton("Proceed to Pay");
		payto.setBounds(0,512,900,50);
		payto.setHorizontalAlignment(JButton.CENTER);
		payto.setBackground(c2);
		payto.setForeground(Color.WHITE);
		payto.setFont(new Font("Garamond",Font.BOLD,28));
		payto.setBorder(null);
		payto.addMouseListener(this);
		// payto.addActionListener(new ActionListener()
		// {
			// public void actionPerformed(ActionEvent ae)
			// {
				// if(ae.getSource()==payto)
				// {
					// purchasepage.this.setVisible(false);
				// }
			// }
		// });
		frame.add(payto);
		
		frame.add(panel);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false);
		
		back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                if(ae.getSource() == back){
                    switch(name)
					{
						case "Men Solid Single Breasted Blazer":
						blazerb k=new blazerb();
						frame.setVisible(false);
						k.setVisible(true);
						break;
						
						case "The Kooples Striped Suit Vest":
						vest f=new vest();
						purchasep.this.setVisible(false);
						f.setVisible(true);
						break;
						
						case "EXCLUSIVE SLIM FITTED COTTON PANJABI":
						punjabi s=new punjabi();
						purchasep.this.setVisible(false);
						s.setVisible(true);
						break;
						
						case "Slim Fit Mens Cotton Dress Pant":
						dresspant a=new dresspant();
						purchasep.this.setVisible(false);
						a.setVisible(true);
						break;
						
						case "Woven Art Silk Jacquard Sherwani":
						sherwani d=new sherwani();
						purchasep.this.setVisible(false);
						d.setVisible(true);
						break;
						
						case "Arrow Manhattan Slim Fit Shirt":
						shirt h=new shirt();
						purchasep.this.setVisible(false);
						h.setVisible(true);
						break;
						
						case "Handwoven Raw Silk Blend Tie":
						tie kim=new tie();
						purchasep.this.setVisible(false);
						kim.setVisible(true);
						break;
						
						case "Taaga Man Casual Fusion Shirt":
						shirtc bl=new shirtc();
						purchasep.this.setVisible(false);
						bl.setVisible(true);
						break;
						
						case "Lauren Slim Fit Mesh Polo Shirt":
						poloshirt gn=new poloshirt();
						purchasep.this.setVisible(false);
						gn.setVisible(true);
						break;
						
						case "Stretchable Vintage Jeans Pant":
						jeans btie=new jeans();
						purchasep.this.setVisible(false);
						btie.setVisible(true);
						break;
						
						case "Men's V-Neck Sweater (Henbury)":
						vnecksweater bpoloshirt=new vnecksweater();
						purchasep.this.setVisible(false);
						bpoloshirt.setVisible(true);
						break;
						
						case "Flannel Lined Denim Jacket":
						jacket sdr=new jacket();
						purchasep.this.setVisible(false);
						sdr.setVisible(true);
						break;
						
						case "AE Flex Lived-In Cargo Short":
						shorts fir=new shorts();
						purchasep.this.setVisible(false);
						fir.setVisible(true);
						break;
						
						case "Wyoming Short Graphic T-Shirt":
						grafictee grafictee=new grafictee();
						purchasep.this.setVisible(false);
						grafictee.setVisible(true);
						break;
					}
                }
            }
        });
		
		
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
					frame.setVisible(false);
					}
					else if(sc==2){
						new mobileBanking();
					frame.setVisible(false);
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
	
	
	
	// public static void main(String args[])
	// {
		// purchasep q=new purchasep("a","b","c");
		// q.setVisible(true);
		
	// }
	
}