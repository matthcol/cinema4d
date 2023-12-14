package org.example.cinema.dto;

public class Person {
    public Person(String name, String prenom, int age) {
        this.name = name;
        this.prenom = prenom;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String name;
    public String prenom;
    public int age;
}