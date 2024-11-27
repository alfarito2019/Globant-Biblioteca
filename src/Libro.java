public class Libro extends ItemBiblioteca implements Catalogable{

    private String titulo;
    private String autor;
    private int paginas;
    private int cantidadLibros;

    public Libro(String titulo, String autor, int cantidadLibros, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.cantidadLibros = cantidadLibros;
        this.paginas = paginas;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


    public int getCantidadLibros() {
        return cantidadLibros;
    }

    public void setCantidadLibros(int cantidadLibros) {
        this.cantidadLibros = cantidadLibros;
    }

    @Override
    public void obtenerInformacion() {
        System.out.println("El titulo es: " + getTitulo());
        System.out.println("El autor es: " + getAutor());
        System.out.println("El número de páginas: " + getPaginas());
        System.out.println("La cantidad de ejemplares es: " + getCantidadLibros());
    }

    @Override
    public int prestar() {
        return cantidadLibros --;
    }

    @Override
    public int devolver() {
        return this.cantidadLibros++;
    }

    @Override
    public int calcularMultas() {
        return 0;
    }
}
