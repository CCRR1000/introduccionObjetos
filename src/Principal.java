package src;

public class Principal {

    public static void main(String[] args) {

        // ----- Contadores -----

        Contador contador1 = new Contador(2);
        Contador contador2 = contador1;

        contador2.setContador(10);

        System.out.println("\nDatos del Contador:");
        System.out.println("Contador: " + contador1.getContador() + ", Incremento: " + contador1.incrementar() + ", Decremento: " + contador1.decrementar());

        // ----- Cuadrados -----

        Cuadrado cuadrado1 = new Cuadrado(5);
        Cuadrado cuadrado2 = cuadrado1;

        cuadrado2.setLado(7);

        System.out.println("\nDatos del Cuadrado:");
        System.out.println("Lado: " + cuadrado1.getLado() + ", Area: " + cuadrado1.calcularArea() + ", Perimetro: " + cuadrado1.calcularPerimetro());

        // ----- Círculos -----

        Circulo circulo1 = new Circulo(3);
        Circulo circulo2 = circulo1;

        circulo2.setRadio(5);

        System.out.println("\nDatos del Circulo:");
        System.out.println("Radio: " + circulo1.getRadio() + ", Area: " + circulo1.hallarArea() + ", Perimetro: " + circulo1.hallarPerimetro());

        // ----- Rectángulos -----

        Rectangulo rectangulo1 = new Rectangulo(2, 2);
        Rectangulo rectangulo2 = rectangulo1;

        rectangulo2.setAlto(2);
        rectangulo2.setAncho(4);

        System.out.println("\nDatos del Rectangulo:");
        System.out.println("Alto: "+rectangulo1.getAlto()+", Ancho: "+rectangulo1.getAncho()+", Area: "+rectangulo1.calcularArea()+", Perimetro: "+rectangulo1.calcularPerimetro());

        // ----- Libros -----

        Libro libro1 = new Libro("Harry Potter", "J. K. Rowling", 1997, 1, false);
        Libro libro2 = libro1;

        libro2.setNombre("Harry Potter y el Principe Mestizo");
        libro2.setVolumen(6);
        libro2.setAnio(2005);
        libro2.setPrestado(true);

        System.out.println("\nDatos del Libro:");
        System.out.println("Nombre: "+libro1.getNombre()+", Autor: "+libro1.getAutor()+", Anio: "+libro1.getAnio()+", Volumen: "+libro1.getVolumen()+", Esta Prestado: "+libro1.esPrestado());

        // ----- Fracciones -----

        Fraccion fracciones1 = new Fraccion(1, 8, 4, 7);
        Fraccion fracciones2 = fracciones1;

        fracciones2.setNum1(3);;
        fracciones2.setDenom1(5);
        fracciones2.setNum2(2);
        fracciones2.setDenom2(9);;

        System.out.println("\nOperaciones:");
        System.out.println("Fraccion 1: "+fracciones1.getNum1()+"/"+fracciones1.getDenom1()+", Fraccion 2: "+fracciones1.getNum2()+"/"+fracciones1.getDenom2());
        
        double sumaDecimal = fracciones2.sumar();
        System.out.println("Suma: "+fracciones1.getNumeradorResultado()+"/"+fracciones2.getDenominadorResultado()+" = "+sumaDecimal);
        
        double restaDecimal = fracciones2.restar();
        System.out.println("Resta: "+fracciones1.getNumeradorResultado()+"/"+fracciones2.getDenominadorResultado()+" = "+restaDecimal);
        
        double multiplicacionDecimal = fracciones2.multiplicar();
        System.out.println("Multiplicacion: "+fracciones1.getNumeradorResultado()+"/"+fracciones2.getDenominadorResultado()+" = "+multiplicacionDecimal);
        
        double divisionDecimal = fracciones2.dividir();
        System.out.println("Division: "+fracciones1.getNumeradorResultado()+"/"+fracciones2.getDenominadorResultado()+" = "+divisionDecimal);
        
        System.out.println();
    }

    

}