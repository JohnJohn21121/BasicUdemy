package com.JohnJohn21121;

import javax.print.attribute.ResolutionSyntax;

public class Monitor {

    private String model;
    private String manufacturer;
    private int sizeOfScreen;
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, int sizeOfScreen, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.sizeOfScreen = sizeOfScreen;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + "," + y + " in colour " + color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSizeOfScreen() {
        return sizeOfScreen;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
