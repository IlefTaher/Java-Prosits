package org.example;

import java.util.Scanner;

public class ZooManagement{

    public static void main(String[] args) {
        /* 1ere instruction
        int nbrCages=20;
        String zooName="my zoo";
        System.out.println("Nombre de cages : " + nbrCages + ", Nom du zoo : " + zooName);

        */
        //2eme instruction 1ere question
        //System.out.println(zooName + " comporte " + nbrCages + "cages " );

        //rest de la 2eme question +3eme instruction
        Scanner sc = new Scanner(System.in);

        int nbrCages;
        String zooName;

        // Vérifier que nbrCages est positif
        do {
            System.out.print("Donnez le nombre de cages : ");
            nbrCages = sc.nextInt();
        } while (nbrCages <= 0);

       // Vider le retour à la ligne après nextInt()
        sc.nextLine();

       // Vérifier que zooName n'est pas vide
        do {
            System.out.print("Donnez le nom du zoo : ");
            zooName = sc.nextLine();
        } while (zooName.trim().isEmpty());

        System.out.println(zooName + " comporte " + nbrCages + " cages");


    }

}
