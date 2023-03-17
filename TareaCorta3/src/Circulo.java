public class Circulo extends Figura implements Comparable<Figura>{
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

    public int compareTo(Figura pFigura) {
        double areaPorComparar = pFigura.calcularArea();
        double miArea = this.calcularArea();

        if(miArea == areaPorComparar){
            // si ambas figuras tienen la misma área, revisará el número de lados
            if(pFigura.cantidadLados() == this.lados){
                return 0;
            }else{
                return -1;
            }

        }else if(miArea > areaPorComparar){
            return 1;

        }else{
            return -1;
        }
    }
    
    public int cantidadLados(){
        return this.lados;

    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    

    public void setLados(int lados) {
        this.lados = lados;
    }
    
}
