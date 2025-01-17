package org.example;

public class LoopsAndControl {


    public static void main(String[] args){

        // For Loop
        System.out.println("For Loop");
        for (int i =0; i< 5; i++){
            System.out.println(i);
        }

        // While Loop
        System.out.println("While Loop");
        int i = 10;
        while(i >= 5) {
            System.out.println(i);
            i--;
        }

        // Do...while
        System.out.println("Do...While Loop");
        int j = 1;
        do {
            System.out.println(j);
            j++;
        }while (j <= 5);

        // Enhanced For Loop - ForEach - Collections
        System.out.println("Enhanced For Loop");

        int[] numbers = {1,2,3,4,5};
        for(int num : numbers){
            System.out.println("Number: " + num);
        }


        // Control Structures

        // if-else	Decision-making with two outcomes
        // if else ladder
        // switch	Multiple decision paths

        //  Jump Statements
        // break	Exit loop or switch
        // continue	Skip current iteration
        // return	Exit method
    }
}
