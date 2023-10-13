/*
  Titre      : PlusGrandeValeur
  Auteur     : Crepin Vardin Fouelefack
  Date       : 11/10/2023
  Description: Remplissage dynamique d'un tableau et d'une liste chainees et affichage du max et son index
  Version    : 0.0.1
*/

//Lien github  https://github.com/crepin21/TableauDevoir12023

//Importation des librairies necessaires
package Organisation;
import Organisation.Models.Liste;
import Organisation.Models.Tableau;
import Organisation.Utils.LinkedList;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) throws Exception 
    {
      
      Scanner sc = new Scanner(System.in);
      while(true)
      {  
        //Menu options
        System.out.println("Choisissez une option");
        System.out.println("1-Utilisation des tableaux");
        System.out.println("2-Utilisation des Listes Chainees");
        System.out.println("3-Quitter le programme");
        int choix = sc.nextInt();

        switch (choix) 
        {
          case 1:
              int tab[] = new int[15];                //Creation d'un tableau
              Tableau nouveauExple = new Tableau(tab); //Creation d'un objet de la classe Tableau en passant le tableau tab en parametre
              nouveauExple.initialiserTableau();       //Initialisation du tableau avec des variables aleatoires
              nouveauExple.affichageTableau();         //Afiichage des elts du tableau cree
              nouveauExple.trouverPlusGrand();  
            break;
          case 2:
              LinkedList<Integer> listeChainee = new LinkedList<>(); //Creation d'une liste
              Liste listeCh = new Liste(listeChainee);               //Creation d'un objet de la classe Liste en passant la liste listeChainee en parametre
              listeCh.initialiserListe();                         //Initialisation de la liste avec des variables aleatoires
              listeCh.affichageListe();                           //Affichage du plus grand elt ainsi que son index
              listeCh.trouverPlusGrand();
              break;
          case 3:
              System.out.println("Au revoir !");
              System.exit(0);                          //Sortir du programme
              break;
          default:
              System.out.println("Choisissez une option valide \n");   //Message en cas de mauvais choix

        }
      }    
    }
}
