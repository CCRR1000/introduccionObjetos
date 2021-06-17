package src;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // ----- Contadores -----

        Contador contador1 = new Contador(2);
        Contador contador2 = contador1;

        contador2.setContador(10);

        System.out.println("\n  Datos del Contador:");
        System.out.println("  Contador: " + contador1.getContador() + ", Incremento: " + contador1.incrementar() + ", Decremento: " + contador1.decrementar());

        // ----- Cuadrados -----

        Cuadrado cuadrado1 = new Cuadrado(5);
        Cuadrado cuadrado2 = cuadrado1;

        cuadrado2.setLado(7);

        System.out.println("\n  Datos del Cuadrado:");
        System.out.println("  Lado: " + cuadrado1.getLado() + ", Area: " + cuadrado1.calcularArea() + ", Perimetro: " + cuadrado1.calcularPerimetro());

        // ----- Círculos -----

        Circulo circulo1 = new Circulo(3);
        Circulo circulo2 = circulo1;

        circulo2.setRadio(5);

        System.out.println("\n  Datos del Circulo:");
        System.out.println("  Radio: " + circulo1.getRadio() + ", Area: " + circulo1.hallarArea() + ", Perimetro: " + circulo1.hallarPerimetro());

        // ----- Rectángulos -----

        Rectangulo rectangulo1 = new Rectangulo(2, 2);
        Rectangulo rectangulo2 = rectangulo1;

        rectangulo2.setAlto(2);
        rectangulo2.setAncho(4);

        System.out.println("\n  Datos del Rectangulo:");
        System.out.println("  Alto: "+rectangulo1.getAlto()+", Ancho: "+rectangulo1.getAncho()+", Area: "+rectangulo1.calcularArea()+", Perimetro: "+rectangulo1.calcularPerimetro());

        // ----- Libros -----

        Libro libro1 = new Libro("  Harry Potter", "J. K. Rowling", 1997, 1, false);
        Libro libro2 = libro1;

        libro2.setNombre("  Harry Potter y el Principe Mestizo");
        libro2.setVolumen(6);
        libro2.setAnio(2005);
        libro2.setPrestado(true);

        System.out.println("\n  Datos del Libro:");
        System.out.println("  Nombre: "+libro1.getNombre()+", Autor: "+libro1.getAutor()+", Anio: "+libro1.getAnio()+", Volumen: "+libro1.getVolumen()+", Esta Prestado: "+libro1.esPrestado());

        // ----- Fracciones -----

        Fraccion fracciones1 = new Fraccion(1, 8, 4, 7);
        Fraccion fracciones2 = fracciones1;

        fracciones2.setNum1(3);;
        fracciones2.setDenom1(5);
        fracciones2.setNum2(2);
        fracciones2.setDenom2(9);;

        System.out.println("\n  Operaciones con Fracciones:");
        System.out.println("  Fraccion 1: "+fracciones1.getNum1()+"/"+fracciones1.getDenom1()+",   Fraccion 2: "+fracciones1.getNum2()+"/"+fracciones1.getDenom2());
        
        double sumaDecimal = fracciones2.sumar();
        System.out.println("   - Suma: "+fracciones1.getNumeradorResultado()+"/"+fracciones2.getDenominadorResultado()+" = "+sumaDecimal);
        
        double restaDecimal = fracciones2.restar();
        System.out.println("   - Resta: "+fracciones1.getNumeradorResultado()+"/"+fracciones2.getDenominadorResultado()+" = "+restaDecimal);
        
        double multiplicacionDecimal = fracciones2.multiplicar();
        System.out.println("   - Multiplicacion: "+fracciones1.getNumeradorResultado()+"/"+fracciones2.getDenominadorResultado()+" = "+multiplicacionDecimal);
        
        double divisionDecimal = fracciones2.dividir();
        System.out.println("   - Division: "+fracciones1.getNumeradorResultado()+"/"+fracciones2.getDenominadorResultado()+" = "+divisionDecimal);
        
        System.out.println();


        // ----- Personas -----
        System.out.print("  Ingrese nombre: ");
        String nombre = scan.nextLine();
        System.out.print("  Ingrese edad: ");
        int edad = Integer.parseInt(scan.nextLine());
        System.out.print("  Ingrese sexo (H/M): ");
        char sexo = scan.next().charAt(0);
        System.out.print("  Ingrese peso (kg): ");
        double peso = scan.nextDouble();
        System.out.print("  Ingrese altura (m): ");
        double altura = scan.nextDouble();

        // Creación Personas
        Persona persona1 = new Persona(nombre, edad, peso, altura, sexo);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();

        persona2.setAltura(1.79);
        persona2.setPeso(75);

        persona3.setNombre("Emma Stone");
        persona3.setEdad(32);
        persona3.setSexo('m');
        persona3.setAltura(1.68);
        persona3.setPeso(52);

        // Control de Peso
        System.out.println("\n\n  Control de Peso por persona:\n");
        System.out.println("  Nombre: "+persona1.getNombre()+", resultado IMC: "+persona1.estadoIMC(persona1.calcularIMC()));
        System.out.println("  Nombre: "+persona2.getNombre()+", resultado IMC: "+persona2.estadoIMC(persona2.calcularIMC()));
        System.out.println("  Nombre: "+persona3.getNombre()+", resultado IMC: "+persona3.estadoIMC(persona3.calcularIMC()));

        // Mayoría de edad
        System.out.println("\n\n  Mayoria de Edad:\n");
        System.out.println("  "+persona1.getNombre()+" "+persona1.mayoriaEdad(persona1.esMayorDeEdad(persona1.getEdad())));
        System.out.println("  "+persona2.getNombre()+" "+persona2.mayoriaEdad(persona2.esMayorDeEdad(persona2.getEdad())));
        System.out.println("  "+persona3.getNombre()+" "+persona3.mayoriaEdad(persona3.esMayorDeEdad(persona3.getEdad())));

        // Información de cada Persona
        System.out.println("\n\n  Datos de Personas:\n");
        System.out.println(  "  "+persona1.toString());        
        System.out.println(  "  "+persona2.toString());        
        System.out.println(  "  "+persona3.toString());
        
        System.out.println("\n");
    }

    

}