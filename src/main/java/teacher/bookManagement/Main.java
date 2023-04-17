package teacher.bookManagement;

public class Main {
    public static void main(String[] args) {
        Book myFirstBook = new Book();
        myFirstBook.name = "Alice in Wonderland";
        myFirstBook.color = "Red";
        myFirstBook.assignPlaceHolderNumber(123);
        myFirstBook.readBook();
        System.out.println(myFirstBook.name);
        System.out.println(myFirstBook.isRead);

        Book mySecondBook = new Book();
        Book currentBook = new Book();

        mySecondBook.readBook();
        currentBook.name = "ABC";
        currentBook.isRead = false;

    }
}
