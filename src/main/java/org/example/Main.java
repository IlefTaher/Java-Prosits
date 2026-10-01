package org.example;

public class Main {
    public static void main(String[] args) {
        /*Animal lion = new Animal();

        lion.family = "Feline";
        lion.name = "Lion";
        lion.age = 5;
        lion.isMammal = true;*/
        // on crée simplement les classes et leurs attributs
        //Avant le constructeur, on aurait dû faire beaucoup de lignes pour affecter des valeurs aux attributs de la classe alors que avec les constructeurs parametres , l'operation devient plus facile
        Animal lion = new Animal("Feline", "Lion", 5, true);
        Zoo myZoo = new Zoo("Zoo de Tunis", "Tunis", 20);
        Animal elephant = new Animal("Elephantidae", "Elephant", 10, true);

        Animal eagle = new Animal("Bird", "Eagle", 3, false);
        System.out.println(lion);

        //System.out.println(myZoo);

        // Affichage du zoo avec displayZoo()
        myZoo.displayZoo();

        // Affichage direct de l'objet Zoo
        System.out.println(myZoo);

        // Même résultat
        System.out.println(myZoo.toString());
        // on remarque :Mais si on ne redéfinit pas toString(), Java affiche quelque chose ressemblant à :
        //Zoo@5e2de80c

    }

}
