import java.util.Scanner;
import java.util.Arrays;

public class lab4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n;
        do {
            System.out.println("Введите размерность массива: ");
            while (!console.hasNextInt()) {
                System.out.println("Введите неотрицательное число!");
                console.next();
            }
            n = console.nextInt();
        } while (n <= 0);
        System.out.println("Введите элементы массива: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            while (!console.hasNextInt()) {
                System.out.println("Введите целое число!");
                console.next();
            }
            arr[i] = console.nextInt();
        }
        System.out.println("Введите число Х.");
        while (!console.hasNextInt()) {
            System.out.println("Введите целое число!");
            console.next();
        }
        int x = console.nextInt();
        int[] newArr = null;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == x) {
                newArr = new int[arr.length - 1];
                for (int m = 0; m < i; m++) {
                    newArr[m] = arr[m];
                }
                for (int j = i; j < arr.length - 1; j++) {
                    newArr[j] = arr[j + 1];
                }
            }
        }
        System.out.println("Исходный массив — " + Arrays.toString(arr));
        System.out.println("Новый массив — " + Arrays.toString(newArr));
    }
}
