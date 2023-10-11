package Organisation.Models;
import java.util.Random; 

//Declaration de la classe
public class Tableau 
{
    private int[] tableau;

    public Tableau(int[] tableau)
    {
        this.tableau = tableau;
    }

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

    public void affichageTableau()
    {
        System.out.println("***Affichage du tableau***");
        for(int i = 0; i < tableau.length; i++)
        {
            System.out.print("tableau [" + i + "] = " + tableau[i]);
            System.out.println();
        }
    }

    public void trouverPlusGrand()
    {
        int maxValeur = tableau[0];
        int indexMax  = 0;
        for(short i = 1; i < tableau.length; i++)
        {
            if(tableau[i] > maxValeur)
            {
                maxValeur = tableau[i];
                indexMax = i;
            }
        }
        
        //Affichage
        System.out.println("Le plus grand nombre du tableau est: " + maxValeur);
        System.out.println("Il est a l'index: " + indexMax);
    }
}