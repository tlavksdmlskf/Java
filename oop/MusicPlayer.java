package oop;

public class MusicPlayer {
    private boolean isOn;
    private int volume;

    void showStatus(){
        System.out.println("음악 플레이어 "  + (isOn ? "ON, 현재 볼륨: " + volume : "OFF" ));
    }

    void on(){
        isOn = true;
        System.out.println("음악 플레이어 ON");
    }

    void off(){
        isOn = false;
        System.out.println("음악 플레이어 OFF");
    }

    void volumeUp(){
        volume++;
        System.out.println("볼륨 증가, 현재 볼륨: " + volume);
    }

    void volumeDown(){
        volume--;
        System.out.println("볼륨 감소, 현재 볼륨: " + volume);
    }
}
// 캡슐화
// MusicPlayer를 보면 음악 플레이어를 구성하기 위한 속성과 기능이 마치 하나의 캡슐에 쌓여있는 것 같다.
// 이렇게 속성(필드, 맴버 변수)과 기능(메서드)를 하나로 묶어서 필요한 기능을 메서드를 통해 외부에 제공하는 것을 캡슐화라고 한다.
