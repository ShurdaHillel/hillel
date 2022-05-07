package com.hillel.lesson4;

public class ZooRecursion {
    public static void main(String[] args) {
        int bearsGrizli = 20;
        int increaseBears = 80;

        int animalsNextYear = countAnimalsNextYear(bearsGrizli, increaseBears, "bears");
        System.out.printf("Count animals next year %s", animalsNextYear);
        System.out.println();
        int countAnimalsTenYear = countAnimalsNextYear(bearsGrizli, increaseBears, 3);
        System.out.printf("Count animals next 10 years %s", countAnimalsTenYear);
    }

    private static int countAnimalsNextYear(int bears, int tigers,
                                            int koefBears, int koefTigers,
                                            int years) {
        int countBears = countAnimalsNextYear(bears, koefBears, years);
        int countTigers = countAnimalsNextYear(tigers, koefTigers, years);
        return countBears + countTigers;
    }


    private static int countAnimalsNextYear(int animals, int koef, int years) {
        if (years > 0) {
            int countAnimalsNextYear = countAnimalsNextYear(animals, koef, "bears");
            return animals + countAnimalsNextYear(countAnimalsNextYear, koef, years - 1);
        }
        return 0;

    }

    private static int countAnimalsNextYear(int animals, int koef, String animalName) {
        int countAnimals = animals + (int) Math.round(animals * (koef / 100.0));
        System.out.printf("Count animals %s: %d\n", animalName, countAnimals);
        return countAnimals;
    }
}
