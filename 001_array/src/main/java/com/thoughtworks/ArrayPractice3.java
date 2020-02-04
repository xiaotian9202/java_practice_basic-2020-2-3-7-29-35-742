package com.thoughtworks;

public class ArrayPractice3 {

    /**
     * 完成本方法实现功能: 将一个整型数组array中值0的元素去掉，并把剩下的元素组成新的数组
     */
    public static int[] filterZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                int[] newArray = delete(array, i);
                return filterZero(newArray);
            }
        }
        return array;
    }

    public static int[] delete(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            System.out.println("索引越界!");
            return null;
        }

        int[] newArray = new int[array.length - 1];
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        System.arraycopy(array, 0, newArray, 0, newArray.length);
        return newArray;
    }
}
