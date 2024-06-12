package oop;

public class MusicPleyerMain1 {
    public static void main(String[] args) {
        boolean isON = false;
        int volume = 0;

        isON = true;
        System.out.println("음악 플레이어을 실행합니다");

        volume++;
        System.out.println("현재 볼륨: " + volume);

        volume--;
        System.out.println("현재 볼륨: " + volume);

        volume++;
        System.out.println("현재 볼륨: " + volume);

        if(isON){
            System.out.println("음악 플레이어 ON, 볼륨: "+volume);
        }else{
            System.out.println("음악 플레이어 OFF");
        }

        isON = false;
        System.out.println("음악 플레이어를 종료합니다");

    }
}
