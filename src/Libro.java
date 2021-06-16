/**
 * 6. Crea una clase Libro con los métodos préstamo, devolución y mostrarInformación. La clase contendrá un 
 * constructor por defecto, un constructor con parámetros y los métodos getters y setters.
 */
package src;

public class Libro {
    
    private String nombre, autor;
    private int anio, volumen;
    private boolean prestado;
    
    public Libro() {
        prestado = false;
    }

    public Libro(String _nombre, String _autor, int _anio, int _edicion, boolean _prestado) {
        nombre = _nombre;
        autor = _autor;
        anio = _anio;
        volumen = _edicion;
        prestado = _prestado;
    }

    public String prestamo() {
        prestado = true;
        return "El libro se ha prestado."; 
    }

    public String devolucion() {
        prestado = false;
        return "El libro se ha devuelto.";
    }

    public String mostrarInformacion() {
        return "Libro: "+ nombre + ", Autor: " + autor + ", Edicion: " + volumen + "Anio: " + anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String _nombre) {
        nombre = _nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String _autor) {
        autor = _autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int _anio) {
        anio = _anio;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int _volumen) {
        volumen = _volumen;
    }

    public boolean esPrestado() {
        return prestado;
    }

    public void setPrestado(boolean _prestado) {
        prestado = _prestado;
    } 



}
