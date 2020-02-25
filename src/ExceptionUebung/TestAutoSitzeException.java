package ExceptionUebung;

public class TestAutoSitzeException {

    public static void main(String[] args) {
        new TestAutoSitzeException();
    }
    public TestAutoSitzeException() {
        try {
            new AutoSitze(true, "weiß");
        } catch (FalscherParameter falscherParameter) {
            System.out.println(falscherParameter.getMessage());
            System.out.println("Beziehung fehlgeschlagen.");
        }

        try {
            new AutoSitze(true, "bunt");
        } catch (FalscherParameter falscherParameter) {
            System.out.println(falscherParameter.getMessage());
            System.out.println("Beziehung fehlgeschlagen.");
        }

    }
}
