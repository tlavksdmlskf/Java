package extends1.super1;

import extends1.access.child.Child;

public class SuperMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.call();
    }

    /* super - 생성자

       상속관계의 인스턴스를 생성하면 결국 메모리 내부에는 자식과 부모 클래스가 각각 다 만들어진다.
       child를 만들면 부모인 parent까지 함께 만들어지는 것이다 따라서 각각의 생성자도 모두 호출되어야한다
       상소 관계를 사용하면 자식 클래스의 생성자에서 부모 클래스의 생성자를 반드시 호출해야한다
       상속관계에서 부모의 생성자를 호출 할 때는 super()를 사용하면 된다
     */
}
