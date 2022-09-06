package eu.hillel.hw12.list.services;

import eu.hillel.hw12.list.data.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    LinkedList<Integer> listFromArray = new LinkedList<>(new Integer[]{0, 3, 7, 4, 9});

    @Test
    void addFirstTest() {
        listFromArray.addFirst(12);
        Node<Integer> nodeFirst = listFromArray.findNodeByIndex(0);
        Assertions.assertEquals(12, nodeFirst.getValue());
    }

    @Test
    void addLastTest() {
        listFromArray.addLast(14);
        Node<Integer> nodeLast = listFromArray.findNodeByIndex(listFromArray.getSize() - 1);
        Assertions.assertEquals(14, nodeLast.getValue());
    }


    @Test
    void deleteFirstTest() {
        listFromArray.deleteFirst();
        Node<Integer> nodeFirst = listFromArray.findNodeByIndex(0);
        Assertions.assertEquals(3, nodeFirst.getValue());
    }

    @Test
    void deleteLastTest() {
        listFromArray.deleteLast();
        Node<Integer> nodeLast = listFromArray.findNodeByIndex(listFromArray.getSize() - 1);
        Assertions.assertEquals(4, nodeLast.getValue());
    }


    @Test
    void moveTest() {
        int index1 = 1;
        int index2 = 3;
        Node<Integer> nodeByIndex1Before = listFromArray.findNodeByIndex(index1);
        Node<Integer> nodeByIndex2Before = listFromArray.findNodeByIndex(index2);
        listFromArray.move(1, 3);
        Node<Integer> nodeByIndex1After = listFromArray.findNodeByIndex(index1);
        Node<Integer> nodeByIndex2After = listFromArray.findNodeByIndex(index2);
        Assertions.assertEquals(nodeByIndex2After.getValue(), nodeByIndex1Before.getValue());
        Assertions.assertEquals(nodeByIndex1After.getValue(), nodeByIndex2Before.getValue());

    }


}