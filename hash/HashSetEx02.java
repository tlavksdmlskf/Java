package hash;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetEx02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

//        System.out.println(solution(arr));
        solution(arr);
    }
    public static void solution(int[] a){
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0 ; i < a.length - 1 ; i++ ){
            for(int j = (a.length - 1)  ; j > i ; j--){
                set.add(a[i]+a[j]);
            }
        }
        System.out.println(set);

        int[] number = set.stream().sorted().mapToInt(Integer::intValue).toArray();

        for (int n : number){
            System.out.println(n + " ");
        }
    }
}
