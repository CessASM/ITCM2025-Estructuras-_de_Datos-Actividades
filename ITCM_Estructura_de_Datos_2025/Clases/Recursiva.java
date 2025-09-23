package Clases;

public class Recursiva {

    private double base, resultado;
    private int exponente;

    // Constructor
    public Recursiva(){}
    public Recursiva(double base, int exponente) {
        this.base = base;
        this.exponente = exponente;
        this.resultado = calcularExponencial(base, exponente);
    }

    // Método para calcular la exponencial de forma recursiva
    private double calcularExponencial(double base, int exponente) {
        if (exponente == 0) {return 1;}
        if (exponente < 0) {return 1 / calcularExponencial(base, -exponente);}
        return base * calcularExponencial(base, exponente - 1);
    }

    // Métodos getter (para obtener los valores)
    public double getBase() {return base;}
    public int getExponente() {return exponente;}
    public double getResultado() {return resultado;}

    // Métodos setter (para modificar los valores)
    public void setBase(double base) {
        this.base = base;
        this.resultado = calcularExponencial(base, this.exponente);
    }
    public void setExponente(int exponente) {
        this.exponente = exponente;
        this.resultado = calcularExponencial(this.base, exponente);
    }
    
    @Override
    public String toString() {
        return  "Base: "+base+"\nExponente: "
                +exponente+"\nResultado: "+resultado;
    }
}