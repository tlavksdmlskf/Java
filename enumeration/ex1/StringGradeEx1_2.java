package enumeration.ex1;

public class StringGradeEx1_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();



    }
}
// 문자열 상수를 사용해도 지금까지 발생한 문제들을 근본적으로 해결할 수 없다.
// 왜냐하면 String 타입은 어떤 문자열이든 입력할 수 있기 때문이다.
// 어떤 개발자가 상수로 StringGrade에 있는 문자열 상수를사용하지 않고, 위처럼 직접 문자열을 사용해도
// 막을 수 있는 방법이 없ㅏ.
// 사용해야 하는 문자열 상수가 어디에 있는지 discount()를 호출하는 개발자는 알기 어렵다
