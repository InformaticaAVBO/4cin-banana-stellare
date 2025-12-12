import java.util.ArrayList;
public class Lista {

    private ArrayList<String> lista = new ArrayList<>();

    public Lista() {
        
    }

    public void printa(){
        for(String x : lista)
        System.out.println(x);
    }

    public void add(String nome){
        lista.add(nome);
    }

    public void remove(String nome){
        for(String x : lista){
            if(x==nome) lista.remove(x);
        }
    }

    public void remove(int persona){
        lista.remove(persona);
    }
    

}