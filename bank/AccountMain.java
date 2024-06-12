package bank;

import java.util.Iterator;

public class AccountMain {
    public static void main(String[] args) {
        Account ac = new Account();


        ac.deposit(10000);
        ac.withdraw(9000);
        ac.withdraw(9000);
        System.out.println("잔고: " + ac.balance);

        //hashset : set 인터페이스에서 지원하는 구현 클래스이다
        //순서대로 입력되지 않고, 일정하게 유지되지 않는다
        // null 요소도 허용이 된다
        // 중복을 허용하지 않는다 ＂

        // 중복을 걸러내는 과정
        // 객체를 저장하기 전에 먼저 객체의 hashcode() 매소드를 호출해서 해시 코드를 얻어 낸 다음
        // 저장되어 있는 객체들의 hashcode와 비교한 뒤 같은 해시코드가 있다면 다시 equals() 메소드로
        // 두 객체를 빅해서 true가 나오면 동일한 객체로 판단하고 중복 저장을 하지 ㅇ너]ㅏㅏ

        //ahashset<Integer> set = new hashser<>()
        //get 메소드가 존재하지 않앗 하나의 객체를 가져올 수 없다
        //하나의 객체를 가져오기 위해서는 Iterator를 사용해야한다
        //전체 객체를 대상으로 한 번씩 반복해서 가져오는 반복자다
        //메소드를 호출하면 먹을 수 있다
        //에서 하나의 객체를 가져올 때는 next() 메소드를 사용한다
        //먼저 가져올 객체가 있는지 확인하기 위해 hasNext() 메소드를 사용하여 확인하는 것이 좋다
        //hasNext() 메소드는 가져올 객체가 있으면 true 없으면 false를 반환한다
//
//        Iterator iter = set.iterator();
//        while (iter.hasNext()){
//            System.out.println(iter.next());
//        }


    }
}
