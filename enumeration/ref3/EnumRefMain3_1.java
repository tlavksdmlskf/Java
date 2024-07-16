package enumeration.ref3;

public class EnumRefMain3_1 {
    public static void main(String[] args) {
        int price = 10000;

        Grade[] grades = Grade.values();

        for (Grade grade : grades){
            printDiscout(grade,price);
        }
    }

    private static void printDiscout(Grade grade, int price){
        System.out.println(grade.name() + " 등급의 할인 금액 = " + grade.discount(price));
    }
}
