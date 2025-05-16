package Classes;

import Interface.*;
import java.io.*;
import java.lang.*;
import java.nio.file.*;

import javax.swing.JOptionPane;

public class FileRead implements LoginOP{

    String s1;
    String s2;
    int flag =0;

    // FileRead(String s1,String s2){
    //     this.s1 = s1;
    //     this.s2 = s2;
    // }
    
    BufferedReader buffreader;
    public void matchUser(String s1,String s2){
        try{
        String username = "User Name : "+s1;
        String Password = "Password : "+s2;

        buffreader = new BufferedReader(new FileReader(".\\Data\\User.txt"));
        int totalline = 0;
        while(buffreader.readLine() != null){
            totalline++;
        }
            
        buffreader.close();

        for(int i=0; i<totalline; i++){
            String line = Files.readAllLines(Paths.get(".\\Data\\User.txt")).get(i);
            if(line.equals(username)){
                String line2 = Files.readAllLines(Paths.get(".\\Data\\User.txt")).get(i+1);
                if(line2.equals(Password)){
                    //new emni();
                    Interface k=new Interface();
		            k.setVisible(true);
                    flag = 2;
                    break;
                }
            }
             

         }
    }

        catch(IOException e){
            e.printStackTrace();
        }
    }


    public void matchAdmin(String s1,String s2){
        try{
        String username = "User Name : "+s1;
        String Password = "Password : "+s2;

        buffreader = new BufferedReader(new FileReader(".\\Data\\Admin.txt"));
        int totalline = 0;
        while(buffreader.readLine() != null){
            totalline++;
        }
            
        buffreader.close();

        for(int i=0; i<totalline; i++){
            String line = Files.readAllLines(Paths.get(".\\Data\\Admin.txt")).get(i);
            if(line.equals(username)){
                String line2 = Files.readAllLines(Paths.get(".\\Data\\Admin.txt")).get(i+1);
                if(line2.equals(Password)){
                    new Adminpanel();
                    flag = 2;
                    break;
                }
            }
             

         }
    }

    catch(IOException e){
        e.printStackTrace();
     }
    }
    
}