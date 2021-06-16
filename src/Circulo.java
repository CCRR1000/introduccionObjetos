package src;

public class Circulo {
    
    private double radio;

   
    public Circulo(double _radio) {
        radio = _radio;
    }

    public double hallarArea() {
        double area;
        area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    public double hallarPerimetro() {
        double perimetro;
        perimetro = 2 * Math.PI * radio ;
        return perimetro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double _radio) {
        radio = _radio;
    }


}
