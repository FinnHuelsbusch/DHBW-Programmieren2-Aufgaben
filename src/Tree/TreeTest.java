package Tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TreeTest {

    Tree<Integer> testTree = null;
    String test;

    @BeforeEach
    void setup(){
        testTree = new Tree<Integer>();
    }

    @Test
    void addAndContains() {
        testTree.add(5);
        testTree.add(2);
        testTree.add(7);
        testTree.printLeafNodes(testTree.getRoot());
        Assertions.assertTrue(testTree.contains(2));
    }



    @Test
    void containsNotExistingElement(){
        testTree.add(1);
        testTree.add(2);
        testTree.add(3);
        testTree.balance();
        Assertions.assertFalse(testTree.contains(5));
    }

    @Test
    void containsOnEmptyTree(){
        Assertions.assertFalse(testTree.contains(5));
    }

    @Test
    void find() {
        int testint = 2;

        testTree.add(1);
        testTree.add(testint);
        testTree.add(3);

        Assertions.assertEquals(testint, testTree.find(testint));
    }

    @Test
    void size() {
        testTree.add(1);
        testTree.add(2);
        testTree.add(3);
        Assertions.assertEquals(3, testTree.size());
    }
}