package extends1.super1;

public class Child extends parent{
    public String value = "child";

    @Override
    public void hello(){
        System.out.println("child hello");
    }

    public void call(){
        System.out.println("자식의 값" + super.value);
        System.out.println("부모의 값" + this.value);
    }
}
