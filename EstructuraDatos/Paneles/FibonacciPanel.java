package EstructuraDatos.Paneles;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class FibonacciPanel extends JPanel {
    private JTextField nField;
    private JTextArea resultadoArea;

    public FibonacciPanel() {
        setLayout(new GridLayout(3, 2));

        nField = new JTextField();
        resultadoArea = new JTextArea();

        JButton calcularButton = new JButton("Calcular Fibonacci");
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = Integer.parseInt(nField.getText());
                FibonacciCalculator fibonacci = new FibonacciCalculator();
                int resultadoRecursivo = fibonacci.calcularFibonacciRecursivo(n);
                int resultadoIterativo = fibonacci.calcularFibonacciIterativo(n);
                resultadoArea.setText("Fibonacci Recursivo: " + resultadoRecursivo + "\n" +
                                      "Fibonacci Iterativo: " + resultadoIterativo);
            }
        });

        add(new JLabel("Ingrese n:"));
        add(nField);
        add(calcularButton);
        add(new JScrollPane(resultadoArea));
    }
}
