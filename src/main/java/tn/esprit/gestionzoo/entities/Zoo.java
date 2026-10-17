package tn.esprit.gestionzoo.entities;

public class Zoo {

    private Animal[] animals;
    private String name;
    private String city;

    final int nbrCages = 25;

    private int nbrAnimals;


    public Zoo(String name, String city) {

        // Le nom du zoo ne doit pas être vide
        if (name == null || name.isEmpty()) {
            this.name = "Zoo sans nom";
        } else {
            this.name = name;
        }

        this.city = city;
        this.animals = new Animal[nbrCages];
        this.nbrAnimals = 0;
    }

    // Instruction 17
    // Ajouter un animal en utilisant isZooFull()
    public boolean addAnimal(Animal animal) {

        if (isZooFull()) {
            return false;
        }

        if (searchAnimal(animal) == -1) {

            animals[nbrAnimals] = animal;
            nbrAnimals++;

            return true;
        }

        return false;
    }

    // Afficher animaux
    public void displayAnimals() {

        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    // Rechercher un animal
    public int searchAnimal(Animal animal) {

        for (int i = 0; i < nbrAnimals; i++) {

            if (animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }

        return -1;
    }

    // Supprimer un animal
    public boolean removeAnimal(Animal animal) {

        int position = searchAnimal(animal);

        if (position == -1) {
            return false;
        }


        for (int i = position; i < nbrAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }

        animals[nbrAnimals - 1] = null;

        nbrAnimals--;

        return true;
    }

    public boolean isZooFull() {

        return nbrAnimals == nbrCages;
    }


    public static Zoo zooWithMoreAnimals(Zoo z1, Zoo z2) {

        if (z1.nbrAnimals > z2.nbrAnimals) {
            return z1;
        } else {
            return z2;
        }
    }


    public String getName() {
        return name;
    }


    public String getCity() {
        return city;
    }


    public int getNbrAnimals() {
        return nbrAnimals;
    }
}