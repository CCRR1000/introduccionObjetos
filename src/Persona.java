package src;

import java.util.Random;

public class Persona {
    
    private String nombre;
    private int edad, dni;
    private double peso, altura;
    private char sexo = 'H';

    Random random = new Random();

    public Persona() {
    }

    public Persona(String _nombre, int _edad, char _sexo) {
        nombre = _nombre;
        edad = _edad;
        sexo = _sexo;
        dni = generarDNI();

    }

    public Persona(String _nombre, int _edad, double _peso, double _altura, char _sexo) {
        nombre = _nombre;
        edad = _edad;
        peso = _peso;
        altura = _altura;
        sexo = _sexo;
        dni = generarDNI();
    }

    public int calcularIMC() {

        int indice;
        double imc = peso / (Math.pow(altura, 2));
        if (imc < 20) {
            indice = -1;
        } else if (imc <= 25) {
            indice = 0;
        } else {
            indice = 1;
        }

        return indice;
    }

    public boolean esMayorDeEdad(int edad) {

        boolean mayor;

        if (edad >= 18) {
            mayor = true;
        } else {
            mayor = false;
        }
        return mayor;
    }

    public void comprobarSexo(char sexo) {
        if (sexo != 'F' || sexo != 'f') {
            sexo = 'H';
        } 
    }

    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Peso: " + peso + ", Altura: " + altura + "Sexo: " + sexo;
    }

    public int generarDNI() {
        int dni = random.nextInt(100000000-10000000) + 10000000;
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getDni() {
        return dni;
    }
    


}
