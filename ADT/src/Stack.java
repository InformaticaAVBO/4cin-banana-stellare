public class Stack {
    private Persona[] stack;
    private int top;

    public Stack(int dim) {
        stack = new Persona[dim];
        top = 0;
    }

    public void push(Persona p) {
        if (top < stack.length) {
            stack[top++] = p;
        } else {
            System.out.println("Stack overflow");
        }
    }

    public Persona pop() {
        if (top > 0) {
            return stack[--top];
        } else {
            System.out.println("Stack underflow");
            return null;
        }
    }

    public void aumentaDimensione(int nuovodim) {
        Persona[] nuovoStack = new Persona[stack.length + nuovodim];
        for (int i = 0; i < top; i++) {
            nuovoStack[i] = stack[i];
        }
        stack = nuovoStack;
    }
}           