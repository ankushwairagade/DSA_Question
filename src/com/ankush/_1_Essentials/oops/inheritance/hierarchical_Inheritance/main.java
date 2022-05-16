package com.ankush._1_Essentials.oops.inheritance.hierarchical_Inheritance;

public class main {

    // car is base ----> using this we can derived sport car , EV car , SUV car

    public static void main(String[] args) {


    }
}


class car
{
    int airbag;
    String wheelbase;
    int weight;
    int length;
    int width;
    int cylin;
    int rev;

    public car(int airbag, String wheelbase, int weight, int length, int width, int cylin, int rev) {
        this.airbag = airbag;
        this.wheelbase = wheelbase;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.cylin = cylin;
        this.rev = rev;
    }

    public int getAirbag() {
        return airbag;
    }

    public void setAirbag(int airbag) {
        this.airbag = airbag;
    }

    public String getWheelbase() {
        return wheelbase;
    }

    public void setWheelbase(String wheelbase) {
        this.wheelbase = wheelbase;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getCylin() {
        return cylin;
    }

    public void setCylin(int cylin) {
        this.cylin = cylin;
    }

    public int getRev() {
        return rev;
    }

    public void setRev(int rev) {
        this.rev = rev;
    }
}

class sport extends car
{   String fuel;
    String color;
    double price;

    public sport(int airbag, String wheelbase, int weight, int length, int width, int cylin, int rev, String fuel, String color, double price) {
        super(airbag, wheelbase, weight, length, width, cylin, rev);
        this.fuel = fuel;
        this.color = color;
        this.price = price;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class EV extends car
{
    String color;
    int price;

    public EV(int airbag, String wheelbase, int weight, int length, int width, int cylin, int rev, String color, int price) {
        super(airbag, wheelbase, weight, length, width, cylin, rev);
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

class SUV extends car{
    String color;
    int price;

    public SUV(int airbag, String wheelbase, int weight, int length, int width, int cylin, int rev, String color, int price) {
        super(airbag, wheelbase, weight, length, width, cylin, rev);
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}