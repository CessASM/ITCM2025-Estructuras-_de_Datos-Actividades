package EstructuraDatos;
import EstructuraDatos.ClaseMCD.MCD;
import EstructuraDatos.claseFibonacci.FibonacciCalculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 3en1 extends JFrame {

    public 3en1() {
        setTitle("Programas en Java");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane tabbedPane = new JTabbedPane();

        // Panel para PotenciaRecursiva
        JPanel potenciaPanel = new JPanel();
        potenciaPanel.setLayout(new BorderLayout());
        JTextArea potenciaOutput = new JTextArea();
        potenciaOutput.setEditable(false);
        JButton potenciaButton = new JButton("Calcular Potencia");
        JTextField baseField = new JTextField(10);
        JTextField exponenteField = new JTextField(10);
        potenciaPanel.add(new JLabel("Base:"), BorderLayout.NORTH);
        potenciaPanel.add(baseField, BorderLayout.NORTH);
        potenciaPanel.add(new JLabel("Exponente:"), BorderLayout.CENTER);
        potenciaPanel.add(exponenteField, BorderLayout.CENTER);
        potenciaPanel.add(potenciaButton, BorderLayout.SOUTH);
        potenciaPanel.add(new JScrollPane(potenciaOutput), BorderLayout.EAST);

        potenciaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int base = Integer.parseInt(baseField.getText());
                int exponente = Integer.parseInt(exponenteField.getText());
                int resultado = calcularPotencia(base, exponente);
                potenciaOutput.setText(base + " elevado a " + exponente + " es: " + resultado);
            }
        });

        // Panel para MCD
        JPanel mcdPanel = new JPanel();
        mcdPanel.setLayout(new BorderLayout());
        JTextArea mcdOutput = new JTextArea();
        mcdOutput.setEditable(false);
        JButton mcdButton = new JButton("Calcular MCD");
        JTextField aField = new JTextField(10);
        JTextField bField = new JTextField(10);
        mcdPanel.add(new JLabel("Número A:"), BorderLayout.NORTH);
        mcdPanel.add(aField, BorderLayout.NORTH);
        mcdPanel.add(new JLabel("Número B:"), BorderLayout.CENTER);
        mcdPanel.add(bField, BorderLayout.CENTER);
        mcdPanel.add(mcdButton, BorderLayout.SOUTH);
        mcdPanel.add(new JScrollPane(mcdOutput), BorderLayout.EAST);

        mcdButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(aField.getText());
                int b = Integer.parseInt(bField.getText());
                MCD mcd = new MCD(a, b);
                int resultado = mcd.mcRecursivo();
                mcdOutput.setText("MCD de " + a + " y " + b + " es: " + resultado);
            }
        });

        // Panel para FibonacciCalculator
        JPanel fibonacciPanel = new JPanel();
        fibonacciPanel.setLayout(new BorderLayout());
        JTextArea fibonacciOutput = new JTextArea();
        fibonacciOutput.setEditable(false);
        JButton fibonacciButton = new JButton("Calcular Fibonacci");
        JTextField nField = new JTextField(10);
        fibonacciPanel.add(new JLabel("Número N:"), BorderLayout.NORTH);
        fibonacciPanel.add(nField, BorderLayout.NORTH);
        fibonacciPanel.add(fibonacciButton, BorderLayout.SOUTH);
        fibonacciPanel.add(new JScrollPane(fibonacciOutput), BorderLayout.EAST);

        fibonacciButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = Integer.parseInt(nField.getText());
                FibonacciCalculator fibonacciCalculator = new FibonacciCalculator();
                int resultado = fibonacciCalculator.calcularFibonacciIterativo(n);
                fibonacciOutput.setText("Fibonacci de " + n + " es: " + resultado);
            }
        });

        // Agregar paneles al JTabbedPane
        tabbedPane.addTab("Potencia Recursiva", potenciaPanel);
        tabbedPane.addTab("MCD", mcdPanel);
        tabbedPane.addTab("Fibonacci", fibonacciPanel);

        add(tabbedPane);
    }

    public static int calcularPotencia(int base, int exponente) {
        if (exponente == 0) {return 1;}
        if (exponente == 1) {return base;}
        return base * calcularPotencia(base, exponente - 1);
    }

    class MCD {
        private int a, b;

        public MCD(int a, int b) 
        {this.a = a; this.b = b;}

        public int mcRecursivo() {
            if (b == 0) {return a;}
            MCD x = new MCD(b, a % b);
           return x.mcRecursivo();
       }
    }

    class FibonacciCalculator {
         public int calcularFibonacciIterativo(int n) {
            if (n < 0) return -1;
            if (n <= 1) return n;

            int a = 0, b = 1, resultado = 0;
            for (int i = 2; i <= n; i++) {
                resultado = a + b;
                a = b; b = resultado;
            }
            return resultado;
       }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            3en1 frame = new 3en1();
            frame.setVisible(true);
        });
    }
}