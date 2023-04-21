public class Main {
    public static void main(String[] args) {

        Pizzeria pizzeria = new Pizzeria();

        pizzeria.agregarOferta(PizzaFactory.CODIGO_PIZZA_MUZZARELLA_CHICA);
        pizzeria.agregarOferta(PizzaFactory.CODIGO_PIZZA_ESPECIAL_CHICA);
        pizzeria.agregarOferta(PizzaFactory.CODIGO_PIZZA_ANANA_CHICA);
        pizzeria.agregarOferta(PizzaFactory.CODIGO_PIZZA_COMBINADA_LOCA);
        pizzeria.generarInforme();
    }
}