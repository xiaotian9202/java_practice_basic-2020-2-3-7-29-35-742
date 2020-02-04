package com.thoughtworks;

public class ArrayPractice2 {

    /**
     * 把给定数组中的最大值保存到数组中的第1个元素且原第一个数换到最大值的位置
     */
    public static int[] exchange() {
        int[] array = new int[]{10, 8, 1, 7, 0, 20, 16, 19};
        int max = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        swap(array, 0, index);

        return array;
    }

    public static void swap(int[] arr, int index_1, int index_2) {
        int temp = arr[index_1];
        arr[index_1] = arr[index_2];
        arr[index_2] = temp;

    }
}
