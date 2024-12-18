package dev.andreina.ex_computers_shop.models;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private String storeName;
    private String ownerFullName;
    private int storeTaxIdentifier;
    private List <Computer> computers;


    public Store(String storeName, String ownerFullName, int storeTaxIdentifier) {
        this.storeName = storeName;
        this.ownerFullName = ownerFullName;
        this.storeTaxIdentifier = storeTaxIdentifier;
        this.computers= new ArrayList<>();
    }


    public String getStoreName() {
        return storeName;
    }


    public String getOwnerFullName() {
        return ownerFullName;
    }


    public int getStoreTaxIdentifier() {
        return storeTaxIdentifier;
    }

    // method add computers to the store
    public void addComputer (Computer computer) {
        computers.add(computer);
    
    }

    // method delete computers to the store
    public boolean deleteComputerGivenItsBrand (String computerBrand) {
        for (Computer computer: computers) {
            if (computer.getComputerBrand().equalsIgnoreCase(computerBrand)) {
                computers.remove(computer);
                System.out.println("Computer delete:" + computerBrand);
                return true;
            }
        }
            System.out.println("Computer not found:" + computerBrand);
            return false;
    
}
    // method search computers to the store
    public Computer lookComputerGivenItsBrand(String brand) {
        for (Computer computer: computers) {
            if (computer.getComputerBrand().equalsIgnoreCase(brand)) {
                return computer;
            }

    }
        return null;
}
    // method list computers to the store
        public List <Computer> listInformationOfAllComputer() {
            return computers;
        }
    



}
