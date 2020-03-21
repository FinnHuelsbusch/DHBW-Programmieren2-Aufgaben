package collectionFramework;

import java.util.Comparator;

public class ComperatorKunde implements Comparator<Kunde> {

    @Override
    public int compare(Kunde o1, Kunde o2) {
        if (!o1.getName().equals(o2.getName())) {
            return o1.getName().compareTo(o2.getName());
        } else if (!o1.getVorname().equals(o2.getVorname())) {
            return o1.getVorname().compareTo(o2.getVorname());
        }
        return 0;
    }
}
