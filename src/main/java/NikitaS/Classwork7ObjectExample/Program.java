package NikitaS.Classwork7ObjectExample;

public class Program {
    public static void main(String[] args) {
        //new Book();
        Book diary = new Book();
        diary.title = "Nikita's Diary";
        diary.author = "Nikita";
        diary.numPages = 300;
        diary.currentPage = 144;
        diary.withPictures = false;

        diary.turnPage();

        System.out.println(diary.currentPage);




    }
}
