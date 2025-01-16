package org.example;


public class Operators {
    public static void main(String[] args) {

        System.out.println("1. Arithmetic Operators");
        int sum = 12 + 5;
        System.out.println("Sum " + sum);

        int difference = 12 - 5;
        System.out.println("Difference " + difference);

        int product = 12 * 5;
        System.out.println("Product " + product);

        int quotient = 12 / 5;
        System.out.println("Quotient " + quotient);

        int remainder = 12 % 5;
        System.out.println("Remainder " + remainder);

        System.out.println("2. Unary Operators");
        // Used for increment, decrement or negate a value

        int value1 = 25;
        System.out.println("Post Increment " + value1++); //25

        int value2 = 25;
        System.out.println("Pre Increment " + ++value2); //26

        int value3 = 25;
        System.out.println("Post Decrement " + value3--); //25

        int value4 = 25;
        System.out.println("Pre Decrement " + --value4); //24


        System.out.println("3. Assignment Operators");
        float value5 = 56;
        float value6;
        float value7 = 1;

        value6 = value5;
        System.out.println("Value 5 is assigned to Value6 " + value6);

        value7 += 5;
        System.out.println("Shorthand operator " + value7); //6

        System.out.println("4. Relational Operators");
        // == , != , <= , >= , <, >

        if (1 > 10) {
            System.out.println("True");
        } else {
            System.out.println("5 is Lesser than 10");
        }

        System.out.println("5. Logical Operators");
        // && , || , !

        if(5 < 10 && 6 < 9) {
            System.out.println("6 > 9 && 5 > 10");
        }

        System.out.println("5. Tenery Operator");
        int mark = 75;
        String grade =
                mark >= 90 ? "Outstanding" :
                mark >= 75 ? "Good" :
                mark >= 50 ? "Average" : "Fail";
        System.out.println("Grade is "+grade); // Good

        System.out.println("6. Bitwise Operator");
        // Manipulate bits of a number type
        // & - Sets each bit to 1 if both bits are 1.
        // | -  Sets 1 if at least one of the bits is 1.
        // ^ (XOR) - Returns 1 if bits are different.
        // ~ (NOT) - Inverts all bits of a number.

        // Note In Java Int is represented as 32 bits,
        // 5 = 00000000 00000000 00000101,

        int btNum1 = 5; // ... 00000101
        int btNum2 = 3; //  ... 00000011

        int btResult = btNum1 & btNum2; // ... 00000001 - only right most bits of both numbers are one.
        System.out.println(btResult); // 1 - ... 00000001

        int letShiftedFive = btNum1 << 1; // shifts all bits 1 position ( doubles the number)
        // 5 = ... 00000101 --> 10 = ... 00001010
        System.out.println(letShiftedFive);

        // Left shift does not preserve the sign bit;
        // Right shift preserves the sign bit
        // Unsigned right bit doest preserve the sign bit

        System.out.println(~5);
        // 00000000 0000000 00000101 -> 11111111 11111111 11111010 ( -6 )
        // Most Significant Bit -> 1, Least Significant Bit -> 0
        // MSB -> 1 means it's a negative number;
        // To convert it to positive two's complement is used
        // Step 1 : Take one's complement
        // 11111111 11111111 11111010 -> 0000000 0000000 00000101
        // Step 2 : Add 1 to the result
        // 00000000 00000000 00000101  +
        //                          1
        // -------------------------------
        // 00000000 00000000 00000110  = 6 in Binary


        /**
         * Uses of Bitwise operators
         * << multiples number by 2
         * >> divides number by 2
         * number & 1 -> LSB -> 1 odd, 0 even
         * Swap two numbers without temp variable
         * Masking
         * Bit fields for space optimization in flags or booleans.
         * Cryptography (e.g., XOR encryption)
         */



    }
}
