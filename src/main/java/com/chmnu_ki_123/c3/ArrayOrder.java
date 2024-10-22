package com.chmnu_ki_123.c3;

public class ArrayOrder {

    public static int checkOrder(int[] array) {
        if (array.length < 2) {
            return 0; // Масив занадто малий, щоб визначити порядок
        }

        boolean ascending = true;
        boolean descending = true;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                descending = false; // Якщо знайдено порушення для спадання
            } else if (array[i] < array[i - 1]) {
                ascending = false; // Якщо знайдено порушення для зростання
            }
        }

        if (ascending) {
            return 1; // Масив впорядкований за зростанням
        } else if (descending) {
            return -1; // Масив впорядкований за спаданням
        } else {
            return 0; // Масив не впорядкований
        }
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 4, 3, 2, 1};
        int[] array3 = {1, 3, 2, 4, 5};

        System.out.println(checkOrder(array1)); // Виведе 1
        System.out.println(checkOrder(array2)); // Виведе -1
        System.out.println(checkOrder(array3)); // Виведе 0
    }
}
