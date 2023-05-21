package margo.homeWorks;

public class CatAgeVsHuman {
    public static void main(String[] args) {
        int myAge = 32;
        int catAge = 11;
        int answer;
        System.out.println("I have a cat who's name is The Cat. He is " + catAge + " years old.");
        System.out.println("Assuming that 1 cat's year equals to human's 7 years let's find out how old is my The Cat!");
        //the next line will help to figure out how humanly old is my Cat
        answer = (catAge * 7);
        System.out.println("I'm gonna multiply The Cat's age " + catAge + " by 7 and voila = " + answer + " years old");
        //the next line will define how young I am in comparison with my The Cat
        answer = ((catAge * 7) - myAge);
        System.out.println("My The Cat is " + answer + " years older than me!");
    }
}
