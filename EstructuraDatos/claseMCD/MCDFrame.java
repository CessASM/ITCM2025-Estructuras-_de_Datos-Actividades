package EstructuraDatos.claseMCD;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class MCDFrame extends JFrame implements ActionListener {

    private JTextField textFieldA, textFieldB;
    private JButton buttonCalcular;
    private JTextArea textAreaResultados;
    private JLabel labelA, labelB;

    public MCDFrame() {
        setTitle("Calculadora de MCD");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        labelA = new JLabel("Número A:");
        textFieldA = new JTextField(10);
        labelB = new JLabel("Número B:");
        textFieldB = new JTextField(10);
        buttonCalcular = new JButton("Calcular MCD");
        textAreaResultados = new JTextArea(10, 30);
        textAreaResultados.setEditable(false);

        buttonCalcular.addActionListener(this);

        add(labelA);
        add(textFieldA);
        add(labelB);
        add(textFieldB);
        add(buttonCalcular);
        add(new JScrollPane(textAreaResultados));

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonCalcular) {
            try {
                int a = Integer.parseInt(textFieldA.getText());
                int b = Integer.parseInt(textFieldB.getText());

                MCD mcd = new MCD(a, b);

                int mcdRecursivo = mcd.mcRecursivo();
                int mcdIterativo = mcd.mcIterativo();
                List<Integer> divisoresA = mcd.obtenerDivisores(a);
                List<Integer> divisoresB = mcd.obtenerDivisores(b);

                textAreaResultados.setText(""); // Limpiar el área de texto

                textAreaResultados.append("Resultados:\n");
                textAreaResultados.append("-----------------------\n");
                textAreaResultados.append("MCD (Recursivo): " + mcdRecursivo + "\n");
                textAreaResultados.append("MCD (Iterativo): " + mcdIterativo + "\n");
                textAreaResultados.append("-----------------------\n");
                textAreaResultados.append("Divisores de " + a + ": " + divisoresA + "\n");
                textAreaResultados.append("Divisores de " + b + ": " + divisoresB + "\n");

            } catch (NumberFormatException ex) {
                textAreaResultados.setText("Error: Ingresa números válidos.");
            } catch (Exception ex) {
                textAreaResultados.setText("Ocurrió un error: " + ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MCDFrame());
    }
}