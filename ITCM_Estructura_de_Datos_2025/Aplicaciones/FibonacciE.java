package Aplicaciones;
public class FibonacciE {
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1;//inicializar los dos primeros numeros
        
        for(int i = 2; i <= n; i++){
            int sig = a + b;//calcular el sig. numero
            a = b;
            b = sig;
        }
        System.out.println("Fibonnaci de "+n+" es: "+b+" metodo espacial");
    } 
}
//Vente¿ajas de el metodo espacial
//Menor uso de memoria: solo necesitas almacenar dos variables en lugar de un array completo
//Rapido: la complejidad temporal sigue siendo O(n), pero con un uso de memoria significativamente menor