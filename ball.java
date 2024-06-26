package test;

import java.util.Scanner;

public class ball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] q = new int[n][3];

        for (int i = 0; i < n; i++){
            q[i][0] = sc.nextInt();
            q[i][1] = sc.nextInt();
            q[i][2] = sc.nextInt();
        }
        int ans = 0;

        for (int i = 1; i <= 9; i++){
            for (int j = 1; j <= 9; j++){
                for (int k = 1; k <= 9; k++){
                    if(i == j || j == k || k == i) continue;

                    boolean chk = true;

                    for (int l = 0; l < n; l++){
                        int qi = q[l][0] / 100;
                        int qj = (q[l][0] / 10) % 10;
                        int qk = q[l][0] % 10;

                        int strike = 0;
                        int ball = 0;

                        if (i == qi)strike++;
                        else if (i == qj || i == qk) ball++;
                        if (j == qj)strike++;
                        else if (j == qi || j == qk) ball++;
                        if (k == qk)strike++;
                        else if (k == qi || k == qj) ball++;

                        if(strike != q[l][1] || ball != q[l][2]){
                            chk = false;
                            break;
                        }

                    }
                    if (chk) ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
