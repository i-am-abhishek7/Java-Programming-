package com.abhishek;

public class Point {

    private int x;
    private int y;

    Point() {
        this(0, 0);
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
         return (Math.sqrt((-this.x) * (-this.x) + (-this.y) * (-this.y)));
    }

    public double distance(double x, double y) {
        return (Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y)));
    }

    public double distance(Point obj) {
        return (Math.sqrt((this.x - obj.x) * (this.x - obj.x) + (this.y - obj.y) * (this.y - obj.y)));
    }
}
