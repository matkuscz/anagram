/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package anagram;

import java.util.*;

/**
 *
 * @author matejka
 */
public class Anagram
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Mapa mapicka = new Mapa();
        Anagram anagram = new Anagram();
        Boolean mameAnagram = false;
        
        System.out.print(mapicka + "\n");
        
        mapicka.vypisMapu();
        
        mapicka.pridejVyskyt(new Character('b'));
        mapicka.pridejVyskyt(new Character('b'));
        mapicka.pridejVyskyt(new Character('b'));
        mapicka.pridejVyskyt(new Character('b'));
        mapicka.pridejVyskyt(new Character('b'));
        mapicka.pridejVyskyt(new Character('b'));
        
        mapicka.vypisMapu();
        mameAnagram = Anagram.zjistiAnagram("cadac", "daacc");
        
        System.out.println(mameAnagram);
        
    }
    
    public static Boolean zjistiAnagram(String prvniVeta, String druhaVeta)
    {
        Boolean jeAnagram = false;
        
        Character pismeno;
        Character pismeno2;
        
        Mapa mapkaPrvnihoSlova = new Mapa();
        
        for (int i = 0; i < prvniVeta.length(); i++)
        {
            pismeno = prvniVeta.charAt(i);
            mapkaPrvnihoSlova.pridejVyskyt(pismeno);
        }
        
        mapkaPrvnihoSlova.vypisMapu();

        Mapa mapkaDruhehoSlova = new Mapa();
        
        for (int j = 0; j < druhaVeta.length(); j++)
        {
            pismeno2 = druhaVeta.charAt(j);
            mapkaDruhehoSlova.pridejVyskyt(pismeno2);
        }
        
        mapkaDruhehoSlova.vypisMapu();
        
        
        return Mapa.porovnejMapy(mapkaPrvnihoSlova, mapkaDruhehoSlova);
        
        
        
        
    }
}
