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
import java.util.Random;
import Organisation.Models.Tableau;

public class Max {
    public static void main(String[] args) throws Exception {
      
      int tab[] = new int[15];                //Creation d'un tableau
      Tableau nouveauExple = new Tableau(tab); //Creation d'un objet de la classe Tableau en passant le tableau tab en parametre
      nouveauExple.initialiserTableau();       //Initialisation du tableau avec des variables aleatoires
      nouveauExple.affichageTableau();         //Afiichage des elts du tableau cree
      nouveauExple.trouverPlusGrand();         //Affichage du plus grand elt ainsi que son index
    }
}
