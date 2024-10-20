package ua.javarush.task.pro.task10.task1002;

/* 
Збудуймо новий житловий комплекс JavaRush Towers
*/

public class Skyscraper {
    public static final String SKYSCRAPER_WAS_BUILD = "Хмарочос побудовано.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Хмарочос побудовано. Кількість поверхів - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Хмарочос побудовано. Забудовник - ";

    //напишіть тут ваш код
    public Skyscraper() {
       System.out.println(SKYSCRAPER_WAS_BUILD);
    }

    public Skyscraper(int a) {
        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT+a);
    }

    public Skyscraper(String name) {
       System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER+ name);

    }

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperTower = new Skyscraper(50);
        Skyscraper skyscraperSkyline = new Skyscraper("JavaRushDevelopment");
    }
}

