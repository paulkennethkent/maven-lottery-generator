package com.diffblue;
import java.util.Arrays;
import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many lottery balls would you like to play 6 or 7?");
        int n = sc.nextInt();
        int[] lottery = new int[n];
        int randomNum;
        for (int i = 0; i < lottery.length; i++) {
            randomNum = (int) (Math.random() * 49);
            for (int x = 0; x < i; x++) {
                if (lottery[x] == randomNum)
                {
                    randomNum = (int) (Math.random() * 49);
                }

            }
            lottery[i] = randomNum;
        }
        Arrays.sort(lottery);

        for (int i = 0; i < lottery.length; i++)
            System.out.print(lottery[i] + " ");

        isItReal(lottery);

    }

    public static boolean isItReal(int[] lottery) {
        boolean real;
        if (lottery.length < 8) {
            System.out.println("Its a real lottery, winner winner chicken dinner!");
            real = true;
            return real;
        }
        else {
            System.out.println("Its not a real lottery you idiothole");
            real = false;
            return false;

        }

    }
}