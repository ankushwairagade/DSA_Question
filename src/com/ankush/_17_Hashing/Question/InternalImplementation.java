package com.ankush._17_Hashing.Question;


class HashNode
{
    Integer key;
    String value;
    HashNode next;

    public HashNode(Integer key, String value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}

class Hashmap {
    HashNode[] buckets;
    int numofbuckets;
    int size;

    // by default capacity 10
    public Hashmap() {
        this.buckets = new HashNode[10];
        this.numofbuckets = 10;
        this.size = 0;
    }

    // parameterized constructor
    public Hashmap(int capacity) {
        this.buckets = new HashNode[capacity];
        this.numofbuckets = capacity;
        this.size = 0;
    }

    int getNumofbuckets() {return numofbuckets;}
    int size() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }
    // Hashfunction (key)
    // Primary Function of hashmap is   put(key , val) , get(key) , remove(key) ;

    int hashfunction(Integer key) {
        return key % buckets.length;
    }

    public void Put(Integer key, String val) {
        int getpos = hashfunction(key);
        HashNode head = buckets[getpos];

        while (head != null) {
            if (head.key.equals(key)) {
                head.value = val;
                return;
            }

            head = head.next;
        }

        HashNode node = new HashNode(key, val);
        HashNode temp = buckets[getpos];
        size++;
        // insertion node at beginning
        node.next = temp;
        temp = node;
    }

    public String Get(Integer key) {
        int getpos = hashfunction(key);
        HashNode head = buckets[getpos];

        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public String Remove(Integer key) {
        int getpos = hashfunction(key);
        HashNode head = buckets[getpos];
        HashNode prev = null;
        while (head != null) {
            if (head.key.equals(key)) {
                break;
            }
            prev = head;
            head = head.next;
        }

        if (head == null) return null;

        size--;
        prev.next = head.next;

        return head.value;
    }

}
    public class InternalImplementation {
        public static void main(String[] args) {

            Hashmap hashmap = new Hashmap(10);
            hashmap.size();
            hashmap.Put(1,"apple inc");
            hashmap.Put(25,"Jio Inc");
            hashmap.Put(69,"Tata Group");
            hashmap.Put(11,"Google");
            hashmap.Put(2,"Amazon");

            hashmap.size();
            hashmap.getNumofbuckets();
            System.out.println(hashmap.Get(11));

        }

    }


