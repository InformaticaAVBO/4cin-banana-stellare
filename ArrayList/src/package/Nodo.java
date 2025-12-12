public class Nodo {
    private String nome;
    Nodo next;

    public Nodo(String nome) {
        this.nome = nome;
        this.next = null;
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
    
    public void setNome(String nome) {
        this.nome = nome;
    }

}