package aleksejs_lukins.playWithBook;

public class Practice7MainClassForBook {

    public static void main(String[] args) {
        Practice7Book bookOne = new Practice7Book();
        bookOne.currentPage = 1;
        bookOne.bookName = "LOTR";
        bookOne.isDigital = true;
        bookOne.turnPage();
        System.out.println("Book: " + bookOne.bookName + "; Current page: " + bookOne.currentPage + "; Is digital: " + bookOne.isDigital + ".");
        bookOne.turnPage();
    }
}
