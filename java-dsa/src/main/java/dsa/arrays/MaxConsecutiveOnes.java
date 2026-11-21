// https://leetcode.com/problems/max-consecutive-ones/
package dsa.arrays;
import java.util.Scanner;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];      
        for(int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = 0;
        int cnt = 0;

        for(int i = 0; i < size; i++) {
            if(arr[i] == 1) {
                cnt += 1;
                max = Math.max(max, cnt); 
            } else {
                cnt = 0;
            }
        }

        System.out.println(max);

        scanner.close();
    }
}
