package org.example.example8;

public class Main {

    public static void main(String[] args) {
        ConsistentHash hash = new ConsistentHash();

        Server s1 = new Server("S1-DB");
        Server s2 = new Server("S2-DB");
        Server s3 = new Server("S3-DB");

        hash.addServer(s1);
        hash.addServer(s2);
        hash.addServer(s3);

        System.out.println("\n--- VERİ ATAMASI ---");
        System.out.println("Key1 atandı: " + hash.assignKeyToServer("UserKey1"));
        System.out.println("Key2 atandı: " + hash.assignKeyToServer("UserKey2"));
        System.out.println("Key3 atandı: " + hash.assignKeyToServer("OrderKey3"));
        System.out.println("Key4 atandı: " + hash.assignKeyToServer("DataKey4"));

        hash.printLoad();

        Server s4 = new Server("S4-New");
        hash.addServer(s4);
        System.out.printf("S4 eklendi. S1'e atanması beklenen 'UserKey1' yeniden atanıyor: %s\n",
                hash.assignKeyToServer("UserKey1"));

        hash.printLoad();
    }
}
