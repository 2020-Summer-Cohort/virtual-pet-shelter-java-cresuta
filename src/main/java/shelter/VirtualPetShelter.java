package shelter;

import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
    Map<String, VirtualPet> virtualShelter = new HashMap<>();

    public Map<String, VirtualPet> showAllVirtualPets() {
        return virtualShelter;
    }

    public VirtualPet showVirtualPet(String name) {
        return virtualShelter.get(name);
    }

    public void feedVirtualPets() {
        for (VirtualPet virtualPet : virtualShelter.values()) {
            virtualPet.feed();
        }
    }

    public void waterVirtualPets() {
        for (VirtualPet virtualPet : virtualShelter.values()) {
            virtualPet.water();
        }
    }

    public void play(String name) {
        virtualShelter.get(name).play();
    }

    public void adopt(String name) {
        virtualShelter.remove(name);
    }

    public void admitHomelessPet(String name, VirtualPet newVirtualPet) {
        virtualShelter.put(name, newVirtualPet);
    }

    public void updateVirtualPetShelter() {
        for (VirtualPet virtualPet : virtualShelter.values()) {
            virtualPet.updateVirtualPetFields();
        }
    }
}
