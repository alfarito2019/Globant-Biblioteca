import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> catalogo;
    private ArrayList<Libro> listado;
    private Persona persona = new Persona("Luca Alfaro", listado);
    private ArrayList<Persona> lista = new ArrayList<>();

    public Biblioteca(ArrayList<Libro> catalogo) {
        lista.add(persona);
        this.catalogo = catalogo;
    }

    public ArrayList<Libro> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(ArrayList<Libro> catalogo) {
        this.catalogo = catalogo;
    }

    public void agregarLibro(Libro lib){
        this.catalogo.add(lib);
    }

    public void mostrarLibros(){
        for (Libro lib:catalogo){
            System.out.println("-------------------------------------------------");
            lib.obtenerInformacion();
        }
    }

    public void prestarLibro(){
        System.out.println("Ingrese el titulo del libro a prestar");
        String titulo = Main.ingresarCadena();
        System.out.println("Ingrese la persona a la que se le prestará");
        String nombre = Main.ingresarCadena();
        Libro libro = buscarPorTitulo(catalogo, titulo);
        Persona pers = buscarPorNombre(lista, titulo);
        if(libro!= null){
            if(libro.getCantidadLibros()==0){
                System.out.println("Lo sentimos, libro agotado");
            }else{
                libro.prestar();
                System.out.println("Prestamo exitoso");
            }
        }else{
            System.out.println("Libro no encontrado");
        }
    }

    public void devolverLibro(){
        System.out.println("Ingrese el titulo del libro a devolver");
        String titulo = Main.ingresarCadena();
        Libro libro = buscarPorTitulo(catalogo, titulo);
        if(libro!= null){
                libro.devolver();
                System.out.println("Devolucion exitosa");
        }else{
            System.out.println("Libro no encontrado");
        }
    }

    public static Libro buscarPorTitulo(ArrayList<Libro> catalogo, String titulo) {
        for(Libro libro: catalogo){
            if(titulo.equals(libro.getTitulo())){
                return libro;
            }
        }
        return null;
    }

    public static Persona buscarPorNombre(ArrayList<Persona> personasRegistradas, String nombre) {
        for(Persona persona: personasRegistradas){
            if(nombre.equals(persona.getNombre())){
                return persona;
            }
        }
        return null;
    }
}
