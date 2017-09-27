package com.diffblue;
import java.util.Arrays;
import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many lottery balls would you like to play?");
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

    }
}