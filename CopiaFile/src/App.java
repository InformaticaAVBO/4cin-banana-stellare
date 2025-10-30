import java.io.File;
import java.io.FileWriter;   
import java.util.Scanner;    

public class App {
    public static void main(String[] args) throws Exception {
        String file;
        String file2;
        Scanner input = new Scanner(System.in);

        System.out.println("Inserire il nome del file da creare:");
        file=input.nextLine();
        FileWriter n1 = new FileWriter(file);

        System.out.println("Inserire il nome del secondo file da creare:");
        file2=input.nextLine();
        FileWriter n2 = new FileWriter(file2);

        for(int i=0; i<10; i++) n1.write("Testo numero "+(i+1)+"\n");
        System.out.println("Fatto");
        n1.close();

        File fail = new File(file);

        Scanner leggi = new Scanner(fail);    

        while(leggi.hasNextLine()) {

            String s = leggi.nextLine();
            n2.write(s + "\n");
            System.out.println(s);
            
            
        }
        
        n2.close();
        leggi.close();
    }
}