package cartella;

public class ListaNodi{
    private Nodo root;

    public ListaNodi(){
        this.root=null;
    }
    // aggiunge un nodo in fondo alla lista
    public void add(Nodo n){
        if(root==null){
            root=n;
            return;
        }
        Nodo temp=root;
        while(temp.getNext()!=null){
        temp=temp.getNext();
        }
        temp.setNext(n);   
    }

    public String toString(){
        String s="La lista contiene: \n";
        Nodo temp=root;
        while(temp!=null){
            s+=temp.getNome()+"\n";
            temp=temp.getNext();
        }
        return s;
    }
}
