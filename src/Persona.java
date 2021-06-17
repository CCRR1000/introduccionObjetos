package src;

import java.util.Random;

public class Persona {
    
    private String nombre;
    private int edad, dni;
    private double peso, altura;
    private char sexo = 'H';
    private final char MASCULINO = 'H', FEMENINO = 'M';

    Random random = new Random();

    public Persona() {
    }

    public Persona(String _nombre, int _edad, char _sexo) {
        nombre = _nombre;
        edad = _edad;
        comprobarSexo(_sexo);
        dni = generarDNI();

    }

    public Persona(String _nombre, int _edad, double _peso, double _altura, char _sexo) {
        nombre = _nombre;
        edad = _edad;
        peso = _peso;
        altura = _altura;
        comprobarSexo(_sexo);
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

    public String estadoIMC(int indice) {
        String estado;
        if (indice == -1) {
            estado = "Está por debajo de su peso ideal.";
        } else if (indice == 0) {
            estado = "Está en su peso ideal.";
        } else {
            estado = "Tiene sobrepeso.";
        }
        return estado;
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

    public String mayoriaEdad(boolean mayorDeEdad) {

        if (mayorDeEdad) {
            return "Es mayor de Edad.";
        } else {
            return "No es mayor de Edad.";
        }
    }

    public void comprobarSexo(char sexo) {
        if (sexo == 'M' || sexo == 'm') {
            sexo = FEMENINO;
        } 
        else {
            sexo = MASCULINO;
        }
    }

    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Peso: " + peso + ", Altura: " + altura + ", Sexo: " + sexo;
    }

    public int generarDNI() {
        int dni = random.nextInt(100000000-10000000) + 10000000;
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String _nombre) {
        nombre = _nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int _edad) {
        edad = _edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double _peso) {
        peso = _peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double _altura) {
        altura = _altura;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char _sexo) {
        comprobarSexo(_sexo);;
    }

    public int getDni() {
        return dni;
    }
    


}
