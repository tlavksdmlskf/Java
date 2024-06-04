package lang.Object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object dog1 = new Dog();

        action(dog);
        action(car);
    }
    public static void action(Object obj){
        // 부모는 자식 메서드를 참조할 수 없다.
        //dog.sound()  // 컴파일 오류, Object에서 sound()가 없다
        //car.move()  // 컴파일 오류, Object에서 move()가 없다

        // 객체에 맞는 다운캐스팅 필요
        if(obj instanceof Dog dog){
            dog.sound();
        }else if(obj instanceof Car car){
            car.move();
        }
    }
}
