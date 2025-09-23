package Aplicaciones;
public class FibonacciD {
    public static void main(String[] args) {
        int n = 10;//numero de terminos
        int[] fib = new int[n+1];//crea el array
        fib[0] = 0;
        fib[1] = 1;
        
        for (int i = 2; i<=n; i++){fib[i] = fib[i - 1] + fib[i - 2];}
        
        System.out.println("fibonacci de " + n + " es: " + fib[n] + " metodo dinamico");
    }
}
//Ventajas de elmmetodo dinamico
//Eficiencia: reduce el tiempo de calculo al evitar la recalculacion de numeros ya conocidos
//Claridad: el codigo es mas facil de entender y seguir