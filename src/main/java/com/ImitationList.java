package com;

import java.util.*;

/**
 * 1) добавление элементов.
 * 2) изменение/удаление элементов по индексу.
 * 3) увеличение листа на заданное количество элементов.
 * 4) уменьшение листа до заданного количество элементов.
 * 5) вывод элементов в консоль в прямом и обратном порядке.
 * 6) сортировка листа методом пузырька(http://study-java.ru/uroki-java/urok-11-sortirovka-massiva/).
 * 7) добавление массива в массив.
 * 8) удалять дубликаты.
 * 9) Поиск элемента методом линейного поиска.
 * При удалении элемента не обнулять его, а удалять физически.
 * Начальную размерность листа юзер вводит с консоли.
 * Создать меню для работы с листом из консоли.
 * Условие добавления: перезаписывать если элемент равен 0;
 */

public class ImitationList {
    private int[] array;

    public static final Random RANDOM = new Random();

    public ImitationList() {
        this.array = new int[10];
    }

    public void createArray(int numberOfElements) {
        for (int i = 0; i < numberOfElements; i++) {
            array[i] = RANDOM.nextInt(10);
        }
    }

    public void showArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    public void addElement(int element) {
        resize();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = element;
                break;
            }
        }
    }

    //TODO only for test purposes
    public int[] getArray() {
        return array;
    }

    //TODO only for test purposes
    public void setArray(int[] array) {
        this.array = array;
    }

    public void changeElementByIndex(int index, int element) {
        if (index >= 0 && index <= array.length - 1) {
            array[index] = element;
        }
    }

    public void deleteByIndex(int index) {
        int length = array.length - 1;
        if (index >= 0 && index <= length) {
            int[] arrayNew = new int[length];
            for (int i = 0; i < index; i++) {
                arrayNew[i] = array[i];
            }

            for (int i = index; i < array.length - 1; i++) {
                arrayNew[i] = array[i + 1];
            }
            array = arrayNew;
        }
    }

    public void increaseList(int addedLength) {
        int[] arrayNew = new int[array.length + addedLength];
        for (int i = 0; i < array.length; i++) {
            arrayNew[i] = array[i];
        }
        array = arrayNew;
    }

    public void decreaseList(int decreaseLength) {
        int remain = array.length - decreaseLength;
        int[] arrayNew = new int[remain];
        for (int i = 0; i < decreaseLength; i++) {
            arrayNew[i] = array[i];
        }
        array = arrayNew;
    }

    public void printList() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public void printListInReverseOrder() {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + "    ");
        }
        System.out.println();
    }

    public void bubbleSort() {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void addArray(int[] values) {
        int countZeros = 0;
        for (int element : array) {
            if (element == 0) {
                countZeros++;
            }
        }

        int positionFirstZero = array.length - countZeros;

        if (countZeros < values.length) {
            increaseList(values.length - countZeros + 3);
        }

        for (int i = positionFirstZero, j = 0; j < values.length; i++, ++j) {
            array[i] = values[j];
        }
    }

    public void deleteDuplicate() {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    this.deleteByIndex(j);
                }
            }
        }
    }

    public void searchLinear(int searchedValue) {
        String result = "There's no searched value " + searchedValue;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchedValue) {
                result = "We have found " + array[i] + " at position " + i;
                System.out.println(result);
                break;
            }
        }
    }

    private void resize() {
        int count = 0;

        for (int element : array) {
            if (element == 0) {
                count++;
            }
        }

        if (count == 0) {
            int[] arrayNew = new int[array.length * 2];

            for (int i = 0; i < array.length; i++) {
                arrayNew[i] = array[i];
            }
            array = arrayNew;
        }
    }
}
