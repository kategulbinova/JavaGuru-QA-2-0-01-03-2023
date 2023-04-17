package teacher.bookManagement;

public class Book {
    String name;
    String author;
    String color;
    int placeHolderNumber;
    int pageCount;
    boolean isRead; // true - is read, false - not read

    void readBook() {
        this.isRead = true;
    }
    void assignPlaceHolderNumber(int number) {
        this.placeHolderNumber = number;
    }

}
