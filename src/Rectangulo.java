package src;

public class Rectangulo {

    private double ancho, alto;

    public Rectangulo(double ancho, double alto) {

        compararLados(ancho, alto);

    }

    public void compararLados(double _ancho, double _alto) {

        if (ancho == alto) {
            System.out.println("\nError. El ancho y el alto del rectangulo son iguales");
        } else {
            ancho = _ancho;
            alto = _alto;
        }

    }

    public double calcularArea() {
        double area = ancho * alto;
        return area;
    }

    public double calcularPerimetro() {
        double perimetro = 2 * (alto + ancho);
        return perimetro;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double _ancho) {
        ancho = _ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double _alto) {
        alto = _alto;
    }

}
