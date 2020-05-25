package shelter;

import java.util.Scanner;

public class VirtualPetShelterApp extends VirtualPetShelter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPetShelter wallysShelter = new VirtualPetShelter();
        VirtualPet goldy = new VirtualPet("Goldy", "a lovable, golden retriever puppy.");
        VirtualPet aspen = new VirtualPet("Aspen", "an energetic, snow white samoyed puppy.");
        wallysShelter.admitHomelessPet("Goldy", goldy);
        wallysShelter.admitHomelessPet("Aspen", aspen);
        System.out.println("Thank you for volunteering at Wally's Virtual Pet Shelter!");
        String petChoice;
        int userChoice;
        boolean isShelterOpen = true;
        while (isShelterOpen) {
            statusChartHeader();
            for(VirtualPet virtualPet: wallysShelter.virtualShelter.values()){
                System.out.println(virtualPet.getName() + "\t"+"\t" + virtualPet.getHunger() + "\t"+"\t" + virtualPet.getThirst() + "\t"+"\t" + virtualPet.getBoredom());
            }
            displayInstructions();
            userChoice = input.nextInt();
            if (userChoice == 1) {
                System.out.println("You feed all the pets!");
                wallysShelter.feedVirtualPets();
                wallysShelter.updateVirtualPetShelter();
            } else if (userChoice == 2) {
                System.out.println("You water all the pets!");
                wallysShelter.waterVirtualPets();
                wallysShelter.updateVirtualPetShelter();
            } else if (userChoice == 3) {
                System.out.println("Which pet would you like to play with?");
                System.out.println(wallysShelter.showAllVirtualPets().keySet());
                input.nextLine();
                petChoice = input.nextLine();
                if (petChoice.equalsIgnoreCase("Goldy")) {
                    wallysShelter.play("Goldy");
                    System.out.println("You played with " + goldy.getName() + "!");
                } else if (petChoice.equalsIgnoreCase("Aspen")) {
                    wallysShelter.play("Aspen");
                    System.out.println("You played with " + aspen.getName() + "!");
                } else{
                    wallysShelter.play(petChoice);
                    System.out.println("You played with " + petChoice + "!");
                }
                wallysShelter.updateVirtualPetShelter();
            } else if (userChoice == 4) {
                System.out.println("Which pet would you like to adopt?");
                System.out.println(wallysShelter.showAllVirtualPets().keySet());
                input.nextLine();
                petChoice = input.nextLine();
                if (petChoice.equalsIgnoreCase("Goldy")) {
                    System.out.println("You adopted " + petChoice + "!");
                    wallysShelter.adopt("Goldy");
                } else if (petChoice.equalsIgnoreCase("Aspen")) {
                    System.out.println("You adopted " + petChoice + "!");
                    wallysShelter.adopt("Aspen");
                } else {
                    System.out.println("You adopted " + petChoice + "!") ;
                    wallysShelter.adopt(petChoice);
                }
                wallysShelter.updateVirtualPetShelter();
            } else if (userChoice == 5) {
                System.out.println("Please provide a name and description for the pet you would like to admit.");
                System.out.println("Name: ");
                input.nextLine();
                String newAdmitName = input.nextLine();
                System.out.println("Description: ");
                input.next();
                String newAdmitDescription = input.nextLine();
                VirtualPet newAdmit = new VirtualPet(newAdmitName, newAdmitDescription);
                wallysShelter.admitHomelessPet(newAdmitName, newAdmit);
                wallysShelter.updateVirtualPetShelter();
            } else if (userChoice == 6) {
                goodbyeMessage();
                break;
            }
        }
    }

    public static void displayInstructions() {
        System.out.println("\nWhat would you like to do next?");
        System.out.println("1. Feed the pets");
        System.out.println("2. Water the pets");
        System.out.println("3. Play with a pet");
        System.out.println("4. Adopt a pet");
        System.out.println("5. Admit a pet");
        System.out.println("6. Quit");
    }

    public static void statusChartHeader() {
        System.out.println("\nThis is the status of all the pets: ");
        System.out.println("\nName   |Hunger  |Thirst  |Boredom");
        System.out.println("-------|--------|--------|--------");
    }

    public static void goodbyeMessage(){
        System.out.println("Wally's Virtual Pet Shelter is now closed for the evening.");
        System.out.println("Thanks for volunteering today.");
        System.out.println("Goodbye!");
    }
}
