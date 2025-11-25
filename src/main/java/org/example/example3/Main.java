package org.example.example3;

public class Main {

    public static void main(String[] args) {

        CompanyManagement companyManagement= new CompanyManagement();

        companyManagement.addEmployee(new Employee("C1","Alper Tunga", "CEO"));
        companyManagement.addEmployee(new Employee("M2","Burcu K.", "Müdür A"));
        companyManagement.addEmployee(new Employee("M3","Canan Y.", "Müdür B"));
        companyManagement.addEmployee(new Employee("U4","Deniz O.", "Uzman X"));
        companyManagement.addEmployee(new Employee("U5","Efe Z.", "Uzman Y"));
        companyManagement.addEmployee(new Employee("S6","Fatma L.", "Stajyer Z"));


        companyManagement.connect("C1", "M2");

        companyManagement.connect("C1", "M3");

        companyManagement.connect("M2", "U4");

        companyManagement.connect("M2", "U5");

        companyManagement.connect("U5", "S6");


        companyManagement.toplamBagliCalisanSayisi("C1");
        companyManagement.toplamBagliCalisanSayisi("M2");
        companyManagement.toplamBagliCalisanSayisi("U5");
    }
}
