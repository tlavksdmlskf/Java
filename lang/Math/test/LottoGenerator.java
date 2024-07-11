package lang.Math.test;

import java.util.Random;

public class LottoGenerator {
    private final Random rd = new Random();
    private int[] lottoNumbers;
    private int cnt;

    public int[] generate(){
        lottoNumbers = new int[6];
        cnt = 0;
        while (cnt < 6) {
            int number = rd.nextInt(45)+1;

            if(isUnique(number)){
                lottoNumbers[cnt] = number;
                cnt++;
            }


        }return  lottoNumbers;
    }
    private boolean isUnique(int num){
        for (int i = 0; i < cnt; i++){
            if(lottoNumbers[i] == num){
                return false;
            }
        }
        return true;
    }



//    public int[] generate(){
//        Random rd = new Random();
//        int[] a = new int[6];
//        for(int i = 0; i < 6; i++){
//            a[i] = rd.nextInt(45) + 1;
//            for (int j = 0; j < i; j++){
//                if (a[j] == a[i]){
//                        i--;
//                }
//            }
//        }
//        return a;
//    }
}
