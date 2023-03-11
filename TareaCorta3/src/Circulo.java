public class Circulo extends Figura {
    private double radio;
    private double pi;
    public int lados;

    public Circulo(double pRadio){
        this.radio = pRadio;
        this.pi = 3.1416;
        this.lados = 0;

    }

    public double calcularArea(){
        return pi * radio * radio;
    }

    // me falta el compare to
    
    public int cantidadLados(){
        return this.lados;

    }
}
