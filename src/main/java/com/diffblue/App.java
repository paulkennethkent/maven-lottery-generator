package com.diffblue;
import java.util.Arrays;

public class App
{
    public static void main(String[] args) {

        int[] lottery = new int[6];
        int randomNum;

        for (int i = 0; i < 6; i++) {
            randomNum = (int) (Math.random() * 49 +1);
            for (int x = 0; x < i; x++) {
                if (lottery[x] == randomNum)
                {
                    randomNum = (int) (Math.random() * 49 +1);
                }

            }
            lottery[i] = randomNum;
        }
        Arrays.sort(lottery);

        for (int i = 0; i < lottery.length; i++)
            System.out.print(lottery[i] + " ");

    }
}