package com.hillel.lesson11.homework;

public final class CheeseBurger extends Burger {
    int cheese = 1;

    public CheeseBurger(int bun, int meat, int salad, int cheese) {
        super(bun, meat, salad);
        this.cheese = cheese;
    }

    public CheeseBurger(Burger burger) {
        super(burger.bun, burger.meat, burger.salad);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CheeseBurger that = (CheeseBurger) o;

        return cheese == that.cheese;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + cheese;
        return result;
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
