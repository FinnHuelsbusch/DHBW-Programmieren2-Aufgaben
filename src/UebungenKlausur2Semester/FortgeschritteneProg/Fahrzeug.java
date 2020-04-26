package UebungenKlausur2Semester.FortgeschritteneProg;

public class Fahrzeug {
    private String marke, kfzKz;
    private int ps;

    public Fahrzeug(String marke, String kfzKz, int ps) {
        this.marke = marke;
        this.kfzKz = kfzKz;
        this.ps = ps;
    }
    public int getPs() {
        return ps;
    }
    public String getKfzKz() {
        return kfzKz;
    }
    public String getMarke() {
        return marke;
    }
}

