package pack;

import pack.a.User;

public class PakageMain2 {
    public static void main(String[] args) {
        Data data = new Data();
        User usera = new User();
        pack.b.User userb = new pack.b.User();
        // 2. 패키지의 이름과 위치는 폴더 위치와 같아야 한다
        // 3. ㅐ키지의 이름은 모두 소문자를 사용한다 (관례)
        // 패키지의 이름의 앞 부분에는 일반적으로 회사 도메인 이름을 거꾸로 사용한다 (관례)
        //      - com.company.myapp
        //      - 수 많은 외부 라으브러리가 함께 사용되면 같은 클래스 이름이 존재할 수도 있다
        //      - 이렇게 도메인 이름을 거꾸로 사용하면 이런 문제를 방지할 수 있다
        // - 오픈소스나 라이브러리를 만들어서 외부에 제공한다면 위의 관례를 꼭 지키는 것이 좋다
        // - 내가 만든 애플리케이션을 다른 곳에 공유하지 않고, 직접 배포한다면 보통 문제가 되지 않는다.

        //com.sungilshop

        //user
        //  User
        //  UserService
        // ...
    }
}
