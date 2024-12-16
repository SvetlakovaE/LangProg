package bookpack;


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
        System.out.println(pubDate);
        System.out.println();
    }
}
