package oop;

public class MusicPleyerMain2 {
    public static void main(String[] args) {
        // 맴버 변수 추가
        MusicPlayer player = new MusicPlayer();
        player.on();
        player.volumeUp();
        player.volumeUp();
        player.volumeDown();
        player.showStatus();
        player.showStatus();
        player.off();


    }

}
