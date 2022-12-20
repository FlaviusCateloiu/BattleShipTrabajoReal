import javax.swing.*;

public class BattleShip extends JFrame {
    private Tablero tablero1;
    private ConfiguracionBarcos crearBarcos;

    public BattleShip() {

        tablero1 = new Tablero();
        crearBarcos = new ConfiguracionBarcos(tablero1, this);
        add(crearBarcos);
        setLocationRelativeTo(null);
        setSize(850, 850);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
