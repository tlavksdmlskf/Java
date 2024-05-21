package poly.ex4;

public class Cat implements InterfaceAnimal{
    @Override
    public void sound() {
        System.out.println("어흥");
    }
    public void move() {
        System.out.println("짬타이거 이동");
    }
}
