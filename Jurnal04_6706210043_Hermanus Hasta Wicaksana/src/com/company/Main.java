package com.company;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LinkedList <Songs> playList = new LinkedList<Songs>();

        boolean kondisi = true;
            while (kondisi){
                System.out.println("\n=== MENU ===");
                System.out.println("1. Input Lagu");
                System.out.println("2. Hapus Lagu");
                System.out.println("3. Mainkan Lagu");
                System.out.println("4. Keluar");
                System.out.print("\nPilih menu : ");
                int pilih = input.nextInt();
                input.nextLine();
                    switch (pilih){
                        case 1:
                            System.out.print("Masukan judul lagu : ");
                            String judulLagu = input.nextLine();
                            System.out.print("Masukan nama penyanyi : ");
                            String namaPenyanyi = input.nextLine();
                            playList.addLast(new Songs(judulLagu, namaPenyanyi));
                            break;

                        case 2:
                            System.out.println("===Menu Hapus Lagu===");
                            System.out.println("1. Hapus berdasarkan lagu yang terakhir masuk?");
                            System.out.println("2. Hapus berdasarkan judul lagu?");
                            System.out.print("Pilih Menu : ");
                            if (input.nextInt() == 1) {
                                playList.removeLast();
                                System.out.println("berhasil terhapus");
                            }else {
                                System.out.print("Masukan Judul Lagu : ");
                                removeByJudul(playList, input.next());
                            }
                            break;

                        case 3:
                            print(playList);
                            break;
                        default:
                            kondisi = false;
                            System.out.println("Berhasil Keluar Terima Kasih");
                            break;

                    }
            }
    }

    public static void removeByJudul(LinkedList playerLists, String judul) {
        ListIterator<Songs> iterator = playerLists.listIterator();
        while (iterator.hasNext()) {
            Songs playerList = iterator.next();
            if (playerList.getjudulLagu().equals(judul)) {
                iterator.remove();
                System.out.println("Sudah terhapus");
            }
        }
    }

    public static void print(LinkedList playerLists){
        ListIterator<Songs> iterator = playerLists.listIterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next());
            if (iterator.hasNext()){
                System.out.print(" | ");
            }
        }

        System.out.println();

        while (iterator.hasPrevious()){
            System.out.print(iterator.previous());
            if (iterator.hasPrevious()){
                System.out.print(" | ");
            }
        }
    }
}
