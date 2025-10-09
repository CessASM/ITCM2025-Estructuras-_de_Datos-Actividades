package EstructuraDatos.Paneles;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MCDPanel extends JPanel {
    private JTextField aField;
    private JTextField bField;
    private JTextArea resultadoArea;

    public MCDPanel() {
        setLayout(new GridLayout(4, 2));

        aField = new JTextField();
        bField = new JTextField();
        resultadoArea = new JTextArea();

        JButton calcularButton = new JButton("Calcular MCD");
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(aField.getText());
                int b = Integer.parseInt(bField.getText());
                MCD mcd = new MCD(a, b);
                int resultado = mcd.mcRecursivo(); // o mcd.mcIterativo();
                resultadoArea.setText("MCD de " + a + " y " + b + " es: " + resultado);
            }
        });

        add(new JLabel("Ingrese a:"));
        add(aField);
        add(new JLabel("Ingrese b:"));
        add(bField);
        add(calcularButton);
        add(new JScrollPane(resultadoArea));
    }
}
