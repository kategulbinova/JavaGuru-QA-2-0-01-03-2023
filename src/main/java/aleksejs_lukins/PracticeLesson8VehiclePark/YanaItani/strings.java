package aleksejs_lukins.PracticeLesson8VehiclePark.YanaItani;

public class strings {
    public static void main(String[] args) {
        String Name = "Yana";
        String LastName = "Itani";
        System.out.println(Name  + " " + LastName);
        String NameC = "Yana";
        String LastNameC = "Itani";
        System.out.println(NameC.concat ( " ").concat(LastNameC) );
        String NameD = "Yana";
        String LastNameD = "Itani";
        System.out.println(LastNameD  + ", " + NameD);
        String NameE = "Yana";
        String LastNameE = "Itani";
        System.out.println(LastNameE.concat (", ").concat(NameE));
        String NameF = "Mrs Yana";
        String LastNameF = "Itani";
        String gender = "female";
        String maritalStatus = "married";
        System.out.println("Name:".concat(NameF).concat("\n").concat("Surname:").concat( LastNameF));
        System.out.println(("Gender: ").concat(gender).concat("\n").concat("Marital status: ").concat(maritalStatus));




    }
}
