package lang.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {

        int iterations = 1_000_000_000;
        long startTime, endTime;

        // 기본형 long 사용
        long sumPrinutuve = 0;
        startTime = System.currentTimeMillis(); // 현재 시간;

        for(int i = 0; i < iterations; i++){
            sumPrinutuve += i;
        }
        endTime = System.currentTimeMillis();

        System.out.println("sumPrimitive = " + sumPrinutuve);
        System.out.println("기본 자료형 long 실행 시간 : " + (endTime - startTime) + "ms");


        // 래퍼 클리스 Long 사용
        Long sumWrapper = System.currentTimeMillis();
        startTime = System.currentTimeMillis(); // 현재 시간;
        for(int i = 0; i < iterations; i++){
            sumWrapper += i; // 오토박싱 발생
        }
        endTime = System.currentTimeMillis();
        
        System.out.println("sumWrapper = " + sumWrapper);
        System.out.println("래퍼 클래스 Long 실행 시간 : " + (endTime - startTime) + "ms");


    }
}


/*
기본형 연산이 래퍼 클래스보다 대략 10여배 이상 빠른 것을 확인할 수 있다. (시스템마다 다름)
기본형은 메모리에서 단순히 그 크기만큼의 공간을 차지한다.
래퍼 클래스의 인스턴스는 내부에 필드로 가지고 있는 기본형의 값 뿐만 아니라 자바에서 객체 자체를 다루는데 필요한
객체 메타 데이터를 포함하므로 더 많은 메모리를 사용하게 된다. (대략 8~16 바이트)

위 연산은 10억 번의 연산을 수행했을 때 0.2초와 3.1초의 차이만큼 발생한다
기본형이든 래퍼 클래스든 이것을 1회로 환산하면 둘 다 매우 빠르게 연산이 수행된다
일반적으로 애플리케이션을 만드는 관점에서 보면 이런 부분을 최적화해도 사막의 모래알 하나 정도의
CPU연산을 아주 많이 수행하는 특수한 경우이거나, 수만 ~ 수십만 이상 연속해서 연산을 수행해야 하는 경우라면 기본형을
사용해서 최적화를 고려해야 한다.
그렇지 않은 일반적인 경우라면 코드를 유지보수하기 더 나은 것을 선택해야 한다

유지보수 VS 최적화
유지보수와 최적화 중 우선 고려할 사항은 유지보수하기 좋은 코드이다
특히 최신 컴퓨터는 매우 빠르기 때문에 메모리 상에서 발생하는 연산을 몇 번 줄인다고 해서 실질적인 도움이 되지 않는
경우가 많다
 */
