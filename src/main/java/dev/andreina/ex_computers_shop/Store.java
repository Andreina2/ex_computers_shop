package dev.andreina.ex_computers_shop;

public class Store {
    private String storeName;
    private String ownerFullName;
    private String storeTaxIdentifier;


    public Store(String storeName, String ownerFullName, String storeTaxIdentifier) {
        this.storeName = storeName;
        this.ownerFullName = ownerFullName;
        this.storeTaxIdentifier = storeTaxIdentifier;
    }


    public String getStoreName() {
        return storeName;
    }


    public String getOwnerFullName() {
        return ownerFullName;
    }


    public String getStoreTaxIdentifier() {
        return storeTaxIdentifier;
    }

    



}
