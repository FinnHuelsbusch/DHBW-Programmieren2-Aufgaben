package doubleLinkedList;

public class DoubleLinkedList {

    private ListElement firstElement;

    public static void main(String[] args) {
        new DoubleLinkedList();
    }

    public DoubleLinkedList() {
        firstElement = null;
    }

    public void appendElement(String text) {
        ListElement currentElement = firstElement;
        while (currentElement.hasNext()) {
            currentElement = currentElement.next;
        }
        currentElement.next = new ListElement(text, null, currentElement);
    }

    public void deleteElement(int index) {
        ListElement currentElement = firstElement;
        for ( int i = 1; currentElement.hasNext() && i != index; i++ ) {
            currentElement = currentElement.next;
        }
        currentElement.before.next = currentElement.next;
        currentElement.next.before = currentElement.before;
    }
}
