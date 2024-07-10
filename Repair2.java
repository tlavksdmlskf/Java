package test;

import java.util.Arrays;
import java.util.Scanner;

public class Repair2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();

        int[] cost = new int[n];
        int[] budget = new int[m];

        for (int i = 0; i < n; i++){
            budget[i] = sc.nextInt();
        }

        Arrays.sort(cost);
        Arrays.sort(budget);

        int l = 0, r = Math.min(n,m), ans = 0;
        while (l <= r){
            int M = (l + r) / 2; // l + r의 값이 int의 범위를 넘어설 때는 사용하면 안됨
            if(calc(cost, budget, M) <= x){
                ans = m;
                l = m + 1;
            }else{
                r = m - 1;
            }

        }
        System.out.println(ans);


    }

    static long calc(int[] cost, int[] budget, int assignCount){
        long needAmount = 0;
        for (int i = 0; i < assignCount; i++){
            needAmount += Math.max(cost[i] - budget[budget.length - assignCount + i], 0);
        }
        return needAmount;
    }
}
