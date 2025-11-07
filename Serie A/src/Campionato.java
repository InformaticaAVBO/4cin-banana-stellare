
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

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
            classifica[i] = new Squadra(ss[0], ss[1], ss[2], ss[3], ss[4], ss[5], ss[6], ss[7], ss[8], ss[9]);
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
    }

    //s.split(",")
