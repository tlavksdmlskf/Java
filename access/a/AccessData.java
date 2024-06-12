package access.a;

public class AccessData {
    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod(){
        System.out.println("publicField 출력 :" + publicField);
    }

    void defaultMethod(){
        System.out.println("defaultField 출력 :"+ defaultField);
    }

    private void privateMethod(){
        System.out.println("privateField 출력 :"+privateField);
    }

    public void innerAccess(){
        System.out.println("내부 호출");
        publicField = 100;
        defaultField = 200;
        privateField = 300;

        publicMethod();
        defaultMethod();
        privateMethod();
    }

    /*접근제어자
-자바느 접근제어자를 제공한다
-접근 제어자를 사용하면 해당 클래스 외부에서 특정 필드나 메서드에 접근하는 것을 제한할 수 있다

예를 들어,
스피커에 들어가는 소프트웨어를 개발한다고 가정해보자
요구사항 - 음량은 절대로 00을 초과하면 안된다 -> 부품이 고장난다

스피커는 볼륨증가, 볼륨감소, 현재음량 확인하는 기능만 구현한다.
    - 볼륨은 10씩 증가 또는 감소
    -켤 때는 생성자를 통해 초기값(초기음량) 적용할 수 있게 한다.
요구사항은 꼭 지켜서 개발한다

접근 제어자 종류
-자바는 4가지 종류의 접근 제어자를 제공한다

접근 제어자의 종류
1. private : 모든 외부 호출을 막는다
2. default : 같은 패키지 안에서호출은 허용한다
3. protected : 같은 패키지 안에서 호출은 허용한다 패키지가 달라도 상속 관계의 호출은 허용한
4. public : 모든 외부 호출을 허용한다

private -> default -> protected -> public

접근 제어자는 필드와 메서드, 생성자에 사용된다
클래스 레벨에도 일부 접근 제어자를 사용할 수 있다(public , default

     */

}
