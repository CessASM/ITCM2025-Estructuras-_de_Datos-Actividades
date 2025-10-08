package EstructuraDatos;
import java.util.List;

public class MainMCD {

    public static void main(String[] args) {
        MCD calculoMCD = new MCD(12, 15);
        int resultadoRecursivo = calculoMCD.mcRecursivo();
        System.out.println("El MCD recursivo es: " + resultadoRecursivo);
        int resultadoIterativo = calculoMCD.mcIterativo();
        System.out.println("El MCD Iterativo es: " + resultadoIterativo);

        // Mostrar divisores
        List<Integer> divisoresA = calculoMCD.obtenerDivisores(calculoMCD.getA());
        List<Integer> divisoresB = calculoMCD.obtenerDivisores(calculoMCD.getB());

        System.out.println("Divisores de " + calculoMCD.getA() + ": " + divisoresA);
        System.out.println("Divisores de " + calculoMCD.getB() + ": " + divisoresB);
    }
}