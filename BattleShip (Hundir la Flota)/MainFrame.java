import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JPanel mainPanel;
    private JButton salirDelJuegoButton;
    private JButton reanudarElJuegoButton;
    private JButton colocarBarcosButton;
    private JButton empezarElJuegoButton;

    public MainFrame() {
        setContentPane(mainPanel);
        setTitle("BattleShip");
        colocarBarcosButton.addActionListener(a -> {
            //Tengo que crear un GUI con los datos necesarios para introducir los barcos en un mapa.
            IntroducirBarcosPlayer introducirBarcos = new IntroducirBarcosPlayer();
        });
        empezarElJuegoButton.addActionListener(a -> {
            //Tener que completar.
        });
        salirDelJuegoButton.addActionListener(a -> {
            System.exit(0);
        });
        reanudarElJuegoButton.addActionListener(a -> {
            //Tener que completar.
        });
        setSize(450, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        MainFrame aplicacion = new MainFrame();
    }
}
