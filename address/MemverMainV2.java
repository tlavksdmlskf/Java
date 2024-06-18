package lang.immutable.address;

public class MemverMainV2 {

    public static void main(String[] args) {

        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 memberA = new MemberV2("회원 A", address);
        MemberV2 memberB = new MemberV2("회원 B", address);

        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

//        memberB.getAddress().setValue("부산");  // 컴파일 오류
        memberB.setAddress(new ImmutableAddress("부산"));

        System.out.println("부산 -> " + "memberB.Address");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);


    }
}
