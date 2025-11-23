package org.example.example8;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Server {

    private String id;
    private List<String> dataKeys= new ArrayList<>();

    public Server(String id){
        this.id=id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getDataKeys() {
        return dataKeys;
    }

    public void setDataKeys(List<String> list) {
        this.dataKeys = list;
    }






}
