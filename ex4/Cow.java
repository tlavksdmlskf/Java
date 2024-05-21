package poly.ex4;

public class Cow implements InterfaceAnimal{
    @Override
    public void sound(){
        System.out.println("와츄고나두");
    }

    @Override
    public void move() {
        System.out.println("청도 소싸움 경기장 가는 중");
    }
}
