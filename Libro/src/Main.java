public class Main {
    public static void main(String[] args) {
        Libro matematicas;
        matematicas = new Libro();
        Libro lenguaje = new Libro();
        System.out.println(matematicas);
        System.out.println(lenguaje);
        matematicas.titulo = "Nombre Libro: 1 Secundaria";
        matematicas.autor = "Autor de Libro: Dario";
        matematicas.paginas = 255;
        lenguaje.titulo = "Nombre Libro: 2 Secundaria";
        lenguaje.autor = "Autor de Libro: Juan";
        lenguaje.paginas = 360;
        System.out.println(matematicas.autor);
        System.out.println(matematicas.titulo);
        System.out.println(matematicas.paginas);
        System.out.println(lenguaje.autor);
        System.out.println(lenguaje.titulo);
        System.out.println(lenguaje.paginas);

    }
}