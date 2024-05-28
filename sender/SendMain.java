package poly.ex.sender;

public class SendMain {
    public static void main(String[] args) {
        Sender[] senders = {new EmailSender(), new SmsSender(), new FaceBookSender()};

        for (Sender sender : senders){
            sender.sendMessage("환영합니다!");
        }
    }
}

/*
다중 메세지 발송
-한 번에 여러곳에 메시지를 발송하는 프로그램을개발하자.
- 메인 코드를 보고 클래스를 완성하시오.

요구사항
1. 다형성을 활용해야 한다.
2. Sender 인터페이스를 구현하고사용해야 한다.
3. EmailSender.java, SmsSender.java, FaceBookSender.java를 구현하세요.

// 실행 결과
메일을 발송합니다: 환영합니다!
SMS를 발송합니다: 환영합니다!
페이스북에 발송합니다: 환영합니다!
 */
