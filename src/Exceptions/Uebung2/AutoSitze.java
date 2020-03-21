package Exceptions.Uebung2;

public class AutoSitze {
    private boolean ledersitze;
    private String farbe;

    public AutoSitze(boolean bezug, String farbe) throws FalscherParameter{
        if (bezug && !(farbe.equalsIgnoreCase("schwarz") || farbe.equalsIgnoreCase("weiß"))) {
            throw new FalscherParameter(farbe);
        } else {
            this.farbe = farbe;
            this.ledersitze = bezug;
        }
    }

    public String getFarbe() {
        return farbe;
    }

    public boolean isLedersitze() {
        return ledersitze;
    }
}
