package org.example.example3;

import java.util.HashMap;
import java.util.Map;

public class CompanyManagement {

    private Map<String, Employee> employeeMap= new HashMap<>();

    public void addEmployee(Employee employee){

        employeeMap.put(employee.getId(),employee);

    }

    public void connect(String bossId, String employeeId){

        Employee boss=employeeMap.get(bossId);

        boss.getLinkedEmployeeIDs().add(employeeId);

    }

    public int toplamBagliCalisanSayisi(String yoneticiID){

        Employee boss= employeeMap.get(yoneticiID);

        if (boss==null){
            return 0;
        }

        int conut=0;

        for(String s:boss.getLinkedEmployeeIDs()){

            System.out.println(employeeMap.get(s).getName());
            conut+=1;
            conut+=toplamBagliCalisanSayisi(s);
        }

        return conut;
    }

}
