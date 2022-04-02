package com.company;

import java.util.ArrayList;//mengimpor library dari java untuk membuat arraylist
import java.util.Collections;//mengimpor method collections bawaan dari kelas Java

public class Main {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<Movie>();//menambahkan data arraylist untuk film
        list.add(new Movie(8.1,"How to Train Your Dragon",2010));
        list.add(new Movie(8.3,"Avengers: Endgame",2019));
        list.add(new Movie(8.3,"Your Name",2016));
        list.add(new Movie(8.2,"Toy Story 3",2010));
        list.add(new Movie(8.4,"Avengers: Infinity War",2018));
        System.out.println("Movies before sorting : ");//menampilkan list film sebelum diurutkan/sort
        for (Movie movie: list)
        {
            System.out.println(movie.getName() + "-" +//memanggil atribut nama film
                    movie.getRating() + "-" +         //memanggil atribut rating film
                    movie.getYear());                 //memanggil atribur tahun film
        }
        Collections.sort(list);//method Collection.sort untuk melakukan sorting elemen arrayList secara descendind(terbesar ke terkecil)
        System.out.println("\nMovies after sorting : ");//menampilkan list film sesudah diururtkan/sort
        for (Movie movie: list)//mengganti list dengan atribut movie
        {
            System.out.println(movie.getName() + "-" +//memanggil atribut nama film yg sudah diurutkan
                    movie.getRating() + "-" +         //memanggil atribut rating film yg sudah diurutkan
                    movie.getYear());                 //memanggil atribut tahun film yg sudah diurutkan
        }
    }
}
