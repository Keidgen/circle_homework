package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // Task 1
        int a = 1;
        while (a < 11){
            System.out.print(a + " ");
            a++;
        }

        System.out.print("\n");

        for(int b = 10; b > 0; b--){
            System.out.print(b + " ");
        }
        System.out.print("\n");

        // Task 2
        int Friday = 7;
        for (int c = 1; c <= 31; c++){
            if (c == Friday){
                System.out.println("Сегодня пятница, " + c + "-е число. Необходимо подготовить отчет.");
                Friday = Friday + 7;
            }
        }

        // Task 3
        int startComet = 1822;
        for (int i = 0; i <= 2122; i = i + 79){
            if (i >= startComet){
                System.out.println(i);
            }
        }

        // Task 4
        String output;
        for (int i = 1; i <= 30; i++) {
            output = i + ": ";
            if (i % 3 == 0) {
                output = output + "ping ";
            }
            if (i % 5 == 0) {
                output = output + "pong ";
            }
            System.out.println(output);
        }

        // Task 5
        int i = 10;
        int numOne = 0;
        int numTwo = 1;
        while (i > 0){
            System.out.print(numOne + " " + numTwo + " ");
            numOne = numOne + numTwo;
            numTwo = numOne + numTwo;
            i = i -2;
        }

    }
}
