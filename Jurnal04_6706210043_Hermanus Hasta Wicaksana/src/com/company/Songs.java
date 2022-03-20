package com.company;

public class Songs{
    private String judulLagu;
    private String namaPenyanyi;

    public Songs( String judulLagu, String namaPenyanyi){
        this.judulLagu = judulLagu;
        this.namaPenyanyi = namaPenyanyi;
    }

    public String getjudulLagu(){
        return this.judulLagu;
    }

    @Override
    public String toString() {
        return judulLagu + " - " + namaPenyanyi;
    }
}
