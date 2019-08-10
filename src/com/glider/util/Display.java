package com.glider.util;

public interface Display {
    /**
     * to clean display
     */
    void clean();

    /**
     * show
     */
    void show();

    /**
     * draw symbol on position (x,y)
     * @param x
     * @param y
     * @param symbol
     */
    void draw(int x, int y, char symbol);
}
