package hashtable;

public class Main {
    public static void main(String args[]) {
        HashTable myHashTable = new HashTable();
        myHashTable.set("paint", 20);
        myHashTable.set("bolts", 40);

        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);

        // myHashTable.set("bolts", 200);
        // myHashTable.set("screws", 140);
        // myHashTable.printTable();
        System.out.println(myHashTable.keys());

        // System.out.println(myHashTable.get("lumber"));
        // System.out.println(myHashTable.get("bolts"));

    }

}
