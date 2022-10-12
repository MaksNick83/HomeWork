package eu.hillel.hw14.list.services;

import eu.hillel.hw14.list.data.Node;

import java.util.Iterator;

public class LinkedListIterator<T> implements Iterator<T> {
    private Node<T> current;

    public LinkedListIterator(LinkedList<T> list) {
        this.current = list.getHead();
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        return current.getNext().getValue();
    }
}
