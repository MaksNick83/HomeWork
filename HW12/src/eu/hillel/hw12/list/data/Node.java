package eu.hillel.hw12.list.data;

public class Node<T> {
    public T getValue() {
        return value;
    }

    private T value;

    public Node<T> getNext() {
        return next;
    }

    private Node<T> next = null;

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node(T value) {
        this.value = value;
    }

    public Node() {
    }
}
