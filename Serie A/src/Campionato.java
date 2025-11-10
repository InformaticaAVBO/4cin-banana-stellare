
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Campionato {

    int DIM = 20;
    Squadra[] classifica;
    String[] elenco = { "Atalanta", "Bologna", "Cagliari", "Como", "Cremonese", "Fiorentina", "Genoa", "Inter",
            "Juventus", "Lazio", "Lecce", "Milan","Napoli", "Parma", "Pisa", "Roma", "Sassuolo", "Torino", "Udinese", "Verona" };

    public Campionato() throws FileNotFoundException {
        classifica = new Squadra[DIM];
        this.classifica = classifica;
        File f = new File("data/Classifica.csv");
        Scanner leggi = new Scanner(f);

        for (int i = 0; leggi.hasNextLine(); i++) {
            String s = leggi.nextLine();
            String[] ss = s.split(",");
            classifica[i] = new Squadra(Integer.parseInt(ss[0]),
                    ss[1],
                    Integer.parseInt(ss[2]),
                    Integer.parseInt(ss[3]),
                    Integer.parseInt(ss[4]),
                    Integer.parseInt(ss[5]),
                    Integer.parseInt(ss[6]),
                    Integer.parseInt(ss[7]),
                    Integer.parseInt(ss[8]),
                    Integer.parseInt(ss[9]));
        }

        leggi.close();
    }

    // public void riempi
    public void stampaCampionato() {
        for (int i = 0; i < 20; i++) {
            if (classifica[i] != null) {
                System.out.println(classifica[i].getPosizione() + " " + classifica[i].getNome());
            }
        }
    }

    public void cercaSquadra() {
        System.out.println("Elenco delle squadre in Serie A");
        for (int i = 0; i < elenco.length; i++) {
            System.out.println((i + 1) + "-" + elenco[i]);
        }
        System.out.println("\n Di che squadra vuoi sapere le informazioni?");
        Scanner input = new Scanner(System.in);
        int nSquadra = input.nextInt();
        boolean valoreGiusto = false;
        if (nSquadra > 0) {
            if (nSquadra <= 20) {
                valoreGiusto = true;
            }
        }

        while (valoreGiusto == false) {
            System.out.println("\n Di che squadra vuoi sapere le informazioni?");
            nSquadra = input.nextInt();
            if (nSquadra > 0) {
                if (nSquadra <= 20) {
                    valoreGiusto = true;
                }
            }
        }
        for (int i = 0; i < classifica.length; i++) {
            // evita NullPointerException se classifica[i] è null
            if (classifica[i] != null && elenco[nSquadra - 1].equalsIgnoreCase(classifica[i].getNome())) {
                System.out.println(classifica[i]);
            }
        }
        
    }

    public void calcolaPunti() {
        for (int i = 0; i < DIM; i++) {
            if (classifica[i] != null) {
                int punti = (classifica[i].getVinte() * 3) + classifica[i].getPareggiate();
                classifica[i].setPunti(punti);
            }
        }
    }

    public void ordinaSquadre(){
        Squadra[] v1= new Squadra[classifica.length];
        int contatore=0;
        int migliori=0;
        while(v1[classifica.length-1]==null){
            Squadra s1= classifica[contatore];
            for (int i = 0; i < classifica.length; i++) {
                if(classifica[i]!=null){
                       if(s1.getPunti()<classifica[i].getPunti()){
                        s1=classifica[i];
                        migliori=i;
                        } 

                }
            }
            v1[contatore]=s1;
            classifica[migliori]=null;
            contatore++;
        }
        classifica=v1;
        
    }
}
// s.split(",")
