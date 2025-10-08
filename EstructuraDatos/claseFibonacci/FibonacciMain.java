package EstructuraDatos;
public class FibonacciMain {
    public static void main(String[] args) {
        FibonacciCalculator calculadora = new FibonacciCalculator();

        int n = 10;
        int resultadoIterativo = calculadora.calcularFibonacciIterativo(n);
        int resultadoRecursivo = calculadora.calcularFibonacciRecursivo(n);

        System.out.println("Fibonacci (" + n + ") (Iterativo): " + resultadoIterativo);
        System.out.println("Fibonacci (" + n + ") (Recursivo): " + resultadoRecursivo);
        System.out.println("Último resultado iterativo: " + calculadora.getResultadoIterativo());
        System.out.println("Último resultado recursivo: " + calculadora.getResultadoRecursivo());
    }
}