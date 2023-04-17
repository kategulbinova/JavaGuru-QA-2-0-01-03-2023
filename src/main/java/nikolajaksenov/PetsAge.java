package nikolajaksenov;

// Ниже название класса с публичной доступностью
public class PetsAge {
// Ниже метод который при запуске программы выполнятет код, который находиться внутри него.
    public static void main(String[] args) {
        // вводим переменную для реального возраста животного, со значением 6, что является целым числом.
        int petsAge = 6;
        // вводим переменную которая будет расчитывать возраст животного в человеческих годах, с коэффицентом равным 1:7.
        int petsAgeHuman;
        petsAgeHuman = petsAge * 7;

        //Выводим в консоль реальный возраст животного.
        System.out.println("If your pets age is " + petsAge + " years.");
        //Выводим возраст животного в человеческих годах.
        System.out.println("Then your pets age in 'human' years is " + petsAgeHuman + ".");

    }
}
