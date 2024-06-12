package hash;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetEx01_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int target = sc.nextInt();

        for (int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(arr, target));

    }
    public  static boolean solution(int[] arr, int target){
        HashSet<Integer> set = new HashSet<>();

        for (int i : arr){
            if (set.contains(target - i) && target - i != i) {
                return true;
            }
            set.add(i);
        }
        return false;
    }
}
