package org.example.example3;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Employee {

    private String id;
    private String name;
    private String title;
    private List<String> linkedEmployeeIDs= new ArrayList<>();

    public Employee(String id,String name,String title){
        this.id=id;
        this.name=name;
        this.title=title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getLinkedEmployeeIDs() {
        return linkedEmployeeIDs;
    }

    public void setLinkedEmployeeIDs(List<String> linkedEmployeeIDs) {
        this.linkedEmployeeIDs = linkedEmployeeIDs;
    }


}
