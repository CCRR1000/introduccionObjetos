package src;

public class Cuadrado {

    int lado = 0;

    public Cuadrado(int _lado) {
        lado = _lado;
    }

    public int calcularArea() {
        int area = (int) Math.pow(lado, 2);
        return area;
    }

    public int calcularPerimetro() {
        int perimetro = 4 * lado;
        return perimetro;
    }

    public void setLado(int _lado) {
        lado = _lado;
    }

    public int getLado() {
        return lado;
    }

    
}
