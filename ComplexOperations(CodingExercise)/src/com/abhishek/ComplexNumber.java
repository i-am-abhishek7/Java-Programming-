package com.abhishek;

public class ComplexNumber {

    private double real;
    private double imaginary;

    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public void add(double real, double imaginary) {
        this.real = this.real + real;
        this.imaginary = this.imaginary + imaginary;
    }

    public void subtract(ComplexNumber SubtractComplexNumber) {
        this.real = this.real - SubtractComplexNumber.real;
        this.imaginary = this.imaginary - SubtractComplexNumber.imaginary;
    }

    public void subtract(double real, double imaginary) {
        this.real = this.real + real;
        this.imaginary = this.imaginary + imaginary;
    }
}
