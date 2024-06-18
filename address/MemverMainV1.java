package lang.immutable.address;

public class MemverMainV1 {

    public static void main(String[] args) {

        Address address = new Address("서울");

        MemberV1 memberA = new MemberV1("회원 A", address);
        MemberV1 memberB = new MemberV1("회원 B", address);

        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        memberB.getAddress().setValue("부산");
        System.out.println("부산 -> " + "memberB.Address");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);


    }
}
