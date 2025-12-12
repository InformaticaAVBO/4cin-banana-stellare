public class Main{
    public static void main(String[] args) {
        /*
        
        Lista l1= new Lista();
        l1.add("Mario");
        l1.add("Mimmo");
        l1.add("Martino");
        l1.remove("Mimmo");
        l1.printa();
        l1.add("Mimmo");
        l1.remove(1);
        l1.printa();
        */
        ListaNodi l1= new ListaNodi();
        l1.add(new Nodo("Mario"));
        l1.add(new Nodo("Mimmo"));
        l1.add(new Nodo("Martino"));
        System.out.println(l1.toString());
    }
}