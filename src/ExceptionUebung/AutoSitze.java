package ExceptionUebung;

public class AutoSitze {
    private boolean ledersitze;
    private String farbe;

    public AutoSitze(boolean bezug, String farbe) throws FalscherParameter{
        if (bezug && !(farbe.equalsIgnoreCase("schwarz") || farbe.equalsIgnoreCase("weiß"))) {
            throw new FalscherParameter(farbe);
        }
    }

    public String getFarbe() {
        return farbe;
    }

    public boolean isLedersitze() {
        return ledersitze;
    }
}
