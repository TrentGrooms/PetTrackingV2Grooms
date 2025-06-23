import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
    String name = JOptionPane.showInputDialog("Enter your pets name: ");
    String species = JOptionPane.showInputDialog("Enter your pets species (Options: " + PetConstants.SPECIES_OPTIONS);
    String breed = JOptionPane.showInputDialog("Enter your pets breed: ");
    int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your pets age: "));
    String vaccinationStatus = JOptionPane.showInputDialog("Enter your pets vaccination status (Options: " + PetConstants.VACCINE_OPTIONS);

    Pet pet = new Pet(name, species, breed, age, vaccinationStatus);

    pet.printAllPetData();

    String petInfo = "Name : " + pet.getName() +
                     "\nSpecies: " + pet.getSpecies() +
                     "\nBreed: " + pet.getBreed() +
                     "\nAge: " + pet.getAge()
                     + "\nVaccination status: " + pet.getVaccinationStatus();
    JOptionPane.showMessageDialog(null, petInfo);

    }
}