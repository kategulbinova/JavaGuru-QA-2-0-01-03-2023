package gleb.Lesson7.Objects.PersonAge;

public class Person {
     String name;
     int age;
     Person() {
          System.out.println("No name yet");

     }
     String nationality;
     boolean isMarried= false;
     boolean isMale=true;
     public void getOlder(){
         this.age++;
     }
}
