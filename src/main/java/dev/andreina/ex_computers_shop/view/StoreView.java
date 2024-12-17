package dev.andreina.ex_computers_shop.view;

import java.util.Scanner;

import dev.andreina.ex_computers_shop.controller.StoreController;

import dev.andreina.ex_computers_shop.models.Computer;


public class StoreView {
    private StoreController storeController;

    public StoreView(StoreController storeController) {
        this.storeController = storeController;
    }

    public void menu() {
        Scanner scanner= new Scanner(System.in);
        int option= 0;

        while (option != 5) {

        System.out.println("--- Store Menu ---");
        System.out.println("1. Add Computer");
        System.out.println("2. Delete Computer");
        System.out.println("3. Search Computer");
        System.out.println("4. List Computer");
        System.out.println("5. Close");
        System.out.print("Choose an option: ");

        option = scanner.nextInt();
            scanner.nextLine();

        if (option==1) {
            addComputer(scanner);
        }
        
        else if (option==2) {
            deleteComputerGivenItsBrand(scanner);
        }

        else if (option==3) {
            lookComputerGivenItsBrand(scanner);
        }
        
        else if (option==4) {
            listInformationOfAllComputer();
        }

        else if (option == 5) {
        System.out.println("See you next time!");
        }

        else {
            System.out.println("Not a valid option, please try again");
        }
    }

}

    private void addComputer (Scanner scanner) {
    System.out.println("Enter brand computer:");
    String brandComputer = scanner.nextLine();

    System.out.println("Enter memory:");
    int memory = scanner.nextInt();

    System.out.println("Enter processor characteristics:");
    String processorCharacteristics = scanner.nextLine();

    System.out.println("Enter operating system:");
    String operatingSystem = scanner.nextLine();

    System.out.println("Enter price computer:");
    int price = scanner.nextInt();

    Computer computer= new Computer(brandComputer, memory, processorCharacteristics, operatingSystem, price);
    storeController.addComputer(computer);
    System.out.println("Computer added successfully.");

}

    private void deleteComputerGivenItsBrand (Scanner scanner) {
    System.out.println("Enter the brand computer that you want to delete:");
    String brandComputer = scanner.nextLine();
    boolean deleted = storeController.deleteComputerGivenItsBrand(brandComputer);

    if (deleted) {
        System.out.println("Computer deleted");
    }
    else {
        System.out.println("Computer not found with this brand");
    }
}

    private void lookComputerGivenItsBrand (Scanner scanner) {
    System.out.println("Enter the brand computer that you want to search:");
    String brandComputer = scanner.nextLine();
    Computer computer= storeController.lookComputerGivenItsBrand(brandComputer);

    if ( computer !=null ) {
        System.out.println("The computer is:" + computer);
    }

    else {
        System.out.println("Computer not found with this brand");
    }
}
    private void listInformationOfAllComputer() {
        System.out.println("List of all computers in the store");
        for (Computer computer : storeController.listInformationOfAllComputer()) {
        System.out.println(computer);

    }

    }
}
