package Uebungen;

public class Spielfeld {
    private int groesse;

    public Spielfeld() {
        //initial size
        groesse = 5;
    }

    public int getGroesse() {
        return groesse;
    }

    public void setGroesse(int newgroesse) {
        this.groesse = newgroesse;
    }

}
