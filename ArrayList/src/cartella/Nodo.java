package cartella;
public class Nodo {
    private String nome;
    private Nodo next;
    private Nodo previous;
    private int posizione;
    public Nodo(String nome) {
        this.nome = nome;
        this.next = null;
        this.previous = null;
    }

    public String getNome() {
        return nome;
    }
    public Nodo getNext() {
        return next;
    }
    public void setNext(Nodo next) {
        this.next = next;
    }
    public Nodo getPrevious() {
        return previous;
    }
    public void setPrevious(Nodo previous) {
        this.previous = previous;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPosizione(int posizione) {
        this.posizione = posizione;
    }
    public int getPosizione() {
        return posizione;
    }

}