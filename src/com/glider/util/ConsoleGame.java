package com.glider.util;

import java.util.Scanner;

public abstract class ConsoleGame {
    private Scanner sc;
    protected Display display;

    public ConsoleGame(int sizeX, int sizeY) {
        this.sc = new Scanner(System.in);
        this.display = new ConsoleDisplay(sizeX, sizeY);
    }

    public String getCommand(){
        return sc.nextLine();
    }

    public void loop(){
        display.clean();

        while (true){
            game();
        }
    }

    public abstract void game();

}
