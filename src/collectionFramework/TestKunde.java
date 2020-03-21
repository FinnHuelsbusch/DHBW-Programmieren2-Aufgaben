package collectionFramework;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.Vector;

public class TestKunde {

    public static void main(String[] args) {
        new TestKunde();
    }

    public TestKunde() {
        Kunde kunde1 = new Kunde("Mustermann", "Klaus", 4711);
        Kunde kunde2 = new Kunde("Beispiel", "Hans", 5180);
        Kunde kunde3 = new Kunde("Mustermann", "Hilde", 4712);
        Kunde kunde4 = new Kunde("Vorbild", "Theodor", 8278);
        Kunde kunde5 = new Kunde("Dummy", "Jimmy", 1111);

        TreeSet<Kunde> treeSet = new TreeSet();
        treeSet.add(kunde1);
        treeSet.add(kunde2);
        treeSet.add(kunde3);
        treeSet.add(kunde4);
        treeSet.add(kunde5);

        Iterator<Kunde> iteratorTreeSet = treeSet.iterator();
        while (iteratorTreeSet.hasNext()) {
            System.out.println(iteratorTreeSet.next().toString());
        }


        System.out.println("Vector\n" +
                "--------------------------------------------------------------------");

        Vector<Kunde> vector = new Vector<>();
        vector.addAll(treeSet);

        vector.sort(new ComperatorKunde());


        Iterator<Kunde> iteratorVector = vector.iterator();
        while (iteratorVector.hasNext()) {
            System.out.println(iteratorVector.next().toString());
        }
        System.out.println("Vergleich\n" +
                "--------------------------------------------------------------------");
        Kunde kunde1Identical = new Kunde("Mustermann", "Klaus", 4711);
        System.out.println("Sind sie gleich ?" + kunde1.equals(kunde1Identical));


    }


}
