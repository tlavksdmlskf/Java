package access;

public class Speaker {
    int volume;

    public Speaker(int volume){
        this.volume = volume;
    }

    void volumeUp(){
        if (volume >= 100){
            System.out.println("최대임");
        }else{
            volume += 10;
            System.out.println("소리 증가");
        }
    }

    void volumeDown(){
        volume -= 10;
        System.out.println("소리 감소");
    }

    void showVolume(){
        System.out.println("현재 볼륨 : " + volume);
    }
}
