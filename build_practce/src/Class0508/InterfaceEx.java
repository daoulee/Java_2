package Class0508;

interface PhoneInterface {
    final int TIMEOUT = 10000; // 상수 필드 선언
    void sendCall();           // 추상 메서드
    void receiveCall();        // 추상 메서드
    default void printLogo() { // default 메서드
        System.out.println("** Phone **");
    }
}

class Calc {
    public int calculate(int x, int y) {
        return x + y;
    }
}

class SmartPhone extends Calc implements PhoneInterface {
    @Override
    public void sendCall() {
        System.out.println("따르릉따르릉~~");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화가 왔어요.");
    }

    public void schedule() {
        System.out.println("일정 관리합니다.");
    }
}

public class InterfaceEx {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.printLogo(); // default 메서드 호출
        phone.sendCall();  // 인터페이스 구현 메서드
        System.out.println("3과 5를 더하면 " + phone.calculate(3, 5));
        phone.schedule();  // 자체 정의된 메서드
    }
}