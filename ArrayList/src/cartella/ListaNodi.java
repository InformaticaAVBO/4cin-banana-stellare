package cartella;

public class ListaNodi {
    private Nodo root;

    public ListaNodi() {
        this.root = null;
        root.setPosizione(0);
    }

    public void addHead(Nodo n) {
        if (root == null) {
            root = n;
            return;
        }
        n.setNext(root);
        root.setPrevious(n);
        root.setPosizione(1);
        root = n;
        root.setPrevious(n);
        root.setPosizione(0);
    }

    public void addTail(Nodo n) {
        int i = 0;
        if (root == null) {
            root = n;
            return;
        }
        Nodo temp = root;
        while (temp.getNext() != null) {
            i++;
            temp.setPosizione(i);
            Nodo pre = temp;
            temp = temp.getNext();
            temp.setPrevious(pre);
        }
        temp.setNext(n);
        n.setPrevious(temp);
        n.setPosizione(i + 1);
    }

    public void remove(int eliminato) {
        Nodo temp = root;
        while (temp.getPosizione()!= eliminato) {
            temp = temp.getNext();

        }
        temp.getPrevious().setNext(temp.getNext());
        temp=null;
    }

    public String toString() {
        String s = "La lista contiene: \n";
        Nodo temp = root;
        while (temp != null) {
            s += temp.getNome() + "\n";
            temp = temp.getNext();
        }
        return s;
    }
}
