public class PizzaSimple extends Pizza{

    //ATRIBUTOS
    private Double precioBase;
    private Boolean esGrande;

    //CONSTRUCTOR

    public PizzaSimple(String nombre, String descripcion, Double precioBase, Boolean esGrande) {
        super(nombre, descripcion);
        this.precioBase = precioBase;
        this.esGrande = esGrande;
    }


    @Override
    public Double calcularPrecio() {
        if(esGrande.equals(true)){
            return precioBase * 2;
        }else {
            return precioBase;
        }
    }
}
