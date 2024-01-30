import Personnage.*;
import java.util.Random;
import java.util.Scanner;

public class jeuPersonnage{
    public static void main(String args[]) {
        
        //Demande des noms des personnages//
        System.out.println("Veuillez saisir le nom du sorcier : ");
        Scanner scan = new Scanner(System.in);
        String nomSorcier = scan.nextLine();
        System.out.println("Veuillez saisir le nom du gladiateur : ");
        String nomGladiateur = scan.nextLine();
        System.out.println("");

        //Ajout des perrsonnages avec leurs noms et leur vie + déclaration de la vie des personnages //
       Personnage UnSorcier = new Personnage(nomSorcier, ((int) (Math.random() * ((50 - 20)))));
       System.out.println("La vie du sorcier est " + UnSorcier.LaVie());
       Personnage UnGladiateur = new Personnage(nomGladiateur, ((int) (Math.random() * ((70 - 40)))));
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
       UnGladiateur.Attaque(UnSorcier,((int) (Math.random() * ((40 - 15)))));
       
       //Print de la vie finale//
       System.out.println("Finalement, la vie du gladiateur est " + UnGladiateur.LaVie());
       System.out.println("Finalement, la vie du sorcier est " + UnSorcier.LaVie());

       //Détermination du gagnant//
       if (UnGladiateur.LaVie() > UnSorcier.LaVie()) {
        System.out.println("Le gagnant est " + UnGladiateur.LeNom()) ; 
       }
       else {
        System.out.println("Le gagnant est " + UnSorcier.LeNom());
       }
	}
}