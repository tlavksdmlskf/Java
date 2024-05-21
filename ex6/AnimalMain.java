package poly.ex6;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        dog.sound();
        dog.move();

        bird.sound();
        bird.fly();

        chicken.sound();
        chicken.fly();
    }



}
