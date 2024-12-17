package dev.andreina.ex_computers_shop.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StoreTest {
    @Test
    void testAddComputer() {
        Store store = new Store("Technology Store", "Pedro Perez", 567894112);
        Computer computer= new Computer("Dell", 70, "Intel5", "Windows", 800);
        store.addComputer(computer);

        assertEquals(1, store.listInformationOfAllComputer().size()); // Valor esperado 1, size: tamaño de la lista en este caso un computador y tienda

    }

    @Test
    void testDeleteComputerGivenItsBrand() {
        Store store = new Store("Tech IT Store", "María Hernandez", 456123987);
        Computer computer= new Computer("Asus", 90, "Intel5", "Windows",900);
        store.addComputer(computer);

        boolean deleted= store.deleteComputerGivenItsBrand("Asus");
        assertTrue(deleted);

        assertEquals(0, store.listInformationOfAllComputer().size());

    }

    @Test
    void testGetOwnerFullName() {
        Store store = new Store("Tech IT Store", "María Hernandez", 456123987);
        assertEquals("María Hernandez", store.getOwnerFullName());

    }

    @Test
    void testGetStoreName() {
        Store store = new Store("Tech IT Store", "María Hernandez", 456123987);
        assertEquals("Tech IT Store", store.getStoreName());

    }

    @Test
    void testGetStoreTaxIdentifier() {
        Store store = new Store("Tech IT Store", "María Hernandez", 456123987);
        assertEquals(456123987, store.getStoreTaxIdentifier());

    }

    @Test
    void testListInformationOfAllComputer() {

    }

    @Test
    void testLookComputerGivenItsBrand() {
        Store store = new Store("Technology Store", "Pedro Perez", 567894112);
        Computer computer= new Computer("Dell", 70, "Intel5", "Windows", 800);
        store.addComputer(computer);

        Computer found= store.lookComputerGivenItsBrand("Dell");
        assertNotNull(found);

        assertEquals("Dell", found.getComputerBrand());


    }
}
