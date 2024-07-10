package lang.Math.test;

import java.util.Random;

public class LottoGenerator {
    public int[] generate(){
        Random rd = new Random();
        int[] a = new int[6];
        for(int i = 0; i < 6; i++){
            int x = rd.nextInt(45) + 1;

        }
    }
}
