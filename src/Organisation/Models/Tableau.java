package Organisation.Models;
import java.util.Random;
import javax.management.ConstructorParameters; 

//Declaration de la classe
/**
 * @author Crepin21
 * @version 0.0.1
 * @param tableau
 * tableau d'entiers
  
*/
public class Tableau 
{
    private int[] tableau;

    public Tableau(int[] tableau)
    {
        this.tableau = tableau;
    }

    /**
     * @param val
     * Nombre permettant de choisir des valeurs entre 1 et 100
     * @param rand
     * @return
     * initialise les valeurs du tableau aleatoirement
    */
    public void initialiserTableau()
    {
        int val = 101;
        Random rand = new Random();
        System.out.println("Initialisation du tableau...");
        for(int i = 0; i < tableau.length; i++)
        {
            tableau[i] = rand.nextInt(val);
        }
    }

    /**
     * @return
     * Affiche l'ensemble du tableau
     */
    public void affichageTableau()
    {
        System.out.println("***Affichage du tableau***");
        for(int i = 0; i < tableau.length; i++)
        {
            System.out.print("tableau [" + i + "] = " + tableau[i]);
            System.out.println();
        }
    }

    /**
     * @param maxValeur
     * Valeur maximale du tableau
     * @param indexMax
     * index du plus grand element du tableau
     * @return
     * la plus grande valeur du tableau et son index
     */
    public void trouverPlusGrand()
    {
        int maxValeur = tableau[0];
        int indexMax  = 0;
        for(short i = 1; i < tableau.length; i++)
        {
            if(tableau[i] > maxValeur)
            {
                maxValeur = tableau[i];
                indexMax  = i;
            }
        }
        
        //Affichage
        System.out.println("Le plus grand nombre du tableau est: " + maxValeur);
        System.out.println("Il est a l'index: " + indexMax);
    }
}