package org.example;

public class Viewer {
    private String name;
    private int age;

    public Viewer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void buyTicket(Movie movie) {
        System.out.println(name + " is watching " + movie.getName());
    }

    public void show() {
        System.out.println(name + ", age " + age);
    }
}