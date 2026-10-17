package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class Main {

    public static void main(String[] args) {

        Zoo zoo1 = new Zoo("Zoo Tunis", "Tunis");

        Animal a1 = new Animal("Felidae", "Lion", 5, true);
        Animal a2 = new Animal("Felidae", "Tigre", 4, true);
        Animal a3 = new Animal("Canidae", "Loup", 3, true);

        System.out.println("===== AJOUT DES ANIMAUX =====");

        System.out.println("Lion : " + zoo1.addAnimal(a1));
        System.out.println("Tigre : " + zoo1.addAnimal(a2));
        System.out.println("Loup : " + zoo1.addAnimal(a3));

        // Affichage
        System.out.println("\n===== ANIMAUX DU ZOO =====");
        zoo1.displayAnimals();




        System.out.println("\n===== ENCAPSULATION =====");

        // Age négatif
        Animal a4 = new Animal("Felidae", "Panthere", -5, true);

        System.out.println("Age de la Panthere : "
                + a4.getAge());

        // Nom du zoo vide
        Zoo zoo2 = new Zoo("", "Sousse");

        System.out.println("Nom du zoo : "
                + zoo2.getName());



        // TEST RECHERCHE
        System.out.println("\n===== RECHERCHE =====");

        int position = zoo1.searchAnimal(a1);

        System.out.println("Position du Lion : " + position);




        System.out.println("\n===== SUPPRESSION =====");

        System.out.println("Suppression du Tigre : "
                + zoo1.removeAnimal(a2));

        System.out.println("\nAnimaux restants :");
        zoo1.displayAnimals();




        System.out.println("\n===== TEST ZOO PLEIN =====");

        System.out.println("Le zoo est plein : "
                + zoo1.isZooFull());
    }
}