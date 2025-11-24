package org.example;

import org.example.example3.CompanyManagement;
import org.example.example3.Employee;
import org.example.example5.LRUCache;
import org.example.example6.BagOptimization;
import org.example.example6.Product;
import org.example.example7.CityMap;
import org.example.example8.ConsistentHash;
import org.example.example8.Server;
import org.example.example9.BST;
import org.example.example9.Node;

import java.util.Map;

public class Main {
    public static void main(String[] args) {


//        //  Kargo


//        Kargo kargo1=new Kargo("a","b",KargoDurum.HAZIRLANIYOR);
//        Kargo kargo2=new Kargo("b","a",KargoDurum.YOLDA);
//        Kargo kargo3=new Kargo("a","c",KargoDurum.IPTAL);
//
//
//        System.out.println(kargo1.bilgiGöster());
//        System.out.println(kargo2.bilgiGöster());
//        System.out.println(kargo3.bilgiGöster());
//
//        kargo1.durumGüncelle(KargoDurum.IPTAL);
//
//        System.out.println(kargo1.bilgiGöster());
//
//        System.out.println("");
//        System.out.println("");
//        System.out.println("");
//
//        KargoTakip kargoTakip= new KargoTakip();
//
//        kargoTakip.kargoEkle(kargo1);
//        kargoTakip.kargoEkle(kargo2);
//        kargoTakip.kargoEkle(kargo3);
//
//        kargoTakip.kargoAra(kargo1.getTakipNo());





//        //  Urun

//        Urun a=new Urun("a",100,20);
//        Urun b=new Urun("b",10,50);
//        Urun c=new Urun("c",5,10);
//        Urun d=new Urun("d",20,20);
//
//        DepoYonetimi depoYonetimi= new DepoYonetimi();
//
//        depoYonetimi.urunEkle(a);
//        depoYonetimi.urunEkle(b);
//        depoYonetimi.urunEkle(c);
//        depoYonetimi.urunEkle(d);
//
//        depoYonetimi.kritikUrunleriGoster();





//        //  Sozlük

//        Sozluk sozluk= new Sozluk();
//
//
//        sozluk.kelimeEkle("elma");
//        sozluk.kelimeEkle("alma");
//        sozluk.kelimeEkle("kasa");
//        sozluk.kelimeEkle("kedi");
//        sozluk.kelimeEkle("kelimeler");
//        sozluk.kelimeEkle("kalem");
//        sozluk.kelimeEkle("elmas");
//
//        sozluk.kelimeGecerliMİ("elmaz");

//        sozluk.benzerKelimeBul("kasa");




//        //  Employee
//
//
//        CompanyManagement companyManagement= new CompanyManagement();
//
//        companyManagement.addEmployee(new Employee("C1","Alper Tunga", "CEO"));
//        companyManagement.addEmployee(new Employee("M2","Burcu K.", "Müdür A"));
//        companyManagement.addEmployee(new Employee("M3","Canan Y.", "Müdür B"));
//        companyManagement.addEmployee(new Employee("U4","Deniz O.", "Uzman X"));
//        companyManagement.addEmployee(new Employee("U5","Efe Z.", "Uzman Y"));
//        companyManagement.addEmployee(new Employee("S6","Fatma L.", "Stajyer Z"));
//
//
//        companyManagement.connect("C1", "M2");
//
//        companyManagement.connect("C1", "M3");
//
//        companyManagement.connect("M2", "U4");
//
//        companyManagement.connect("M2", "U5");
//
//        companyManagement.connect("U5", "S6");
//
//
//        companyManagement.toplamBagliCalisanSayisi("C1");
//        companyManagement.toplamBagliCalisanSayisi("M2");
//        companyManagement.toplamBagliCalisanSayisi("U5");





//        //  Cache

//        LRUCache lruCache= new LRUCache(3);
//
//        lruCache.put("A", "veri-a");
//
//        lruCache.put("B", "veri-b");
//
//        lruCache.put("C", "veri-c");
//
//        lruCache.get("A");
//
//        lruCache.put("D", "veri-d");
//
//        lruCache.get("B");
//
//        lruCache.put("E", "veri-e");




//        // Urun-Optimizasyon ** {Dinamik Programlama (DP)}

//        BagOptimization bagOptimization= new BagOptimization(15);
//
//        Product product= new Product("a",3,15);
//        Product product2= new Product("b",7,30);
//        Product product3= new Product("c",5,20);
//        Product product4= new Product("d",2,25);
//        Product product5= new Product("e",3,26);
//        Product product6= new Product("f",6,35);
//
//        bagOptimization.addProduct(product);
//        bagOptimization.addProduct(product2);
//        bagOptimization.addProduct(product3);
//        bagOptimization.addProduct(product4);
//        bagOptimization.addProduct(product5);
//        bagOptimization.addProduct(product6);





//        // Dijkstra Algorithm

//        CityMap map = new CityMap();
//
//        map.addEdge("A", "B", 6);
//        map.addEdge("A", "D", 1);
//        map.addEdge("B", "D", 2);
//        map.addEdge("B", "C", 5);
//        map.addEdge("C", "E", 5);
//        map.addEdge("D", "E", 1);
//        map.addEdge("D", "B", 2);
//        map.addEdge("D", "C", 4);
//
//        String source = "A";
//        Map<String, Integer> shortestDistances = map.findShortestPaths(source);
//
//        System.out.println("--- Shortest Travel Durations from " + source + " ---");
//
//        for (Map.Entry<String, Integer> entry : shortestDistances.entrySet()) {
//            String node = entry.getKey();
//            Integer distance = entry.getValue();
//
//            String output = (distance == Integer.MAX_VALUE) ? "Unreachable" : String.valueOf(distance);
//
//            System.out.printf("%s -> %s: %s\n", source, node, output);
//        }





//        // Consistent Hashing


//        ConsistentHash hash = new ConsistentHash();

//        Server s1 = new Server("S1-DB");
//        Server s2 = new Server("S2-DB");
//        Server s3 = new Server("S3-DB");
//
//        hash.addServer(s1);
//        hash.addServer(s2);
//        hash.addServer(s3);
//
//        System.out.println("\n--- VERİ ATAMASI ---");
//        System.out.println("Key1 atandı: " + hash.assignKeyToServer("UserKey1"));
//        System.out.println("Key2 atandı: " + hash.assignKeyToServer("UserKey2"));
//        System.out.println("Key3 atandı: " + hash.assignKeyToServer("OrderKey3"));
//        System.out.println("Key4 atandı: " + hash.assignKeyToServer("DataKey4"));
//
//        hash.printLoad();
//
//        Server s4 = new Server("S4-New");
//        hash.addServer(s4);
//        System.out.printf("S4 eklendi. S1'e atanması beklenen 'UserKey1' yeniden atanıyor: %s\n",
//                hash.assignKeyToServer("UserKey1"));
//
//        hash.printLoad();







//        // BST




        Node node=new Node(50);

        BST bst= new BST(node);

        Node node1=new Node(30);
        Node node2=new Node(70);
        Node node3=new Node(20);
        Node node4=new Node(40);
        Node node5=new Node(60);
        Node node6=new Node(80);

        bst.add(node1);
        bst.add(node2);
        bst.add(node3);
        bst.add(node4);
        bst.add(node5);
        bst.add(node6);

        bst.inorderTraversal();
    }
}