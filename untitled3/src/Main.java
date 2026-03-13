public class Main {
    public static void main(String[] args) {
        Libro l1 = new Libro();
        Libro l2 = new Libro("El Quijote", "Miguel de Cervantes", 46);
        Libro l3 = new Libro(l2);
        System.out.println(l2.cantidadLibros());
        System.out.println(Math.PI);
        System.out.println(l2.cantidadPaginas());
        l2.paginas = 1000;
        System.out.println(l2.cantidadPaginas());
        System.out.println("El titulo es: " + l2.titulo);
        System.out.println("El autor es: " + l2.autor);
        System.out.println("El numero de paginas es: " + l2.paginas);
        System.out.println("----------------------------");
        System.out.println("El titulo es: " + l3.titulo);
        System.out.println("El autor es: " + l3.autor);
        System.out.println("El numero de paginas es: " + l3.paginas);
    }

}
