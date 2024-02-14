package main.java.lessons.module_4.lesson_4_4;

/**
 * 1. make class as final
 * 2. make all of its fields final
 * 3. only getters
 * 4. make getters final
 * 5. single constructor
 */


public final class Book {
    private final String name;
    private final String author;
    private final Integer pages;

    public Book(String name, String author, Integer pages) {
        this.name = name;
        this.author = author;
        this.pages = pages;
    }

    public final String getName() {
        return name;
    }

    public final String getAuthor() {
        return author;
    }

    public final Integer getPages() {
        return pages;
    }
}
