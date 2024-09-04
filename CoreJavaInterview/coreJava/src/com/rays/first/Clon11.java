package com.rays.first;

public class Clon11 implements Cloneable {
    public void display() {
        System.out.println("Object created using clone()");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            Clon11 original = new Clon11();
            Clon11 clone = (Clon11) original.clone();
            clone.display();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
