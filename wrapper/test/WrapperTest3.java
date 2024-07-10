package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        // String str를 Integer로 변환해서 출력
        // Integer를 int로 변환해서 출력
        // int를 Integer로 변환해서 출력

        Integer a = Integer.valueOf(str);
        System.out.println(a);
        int b = a;
        System.out.println(b);
        Integer c = b;
        System.out.println(c);
    }
}
