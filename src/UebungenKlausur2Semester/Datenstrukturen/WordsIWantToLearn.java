package UebungenKlausur2Semester.Datenstrukturen;

public class WordsIWantToLearn {

    Element peektElement = null;

    public void push(String data) {
        if (peektElement == null) {
            peektElement = new Element(data, null);
        } else {
            peektElement = new Element(data, peektElement);
        }
    }

    public String pop() {
        if (peektElement == null) {
            return null;
        } else {
            Element workingElement = peektElement;
            peektElement = workingElement.prevElement;
            return workingElement.getData();
        }
    }

    public String peek() {
        return peektElement.getData();
    }

    private class Element {
        private String data;
        private Element prevElement;

        public Element(String data, Element prevElement) {
            this.data = data;
            this.prevElement = prevElement;
        }

        public String getData() {
            return data;
        }

        public Element getPrevElement() {
            return prevElement;
        }
    }
}
