package com.JohnJohn21121;

public class PC {

    private Case theCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PC(Case theCase, Monitor monitor, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public void powerUp(){
        theCase.powerButton();
        drawLogo();
    }

    private void drawLogo(){
        //Fancy Graphics here.
        monitor.drawPixelAt(1500,500 ,"blue");
    }

}
