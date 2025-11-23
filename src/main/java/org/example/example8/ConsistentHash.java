package org.example.example8;

import java.util.TreeMap;
import java.util.Map;

public class ConsistentHash {


    private final TreeMap<Integer, Server> ring;

    public ConsistentHash(){
        this.ring = new TreeMap<>();
    }

    public int hashMethod(String key) {
        return Math.abs(key.hashCode() % 360);
    }

    public void addServer(Server server) {
        int serverHash = hashMethod(server.getId());
        ring.put(serverHash, server);
        System.out.printf("Sunucu %s, Hash Konumu: %d\n", server.getId(), serverHash);
    }

    public String assignKeyToServer(String key) {
        int keyHash = hashMethod(key);

        Map.Entry<Integer, Server> entry = ring.ceilingEntry(keyHash);


        if (entry == null) {
            entry = ring.firstEntry();
        }

        Server assignedServer = entry.getValue();
        assignedServer.getDataKeys().add(key);

        return assignedServer.getId();
    }

    public void printLoad() {
        System.out.println("\n--- YÜK DAĞILIMI ---");
        for (Server server : ring.values()) {
            System.out.printf("%s (%d adet Key tutuyor)\n",
                    server.getId(), server.getDataKeys().size());
        }
        System.out.println("--------------------");
    }
}
