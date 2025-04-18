package Class_ver2_0417;

// 비유 📦: 클래스는 사무실, 필드(변수)는 개인 물품
// 접근 지정자는 열쇠 같은 역할을 하며, 누구에게 공개할지 정하는 문이다.
// public: 누구나 열 수 있음
// private: 본인만 열 수 있음
// default: 같은 패키지(같은 층에 사는 이웃들)끼리는 열 수 있음

class Sample {
    public int a;     // 공개된 필드: 누구나 접근 가능
    private int b;    // 비공개 필드: 외부 클래스에서 접근 불가
    int c;            // default 접근자: 같은 패키지 내에서는 접근 가능
}

public class Ex410AccessEx {
    public static void main(String[] args) {
        Sample aClass = new Sample();

        aClass.a = 10; // ✅ 접근 가능 (public)
        // aClass.b = 10; // ❌ 접근 불가 (private) → 컴파일 오류 발생
        aClass.c = 10; // ✅ 접근 가능 (default 같은 패키지 내)
    }
}