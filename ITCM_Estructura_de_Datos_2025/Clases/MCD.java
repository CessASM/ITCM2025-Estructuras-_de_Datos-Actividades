package Clases;
import java.util.ArrayList;
import java.util.List;

public class MCD {

    private int a, b;

    public MCD() {}
    public MCD(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Método Recursivo para calcular MCD
    public int mcRecursivo() {
        if (b == 0) {return a;}
        MCD x = new MCD(b, a % b);
        return x.mcRecursivo();
    }

    // Método Iterativo para calcular MCD
    public int mcIterativo() {
        int aLocal = this.a;
        int bLocal = this.b;
        while (bLocal != 0) {
            int temp = bLocal;
            bLocal = aLocal % bLocal;
            aLocal = temp;
        }
        return aLocal;
    }

    // Método para obtener los divisores de un número
    public List<Integer> obtenerDivisores(int numero) {
        List<Integer> divisores = new ArrayList<>();
        for (int i = 1; i <= Math.abs(numero); i++) { 
            if (numero % i == 0) {divisores.add(i);}
        }
        return divisores;
    }

    // Getters
    public int getA() {return a;}
    public int getB() {return b;}
}
