package com.ankush._17_Hashing;

public class HashMap {

    HashNode[] buckets;
    int numofBuckets;
    int size;

    class HashNode  // blueprint of Node     key, value, next--->
    {
        String value;
        Integer key;
        HashNode next;

        HashNode(Integer key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    HashMap() // by default set 10
    {
        this.numofBuckets = 10;
        this.buckets = new HashNode[10];
    }

    HashMap(int capacity) // parameterized constructor
    {
        this.numofBuckets = capacity;
        this.buckets = new HashNode[capacity];
    }

    int size() {
        return size;
    }

    boolean IsEmpty() {
        return size == 0;
    }

    // primary function of hashmap is ....
    //   get(key), put(key,value) , remove(key),   getbucketIndex(key)

    // hash function Modular hash
    int getBucketIndex(Integer key) {
        return key % buckets.length;
        // hash function   key  %  n = location
    }

    public void put(Integer key, String value) {
        if (key == null || value == null) {
            throw new IllegalArgumentException("key or value is null");
        }
        int indexpos = getBucketIndex(key);
        HashNode head = buckets[indexpos];
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next; // next
        }
        size++; // mean how many index position filled so_far

        head = buckets[indexpos];    // pointing to first node
        HashNode in = new HashNode(key, value);
        in.next = head;
        buckets[indexpos] = in;

    }

    public String get(Integer key) {
        int positionindex = getBucketIndex(key);
        HashNode head = buckets[positionindex];

        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public String remove(Integer key) {
        int indexposition = getBucketIndex(key);
        HashNode curr = buckets[indexposition];
        HashNode prev = null;

        while (curr != null) {
            if (curr.key.equals(key)) break;

            prev = curr;
            curr = curr.next;
        }

        if (curr == null) return null;
        size--;
        if (prev != null) {
            prev.next = curr.next;
        } else {
            buckets[indexposition] = curr.next;  // starting head
        }

        return curr.value;
    }

    public static void main(String[] args) {
        HashMap hm = new HashMap(10); // random size is 10
        hm.put(10, "ankush");
        hm.put(1, "giri");
        hm.put(31, "rohit");
        hm.put(10, "harry");
        System.out.println(hm.size());
        System.out.println(hm.get(1));
        System.out.println(hm.get(31));
        System.out.println(hm.remove(31));
        System.out.println(hm.get(31));
        System.out.println(hm.get(599));

    }
}
