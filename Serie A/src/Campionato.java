
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Campionato {

    int DIM = 20;
    Squadra[] classifica;

    public Campionato() throws FileNotFoundException {
        classifica = new Squadra[DIM];
        this.classifica = classifica;
        File f = new File("data/Classifica.csv");
        Scanner leggi = new Scanner(f);

        for (int i = 0; leggi.hasNextLine(); i++) {
            String s = leggi.nextLine();
            String[] ss = s.split(",");
            classifica[i] = new Squadra(Integer.parseInt(ss[0]), ss[1], Integer.parseInt(ss[2]), Integer.parseInt(ss[3]), Integer.parseInt(ss[4]), Integer.parseInt(ss[5]), Integer.parseInt(ss[6]), Integer.parseInt(ss[7]), Integer.parseInt(ss[8]), Integer.parseInt(ss[9]));
        }

        leggi.close();
    }

    //public void riempi
    public void stampaCampionato() {
        for (int i = 0; i < 20; i++) {
            System.out.println(classifica[i].getPosizione() + " " + classifica[i].getNome());
        }
    }

    public void cercaSquadra() {
        System.out.println("Elenco delle squadre in Serie A");
        for (int i = 0; i < DIM; i++) {
            System.out.println((i + 1) + "-" + classifica[i].getNome());
        }
            System.out.println("\n Di che squadra vuoi sapere le informazioni?");
            Scanner input = new Scanner(System.in);
            int nSquadra = input.nextInt();
            boolean valoreGiusto = false;
            if (nSquadra > 0) {
                if (nSquadra < 20) {
                    valoreGiusto = true;
                }
            }

            while (valoreGiusto == false) {
                System.out.println("\n Di che squadra vuoi sapere le informazioni?");
                nSquadra = input.nextInt();
                if (nSquadra > 0) {
                    if (nSquadra < 20) {
                        valoreGiusto = true;
                    }
                }
            }
            System.out.println(classifica[nSquadra-1]);
    }

    public void ricalcola(){
        for (int i = 0; i < DIM; i++) {
            int punti= (classifica[i].getVinte()*3)+ classifica[i].getPareggiate();
            classifica[i].setPunti(punti);
        }
    }
}
//s.split(",")
  
