package lang.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception{

        Class hellowClass = Class.forName("lang.clazz.Hello");
        Hello hello = (Hello) hellowClass.getDeclaredConstructor().newInstance();
        String result = hello.hello();
        System.out.println("result");
        // getDeclaredConstructor() : 생성자를 선택
        // newInstance() : 선택된 생성자를 기반으로 인스턴스를 생성한다

        Hello hello1 = new Hello();
        System.out.println(hello1.hello());










    }
}
/*
리플렉션 - reflection
Class를 사용하면 클래스의 메타 정보를 기반으로 클래스에 정의한 메서드, 필드, 생성자 등을 조회하고 이들을 통해
객체 인스턴스를 생산하거나 메서드를 호출하는 작업을 할 수 있다.
이런 작업을 리플렉션이라고 한다.
 */