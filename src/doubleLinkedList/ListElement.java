package doubleLinkedList;

public class ListElement {
    public ListElement next, before;
    public String text;

    public ListElement(String text) {
        this.text = text;
        this.next = null;
        this.before = null;
    }

    public ListElement(String text, ListElement next, ListElement before ) {
        this(text);
        this.next = next;
        this.before = before;
    }



    public boolean hasNext() {
        return next != null;
    }
}
