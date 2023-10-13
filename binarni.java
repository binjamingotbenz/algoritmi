//В начале программы мы создаем объект класса Scanner, чтобы прочитать ввод пользователя.
import java.util.Scanner;

public class binarni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 10;
        int[] array = new int[n];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }


        System.out.print("Введите значение, которое нужно найти: ");
        int target = scanner.nextInt();
        int result = binarySearch(array, target);
        printResult(result);
    }


    public static int binarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void printResult(int result) {
        if (result == -1) {
            System.out.println("-");
        } else {
            System.out.println("Индекс:" + result);
        }
    }
}