package shelter;

import java.util.Random;

public class VirtualPet {
    private String name;
    private String description;
    private int hunger;
    private int thirst;
    private int boredom;

    Random random = new Random();

    public VirtualPet(String name, String description) {
        this.name = name;
        this.description = description;
        this.hunger += random.nextInt(75);
        this.thirst += random.nextInt(75);
        this.boredom += random.nextInt(75);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }


    public void feed() {
        hunger -= 15;
        thirst += 5;
        boredom -= 5;
    }

    public void water() {
        thirst -= 15;
        hunger += 5;
        boredom -= 5;
    }

    public void play() {
        boredom -= 15;
        hunger += 5;
        thirst += 5;
    }

    public void updateVirtualPetFields() {
        this.hunger += 5;
        this.thirst += 5;
        this.boredom += 5;
    }
}
