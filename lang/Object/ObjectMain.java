package lang.Object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = new Parent();
        child.childMethod();
        child.parentMethod();

        // toSring()은 Object 클래스의 메서드 == 조상인 Object 클래스의 메서드까지 사용 가능
        System.out.println(child.toString());



    }
}
