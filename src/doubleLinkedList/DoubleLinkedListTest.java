package doubleLinkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleLinkedListTest {

    DoubleLinkedList<String> list;
    @BeforeEach
    void setUp() {
         list = new DoubleLinkedList<>();
    }

    @Test
    void addAndContains() {
        list.add("Hui");
        assertEquals(true, list.contains("Hui"));   // ist ausreichend
        assertEquals("Hui", list.toString());       // nicht falsch sondern extra
    }

    @Test
    void addFirst() {
        list.add("Hui");
        list.addFirst("Hui2");
        assertEquals("Hui2, Hui", list.toString());
    }

    @Test
    void addRemoveObejectNotInList() {
        list.add("Hui");
        assertEquals(false,list.remove("Hallo"));
    }
    @Test
    void addRemoveAdd() {
        list.add("Hui");
        list.remove("Hui");
        list.add("Hallo");
        assertEquals("Hallo",list.toString());
    }


    @Test
    void removeNotExistingElement() {
        assertEquals(false,list.remove("Hui"));
    }

    @Test
    void containsEmpty() {
        assertEquals(false,list.contains("test"));
    }

    @Test
    void testToString() {
        list.add("Hui1");
        list.add("Hui2");
        list.add("Hui3");
        list.add("Hui4");
        assertEquals("Hui1, Hui2, Hui3, Hui4", list.toString());
    }
}