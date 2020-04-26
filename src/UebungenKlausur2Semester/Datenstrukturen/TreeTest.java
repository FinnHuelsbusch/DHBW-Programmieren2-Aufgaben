package UebungenKlausur2Semester.Datenstrukturen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TreeTest {

    Tree tree;
    @BeforeEach
    void setUp() {
        tree = new Tree();
    }

    @Test
    void testToString() {

        tree.insert(1);
        tree.insert(19);
        tree.insert(8);
        tree.insert(5);
        System.out.println(tree.toString());

    }
}