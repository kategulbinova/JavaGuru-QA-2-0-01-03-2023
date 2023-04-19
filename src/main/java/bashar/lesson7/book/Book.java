package bashar.lesson7.book;

public class Book {

    public Book () {

        bookTitle = "Not assigned yet!";
        price = 0;
        isAvailableInAudio = true;
    }
    String bookTitle;
    int price;
    boolean isAvailableInAudio;

    public void toReadList() {
       this.bookTitle = this.bookTitle + " is added to read list!";
    }


}
