package svetlanakussi.practice.objeсts;

public class BookPractice {
    public static void main(String[] args) {
        Book abc = new Book();
        abc.pages = 32;
        abc.author = "Lana Kussi";
        abc.year = 2013;
        abc.openBook();
        System.out.println(abc.author + " write ABC book in " + abc.year + " year.");

    }
}
