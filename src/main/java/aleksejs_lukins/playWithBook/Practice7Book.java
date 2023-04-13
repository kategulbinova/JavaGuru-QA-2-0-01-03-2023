package aleksejs_lukins.playWithBook;

public class Practice7Book {
    String bookName;
    int pageAmount;
    int currentPage = 0;
    boolean isDigital = false;

    Practice7Book() {
        this.bookName = "Two Towers";
        this.pageAmount = 200;
        this.isDigital = true;
    }

    public void turnPage() {
        this.currentPage++;
    }

}
