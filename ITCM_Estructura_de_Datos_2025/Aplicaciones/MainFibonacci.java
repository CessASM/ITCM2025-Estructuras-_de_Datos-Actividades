package Aplicaciones;
import Clases.FibonacciCalculator;

public class MainFibonacci {

    public static void main(String[] args) {
        FibonacciCalculator calculadora = new FibonacciCalculator();
        int numeroTermino = 10; // Puedes cambiar este valor para calcular otro término

        // Cálculo iterativo
        int resultadoIterativo = calculadora.calcularFibonacciIterativo(numeroTermino);
        System.out.println("El termino " + numeroTermino + " de Fibonacci (iterativo) es: " + resultadoIterativo);

        // Cálculo recursivo
        int resultadoRecursivo = calculadora.calcularFibonacciRecursivo(numeroTermino);
        System.out.println("El termino " + numeroTermino + " de Fibonacci (recursivo) es: " + resultadoRecursivo);
    }
}