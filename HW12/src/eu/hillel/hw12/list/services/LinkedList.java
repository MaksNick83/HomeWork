package eu.hillel.hw12.list.services;

import eu.hillel.hw12.list.data.Node;

public class LinkedList<T> {
    private Node<T> head;
    private int size = 0;

    public LinkedList() {

    }

    public LinkedList(T[] nums) {
        int i = 0;
        for (T num : nums) {
            addByIndex(i, num);
            i++;
        }
    }

    public void addFirst(T num) {
        addByIndex(0, num);
    }

    public void addLast(T num) {
        addByIndex(size, num);
    }

    public void addByIndex(int index, T num) {
        int i = 1;
        Node<T> pointerToNode = head;
        Node<T> newNode = new Node<>(num);
        if (index == 0) {
            head = newNode;
            head.setNext(pointerToNode);
            size++;
        } else if (index > 0 && index <= size) {
            while (i != index) {
                pointerToNode = pointerToNode.getNext();
                i++;
            }
            newNode.setNext(pointerToNode.getNext());
            pointerToNode.setNext(newNode);
            size++;
        }
    }

    public void deleteFirst() {
        deleteByIndex(0);
    }

    public void deleteLast() {
        deleteByIndex(size - 1);
    }

    public void deleteByIndex(int index) {
        checkIndex(index);
        Node<T> temp = findNodeByIndex(index == 0 ? 0 : index - 1);
        if (index == 0) {
            head = temp.getNext();
            size--;
            return;
        }
        temp.setNext(temp.getNext().getNext());
        size--;
    }

    public void move(int index1, int index2) {
        if (index1 == index2) {
            return;
        }
        checkIndex(index1);
        checkIndex(index2);
        Node<T> nodeTo = findNodeByIndex(index1);
        Node<T> nodeFor = findNodeByIndex(index2);
        Node<T> nodeToBefore = findNodeByIndex(index1 == 0 ? 0 : index1 - 1);
        Node<T> nodeForBefore = findNodeByIndex(index2 == 0 ? 0 : index2 - 1);
        if (index1 == 0) {
            head = nodeFor;
        } else {
            nodeToBefore.setNext(nodeFor);
        }
        if (index2 == 0) {
            head = nodeTo;
        } else {
            nodeForBefore.setNext(nodeTo);
        }
        Node<T> temp = nodeTo.getNext();
        nodeTo.setNext(nodeFor.getNext());
        nodeFor.setNext(temp);
    }

    private void checkIndex(int index) throws IndexOutOfBoundsException {
        if ((index < 0) || (index >= size)) {
            throw new IndexOutOfBoundsException("Index " + index + " is out size list. Interval index [0," + (size - 1) + "]");
        }
    }

    public Node<T> findNodeByIndex(int index) {
        Node pointerToNode = head;
        if (index != 0) {
            int i = 0;
            while (i != index) {
                pointerToNode = pointerToNode.getNext();
                i++;
            }
        }
        return pointerToNode;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node<T> pointerToNode = head;
        while (pointerToNode != null) {
            builder.append(pointerToNode.getValue()+" ");
            pointerToNode = pointerToNode.getNext();
        }
        return "LinkedList{" + builder.toString() + '}';
    }

    public int getSize() {
        return size;
    }
}
