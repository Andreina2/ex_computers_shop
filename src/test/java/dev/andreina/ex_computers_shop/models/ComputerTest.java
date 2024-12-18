package dev.andreina.ex_computers_shop.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ComputerTest {
    @Test
    void testGetComputerBrand() {
        Computer computer= new Computer("Dell", 70, "Intel7", "Windows", 900);
        assertEquals("Dell", computer.getComputerBrand());

    }

    @Test
    void testGetMemory() {
        Computer computer= new Computer("Dell", 70, "Intel7", "Windows", 900);
        assertEquals(70, computer.getMemory());


    }

    @Test
    void testGetOperatingSystem() {
        Computer computer= new Computer("Dell", 70, "Intel7", "Windows", 900);
        assertEquals("Windows", computer.getOperatingSystem());


    }

    @Test
    void testGetPrice() {
        Computer computer= new Computer("Dell", 70, "Intel7", "Windows", 900);
        assertEquals(900, computer.getPrice());


    }

    @Test
    void testGetProcessorCharacteristics() {
        Computer computer= new Computer("Dell", 70, "Intel7", "Windows", 900);
        assertEquals("Intel7", computer.getProcessorCharacteristics());


    }

    @Test
    void testSetComputerBrand() {
        Computer computer= new Computer("Dell", 70, "Intel7", "Windows", 900);
        computer.setComputerBrand("Acer");
        assertEquals("Acer", computer.getComputerBrand());
    }

    @Test
    void testSetMemory() {
        Computer computer= new Computer("Dell", 70, "Intel7", "Windows", 900);
        computer.setMemory(90);
        assertEquals(90, computer.getMemory());

    }

    @Test
    void testSetOperatingSystem() {
        Computer computer= new Computer("Dell", 70, "Intel7", "Windows", 900);
        computer.setOperatingSystem("mac");
        assertEquals("mac", computer.getOperatingSystem());

    }

    @Test
    void testSetPrice() {
        Computer computer= new Computer("Dell", 70, "Intel7", "Windows", 900);
        computer.setPrice(1000);
        assertEquals(1000, computer.getPrice());

    }

    @Test
    void testSetProcessorCharacteristics() {
        Computer computer = new Computer("mac", 90, "Intel3", "Windows", 800);
        computer.setProcessorCharacteristics("Intel5");
        assertEquals("Intel5", computer.getProcessorCharacteristics());

    }

    @Test
    void testToString() {
        Computer computer= new Computer("Lenovo", 32, "Intel5", "Windows", 700);

        String expected=    "Computer{" + "brand='Lenovo'" +
                            ", memory=32" + " GB" +
                            ", processor='Intel5'" +
                            ", operatingSystem='Windows'" +
                            ", price=$700}";
                            assertEquals(expected, computer.toString());
                            
    }
}


