package com.ankush._10_LinkedList;

import java.util.ArrayDeque;
import java.util.Deque;

public class DesignLRU {

    Deque<Integer> deque;
    int hit =0,miss=0,totalref=0;
    int CACHE_SIZE;

    DesignLRU(int capacity)
    {
        deque = new ArrayDeque<>();
        CACHE_SIZE=capacity;
    }

    DesignLRU(){
        deque = new ArrayDeque<>();
        CACHE_SIZE=5; // default
    }

    void InsertintoCache(int page)
    {   totalref++;
        if(deque.size() < CACHE_SIZE)
        {
            // then insert directly
            // Compulsory miss this will repeated up to capacity miss
            deque.addLast(page);
            miss++;

        }else{
            // Capacity miss / conflict miss
            if(deque.contains(page))  // this contains page or search operation maybe take t(n)=0(n)
            {
                // element is present
                // hit case
                hit++;
                deque.remove(page);
                deque.addLast(page);
            }else {
                // miss case
                miss++;
                deque.removeFirst();
                deque.addLast(page);
            }
        }
    }

    void display()
    {
        System.out.println(deque);
        System.out.println("total cache reference is "+totalref);
        System.out.println("Cache Hit "+hit);
        System.out.println("Cache Miss "+miss);
    }


    public static void main(String[] args) {
        DesignLRU  cache = new DesignLRU(3);
        cache.InsertintoCache(4);
        cache.InsertintoCache(7);
        cache.InsertintoCache(6);
        cache.InsertintoCache(1);
        cache.InsertintoCache(7);
        cache.InsertintoCache(6);
        cache.InsertintoCache(1);
        cache.InsertintoCache(2);
        cache.InsertintoCache(7);
        cache.InsertintoCache(2);

        cache.display();






    }






}