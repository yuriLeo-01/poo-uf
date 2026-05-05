package Polymorphism.Questao03;

import java.util.LinkedList;

public class Pilha<X> {
    private LinkedList<X> elementos = new LinkedList<>();
    private static final int tamanhoMax = 10;

    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    public boolean isFull() {
        return elementos.size() == tamanhoMax;
    }

    public X pop() {
        if (!isEmpty()) {
            return elementos.removeLast();
        } else {
            System.out.println("A pilha está vazia.");
            return null;
        }
    }

    public void push(X elemento) {
        if (!isFull()) {
            elementos.addLast(elemento);
        } else {
            System.out.println("A pilha está cheia!");
        }
    }

}
