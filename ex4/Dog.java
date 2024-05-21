package poly.ex4;

public class Dog implements InterfaceAnimal{
    @Override
    public void sound(){
        System.out.println("왈왈");
    }

    public void move(){
        System.out.println("강아지 이동");
    }
}
