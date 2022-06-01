package com.hillel.lesson12;

public enum Level {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    int value;

    Level(int value) {
        this.value = value;
    }

    public static Level convert(String level){
        for (Level l : values()) {
            if (level.equalsIgnoreCase(l.toString())) {
                return valueOf(level.toUpperCase());
            }
        }
        return LOW;
    }

    @Override
    public String toString() {
        return "Level{" +
                "name=" + name() + ", "+
                "value=" + value +
                '}';
    }
}
