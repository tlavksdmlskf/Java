package oop;

public class MusicPlayerData {
    boolean isOn = true;
    int volume = 0;


}
// 각각의 기능을 메서드로 만든 덕분에 각각의 기능이 모듈화 되었다. 따라서 다음과 같은 장점이 생긴다.
// 1. 중복 제거 : 로직 중복이 제거되었다. 같은 로직이 필요하면 해당 메서드를 여러번 호출하면 된다.
// 2. 변경 영향 범위 : 기능을 수정할 때 해당 메서드 내부만 변경하면 된다.
// 3. 메서드 이름 추가 : 메서드 이름을 통해 코드를 좀 더 쉽게 이해할 수 있다.

// 모듈화 - 레고를 생각하자
// 레고에서 필요한 블럭을 가져다 꼽아서 사용할 수 있듯이
// 여깃는 음악 플레이어의 기능이 필요하면 해당 기능을 메서드 호출만으로 손쉽게 사용할 수 있다.
// 이제 음악 플레이어와 관련된 매소두룰 조립해서 프로그램을 작성할 수 있다.