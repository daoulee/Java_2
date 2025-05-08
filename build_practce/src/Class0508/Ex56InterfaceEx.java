package Class0508;

// 인터페이스 선언
interface PhoneInterface {
    final int TIMEOUT = 10000; // 상수 필드 (public static final 생략됨)

    void sendCall();    // 추상 메서드
    void receiveCall(); // 추상 메서드

    default void printLogo() { // default 메서드
        System.out.println("** Phone **");
    }
}

// 인터페이스 구현 클래스
class SamsungPhone implements PhoneInterface {
    @Override
    public void sendCall() {
        System.out.println("띠리리링~");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화가 왔습니다.");
    }

    // 추가 메서드
    public void flash() {
        System.out.println("전화기에 불이 켜졌습니다.");
    }
}

// 실행 클래스
public class Ex56InterfaceEx {
    public static void main(String[] args) {
        SamsungPhone phone = new SamsungPhone();

        phone.printLogo();
        phone.sendCall();
        phone.receiveCall();
        phone.flash();
    }
}
    
