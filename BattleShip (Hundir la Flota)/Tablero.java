import java.util.ArrayList;

public class Tablero {
    private int[][] tablero;

    public Tablero() {
        tablero = new int[10][10];
    }
    public int[][] getTablero() {
        return tablero;
    }
    public void setTablero(int[][] tablero) {
        this.tablero = tablero;
    }
}