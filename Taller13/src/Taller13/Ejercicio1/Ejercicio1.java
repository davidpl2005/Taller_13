package Taller13.Ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(5, 3);
        Triangulo triangulo = new Triangulo(4, 6);

        System.out.println("Area del rectangulo: " + rectangulo.calcularArea());
        System.out.println("Area del triangulo: " + triangulo.calcularArea());
    }
}
