package com.hillel.lesson11.homework;

public class VeganBurger extends Burger {

    int tofu;
    public VeganBurger(int bun, int meat, int salad) {
        super(bun, meat, salad);
    }

    public VeganBurger(int bun, int meat, int salad, int tofu) {
        super(bun, meat, salad);
        this.tofu = tofu;
    }

    @Override
    public String toString() {
        return "VeganBurger{" +
                "tofu=" + tofu +
                ", bun=" + bun +
                ", meat=" + meat +
                ", salad=" + salad +
                '}';
    }
}
