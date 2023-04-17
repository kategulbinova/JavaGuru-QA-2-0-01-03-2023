package NikitaS.Classwork7ObjectExample;

public class Book {
    String title;
    String author;
    int numPages;

    int currentPage;

    boolean withPictures;

    public void turnPage() {
        this.currentPage++;
    }

}
