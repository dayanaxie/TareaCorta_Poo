public class Triangulo extends Figura {
    private double base;
    private double altura;
    private int lados;

    public Triangulo(double pBase, double pAltura){
        this.base = pBase;
        this.altura = pAltura;
        this.lados = 3;     

    }

    public double calcularArea(){
        return (base * altura) / 2;
    }

    // me falta el compare to

    public int cantidadLados(){
        return this.lados;

    }

}
