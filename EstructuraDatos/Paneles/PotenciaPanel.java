package EstructuraDatos.Paneles;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class PotenciaPanel extends JPanel {
    private JTextField baseField;
    private JTextField exponenteField;
    private JTextArea resultadoArea;

    public PotenciaPanel() {
        setLayout(new GridLayout(4, 2));

        baseField = new JTextField();
        exponenteField = new JTextField();
        resultadoArea = new JTextArea();

        JButton calcularButton = new JButton("Calcular Potencia");
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int base = Integer.parseInt(baseField.getText());
                int exponente = Integer.parseInt(exponenteField.getText());
                int resultado = PotenciaRecursiva.calcularPotencia(base, exponente);
                resultadoArea.setText(base + " elevado a " + exponente + " es: " + resultado);
            }
        });

        add(new JLabel("Ingrese la base:"));
        add(baseField);
        add(new JLabel("Ingrese el exponente:"));
        add(exponenteField);
        add(calcularButton);
        add(new JScrollPane(resultadoArea));
    }
}