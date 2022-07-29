package com.company;

public class Main {


    public static void main(String[] args) {
        name("Алтынай", "Айсулуу", "Наргиза", "Айпери", "Айнурв", "Бермет");
    }

    static void name(String ... varags) {

        for (String varag : varags) {
            System.out.println("Я тебя люблю " + varag);
        }

        }

    }

