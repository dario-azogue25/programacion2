public class Producto {
    public String sku;
    public String nombre;
    public double precio;
    public int stock;
    public boolean activo;
    private boolean tieneStock() {
        return true;
    }
    private void aplicarDescuento(double num) {

    }
    private void vender(int num) {

    }
    private double getPrecio() {
        return 0.5;
    }
    public String toString() {
        return "hola";
    }

}
