import java.util.ArrayList;

public class Persona {
    private String nombre;
    private ArrayList<Libro> listaLibros;

    public Persona(String nombre, ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
        this.nombre = nombre;
    }



    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
