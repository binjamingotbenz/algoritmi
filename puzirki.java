import java.util.Scanner;

public class puzirki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt;
        int[] arr = new int[n];


        System.out.println("Введите числа:");
        for (int i = 0; i != n; i++) {
            arr[i] = scanner.nextInt();
        }

        bubbleSort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int perevorot = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = perevorot;


                }
            }
        }
    }
}
