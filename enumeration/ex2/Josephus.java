package enumeration.test.ex2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Josephus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();

        for(int i = 1; i <= n; i++){
            q.add(i);
        }

        System.out.print("<");

        int[] ans = new int[n];
        for (int i = 0; i < n ; i++){
            for (int j = 1; j < n; j++){
                q.add(q.poll());
            }
            ans[i] = q.poll();
        }
        for(int i = 0; i < ans.length; i++){
            if(i == ans.length-1) System.out.print(ans[i]);
            else System.out.print(ans[i] + ", ");
        }
        System.out.println(">");
    }
}
