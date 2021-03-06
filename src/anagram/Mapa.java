/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package anagram;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author matejka
 */
public class Mapa implements Comparable<Mapa>
{

    private HashMap<Character, Integer> mapa = new HashMap<>();

    public Mapa()
    {

        mapa.put('a', 0);
        mapa.put('b', 0);
        mapa.put('c', 0);
        mapa.put('d', 0);
        mapa.put('e', 0);
        mapa.put('f', 0);
        mapa.put('g', 0);
        mapa.put('h', 0);
        mapa.put('i', 0);
        mapa.put('j', 0);
        mapa.put('k', 0);
        mapa.put('l', 0);
        mapa.put('m', 0);
        mapa.put('n', 0);
        mapa.put('o', 0);
        mapa.put('p', 0);
        mapa.put('q', 0);
        mapa.put('r', 0);
        mapa.put('s', 0);
        mapa.put('t', 0);
        mapa.put('u', 0);
        mapa.put('v', 0);
        mapa.put('w', 0);
        mapa.put('x', 0);
        mapa.put('y', 0);
        mapa.put('z', 0);
    }

    public void pridejVyskyt(Character klic)
    {
        Object puvodniHodnota;
        puvodniHodnota = mapa.get(klic);
        mapa.put(klic, (Integer) puvodniHodnota + 1);

    }

    public void vypisMapu()
    {
        //System.out.print(mapa + "\n");

        Set keys = mapa.keySet();
        for (Object key : keys)
        {
            System.out.print("Prvek[" + key + "]: " + mapa.get(key) + ", ");
        }
        System.out.println("");
    }


    @Override
    public int compareTo(Mapa o)
    {
        Set keys = mapa.keySet();
        for (Object key : keys)
        {
            if (mapa.get(key) != o.getValForKey(key))
            {
                return -1;
            }
        }
      return 1;
    }

    private Integer getValForKey(Object key)
    {
        return mapa.get(key);
    }
}
