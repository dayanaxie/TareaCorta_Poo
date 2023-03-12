
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("---------------------------");
        Rectangulo recOne = new Rectangulo(2.5, 3.0);
        Rectangulo recTwo = new Rectangulo(2.5, 3.0);
        int result = recOne.compareTo(recTwo);
        System.out.println("Resultado de la comparacion: " + result);

        System.out.println("---------------------------");
        Circulo circuloOne = new Circulo(5);
        System.out.println("Area: " + circuloOne.calcularArea());

        System.out.println("---------------------------");
        Triangulo trianguloOne = new Triangulo(4, 2);
        System.out.println("Lados: " + trianguloOne.cantidadLados());

    }
}
