package swing.Uebung1;



import java.util.Iterator;
import java.util.TreeSet;

public class Listenoperationen {
    private static TreeSet<Einwohner> liste = new TreeSet<>();

    private static Einwohner ermittleObjekt(String name, String vorname) {
        Einwohner dummy = new Einwohner(name, vorname, null, null, null, null);
        if (liste.contains(dummy)) {
            Iterator<Einwohner> iterator = liste.iterator();
            while (iterator.hasNext()) {
                Einwohner current = iterator.next();
                if (dummy.compareTo(current) == 0 ) {
                    return current;
                }
            }
        }
        return null;
    }

    public static boolean hinzufuegen(String anrede, String name, String vorname,String gebName, String eMail,String familienstand) {
        return liste.add(new Einwohner(name, vorname, gebName, eMail, anrede, familienstand));
    }

    public static boolean anzeigen(String name, String vorname) {
        Einwohner current = ermittleObjekt(name, vorname);
        if (current != null) {
            System.out.println(current.toString());
            return true;
        }
        return false;
    }

    public static boolean suchen(String name, String vorname) {
        if (ermittleObjekt(name, vorname) != null) {
            return true;
        }
        return false;
    }

    public static boolean loeschen(String name, String vorname) {
        Einwohner dummy = new Einwohner(name, vorname, null, null, null, null);
        if (liste.contains(dummy)) {
            Iterator<Einwohner> iterator = liste.iterator();
            while (iterator.hasNext()) {
                Einwohner current = iterator.next();
                if (dummy.compareTo(current) == 0) {
                    liste.remove(current);
                    return true;
                }
            }
        }
        return false;
    }

    public static void listeAusgeben() {
            Iterator<Einwohner> iterator = liste.iterator();
            while (iterator.hasNext()) {
                System.out.println( iterator.next().toString());
            }
    }

}
