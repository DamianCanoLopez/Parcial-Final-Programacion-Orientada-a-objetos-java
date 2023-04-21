import java.util.ArrayList;
import java.util.List;

public class Pizzeria {

    private List<Pizza> pizzaList;

    public Pizzeria(){
        pizzaList = new ArrayList<>();
    }

    public void agregarOferta(String codicoOferta){
        try {
            pizzaList.add(PizzaFactory.getInstance().crearPizza(codicoOferta));
        }
        catch (PizzaFactoryException e){
            System.out.println(e.getMessage());
        }
    }



    public void generarInforme(){
        for (Pizza pizza : pizzaList) {
            System.out.println(pizza);
        }
    }
}
