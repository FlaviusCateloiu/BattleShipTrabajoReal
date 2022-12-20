import javax.swing.*;

public class IntroducirBarcosPlayer extends JFrame {
    private JPanel jPIntroducirBarcos;
    private JButton jBGuardar;
    private JButton jBCancelar;
    private JTextField nombreJugadorTextField;
    private JComboBox comboBox1;

    public IntroducirBarcosPlayer() {
        super("Introducir Barcos Player");
        setSize(800, 600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setContentPane(jPIntroducirBarcos);
        setVisible(true);
    }
}
