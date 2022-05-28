package com.hillel.lesson11.homework;

public final class CheeseBurger extends Burger{
    int cheese = 1;

    public CheeseBurger(int bun, int meat, int salad, int cheese) {
        super(bun, meat, salad);
        this.cheese = cheese;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CheeseBurger that = (CheeseBurger) o;

        return cheese == that.cheese;
    }

    @Override
    public int hashCode() {
        return cheese;
    }

    @Override
    public String toString() {
        return "CheeseBurger{" +
                "cheese=" + cheese +
                ", bun=" + bun +
                ", meat=" + meat +
                '}';
    }
}
