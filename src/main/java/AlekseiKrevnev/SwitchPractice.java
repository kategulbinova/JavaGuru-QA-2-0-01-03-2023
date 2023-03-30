package AlekseiKrevnev;



public class SwitchPractice {
    public static void main(String[] args) {
        int dayNr = 5;
        String dayName;
        switch (dayNr) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
        }
        System.out.println("Looking forward to the weekend");
            switch (dayNr){
            case 6: dayName="Saturday";break;
            case 7: dayName="Sunday";break;
            default: dayName="unknown day"; break;
            // switch-условный оператор, который дает возможность сравнивать переменную со списком значений.
                // В круглых скобках мы указываем выражение , значение которого будет сравниваться со списком значений,
                // перечисленных после ключевого слова case
            //break - команда именно для switch. Заставляет запуск блока остановиться после break.
        }
        System.out.println("Today is "+dayName);
    }
}

