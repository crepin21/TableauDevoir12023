package Organisation.Models;

import java.util.Random;

import Organisation.Utils.LinkedList;

/**
 * @author Crepin21
 * @version 0.0.1
 * @param listechainee
 * liste d'entiers
  
*/
public class Liste
{
    private LinkedList<Integer> liste; //Creation d'une liste d'entiers

    //Constructeur
    public Liste(LinkedList<Integer> listeChainee)
    {
        this.liste = new LinkedList<Integer>();
    }

    /**
     * @param val
     * Nombre permettant de choisir des valeurs entre 1 et 100
     * @param rand
     * @return
     * initialise les valeurs de la liste aleatoirement
    */
     public void initialiserListe()
    {
        int taille = 15; //Pour obtenir une liste de 
        int val = 101;
        Random rand = new Random();
        System.out.println("Initialisation du tableau...");
        for(int i = 0; i < taille; i++)
        {
            liste.add(rand.nextInt(val));
        }
    }

    /**
     * @return
     * Affiche l'ensemble de la liste
     */
    public void affichageListe()
    {
        System.out.println("***Affichage de la liste***");
        for(int i = 1; i < liste.size(); i++)
        {
            System.out.println("liste [" + i + "] = " + liste.get(i));
        }
    }

    /**
     * @param maxValeur
     * Valeur maximale de la liste
     * @param indexMax
     * index du plus grand element de la liste
     * @return
     * la plus grande valeur de la liste et son index
     */
    public void trouverPlusGrand()
    {
        int maxValeur = liste.get(0);
        int indexMax  = 0;
        for(int i = 1; i < liste.size(); i++)
        {
            if(liste.get(i) > maxValeur)
            {
                maxValeur = liste.get(i);
                indexMax  = i;
            }
        }
        //Affichage
        System.out.println("Le plus grand element de la liste est: " + maxValeur);
        System.out.println("Il est a l'index: " + indexMax);
    }
}