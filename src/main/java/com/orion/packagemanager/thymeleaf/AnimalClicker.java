package com.orion.packagemanager.thymeleaf;

public class AnimalClicker {

    private int CLICKER_COUNT = 0;

    public void counter() {
        CLICKER_COUNT++;
    }

    public int getCount() {
        return CLICKER_COUNT;
    }
}
