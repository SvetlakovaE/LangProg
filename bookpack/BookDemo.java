package bookpack;

/*
public class Book {
    private String title;
    private String autor;
    private int pubDate;

    Book (String t, String a, int d) {
        title = t;
        autor = a;
        pubDate = d;
    }
    
    void show() {
        System.out.println(title);
        System.out.println(autor);
        System.out.println(pubDate);*/
        System.out.println();
    }
}
*/

class BookDemo {
    public static void main(String[] args) {
        Book[] books = new Book[4];

        books[0] = new Book("Первому игроку приготовиться", "Клайн Э.", 2011);
        books[1] = new Book("Солярис", "Лем С.", 1970);
        books[2] = new Book("Безмолвный пациент", "Михаэлидес", 2019);
        books[3] = new Book("Главный инженер", "Пантелеев Л.", 1950);

    }
}
