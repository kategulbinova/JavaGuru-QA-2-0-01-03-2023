package marijaplumite.classworks.ObjectExample;

public class BookProgram {
    public static void main(String[] args) {
        Book myFavoriteBook = new Book();
        myFavoriteBook.name = "The Great Gatsby";
        myFavoriteBook.author = "F. Scott Fitzgerald";
        myFavoriteBook.releaseYear = 1925;
        myFavoriteBook.rating = 9.25;

        myFavoriteBook.readBook();
        System.out.println(myFavoriteBook.name);
        System.out.println(myFavoriteBook.author);
        System.out.println(myFavoriteBook.releaseYear);
        System.out.println("Rating: ");
        System.out.println(myFavoriteBook.rating);
    }
}
