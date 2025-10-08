import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PotenciaJFrame extends JFrame implements ActionListener {

    private JLabel baseLabel, exponenteLabel, resultadoLabel;
    private JTextField baseField, exponenteField, resultadoField;
    private JButton calcularButton;

    public PotenciaJFrame() {
        setTitle("Calculadora de Potencia");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 250);
        setLayout(new GridLayout(4, 2, 10, 10)); // 4 filas, 2 columnas, espaciado

        // Componentes
        baseLabel = new JLabel("Base: ");
        exponenteLabel = new JLabel("Exponente: ");
        resultadoLabel = new JLabel("Resultado: ");

        baseField = new JTextField();
        exponenteField = new JTextField();
        resultadoField = new JTextField();
        resultadoField.setEditable(false); // El resultado no se puede editar

        calcularButton = new JButton("Calcular");
        calcularButton.addActionListener(this);

        // Agregar componentes al JFrame
        add(baseLabel);
        add(baseField);
        add(exponenteLabel);
        add(exponenteField);
        add(resultadoLabel);
        add(resultadoField);
        add(new JLabel()); // Espacio en blanco
        add(calcularButton);

        setLocationRelativeTo(null); // Centrar la ventana
        setVisible(true);
    }

    // Método recursivo para calcular la potencia 
    public static int calcularPotencia(int base, int exponente) {
        if (exponente == 0) {return 1;}
        if (exponente == 1) {return base;}
         else {return base * calcularPotencia(base, exponente - 1);}
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calcularButton) {
            try {
                int base = Integer.parseInt(baseField.getText());
                int exponente = Integer.parseInt(exponenteField.getText());
                int resultado = calcularPotencia(base, exponente);
                resultadoField.setText(String.valueOf(resultado));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese números enteros.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) 
    {SwingUtilities.invokeLater(() -> new PotenciaJFrame());}
}