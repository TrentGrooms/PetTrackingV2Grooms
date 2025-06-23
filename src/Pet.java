import java.util.Arrays;
import java.util.List;

class PetConstants {
    public static final List<String> SPECIES_OPTIONS = Arrays.asList("DOG", "CAT", "RABBIT", "BIRD");
    public static final List<String> VACCINE_OPTIONS = Arrays.asList("Vaccinated", "Not Vaccinated");
}

public class Pet {
    private String name;
    private String species;
    private String breed;
    private int age;
    private String vaccinationStatus;

    public Pet() {
        this.name = "Unknown";
        this.species = "Unknown";
        this.breed = "Unknown";
        this.age = 0;
        this.vaccinationStatus = "Unknown";
    }

    public Pet(String name) {
        this.name = name;
        this.species = "Unknown";
        this.breed = "Unknown";
        this.age = 0;
        this.vaccinationStatus = "Unknown";
    }

    public Pet(String name, String species, String breed, int age, String vaccinationStatus) {
        setName(name);
        setSpecies(species);
        setBreed(breed);
        setAge(age);
        setVaccinationStatus(vaccinationStatus);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.equals("")) {
            this.name = name;
        }
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        for (String type : PetConstants.SPECIES_OPTIONS) {
            if (species.equalsIgnoreCase(species)) {
                this.species = type;
                return;
            } else {
                this.species = "Unknown";
            }

        }

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (!breed.equals("")) {
            this.breed = breed;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 30) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public String getVaccinationStatus() {
        return vaccinationStatus;
    }

    public void setVaccinationStatus(String vaccinationStatus) {
        for (String status : PetConstants.VACCINE_OPTIONS) {
            if (vaccinationStatus.equalsIgnoreCase(vaccinationStatus)) {
                this.vaccinationStatus = status;
                return;
            } else {
                this.vaccinationStatus = "Not Vaccinated";
            }
        }
    }
    public static void printPetCareTips() {
        System.out.println("Make sure you feed your pet!");
}
public void printAllPetData () {
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age);
        System.out.println("Vaccination Status: " + vaccinationStatus);
}


}

