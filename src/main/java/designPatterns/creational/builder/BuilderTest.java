package main.java.designPatterns.creational.builder;

public class BuilderTest {
    public static void main(String[] args) {
        Book book=new Book().builder()
                .setName("ajdskbab")
                .setAuthor("56465")
                .build();
        System.out.println(book);

    }
}
