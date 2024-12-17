package dev.andreina.ex_computers_shop.models;
import dev.andreina.ex_computers_shop.controller.StoreController;
import dev.andreina.ex_computers_shop.view.StoreView;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        //1: System.out.println("Hello World!");
        Store store = new Store("Nina's Store", "Andreina Arias", 123456789);
        
        StoreController storeController= new StoreController(store); // Instanciando el controller

        StoreView storeView= new StoreView(storeController);

        storeView.menu();
    }
}
