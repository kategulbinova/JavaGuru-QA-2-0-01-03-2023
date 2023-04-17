package lpudnika.lessons.lesson7.bookManagement;

public class Book1Program {

    public static void main(String[] args) {
        Book1 myFirstBook = new Book1();
        myFirstBook.name = "Alice in Wonderland";
        myFirstBook.color = "Red";
        myFirstBook.assignPlaceHolderNumber(123);
        myFirstBook.readBook();
        System.out.println(myFirstBook.name);
        System.out.println(myFirstBook.isRead);
    }
}
