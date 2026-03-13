public class Libro {
    public int id = 0;
    public String titulo;
    public String autor;
    public int paginas;

    public Libro() {
        this.id ++;
        this.autor = "Desconocido";
        this.titulo = "Sin Titulo";
        this.paginas = 28;
    }
    public Libro(String titulo, String autor,int paginas) {
        this.id ++;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public Libro (Libro original){
        this.id ++;
        this.titulo = original.titulo;
        this.autor = original.autor;
        this.paginas = original.paginas;
    }
    public int cantidadPaginas() {
        this.id ++;
        return this.paginas;
    }

    public static String cantidadLibros() {
        return "Metodo static";
    }
}
