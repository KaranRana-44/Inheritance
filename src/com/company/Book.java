package com.company;

public class Book {

    private String title;
    private String author;

    public Book(String t,String a){
        title=t;
        author=a;
    }

    public void printBookInfo(){
        System.out.println(title+",written by "+author);
    }
}
