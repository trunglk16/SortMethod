package com.company;


import java.util.Arrays;

public class Main {
private static int [] NUMBERS =
        { 49 ,  38 ,  65 ,  97 ,  76 ,  13 ,  27 ,  78 ,  34 ,  12 ,  64 ,  5 ,  4 ,  62 ,  99 ,  98 ,  54 ,  56 ,  17 ,  18 ,  23 ,  34 ,  15 ,  35 ,  25 ,  53 ,  51 };
    private static int[] Result;


    public static void main(String[] args) {
        BubbleSort();
        SimpleSelectionSort();

    }

    public static void BubbleSort() {
        for (int j = 0; j < NUMBERS.length - 1; j++) {
            for (int i = 0; i < NUMBERS.length - 1 - j; i++) {
                if (NUMBERS[i] > NUMBERS[i + 1]) {
                    int temp = NUMBERS[i + 1];
                    NUMBERS[i + 1] = NUMBERS[i];
                    NUMBERS[i] = temp;
                }
            }
        }
        System.out.println("BUBBLE"+Arrays.toString(NUMBERS));

    }
    public static void SimpleSelectionSort() {
        int position = 0;
        for (int i = 0; i < NUMBERS.length - 1; i++) {
            int j = i + 1;
            position = i;
            int temp = NUMBERS[i];
            for (; j < NUMBERS.length - i; j++) {
                if (NUMBERS[j] < temp) {
                    temp = NUMBERS[j];
                    position = j;
                }
            }
            NUMBERS[position] = NUMBERS[i];
            NUMBERS[i] = temp;
        }
        System.out.println("SelectSort"+Arrays.toString(NUMBERS));
    }

}
