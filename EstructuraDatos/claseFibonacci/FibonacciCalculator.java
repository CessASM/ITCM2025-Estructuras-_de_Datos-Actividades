package EstructuraDatos.claseFibonacci;
public class FibonacciCalculator {

    private int resultadoIterativo;
    private int resultadoRecursivo;

    public FibonacciCalculator() {
        this.resultadoIterativo = 0;
        this.resultadoRecursivo = 0;
    }

    public int calcularFibonacciIterativo(int n) {
        if (n < 0) {this.resultadoIterativo = -1; return -1;}
        if (n <= 1) {this.resultadoIterativo = n; return n;}

        int a = 0;
        int b = 1;
        int resultado = 0;

        for (int i = 2; i <= n; i++) 
        {resultado = a + b; a = b; b = resultado;}
        this.resultadoIterativo = resultado; 
        return resultado;
    }

    public int calcularFibonacciRecursivo(int n) {
        if (n < 0) {this.resultadoRecursivo = -1; return -1;}
        if (n <= 1) {this.resultadoRecursivo = n; return n;}
        this.resultadoRecursivo = calcularFibonacciRecursivo(n - 1) + calcularFibonacciRecursivo(n - 2);
        return this.resultadoRecursivo;
    }
    // Getters
    public int getResultadoIterativo() {return resultadoIterativo;}
    public int getResultadoRecursivo() {return resultadoRecursivo;}
    // Setters
    public void setResultadoIterativo(int resultadoIterativo) {this.resultadoIterativo = resultadoIterativo;}
    public void setResultadoRecursivo(int resultadoRecursivo) {this.resultadoRecursivo = resultadoRecursivo;}
}