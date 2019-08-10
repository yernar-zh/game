package com.glider.snake;

import java.util.LinkedList;

public class Snake {
    private Coordinate head;

    private LinkedList<Coordinate> body;

    public Snake() {
        this.head = new Coordinate(5,5);
        this.body = new LinkedList<>();
        body.add(new Coordinate(6,5));
        body.add(new Coordinate(7,5));
    }

    public void move(char pos, boolean increase){
        if (!increase) body.removeLast();
        body.addFirst(new Coordinate(head.getX(),head.getY()));

        switch (pos){
            case 'w':
                head.setY(head.getY()-1);
                break;
            case 'a':
                head.setX(head.getX()-1);
                break;
            case 's':
                head.setY(head.getY()+1);
                break;
            case 'd':
                head.setX(head.getX()+1);
                break;
        }
    }

    public Coordinate getHead() {
        return head;
    }

    public LinkedList<Coordinate> getBody() {
        return body;
    }
}
