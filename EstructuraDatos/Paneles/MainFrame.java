package EstructuraDatos.Paneles;
import EstructuraDatos.Paneles.FibonacciPanel;
import EstructuraDatos.Paneles.MCDPanel;
import EstructuraDatos.Paneles.PotenciaPanel;
import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Calculadoras Matemáticas");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Crear los paneles
        PotenciaPanel potenciaPanel = new PotenciaPanel();
        MCDPanel mcdPanel = new MCDPanel();
        FibonacciPanel fibonacciPanel = new FibonacciPanel();

        // Agregar los paneles a la ventana
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Potencia", potenciaPanel);
        tabbedPane.addTab("MCD", mcdPanel);
        tabbedPane.addTab("Fibonacci", fibonacciPanel);

        add(tabbedPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame frame = new MainFrame();
            frame.setVisible(true);
        });
    }
}
