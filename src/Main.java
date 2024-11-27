import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int seleccion = 0;
        ArrayList<Libro> Libros = new ArrayList<>();
        Biblioteca bib = new Biblioteca(Libros);
        do {
            System.out.println("\n--- Biblioteca ---");
            System.out.println("1. Agregar libro");
            System.out.println("2. Mostrar libros");
            System.out.println("3. Prestar libro");
            System.out.println("4. Devolver libro");
            System.out.println("5. Salir");

            seleccion = ingresarNumero();
            switch (seleccion) {
                case 1 -> ingresarLibro(bib);
                case 2 -> bib.mostrarLibros();
                case 3 -> bib.prestarLibro();
                case 4 -> bib.devolverLibro();
                case 5 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no permitida");
            }

        } while (seleccion != 5);
    }

    public static void ingresarLibro(Biblioteca bib) {
        System.out.println("Ingrese el titulo del libro");
        String titulo = ingresarCadena();
        System.out.println("Ingrese cantidad de paginas");
        int pag = ingresarNumero();
        System.out.println("Ingrese autor");
        String autor = ingresarCadena();
        System.out.println("Ingrese cantidad de ejemplares");
        int ejemp = ingresarNumero();
        Libro lib = new Libro(titulo, autor, ejemp, pag);
        bib.agregarLibro(lib);
    }

    public static int ingresarNumero() {
        boolean esNumber = false;
        int num = 0;

        do {
            esNumber = true;
            try {
                num = Integer.valueOf(scan.nextLine());
                return num;
            } catch (NumberFormatException e) {
                System.out.println("Error, ingrese un número");
                esNumber = false;
            }

        } while (!esNumber);

        return num;
    }

    public static String ingresarCadena() {
        boolean esString = false;
        String palabra = "";

        do {
            esString = true;
            try {
                palabra = scan.nextLine();
                if(palabra.isEmpty()) {
                    System.out.println("Error, no se admiten campos vacios");
                    esString = false;
                }

                return palabra;
            } catch (NumberFormatException e) {
                System.out.println("Error, ingrese una cadena");
                esString = false;
            }

        } while (!esString);

        return palabra;
    }
}


