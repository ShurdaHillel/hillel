package com.hillel.lesson11.homework;

public class Burger {
    static int count;
    int bun;
    int meat;
    int salad;

    private static final int DISCOUNT_BURGER = 10;

    {
        System.out.println("Non static initialization");
    }

    static {
        System.out.println("Static initialization");
    }

    public Burger(int bun, int meat) {
        this.bun = bun;
        this.meat = meat;
        countBurger();
    }

    public Burger(int bun, int meat, int salad) {
        this.bun = bun;
        this.meat = meat;
        this.salad = salad;
        countBurger();
    }

    public void countBurger(){
        count = count + 1;
    }

    public static int getCount() {
        return count;
    }

    public int getBun() {
        return bun;
    }

    public final void order(){
        System.out.println("Order from Burger");
    }

    @Override
    public String toString() {
        return "Burger{" +
                "bun=" + bun +
                ", meat=" + meat +
                ", salad=" + salad +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Burger burger = (Burger) o;

        if (bun != burger.bun) return false;
        if (meat != burger.meat) return false;
        return salad == burger.salad;
    }

    @Override
    public int hashCode() {
        int result = bun;
        result = 31 * result + meat;
        result = 31 * result + salad;
        return result;
    }
}
