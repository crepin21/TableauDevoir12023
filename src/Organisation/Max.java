/*
  Titre      : PlusGrandeValeur
  Auteur     : Crepin Vardin Fouelefack
  Date       : 11/10/2023
  Description: Remplissage dynamique d'un tableau et affichage du max et son index
  Version    : 0.0.1
*/

//Lien github  

//Importation des librairies necessaires
package Organisation;
import Organisation.Models.Liste;
import Organisation.Models.Tableau;
import Organisation.Utils.LinkedList;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) throws Exception {
      
      System.out.println("Choisissez une option");
      System.out.println("1-Utilisation des tableaux");
      System.out.println("2-Utilisation des Listes....");
      Scanner sc = new Scanner(System.in);
      int choix = sc.nextInt();

      switch (choix) {
        case 1:
            int tab[] = new int[15];                //Creation d'un tableau
            Tableau nouveauExple = new Tableau(tab); //Creation d'un objet de la classe Tableau en passant le tableau tab en parametre
            nouveauExple.initialiserTableau();       //Initialisation du tableau avec des variables aleatoires
            nouveauExple.affichageTableau();         //Afiichage des elts du tableau cree
            nouveauExple.trouverPlusGrand();  
          break;
        case 2:
            LinkedList<Integer> listeChainee = new LinkedList<>();
            Liste listeCh = new Liste(listeChainee);
            listeCh.initialiserListe();
            listeCh.affichageListe();
            listeCh.trouverPlusGrand();
            break;
        default:
            System.out.println("Choisissez une option valide");

      }
             //Affichage du plus grand elt ainsi que son index
    }
}
