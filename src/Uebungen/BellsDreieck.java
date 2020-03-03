package Uebungen;

public class BellsDreieck {
    private int Stufen;
    int[][] Feld;

    public static void main(String[] args) {
        new BellsDreieck(5);
    }

    public BellsDreieck(int Stufen) {
        this.Stufen = Stufen;
        Feld = new int[Stufen][Stufen];
        Feld[0][0] = 1;
        calcualte();
        print();
    }

    private void calcualte() {
        for (int i = 1; i < Feld.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    Feld[i][j] = Feld[i - 1][i - 1];
                }
                else
                {
                    Feld[i][j] = Feld[i][j-1] + Feld[i-1][j-1];
                }
            }
        }
    }

    private void print() {
        for (int i = 0; i < Stufen; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(Feld[i][j] + " ");
            }
            System.out.println();
        }
    }
}
