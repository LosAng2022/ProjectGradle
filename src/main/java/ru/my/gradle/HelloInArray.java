package ru.my.gradle;

public class HelloInArray {

    public static void helloGradle() {

       int[] firstArray = new int[]{0, 1, 2, };
       int[] secondArray = new int[]{4, 5, 6, };
       int[] resultArray;

        resultArray = new int[firstArray.length + secondArray.length];
        int count = 0;

        for (int i = 0; i < firstArray.length; i++) {
            resultArray[i] = firstArray[i];
            count++;
        }

        for (int j = 0; j < secondArray.length; j++) {
            resultArray[count++] = secondArray[j];

        }

        for (int i = 0; i < resultArray.length; i++) {
            System.out.print("Hello Gradle!!! " + resultArray[i] + ", ");
        }

    }
}
