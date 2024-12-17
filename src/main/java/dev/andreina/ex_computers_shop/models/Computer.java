package dev.andreina.ex_computers_shop.models;

public class Computer {
    private String computerBrand;
    private int memory;
    private String processorCharacteristics;
    private String operatingSystem;
    private int price;

    public Computer(String computerBrand, int memory, String processorCharacteristics, String operatingSystem,
            int price) {
        this.computerBrand = computerBrand;
        this.memory = memory;
        this.processorCharacteristics = processorCharacteristics;
        this.operatingSystem = operatingSystem;
        this.price = price;
    }

    public String getComputerBrand() {
        return computerBrand;
    }

    public void setComputerBrand(String computerBrand) {
        this.computerBrand = computerBrand;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getProcessorCharacteristics() {
        return processorCharacteristics;
    }

    public void setProcessorCharacteristics(String processorCharacteristics) {
        this.processorCharacteristics = processorCharacteristics;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
//method show information of computers
@Override
public String toString() {
    return "Computer{" + "brand='" + computerBrand + '\'' +
                ", memory=" + memory + " GB" +
                ", processor='" + processorCharacteristics + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", price=$" + price +
                '}';
}
    



}
