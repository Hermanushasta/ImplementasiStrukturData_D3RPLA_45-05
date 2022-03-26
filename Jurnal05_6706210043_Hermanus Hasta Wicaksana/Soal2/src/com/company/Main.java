package com.company;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            LinkedList<ToDoList> listToDo = new LinkedList<ToDoList>();

            boolean kondisi = true;
            while (kondisi) {
                System.out.println("\n=== MENU ===");
                System.out.println("1. Input nama pekerjaan(secara urut)");
                System.out.println("2. Cetak urutan pekerjaan");
                System.out.println("3. Hapus pekerjaan yang sudah selesai");
                System.out.println("4. Tampilkan seluruh isi to do list");
                System.out.print("\nPilih menu : ");
                int pilih = input.nextInt();
                input.nextLine();
                switch (pilih) {
                    case 1:
                        System.out.print("Masukan nama pekerjaan : ");
                        String namaPekerjaan = input.nextLine();
                        listToDo.addLast(new ToDoList(namaPekerjaan));
                        break;

                    case 2:
                        System.out.println("Urutan pekerjaan yang harus diselesaikan : ");
                        print(listToDo);
                        break;

                    case 3:
                        System.out.println("Masukkan nama pekerjaan yang akan dihapus !");
                        removeByJudul(listToDo, input.nextLine());
                        break;

                    default:
                        kondisi = false;
                        System.out.println("Pekerjaan yang harus diselesaikan");
                        print(listToDo);
                        break;

                }
            }
        }

    public static void removeByJudul(LinkedList playerLists, String nama) {
        ListIterator<ToDoList> iterator = playerLists.listIterator();
        while (iterator.hasNext()) {
            ToDoList listTodo = iterator.next();
            if (listTodo.getnamaPekerjaan().equals(nama)) {
                iterator.remove();
                System.out.println("Sudah terhapus");
            }
        }
    }

    public static void print(LinkedList listToDo){
        ListIterator<ToDoList> iterator = listToDo.listIterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next());
            if (iterator.hasNext()){
                System.out.print(" - ");
            }
        }
    }
}

