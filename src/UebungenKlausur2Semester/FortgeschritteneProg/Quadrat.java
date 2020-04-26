package UebungenKlausur2Semester.FortgeschritteneProg;

public class Quadrat implements Berechnen {
    private  int kantenlaenge;

    public Quadrat(int i) {
        kantenlaenge = i;
    }
    @Override
    public int berechneFlaeche() {
        return kantenlaenge * kantenlaenge;
    }

    @Override
    public int berechneUmfang() {
        return 4 * kantenlaenge;
    }
}
