package org.example;

public class Movie {
    private String name;
    private int length;

    public Movie(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void show() {
        System.out.println(name + " (" + length + " minutes)");
    }
}
