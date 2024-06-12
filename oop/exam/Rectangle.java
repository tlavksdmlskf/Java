package oop.exam;

public class Rectangle {
    int x = 0;
    int y = 0;

    void area(){
        System.out.println("사각형의 넓이: " + (x * y));
    }

    void perimeter(){
        System.out.println("사각형의 둘레" + (2 * (x + y)));
    }

    void isSquare(){
        System.out.println("이 사각형은 " + (x == y ? "정사각형" : "직사각형") + " 입니다.");
    }
}
