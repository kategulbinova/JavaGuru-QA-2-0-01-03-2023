package lpudnika.lessons.lesson7.bookManagement;

public class Book1{

    String name;

    String author;
    String color;

    int pageCount;
    int placeHolderNumber;

    boolean isRead; //true - is read, false - not read

    void readBook() {
        this.isRead = true;
    }

    void assignPlaceHolderNumber(int number) {
            this.placeHolderNumber = number;
        }
}
