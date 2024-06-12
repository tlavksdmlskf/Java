package hash;

import java.util.Scanner;

public class HashSetEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        System.out.println(solution(arr, target));
    }

    static boolean solution(int[] a, int b){
        for (int i : a){
            for(int j : a){
                if(i + j == b) return true;
            }
        }
        return false;
    }


}
