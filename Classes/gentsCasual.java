package Classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class gentsCasual extends JFrame implements MouseListener {
	JLabel logo, donatepic, customercarepic, searchbar, languagepic, title, subtitle, line1, shirtcl, poloshirtl,
			jeansL, vnecksweater1, ballpoloshirtl, jacketl, shortsl, graficteel;
	JPanel panel;
	Color c1 = new Color(228,225,217);
	Font f1 = new Font("Garamond", Font.PLAIN, 20);
	// ImageIcon img;
	JButton back, donate, languages, customercare, shirtc, poloshirt, jeans, vnecksweater, ballpoloshirt, jacket,
			shorts, grafictee, facebook, insta, twiter;
	Border b1 = BorderFactory.createLineBorder(new Color(120, 120, 120), 3, true);
	JTextField searchT;
	JFrame frame;

	public gentsCasual() {
		super("Gents Casual Section");
		frame = new JFrame();
		frame.setSize(1200, 700);
		// this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 1200, 700);
		panel.setBackground(new Color(228,225,217));

		ImageIcon icon = new ImageIcon("images/mainlogo.png"); // Console Icon
		frame.setIconImage(icon.getImage());

		back = new JButton(new ImageIcon("images/back.png"));
		back.setBackground(c1);
		back.setOpaque(true);
		back.setBorder(null);
		back.setBounds(1, 8, 32, 32);
		back.addMouseListener(this);
		back.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.add(back);

		JButton logo=new JButton(new ImageIcon("images/mainlogo.png"));
		logo.setBounds(1080,0,100,100);
		logo.setOpaque(true);
		logo.setBackground(c1);
		logo.setBorder(null);
		logo.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.add(logo);
		
		
		donatepic = new JLabel(new ImageIcon("images/donatepic.png"));
		donatepic.setBounds(407, 22, 16, 16);
		frame.add(donatepic);

		donate = new JButton("Synapse Donate");
		donate.setBounds(425, 20, 150, 20);
		donate.setFont(new Font("Garamond", Font.BOLD, 20));
		donate.setBackground(c1);
		donate.addMouseListener(this);
		donate.setBorder(null);
		donate.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.add(donate);

		customercarepic = new JLabel(new ImageIcon("images/ccare.png"));
		customercarepic.setBounds(580, 22, 16, 16);
		frame.add(customercarepic);

		customercare = new JButton("Customer Care");
		customercare.setBounds(600, 20, 135, 20);
		customercare.setFont(new Font("Garamond", Font.BOLD, 20));
		customercare.setBackground(c1);
		customercare.setBorder(null);
		customercare.addMouseListener(this);
		customercare.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.add(customercare);

		languagepic = new JLabel(new ImageIcon("images/lpic.png"));
		languagepic.setBounds(740, 22, 16, 16);
		frame.add(languagepic);

		languages = new JButton("Languages");
		languages.setBounds(765, 20, 100, 25);
		languages.setFont(new Font("Garamond", Font.BOLD, 20));
		languages.setBackground(c1);
		languages.setBorder(null);
		languages.addMouseListener(this);
		languages.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.add(languages);

		facebook = new JButton(new ImageIcon("images/facebook.png"));
		facebook.setBounds(400, 60, 42, 42);
		facebook.setBackground(c1);
		facebook.setBorder(null);
		facebook.addMouseListener(this);
		facebook.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.add(facebook);

		insta = new JButton(new ImageIcon("images/insta.png"));
		insta.setBounds(450, 60, 42, 42);
		insta.setBackground(c1);
		insta.setBorder(null);
		insta.addMouseListener(this);
		insta.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.add(insta);

		twiter = new JButton(new ImageIcon("images/twitter.png"));
		twiter.setBounds(496, 60, 42, 42);
		twiter.setBackground(c1);
		twiter.setBorder(null);
		twiter.addMouseListener(this);
		twiter.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.add(twiter);

		title = new JLabel("GENT'S");
		title.setBounds(90, 10, 220, 40);
		title.setFont(new Font("Garamond", Font.PLAIN + Font.BOLD, 50));
		// title.setForeground(new Color(60,80,110));
		title.setOpaque(false);
		frame.add(title);

		subtitle = new JLabel("C A S U A L");
		subtitle.setBounds(45, 55, 500, 45);
		subtitle.setFont(new Font("Garamond", Font.PLAIN + Font.BOLD, 55));
		subtitle.setForeground(new Color(50, 80, 110));
		subtitle.setOpaque(false);
		frame.add(subtitle);

		line1 = new JLabel("_______________________________________________");
		line1.setBounds(4, 65, 1200, 50);
		line1.setForeground(new Color(60, 80, 110));
		line1.setFont(new Font("Garamond", Font.BOLD, 50));
		frame.add(line1);

		searchbar = new JLabel(new ImageIcon("images/search.png"));
		searchbar.setBounds(630, 65, 30, 30);
		frame.add(searchbar);

		searchT = new JTextField();
		searchT.setBounds(660, 65, 400, 30);
		searchT.setBackground(c1);
		searchT.setBorder(b1);
		frame.add(searchT);

		shirtc = new JButton(new ImageIcon("image/shirtc.png"));
		shirtc.setBounds(115, 135, 200, 205);
		shirtc.setBackground(c1);
		// shirtc.addMouseListener(this);
		// shirtc.addActionListener(new ActionListener()
		// {
		// public void actionPerformed(ActionEvent ae)
		// {
		// if(ae.getSource()==shirtc)
		// {
		// shirtc b=new shirtc();
		// Womenformal.this.setVisible(false);
		// b.setVisible(true);
		// }
		// }
		// });
		shirtc.setBorder(null);
		shirtc.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.add(shirtc);

		shirtcl = new JLabel("S H I R T");
		shirtcl.setBounds(170, 350, 150, 30);
		shirtcl.setForeground(new Color(60, 80, 110));
		shirtcl.setFont(new Font("Garamond", Font.PLAIN, 20));
		shirtcl.setOpaque(false);
		frame.add(shirtcl);

		poloshirt = new JButton(new ImageIcon("image/poloshirt.png"));
		poloshirt.setBounds(350, 120, 190, 220);
		poloshirt.setBackground(c1);
		poloshirt.setBorder(null);
		poloshirt.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.add(poloshirt);

		JLabel poloshirtl = new JLabel("P O L O  S H I R T");
		poloshirtl.setBounds(380, 350, 200, 30);
		poloshirtl.setForeground(new Color(60, 80, 110));
		poloshirtl.setFont(new Font("Garamond", Font.PLAIN, 20));
		poloshirtl.setOpaque(false);
		frame.add(poloshirtl);

		jeans = new JButton(new ImageIcon("image/jeans.png"));
		jeans.setBounds(595, 140, 200, 200);
		jeans.setBackground(c1);
		// jeans.addMouseListener(this);
		jeans.setBorder(null);
		jeans.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.add(jeans);

		JLabel jeansL = new JLabel("J E A N S  P A N T");
		jeansL.setBounds(610, 350, 200, 30);
		jeansL.setForeground(new Color(60, 80, 110));
		jeansL.setFont(new Font("Garamond", Font.PLAIN, 20));
		jeansL.setOpaque(false);
		frame.add(jeansL);

		vnecksweater = new JButton(new ImageIcon("image/vnecksweater.png"));
		vnecksweater.setBounds(840, 140, 200, 200);
		vnecksweater.setBackground(c1);
		// vnecksweater.addMouseListener(this);
		vnecksweater.setBorder(null);
		vnecksweater.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.add(vnecksweater);

		vnecksweater1 = new JLabel("V - N E C K  S W E A T E R");
		vnecksweater1.setBounds(840, 350, 250, 30);
		vnecksweater1.setForeground(new Color(60, 80, 110));
		vnecksweater1.setFont(new Font("Garamond", Font.PLAIN, 20));
		vnecksweater1.setOpaque(false);
		frame.add(vnecksweater1);

		jacket = new JButton(new ImageIcon("image/jacket.png"));
		jacket.setBounds(210, 390, 200, 220);
		jacket.setBackground(c1);
		// jacket.addMouseListener(this);
		jacket.setBorder(null);
		jacket.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.add(jacket);

		jacketl = new JLabel("D E N I M  J A C K E T");
		jacketl.setBounds(220, 610, 250, 30);
		jacketl.setForeground(new Color(60, 80, 110));
		jacketl.setFont(new Font("Garamond", Font.PLAIN, 20));
		jacketl.setOpaque(false);
		frame.add(jacketl);

		shorts = new JButton(new ImageIcon("image/shorts.png"));
		shorts.setBounds(500, 400, 200, 200);
		shorts.setBackground(c1);
		// shorts.addMouseListener(this);
		shorts.setBorder(null);
		shorts.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.add(shorts);

		shortsl = new JLabel("C U R G O  S H O R T S");
		shortsl.setBounds(500, 610, 250, 30);
		shortsl.setForeground(new Color(60, 80, 110));
		shortsl.setFont(new Font("Garamond", Font.PLAIN, 20));
		shortsl.setOpaque(false);
		frame.add(shortsl);

		grafictee = new JButton(new ImageIcon("image/grafictee.png"));
		grafictee.setBounds(760, 395, 192, 205);
		grafictee.setBackground(c1);
		// grafictee.addMouseListener(this);
		grafictee.setBorder(null);
		grafictee.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.add(grafictee);

		graficteel = new JLabel("G R F I C  T E E");
		graficteel.setBounds(790, 610, 180, 30);
		graficteel.setForeground(new Color(60, 80, 110));
		graficteel.setFont(new Font("Garamond", Font.PLAIN, 20));
		graficteel.setOpaque(false);
		frame.add(graficteel);

		frame.add(panel);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false);

		shirtc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (ae.getSource() == shirtc) {
					new shirtc();
					frame.setVisible(false);
				}
			}
		});

		poloshirt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (ae.getSource() == poloshirt) {
					new poloshirt();
					frame.setVisible(false);
				}
			}
		});

		jeans.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (ae.getSource() == jeans) {
					new jeans();
					frame.setVisible(false);
				}
			}
		});

		vnecksweater.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (ae.getSource() == vnecksweater) {
					new vnecksweater();
					frame.setVisible(false);
				}
			}
		});

		jacket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (ae.getSource() == jacket) {
					new jacket();
					frame.setVisible(false);
				}
			}
		});

		shorts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (ae.getSource() == shorts) {
					new shorts();
					frame.setVisible(false);
				}
			}
		});

		grafictee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (ae.getSource() == grafictee) {
					new grafictee();
					frame.setVisible(false);
				}
			}
		});
		
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (ae.getSource() == back) {
					Interface i=new Interface();
					frame.setVisible(false);
					i.setVisible(true);
				}
			}
		});
		
		logo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (ae.getSource() == logo) {
					Interface i=new Interface();
					frame.setVisible(false);
					i.setVisible(true);
				}
			}
		});
	}

	public void mouseClicked(MouseEvent me) {
	}

	public void mousePressed(MouseEvent me) {
	}

	public void mouseReleased(MouseEvent me) {
	}

	public void mouseEntered(MouseEvent me) {
		if (me.getSource() == donate) {
			donate.setFont(new Font("Garamond", Font.BOLD, 21));
		} else if (me.getSource() == languages) {
			languages.setFont(new Font("Garamond", Font.BOLD, 21));
		} else if (me.getSource() == customercare) {
			customercare.setFont(new Font("Garamond", Font.BOLD, 21));
		} else if (me.getSource() == insta) {
			insta.setBorder(b1);
		} else if (me.getSource() == twiter) {
			twiter.setBorder(b1);
		} else if (me.getSource() == facebook) {
			facebook.setBorder(b1);
		}
	}

	public void mouseExited(MouseEvent me) {
		if (me.getSource() == donate) {
			donate.setFont(new Font("Garamond", Font.BOLD, 20));
		} else if (me.getSource() == languages) {
			languages.setFont(new Font("Garamond", Font.BOLD, 20));
		} else if (me.getSource() == customercare) {
			customercare.setFont(new Font("Garamond", Font.BOLD, 20));
		} else if (me.getSource() == insta) {
			insta.setBorder(null);
		} else if (me.getSource() == twiter) {
			twiter.setBorder(null);
		} else if (me.getSource() == facebook) {
			facebook.setBorder(null);
		}
	}

	public static void main(String args[]) {
		new gentsCasual();

	}

}