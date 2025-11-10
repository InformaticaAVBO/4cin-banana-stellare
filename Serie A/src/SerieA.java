
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SerieA {

    
    public static void main(String[] args) throws FileNotFoundException {
        
        //String[][] r1 = null;
        Campionato seriea= new Campionato();
        Scanner input=new Scanner(System.in);

        String[] comandi= {"0- fine","1-Stampa campionato","2-Calcola punti","3-Ordina calssifica","4-CercaSquadra"};
        boolean fine=false;
        
        while(!fine){
            for (int i = 0; i < comandi.length; i++) {
               System.out.println(comandi[i]); 
            }
            System.out.println("Quale comando vuoi esplorare?");
            
            int scelta=input.nextInt();
            switch(scelta){
                case 0:
                    fine=true;
                    break;
                case 1:
                    seriea.stampaCampionato();
                    break;
                case 2:
                    seriea.calcolaPunti();
                    break;
                case 3:
                    seriea.ordinaSquadre();
                    break;
                case 4:
                    seriea.cercaSquadra();
                    break;
                default:
                    System.out.println("Il comando non esiste");
                    break;
            }
        }
            
        
    }
    
}