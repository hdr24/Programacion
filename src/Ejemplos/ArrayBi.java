package Ejemplos;

public class ArrayBi {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[] array3 = new int[10];
        array1[0] = 12;
        array2[0] = array1[0];
        array3[0] = array2[0];
        array1 = array2;
        array1[0] = 43434343;
        System.out.println(array3[0]);
        System.out.println(array2[0]);
        System.out.println(array1[0]);
    }
}
