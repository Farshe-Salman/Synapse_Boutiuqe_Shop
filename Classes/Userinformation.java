package Classes;
import java.lang.*;
import java.util.Random;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.nio.file.*;

public class Userinformation extends JFrame {
    JFrame frame;
    JPanel panel;
    ImageIcon icon;
    JLabel label1,label2,label3,label4,label5,label6,label7,labelx;
    JRadioButton rbutton1,rbutton2,rbutton3;
    JButton jbutton1,jbutton2,jbutton3,jbutton4;
    JScrollPane scroll;
    JTable table;
    DefaultTableModel modeltable;
    
    String[] column = {"User Name","Password","Email","Security Question","Sequrity Answer","Date And time"};
    String[] row = new String[9];

    public Userinformation(){
        super("User Information");
        frame = new JFrame();
        frame.setSize(1200,700);
        
        icon = new ImageIcon("images/mainlogo.png"); //Console Icon
        frame.setIconImage(icon.getImage());
        
        label1 = new JLabel(); //Background Image
        label1.setIcon(new ImageIcon("images/AdminBlur.png"));
        Dimension size = label1.getPreferredSize();
        label1.setBounds(0,0,size.width,size.height);
        label1.setOpaque(true);


        labelx = new JLabel(); //Background Image
        labelx.setIcon(new ImageIcon("images/tableback.jpg"));
        Dimension size2 = labelx.getPreferredSize();
        labelx.setBounds(120,85,size2.width,size2.height);
        labelx.setOpaque(true);

        jbutton1 = new JButton(); //Back Icon
        jbutton1.setIcon(new ImageIcon("images/Back2.png"));
        jbutton1.setBounds(0,0,50,50);
        jbutton1.setBorder(null);
        jbutton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jbutton1.setContentAreaFilled(false);
        frame.add(jbutton1);

        label2 = new JLabel("All User Information");
        label2.setBounds(450, 90, 300, 40);
        label2.setForeground(Color.black);
        label2.setFont(new Font("Segoe UI", Font.BOLD, 30));
        frame.add(label2);

        label3 = new JLabel("____________________________________");
        label3.setBounds(450, 97, 300, 40);
        label3.setForeground(Color.black);
        label3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        frame.add(label3);

        table = new JTable();
        modeltable = new DefaultTableModel();
        modeltable.setColumnIdentifiers(column);

        table.setModel(modeltable);
        table.setSelectionBackground(new Color(186, 104, 200));
        table.setBackground(new Color(197, 202, 233));
        table.setRowHeight(30);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(120);
        table.getColumnModel().getColumn(1).setPreferredWidth(120);
        table.getColumnModel().getColumn(2).setPreferredWidth(250);
        table.getColumnModel().getColumn(3).setPreferredWidth(220);
        table.getColumnModel().getColumn(4).setPreferredWidth(220);
        table.getColumnModel().getColumn(5).setPreferredWidth(180);

        scroll = new JScrollPane(table);
        scroll.setBounds(120,145,950,350);
        scroll.setBackground(new Color(197, 202, 233));
        frame.add(scroll);

        try{
            BufferedReader buffreader  = new BufferedReader(new FileReader(".\\Data\\User.txt"));

            String line;

            while((line = buffreader.readLine()) != null){
                if(line.startsWith("User Name")){
                    row[0] = line.substring(12);
                }
                else if(line.startsWith("Password")){
                    row[1] = line.substring(11);
                }
                else if(line.startsWith("Email or Phone")){
                    row[2] = line.substring(16);
                }
                else if(line.startsWith("Security Question")){
                    row[3] = line.substring(21);
                }
                else if(line.startsWith("Security Answer")){
                    row[4] = line.substring(18);
                }
                else if(line.startsWith("Time And Date")){
                    row[5] = line.substring(16);
                    
                    modeltable.addRow(row);
                    row = new String[6];
                }
            }
            buffreader.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
        
        jbutton2 = new JButton(); //Delete Button
        jbutton2.setIcon(new ImageIcon("images/Deletuser2.png"));
        jbutton2.setBounds(565,500,80,80);
        jbutton2.setContentAreaFilled(false);
        jbutton2.setBorder(null);
        jbutton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        frame.add(jbutton2);


        frame.add(labelx);
        frame.add(label1);
        

        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);


        jbutton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                if(ae.getSource() == jbutton1){
                    new Adminpanel();
                    frame.setVisible(false);
                }
            }
        });

        jbutton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (table.getSelectionModel().isSelectionEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Select A User To Delete", "!Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    String userRemove = table.getModel().getValueAt(table.getSelectedRow(), 0).toString();
                    String file = ".\\Data\\User.txt";
                    String temp = ".\\Data\\temp.txt";
                    
                    int flag = 0;
        
                    try {
                        BufferedReader buffreader = new BufferedReader(new FileReader(file));
                        int totalLines = 0;
                        while (buffreader.readLine() != null)
                            totalLines++;
                        buffreader.close();
        
                        for (int i = 0; i < totalLines; i++) {
                            String line = Files.readAllLines(Paths.get(file)).get(i);
                            if (line.startsWith("User Name") && line.substring(12).equals(userRemove)) {
                                flag = i;
                                break;
                            }
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                        return;
                    }
        
                    try {
                        FileWriter filewriter = new FileWriter(temp, true);
                        BufferedWriter buffwriter = new BufferedWriter(filewriter);
                        PrintWriter printwriter = new PrintWriter(buffwriter);
        
                        FileReader filereder = new FileReader(file);
                        BufferedReader buffreder = new BufferedReader(filereder);
        
                        int totalLines = 0;
                        while (buffreder.readLine() != null)
                            totalLines++;
                        buffreder.close();
        
                        for (int j = 0; j < totalLines; j++) {
                            String line = Files.readAllLines(Paths.get(file)).get(j);
        
                            if (flag != 0 && (j >= flag && j <= (flag + 5))) {
                                printwriter.println("#Data Removed! " + line);
                            } else {
                                printwriter.println(line);
                            }
                        }
                        printwriter.flush();
                        printwriter.close();
                        filereder.close();
                        buffwriter.close();
                        filewriter.close();
        
                        Files.delete(Paths.get(file));
                        Files.move(Paths.get(temp), Paths.get(file));
        
                        modeltable.removeRow(table.getSelectedRow());
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
        
        
        
    }

    

    public static void main(String[] args) {
        new Userinformation();
    }
}