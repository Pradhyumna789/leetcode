package dsa.arrays;
import java.util.Scanner;

class SecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

       int max = arr[0]; 
       int secondMax = Integer.MIN_VALUE;

        for(int i = 1; i < size; i++) {
            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if(arr[i] == max) {
                continue;
            } else {
                if(arr[i] > secondMax) {
                    secondMax = arr[i];
                }
            }
        }

        System.out.println(max);
        System.out.println(secondMax);

        scanner.close(); 
    }
}

