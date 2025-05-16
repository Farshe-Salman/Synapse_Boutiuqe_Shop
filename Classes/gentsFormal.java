package Classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.io.IOException;

public class gentsFormal extends JFrame implements MouseListener {
	JLabel logo, donatepic, customercarepic, searchbar, languagepic, title, subtitle, line1, blazerbl, vestl, punjabiL,
			dresspant1, ballvestl, sherwanil, shirtl, tiel;
	JPanel panel;
	Color c1 = new Color(228, 225, 217);
	Font f1 = new Font("Garamond", Font.PLAIN, 20);
	//ImageIcon img, icon;
	JButton back, donate, languages, customercare, blazerb, vest, punjabi, dresspant, ballvest, sherwani, shirt, tie,
			facebook, insta, twiter;
	Border b1 = BorderFactory.createLineBorder(new Color(120, 120, 120), 3, true);
	JTextField searchT;
	JFrame frame;

	public gentsFormal() {
		super("Gents Formal Section");
		frame = new JFrame();
		frame.setSize(1200, 700);

		ImageIcon icon = new ImageIcon("images/mainlogo.png"); // Console Icon
		frame.setIconImage(icon.getImage());

		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 1200, 700);
		panel.setBackground(new Color(228, 225, 217));
		

		back = new JButton(new ImageIcon("images/back.png"));
		back.setBackground(c1);
		back.setOpaque(true);
		back.setBorder(null);
		back.setBounds(1, 8, 32, 32);
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
		//donatepic.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.add(donatepic);

		donate = new JButton("Synapse Donate");
		donate.setBounds(425, 20, 150, 20);
		donate.setFont(new Font("Garamond", Font.BOLD, 20));
		// donate.addMouseListener(this);
		donate.setBackground(c1);
		donate.addMouseListener(this);
		donate.setCursor(new Cursor(Cursor.HAND_CURSOR));
		donate.setBorder(null);
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

		subtitle = new JLabel("F O R M A L");
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
		searchbar.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		frame.add(searchbar);

		searchT = new JTextField();
		searchT.setBounds(660, 65, 400, 30);
		searchT.setBackground(c1);
		searchT.setBorder(b1);
		frame.add(searchT);

		blazerb = new JButton(new ImageIcon("image/blazer.png"));
		blazerb.setBounds(115, 135, 200, 205);
		blazerb.setBackground(c1);
		blazerb.setCursor(new Cursor(Cursor.HAND_CURSOR));
		blazerb.setBorder(null);
		frame.add(blazerb);

		blazerbl = new JLabel("B L A Z E R");
		blazerbl.setBounds(150, 350, 150, 30);
		blazerbl.setForeground(new Color(60, 80, 110));
		blazerbl.setFont(new Font("Garamond", Font.PLAIN, 20));
		blazerbl.setOpaque(false);
		frame.add(blazerbl);

		vest = new JButton(new ImageIcon("image/vest.png"));
		vest.setBounds(350, 140, 190, 200);
		vest.setBackground(c1);
		vest.setCursor(new Cursor(Cursor.HAND_CURSOR));
		vest.setBorder(null);
		frame.add(vest);

		JLabel vestl = new JLabel("V E S T");
		vestl.setBounds(410, 350, 150, 30);
		vestl.setForeground(new Color(60, 80, 110));
		vestl.setFont(new Font("Garamond", Font.PLAIN, 20));
		//blazerb.setCursor(new Cursor(Cursor.HAND_CURSOR));
		vestl.setOpaque(false);
		frame.add(vestl);

		punjabi = new JButton(new ImageIcon("image/punjabi.png"));
		punjabi.setBounds(585, 140, 180, 200);
		punjabi.setBackground(c1);
		// punjabi.addMouseListener(this);
		punjabi.setBorder(null);
		punjabi.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.add(punjabi);

		JLabel punjabiL = new JLabel("P U N J A B I");
		punjabiL.setBounds(625, 350, 200, 30);
		punjabiL.setForeground(new Color(60, 80, 110));
		punjabiL.setFont(new Font("Garamond", Font.PLAIN, 20));
		punjabiL.setOpaque(false);
		frame.add(punjabiL);

		dresspant = new JButton(new ImageIcon("image/dresspant.png"));
		dresspant.setBounds(840, 140, 175, 215);
		dresspant.setBackground(c1);
		// dresspant.addMouseListener(this);
		dresspant.setBorder(null);
		dresspant.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.add(dresspant);

		dresspant1 = new JLabel("D R E S S  P A N T");
		dresspant1.setBounds(855, 350, 200, 30);
		dresspant1.setForeground(new Color(60, 80, 110));
		dresspant1.setFont(new Font("Garamond", Font.PLAIN, 20));
		dresspant1.setOpaque(false);
		frame.add(dresspant1);

		sherwani = new JButton(new ImageIcon("image/sherwani.png"));
		sherwani.setBounds(220, 390, 200, 220);
		sherwani.setBackground(c1);
		// sherwani.addMouseListener(this);
		sherwani.setBorder(null);
		sherwani.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.add(sherwani);

		sherwanil = new JLabel("S H E R W A N I");
		sherwanil.setBounds(255, 610, 250, 30);
		sherwanil.setForeground(new Color(60, 80, 110));
		sherwanil.setFont(new Font("Garamond", Font.PLAIN, 20));
		sherwanil.setOpaque(false);
		frame.add(sherwanil);

		shirt = new JButton(new ImageIcon("image/shirt.png"));
		shirt.setBounds(480, 400, 200, 200);
		shirt.setBackground(c1);
		// shirt.addMouseListener(this);
		shirt.setBorder(null);
		shirt.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.add(shirt);

		shirtl = new JLabel("D R E S S  S H I R T");
		shirtl.setBounds(495, 610, 250, 30);
		shirtl.setForeground(new Color(60, 80, 110));
		shirtl.setFont(new Font("Garamond", Font.PLAIN, 20));
		shirtl.setOpaque(false);
		frame.add(shirtl);

		tie = new JButton(new ImageIcon("image/tie.png"));
		tie.setBounds(740, 390, 175, 220);
		tie.setBackground(c1);
		tie.setCursor(new Cursor(Cursor.HAND_CURSOR));
		// tie.addMouseListener(this);
		tie.setBorder(null);
		frame.add(tie);

		tiel = new JLabel("T I E");
		tiel.setBounds(805, 610, 120, 30);
		tiel.setForeground(new Color(60, 80, 110));
		tiel.setFont(new Font("Garamond", Font.PLAIN, 20));
		tiel.setOpaque(false);
		frame.add(tiel);

		frame.add(panel);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false);

		blazerb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (ae.getSource() == blazerb) {
					new blazerb();
					frame.setVisible(false);
				}
			}
		});

		tie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (ae.getSource() == tie) {
					new tie();
					frame.setVisible(false);
				}
			}
		});

		shirt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (ae.getSource() == shirt) {
					new shirt();
					frame.setVisible(false);
				}
			}
		});

		sherwani.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (ae.getSource() == sherwani) {
					new sherwani();
					frame.setVisible(false);
				}
			}
		});

		dresspant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (ae.getSource() == dresspant) {
					new dresspant();
					frame.setVisible(false);
				}
			}
		});

		vest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (ae.getSource() == vest) {
					new vest();
					frame.setVisible(false);
				}
			}
		});

		punjabi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (ae.getSource() == punjabi) {
					new punjabi();
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
		new gentsFormal();
	}

}