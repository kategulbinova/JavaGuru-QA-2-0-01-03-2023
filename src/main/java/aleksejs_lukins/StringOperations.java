package aleksejs_lukins;

public class StringOperations {
    public static void main(String[] args) {
        String myName = "Aleksejs";
        String mySurname = "Lukins";
        String myMartialStatus = "Married";
        String myGender = "Male";
        String myFullName = "Full name: Mr "+ myName.concat(" " + mySurname);

        System.out.println(myName + " " + mySurname);
        System.out.println(myName.concat(" "+ mySurname));
        System.out.println(mySurname + ", " + myName);
        System.out.println(mySurname.concat(", "+ myName));
        System.out.println(myFullName);

    }
}
