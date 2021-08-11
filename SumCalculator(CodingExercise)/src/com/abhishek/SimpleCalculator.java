package com.abhishek;

public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    SimpleCalculator(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return this.firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    public double getAdditionResult() {
        return (this.firstNumber + this.secondNumber);
    }

    public double getSubtractionResult() {
        return (this.firstNumber - this.secondNumber);
    }

    public double getMultiplicationResult() {
        return (this.firstNumber * this.secondNumber);
    }

    public double getDivisionResult() {
        return (this.firstNumber / this.secondNumber);
    }
}
