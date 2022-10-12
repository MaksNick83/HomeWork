package eu.hillel.hw14.list;

import eu.hillel.hw14.list.services.LinkedList;

public class Runner {
    public static void main(String[] args) {
        LinkedList<Integer> newListEmpty = new LinkedList<>();
        Integer[] nodeValue = new Integer[]{0, 3, 7, 4, 9};
        LinkedList<Integer> listFromArray = new LinkedList<>(nodeValue);
        listFromArray.addFirst(-1);
        listFromArray.addLast(10);
        listFromArray.addByIndex(0, 6);
        newListEmpty.addFirst(1);
        newListEmpty.addLast(2);
        newListEmpty.addByIndex(2, 3);
        newListEmpty.addLast(4);
        newListEmpty.addLast(5);
        newListEmpty.addLast(6);
        newListEmpty.addLast(7);
        newListEmpty.addLast(8);
        System.out.println(listFromArray);
        System.out.println(newListEmpty);
        try {
            newListEmpty.move(0, 8);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println(newListEmpty);
        System.out.println("Size: " + newListEmpty.getSize());
        newListEmpty.deleteFirst();
        newListEmpty.deleteLast();
        newListEmpty.deleteByIndex(3);
        System.out.println(newListEmpty);
        System.out.println("Size: " + newListEmpty.getSize());
        System.out.println("Empty: " + newListEmpty.isEmpty());

    }
}
