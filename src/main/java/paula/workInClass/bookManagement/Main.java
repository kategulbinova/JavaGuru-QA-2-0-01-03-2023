package paula.workInClass.bookManagement;

public class Main {
    public static void main(String[] args) {
        Book myFirstBook = new Book(); //we have created book
        myFirstBook.name = "Alice in Wonderland";
        myFirstBook.color = "Red";
        myFirstBook.assignPlaceHolderNumber(123);
        myFirstBook.readBook();
        System.out.println(myFirstBook.name);

        Book mySecondBook = new Book();
        Book currentBook = new Book();

        mySecondBook.readBook();
        currentBook.name = "ABC";
        currentBook.isRead = false;
    }
}
