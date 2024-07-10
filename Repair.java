package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Repair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> cost = new ArrayList<>();
        ArrayList<Integer> budget = new ArrayList<>();

        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();

        for (int i = 0; i < n; i++){
            cost.add(sc.nextInt());
        }

        for (int i = 0; i < m; i++){
            budget.add(sc.nextInt());
        }
        Collections.sort(cost);
        Collections.sort(budget);

        if(m > n){
            for (int i = 0; i < (m - n); i++){
                budget.remove(0);
            }
        }

        int ans = 0;
        while (budget.size() > 0){
            if ((calc(cost, budget)) <= x){
                ans = budget.size();
                break;
            }else{
                budget.remove(0);
            }
        }
        System.out.println(ans);


    }
    static long calc(ArrayList cost, ArrayList budget) {
        long need = 0;
        for (int i = 0; i < budget.size(); i++){
            need += (int)budget.get(i) >= (int)cost.get(i) ? 0 : Math.abs((int)budget.get(i) - (int)cost.get(i));
        }

        return need;
    }
}
