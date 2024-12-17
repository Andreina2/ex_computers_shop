package dev.andreina.ex_computers_shop.controller;

import java.util.List;

import dev.andreina.ex_computers_shop.models.Computer;
import dev.andreina.ex_computers_shop.models.Store;

public class StoreController {
    private Store store;

    public StoreController(Store store) {
        this.store = store;
    }

    public void addComputer(Computer computer) {
        store.addComputer(computer);
    }

    public boolean deleteComputerGivenItsBrand(String computerBrand) {
        return store.deleteComputerGivenItsBrand(computerBrand);
    }

    public Computer lookComputerGivenItsBrand(String computerBrand) {
        return store.lookComputerGivenItsBrand(computerBrand);
    }

    public List<Computer> listInformationOfAllComputer() {
        return store.listInformationOfAllComputer();
    }

}
