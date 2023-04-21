public abstract class Pizza {

    //ATRIBUTOS

    private String nombre;
    private String descripcion;

    //CONSTRUCTOR

    public Pizza(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    //METODOS

    public abstract Double calcularPrecio();

    @Override
    public String toString() {
        return "nombre: " + nombre + " precio: " + calcularPrecio();
    }
}
