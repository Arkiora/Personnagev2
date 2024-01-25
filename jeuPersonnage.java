import Personnage.*;
import java.util.Random;

public class jeuPersonnage{
    public static void main(String args[]) {
        //Ajout des rsonnages avec leurs noms et leur vie + déclaration de la vie des personnages //
       Personnage UnSorcier = new Personnage("Ahmet", ((int) (Math.random() * ((75 - 15)))));
       System.out.println("La vie du sorcier est " + UnSorcier.LaVie());
       Personnage UnGladiateur = new Personnage("Matthew", ((int) (Math.random() * ((100 - 25)))));
       System.out.println("La vie du gladiateur est " + UnGladiateur.LaVie());
       System.out.println("");

        //Print des noms défini pour les deux objets//
       System.out.println("Le nom du sorcier = " + UnSorcier.LeNom());
       System.out.println("Le nom du gladiateur = " + UnGladiateur.LeNom());
       System.out.println("");

        //Utilisation d'une potion//
       System.out.println("Le sorcier prend une potion");
       UnSorcier.Potion();
       System.out.println("La vie du du sorcier est maintenant de " + UnSorcier.LaVie());
       System.out.println("");

        //Attaque d'un objet sur un autre//
       System.out.println("Le gladiateur attaque le sorcier ...");
       System.out.println("...");
       System.out.println("...");
       System.out.println(""); 
       UnGladiateur.Attaque(UnSorcier,((int) (Math.random() * ((40 - 1)))));
       
       //Print de la vie finale//
       System.out.println("Finalement, la vie du gladiateur est " + UnGladiateur.LaVie());
       System.out.println("Finalement, la vie du sorcier est " + UnSorcier.LaVie());

       //Détermination du gagnant//
       if (UnGladiateur.LaVie() > UnSorcier.LaVie()) {
        System.out.println("Le gagnant est le gladiateur");
       }
       else {
        System.out.println("Le gagnant est le sorcier");
       }
	}
}