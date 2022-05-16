package com.ankush._17_Hashing;

import java.util.Hashtable;
import java.util.Iterator;

public class Concept_HashTable {

    public static void main(String[] args) {

        Hashtable<Integer,String> ht = new Hashtable<>();

        ht.put(1,"Ankush");
        ht.put(2,"giri");
        ht.put(3,"rohit");
        ht.put(4,"arpit");
        ht.put(5,"mangesh");
        ht.put(5,"96");  // overwriting lastest value

        System.out.println(ht);


        System.out.println( ht.get(5));

        ht.remove(5);

        for(int i=1;i<=ht.size();i++)
        {
            System.out.println(ht.get(i));
        }


        Iterator<Integer> itr = ht.keySet().iterator();

                while(itr.hasNext())
                {
                    Integer key = itr.next();
                    String value = ht.get(key);
                System.out.println( " Key "+key +" Value "+value);

                }

    }
}
