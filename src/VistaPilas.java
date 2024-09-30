import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaPilas {
    private Pilas pilas;
    private JTextField tfCantidad;
    private JTextField tfNumero;
    private JButton btnAgregar;
    private JButton btnMostrar;
    private JPanel pPrincipal;
    private JButton btnDesapilar;
    private JButton btnPeek;
    private JLabel lbDatos;
    private JTextPane tpResultado;

    public VistaPilas() {
        pilas = new Pilas(3);

        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int numero = Integer.parseInt(tfNumero.getText());
                    int datoIngresado = pilas.push(numero);
                    tpResultado.setText("" + datoIngresado);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingresa un número válido.");

                }
            }
        });

        btnMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pilas.mostrarPila();
            }
        });
        btnDesapilar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pilas.pop();
            }
        });
        btnPeek.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pilas.peek();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("VistaPilas");
        frame.setContentPane(new VistaPilas().pPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
    }
}