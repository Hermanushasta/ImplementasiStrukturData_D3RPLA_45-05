package com.company;

public class Movie implements Comparable<Movie> {//mengimport library java comparable 
    private double rating;                       //supaya objek selain tipe data primitif dapat diurutkan
    private String name;
    private int year;
    public Movie(double rating, String name, int year) {//menginisialisaskan tipe data atribut
        this.rating = rating;
        this.name = name;
        this.year = year;
    }
    public double getRating() {//membuat getter untuk atribut rating(tidak langsung mengakses atribut rating)
        return rating;
    }
    public String getName() {//membuat getter untuk atribut nama(tidak langsung mengakses atribut nama)
        return name;
    }
    public int getYear() {//membuat getter untuk atribut year(tidak langsung mengakses atribut year)
        return year;
    }
    @Override
    public int compareTo(Movie o) {//method compare to digunakan agar tipe data objek dapat diurutkan
        return this.getYear() - o.getYear();
    }

}
