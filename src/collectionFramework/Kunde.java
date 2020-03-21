package collectionFramework;

import java.util.Objects;

public class Kunde implements Comparable {

    private String name, vorname;
    private int kundenNummer;

    public Kunde(String name, String vorname, int kundenNummer) {
        this.name = name;
        this.vorname = vorname;
        this.kundenNummer = kundenNummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public int getKundenNummer() {
        return kundenNummer;
    }

    public void setKundenNummer(int kundenNummer) {
        this.kundenNummer = kundenNummer;
    }

    @Override
    public int compareTo(Object o) {

        return this.kundenNummer - ((Kunde) o).getKundenNummer();
    }

    public String toString() {
        return (name + " "+ vorname + " "+ kundenNummer);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Kunde kunde = (Kunde) o;

        if (kundenNummer != kunde.kundenNummer) return false;
        if (!name.equals(kunde.name)) return false;
        return vorname.equals(kunde.vorname);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + vorname.hashCode();
        result = 31 * result + kundenNummer;
        return result;
    }
}
