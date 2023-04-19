package bashar.lesson7.book;

public class BookAddToReadList {
    public static void main(String[] args) {
        Book scifi = new Book();
        scifi.bookTitle = "Bullet Train";
        scifi.isAvailableInAudio = true;
        scifi.price = 10;
        scifi.toReadList();
        System.out.println(scifi.bookTitle);

    }
}
