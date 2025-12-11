
public class Main{
    public static void main(String[] args) {

        Lista l1= new Lista();
        l1.add("Mario");
        l1.add("Mimmo");
        l1.add("Martino");
        l1.remove("Mimmo");
        l1.printa();
        l1.add("Mimmo");
        l1.remove(1);
        l1.printa();
    }
}