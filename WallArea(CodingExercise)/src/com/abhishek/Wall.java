package com.abhishek;

public class Wall {

    private double height;
    private double width;

    Wall() {
        this(0, 0);
    }

     Wall(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        if(width < 0) {
            this.width = 0;
        }
    }

    public void setHeight(double height) {
        if(height < 0) {
            this.height = 0;
        }
    }

    public double getArea() {
        return (this.height * this.width);
    }
}
