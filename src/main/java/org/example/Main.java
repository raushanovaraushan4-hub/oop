package org.example;

public class Main {
    public static void main(String[] args) {

        Movie firstMovie = new Movie("Parasite", 132);
        Movie secondMovie = new Movie("Train to Busan", 118);

        Viewer ern = new Viewer("Ernur", 20);
        Viewer ali = new Viewer("Ali", 18);

        Cinema mega = new Cinema("MegaCinema", firstMovie);
        Cinema star = new Cinema("StarCinema", secondMovie);

        mega.show();
        star.show();

        ern.show();
        ali.show();

        ern.buyTicket(firstMovie);
        ali.buyTicket(secondMovie);

        System.out.println(firstMovie.getLength() > secondMovie.getLength());
        System.out.println(ern.getAge() == ali.getAge());
    }
}