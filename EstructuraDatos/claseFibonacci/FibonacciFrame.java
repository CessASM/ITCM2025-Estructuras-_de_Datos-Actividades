package EstructuraDatos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FibonacciFrame extends JFrame implements ActionListener {

    private JTextField textFieldInput;
    private JButton buttonIterativo, buttonRecursivo;
    private JTextArea textAreaResultados;
    private JLabel labelInput;

    public FibonacciFrame() {
        setTitle("Calculadora de Fibonacci");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        labelInput = new JLabel("Ingrese un número:");
        textFieldInput = new JTextField(10);
        buttonIterativo = new JButton("Calcular Fibonacci (Iterativo)");
        buttonRecursivo = new JButton("Calcular Fibonacci (Recursivo)");
        textAreaResultados = new JTextArea(10, 30);
        textAreaResultados.setEditable(false);

        buttonIterativo.addActionListener(this);
        buttonRecursivo.addActionListener(this);

        add(labelInput);
        add(textFieldInput);
        add(buttonIterativo);
        add(buttonRecursivo);
        add(new JScrollPane(textAreaResultados));

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        FibonacciCalculator calculadora = new FibonacciCalculator();
        try {
            int n = Integer.parseInt(textFieldInput.getText());

            if (e.getSource() == buttonIterativo) {
                int resultado = calculadora.calcularFibonacciIterativo(n);
                textAreaResultados.setText("Fibonacci (Iterativo) de " + n + ": " + resultado);
            } else if (e.getSource() == buttonRecursivo) {
                int resultado = calculadora.calcularFibonacciRecursivo(n);
                textAreaResultados.setText("Fibonacci (Recursivo) de " + n + ": " + resultado);
            }
        } catch (NumberFormatException ex) 
        {textAreaResultados.setText("Error: Ingresa un número válido.");}
    }

    public static void main(String[] args) 
    {SwingUtilities.invokeLater(() -> new FibonacciFrame());}
}