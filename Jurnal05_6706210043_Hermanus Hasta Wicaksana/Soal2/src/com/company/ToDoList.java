package com.company;

public class ToDoList {
    private String namaPekerjaan;

    public ToDoList(String namaPekerjaan){
        this.namaPekerjaan = namaPekerjaan;
    }

    public String getnamaPekerjaan(){
        return this.namaPekerjaan;
    }

    @Override
    public String toString() {
        return namaPekerjaan;
    }
}
