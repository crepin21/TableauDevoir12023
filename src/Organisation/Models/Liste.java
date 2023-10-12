package Organisation.Models;

import java.util.Random;

import Organisation.Utils.LinkedList;

public class Liste
{
    private LinkedList<Integer> liste; //Creation d'une liste d'entiers

    //Constructeur
    public Liste(LinkedList<Integer> listeChainee)
    {
        this.liste = new LinkedList<Integer>();
    }

    //Initialiser la liste
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

    public void affichageListe()
    {
        System.out.println("***Affichage du tableau***");
        for(int i = 1; i < liste.size(); i++)
        {
            System.out.println("liste [" + i + "] = " + liste.get(i));
        }
    }

    //Plus grand elt et son index
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
        System.out.println("Le plus grand nombre du tableau est: " + maxValeur);
        System.out.println("Il est a l'index: " + indexMax);
    }
}