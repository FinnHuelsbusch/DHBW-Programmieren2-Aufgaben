package swing.Uebung1;

public class Einwohner implements Comparable{
    private String name, vorname, gebName, eMail, anrede, familienstand;

    public Einwohner(String name, String vorname, String gebName, String eMail, String anrede, String familienstand) {
        this.name = name;
        this.vorname = vorname;
        this.gebName = gebName;
        this.eMail = eMail;
        this.anrede = anrede;
        this.familienstand = familienstand;
    }

    @Override
    public int compareTo(Object o) {
        Einwohner e = (Einwohner) o;
        if (!name.equals(e.name)) {
            return name.compareTo(e.name);
        } else if (!vorname.equals(e.vorname)) {
            return vorname.compareTo(e.vorname);
        } else {
            return 0;
        }
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

    public String getGebName() {
        return gebName;
    }

    public void setGebName(String gebName) {
        this.gebName = gebName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getAnrede() {
        return anrede;
    }

    public void setAnrede(String anrede) {
        this.anrede = anrede;
    }

    public String getFamilienstand() {
        return familienstand;
    }

    public void setFamilienstand(String familienstand) {
        this.familienstand = familienstand;
    }
}
