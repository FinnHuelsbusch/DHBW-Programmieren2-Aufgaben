package UebungenKlausur2Semester.FortgeschritteneProg;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class Fuhrpark {
    public static void main(String[] args) {
        Vector<Fahrzeug> fuhrpark = new Vector<Fahrzeug>();
        Fahrzeug kfz1 = new Fahrzeug("Audi","HD-XX 246",180);
        Fahrzeug kfz2 = new Fahrzeug("BMW","MA-LU 845",170);
        Fahrzeug kfz25 = new Fahrzeug("BMW","MA-LU 846",170);
        Fahrzeug kfz3 = new Fahrzeug("VW","MA-BA 563",170);
        Fahrzeug kfz4 = new Fahrzeug("Saab","MOS-FK 74",90);
        fuhrpark.add(kfz1);
        fuhrpark.add(kfz2);
        fuhrpark.add(kfz3);
        fuhrpark.add(kfz4);
        fuhrpark.add(kfz25);
        Collections.sort(fuhrpark,new FahrzeugeComperator());
        Iterator<Fahrzeug> it = fuhrpark.iterator();
        while (it.hasNext()) {
            Fahrzeug f = it.next();
            System.out.println(f.getMarke() +", "+ f.getKfzKz()+", "+ f.getPs());
        }




    }
}

