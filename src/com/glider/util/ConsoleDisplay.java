package com.glider.util;

public class ConsoleDisplay implements Display {
    private char[][] map;
    private int sizeX;
    private int sizeY;

    public ConsoleDisplay(int sizeX, int sizeY) {
        this.map = new char[sizeX][sizeY];
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }

    @Override
    public void clean() {
        for (int i = 0; i < sizeY; i++) {
            for (int j = 0; j < sizeX; j++) {
                map[i][j] = '.';
            }
        }
    }

    @Override
    public void show() {
        for (int i = 0; i < sizeY; i++) {
            for (int j = 0; j < sizeX; j++) {
                System.out.print(map[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }

    @Override
    public void draw(int x, int y, char symbol) {
        map[y][x] = symbol;
    }
}
