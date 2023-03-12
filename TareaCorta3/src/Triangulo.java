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

    public int compareTo(Triangulo trianguloPorComparar) {
        double areaPorComparar = trianguloPorComparar.calcularArea();
        double miArea = this.calcularArea();

        if(miArea == areaPorComparar){
            // si ambas figuras tienen la misma área, revisará el número de lados
            if(trianguloPorComparar.getLados() == this.lados){
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

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }

}
