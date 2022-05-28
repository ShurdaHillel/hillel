package com.hillel.lesson11.homework;

import java.util.Arrays;

public class BurgerHouse {
    public static void main(String[] args) {

        Burger burgerRegular = new Burger(1, 1, 1);
        Burger burgerVegan = new VeganBurger(1, 1, 1, 1);
        Burger cheeseBurger1 =  new CheeseBurger(1, 1, 1, 1);
        Burger cheeseBurger2 =  new CheeseBurger(1, 1, 1, 1);
        cheeseBurger1.order();
        System.out.println("Is cheeseBurger the same: " + cheeseBurger1.equals(cheeseBurger2));

        Burger[] burgers = new Burger[0];

        burgers = addBurger(burgers, burgerRegular);
        burgers = addBurger(burgers, burgerVegan);
        burgers = addBurger(burgers, cheeseBurger1);

        for (Burger burger : burgers) {
            System.out.println(burger);
        }

        System.out.println("burgerRegular count of buns:" + burgerRegular.getBun());
        System.out.println("Burgers count = " + Burger.getCount());
        System.out.println("burgerRegular: " + burgerRegular);
    }

    private static Burger[] addBurger(Burger[] burgers, Burger burger) {
        Burger[] copyOf = Arrays.copyOf(burgers, burgers.length + 1);
        copyOf[copyOf.length - 1] = burger;
        return copyOf;
    }


}
