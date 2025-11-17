public class Main {

    public static void main(String[] args) throws Exception {

        Coppia<String, Persona> c = new Coppia<>("prof", new Persona("Mario", "Rossi"));
        Coppia<String, Persona> q = new Coppia<>("prof2", new Persona("Luigi", "Rossi"));
        System.out.println(c);
        System.out.println(q);
        System.out.println(c.getPrimo());
        System.out.println(c.getSecondo());
        System.out.println(q.getPrimo());
        System.out.println(q.getSecondo());
/*
        Vettore<String> x = new Vettore<>(0, 0);
        for (int i=0; i<23; i++)
            x.add("Juve_" + i);
        System.out.println(x);
        
        System.out.println(x.get(3));
        System.out.println(x.get(3).getClass());

        Vettore<Persona> elenco = new Vettore<Persona>(10, 5);
        */
    }

}