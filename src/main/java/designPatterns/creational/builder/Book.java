package main.java.designPatterns.creational.builder;


/**
 * 1. write inner class as <class-name>Builder
 * 2. create a method (builder) for retrieving builder object
 */

public class Book {
    private String name;
    private String author;

    private BookBuilder builder;

    public BookBuilder builder(){
        this.builder=new BookBuilder();
        return this.builder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    class BookBuilder{
        private Book book;

        public BookBuilder(){
            this.book=new Book();
        }

        public Book build(){
            return this.book;
        }

        public BookBuilder setName(String name) {
            this.book.setName(name);
            return this;
        }

        public BookBuilder setAuthor(String author) {
            this.book.setAuthor(author);
            return this;
        }

    }


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
