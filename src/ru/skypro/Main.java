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

    }
}
