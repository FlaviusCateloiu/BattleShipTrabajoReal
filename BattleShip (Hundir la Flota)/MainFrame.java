import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JPanel mainPanel;
    private JButton salirDelJuegoButton;
    private JButton reanudarElJuegoButton;
    private JButton empezarElJuegoButton;
    private JButton empezarElJuegoButton1;

    public MainFrame() {
        setContentPane(mainPanel);
        setTitle("BattleShip");
        empezarElJuegoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BattleShip batalla = new BattleShip();
            }
        });
        salirDelJuegoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
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
