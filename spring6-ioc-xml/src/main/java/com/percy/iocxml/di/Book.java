package com.percy.iocxml.di;

public class Book {

    private String bname;
    private String author;
    private String other;






    public Book() {
        System.out.println("execute constructor without parameters...");
    }
    public Book(String bname, String author) {
        System.out.println("execute constructor with parameters...");
        this.bname = bname;
        this.author = author;
    }

    public Book(String bname, String author, String other) {
        this.bname = bname;
        this.author = author;
        this.other = other;
    }


    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getOther() {
        return other;
    }
    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", author='" + author + '\'' +
                ", other='" + other + '\'' +
                '}';
    }
}
