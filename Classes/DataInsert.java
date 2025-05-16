package Classes;
import Interface.*;
import java.lang.*;
import java.io.*;
import java.time.*;
import java.time.format.*;


public class DataInsert implements InsertOP{
    String s5;
    String s6;
    String s4;
    String s7;
    String s9;

    int x = 0;

    // DataInsert(String s5, String s6, String s4, String s7, String s9) {
    //     this.s5 = s5;
    //     this.s6 = s6;
    //     this.s4 = s4;
    //     this.s7 = s7;
    //     this.s9 = s9;

    // }

    File file;
    FileWriter filewriter;
    BufferedWriter buffwriter;
    PrintWriter printWriter;

    public void insert(String s5, String s6, String s4, String s7, String s9) {
        try{
            file = new File(".\\Data\\User.txt");

            if(!file.exists()){
                file.createNewFile();
            }
            filewriter = new FileWriter(file,true);
            buffwriter = new BufferedWriter(filewriter);
            printWriter = new PrintWriter(buffwriter);

            LocalDateTime dateoj = LocalDateTime.now();
            DateTimeFormatter formatoj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");

            String TD = dateoj.format(formatoj);

            printWriter.println("User Name : "+s5);
            printWriter.println("Password : "+s6);
            printWriter.println("Email or Phone : "+s4);
            printWriter.println("Security Question: "+s9);
            printWriter.println("Security Answer : "+s7);
            printWriter.println("Time And Date : "+TD);

            printWriter.println();
            printWriter.println("===============================================================");
            printWriter.println("===============================================================");
            printWriter.close();

        }

        catch(IOException e){
            e.printStackTrace();
        }
    }

    
}
