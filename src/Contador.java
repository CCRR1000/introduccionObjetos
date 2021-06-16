package src;

public class Contador {
    
    private int contador;

    public Contador(){}

    public Contador(int cont) {
        contador = cont;
    }

    public Contador(Contador cont) {
        contador = cont.contador;
    }

    public int incrementar() {
        contador++;
        return contador;
    }

    public int decrementar() {
        contador--;
        return contador;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int _contador) {
        contador = _contador;
    }

    
}
