package com.glider.snake;

import com.glider.util.ConsoleGame;

import java.util.Random;

public class SnakeGame extends ConsoleGame {
    private static final int SIZE = 10;
    private Snake snake;
    private Coordinate apple;
    private boolean increase;

    public SnakeGame() {
        super(SIZE, SIZE);
        snake = new Snake();
        apple = new Coordinate(0,0);
        changeApplePosition();
        increase = false;
    }

    private void changeApplePosition(){
        Random r = new Random();
        int x = Math.abs(r.nextInt())%SIZE;
        int y = Math.abs(r.nextInt())%SIZE;
        apple.setX(x);
        apple.setY(y);
    }

    @Override
    public void game() {
        display.clean();
        display.draw(snake.getHead().getX(),snake.getHead().getY(),'#');
        for (Coordinate cor: snake.getBody()){
            display.draw(cor.getX(),cor.getY(),'*');
        }
        display.draw(apple.getX(),apple.getY(),'@');

        display.show();

        String input = getCommand();
        snake.move(input.charAt(0), increase);
        increase = false;
        if (snake.getHead().equals(apple)){
            increase = true;
            changeApplePosition();
        }
    }
}
