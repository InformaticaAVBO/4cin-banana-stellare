
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SerieA {

    
    public static void main(String[] args) throws FileNotFoundException {
        
        //String[][] r1 = null;
        Campionato seriea= new Campionato();
        Scanner input=new Scanner(System.in);
        seriea.stampaCampionato();
        
        String[] elenco= {"Atalanta","Bologna","Cagliari","Como","Cremonese","Fiorentina","Genoa","Inter","Juventus","Lazio","Lecce","Milan","Parma","Pisa","Roma","Sassuolo","Torino","Udinese","Verona"};
        seriea.cercaSquadra();
        /*
        do{
            System.out.println("Quale comando vuoi esplorare?");
            System.out.println(elenco);
            int scelta=input.nextInt();
            switch(scelta){

            }
        }
            */
        
    }
    
}