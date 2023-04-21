public class PizzaFactory {

    public static final String CODIGO_PIZZA_MUZZARELLA_CHICA = "PIZZA_MUZZARELLA";
    public static final String CODIGO_PIZZA_ESPECIAL_CHICA = "PIZZA_ESPECIAL";
    public static final String CODIGO_PIZZA_ANANA_CHICA = "PIZZA_ANANA";
    public static final String CODIGO_PIZZA_COMBINADA_LOCA = "PIZZA_COMBINADA_LOCA";
    private static PizzaFactory instance;

    private PizzaFactory(){

    }

    public static PizzaFactory getInstance() {
        if (instance == null){
            instance = new PizzaFactory();
        }
        return instance;
    }

    public Pizza crearPizza(String codigo) throws PizzaFactoryException {
        switch (codigo){
            case CODIGO_PIZZA_MUZZARELLA_CHICA:
                return new PizzaSimple("Pizza de muzzarella","soy una pizza de muzzarella chica",700.0,false);
            case CODIGO_PIZZA_ESPECIAL_CHICA:
                return new PizzaSimple("Pizza especial","soy una pizza especial chica",850.0,false);
            case CODIGO_PIZZA_ANANA_CHICA:
                return new PizzaSimple("Pizza de Ananá","soy una pizza de ananá chica",950.0,false);
            case CODIGO_PIZZA_COMBINADA_LOCA:
                PizzaCombinada pizzaCombinada = new PizzaCombinada("Pizza combinada loca","soy mitad pizza especial, y mitad pizza de ananá");
                pizzaCombinada.agregarCombinacion(crearPizza(CODIGO_PIZZA_ESPECIAL_CHICA));
                pizzaCombinada.agregarCombinacion(crearPizza(CODIGO_PIZZA_ANANA_CHICA));
                return pizzaCombinada;
        }
        throw new PizzaFactoryException(codigo + " no es un codigo valido");
    }

}
