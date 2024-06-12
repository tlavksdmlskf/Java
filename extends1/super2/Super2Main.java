package extends1.super2;

public class Super2Main {
    public static void main(String[] args) {
        ClassC classC = new ClassC();
        ClassB classB = new ClassB(5);


        /*
        1. 상속 관계의 생성자 호출은 결과적으로 부모에서 자식 순서로 실행된다 따라서 부모의 데이터를 먼저 초기화하고,
           그 다음에 자식의 데이터를 초기화한다
        2. 상속 관계에서 자식 클래스의 생성자 첫 줄에 반드시 super(. . .)를 호출해야 한다.
           단, 기본 생성자 ( super() )인 경우 생략할 수 있다.

        클래스와 메서드에 사용되는 final
        1. 클래스에 final
           a. 상속 끝
           b. final로 선언된 클래스는 확장할 수 없다. 다른 클래스가 final로 선언된 클래스를 상속받을 수 없다
           c. public final class MyFinalClass{ ... }
        2. 메서드에 final
           a. 오버라이딩 끝
           b. final로 선언된 메서드는 오버라이드 할 수 없다. 상속받은 서브 클래스에서 이 메서드를 변경할 수 없다
           c. public final void myFinalMethod(){ ... }

        상속 상품
        쇼핑몰의 판매 상속을 보자
        -book, album movie 이렇게 3가지 상품을 클래스로 만들자
        -커드 중복이 ㅇ벗게 상속 관계를 사용하자 부모 클래스는 item이라는 이름을 사용하자
        -공통 속성: name, price
            -book: 저자(author), isbn(isbn)
            -album: 아티스트(artist)
            -movie: 감독 (director), 배우 (actor)
         */
    }
}
