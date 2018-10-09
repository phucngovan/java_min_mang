import java.util.Scanner;

public class MinArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int num;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input arr[" + i + "]:");
            arr[i] = sc.nextInt();

        }
        int min = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < min) {
                min = arr[j];
            }
        }

        System.out.println("min=" + min);
    }


}
