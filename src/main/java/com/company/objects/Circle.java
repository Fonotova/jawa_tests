package com.company.objects;

public class Circle {

    int x;
    int y;
    int radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public String toString() {
        return "x: " + x + " y: " + y + " radius: " + radius;
    }
}
