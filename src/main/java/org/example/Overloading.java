package org.example;


// Access modifiers define visibility of a classes, methods and variables
// Public - Class, Package, Subclass, World
// Protected - Class, Package, SubClass,
// default (no keyword) - Class, Package
// Private - Class


public class Overloading {

    // Overloading : Multiple methods with same name but different parameters list (type, number, order)
    // Cannot overload methods by return type alone.

    // Add Two Numbers
    private static int addNumbers(int a, int b) {
        return a + b;
    }

    // Add Three Numbers
    private  static int addNumbers(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("Sum : " + addNumbers(10, 20));
        System.out.println("Sum : " + addNumbers(11, 21));

        System.out.println("Sum : " + addNumbers(10, 20, 30));

    }
}
