package Clases;
public class FibonacciCalculator {

    public int calcularFibonacciIterativo(int n) {
        if (n < 0) {return -1;}
        if (n <= 1) {return n;}

        int a = 0;
        int b = 1;
        int resultado = 0;

        for (int i = 2; i <= n; i++) {
            resultado = a + b;
            a = b;
            b = resultado;
        }
        return resultado;
    }

    public int calcularFibonacciRecursivo(int n) {
        if (n < 0) {return -1;}
        if (n <= 1) {return n;}
        return calcularFibonacciRecursivo(n - 1) + calcularFibonacciRecursivo(n - 2);
    }
}
