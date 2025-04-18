package Inheritance0418;

// 📦 비유: Point는 좌표만 찍을 수 있는 흑백 프린터라고 생각하고,
// ColorPoint는 색을 입힐 수 있는 컬러 프린터라고 생각하면 돼.
// 즉, ColorPoint는 Point 기능 + 색상 기능이 추가된 확장판인 셈이야.
public class Ex51ColorPointEx {
    public static void main(String[] args) {
        // 🎯 기본 좌표 객체 생성
        Point p = new Point();         // Point 객체 생성
        p.set(1, 2);                   // 좌표 설정
        p.showPoint();                 // 결과 출력 → (1,2)

        // 🎨 색상이 추가된 좌표 객체 생성
        ColorPoint cp = new ColorPoint();  
        cp.set(3, 4);                  // 부모 클래스 Point의 set() 메서드 사용
        cp.setColor("red");           // ColorPoint의 고유 메서드로 색 지정
        cp.showColorPoint();          // 출력 → red(3,4)
    }
}

// 🧱 좌표를 표현하는 기본 클래스
class Point {
    private int x, y; // 좌표 정보는 외부에서 직접 접근 불가 (캡슐화)

    // 좌표 설정 메서드
    public void set(int x, int y) {
        this.x = x;     // 매개변수 x를 멤버 변수 x에 저장
        this.y = y;
    }

    // 좌표 출력 메서드
    public void showPoint() {
        System.out.println("(" + x + "," + y + ")");
    }
}

// 🎨 색상이 추가된 좌표 클래스 (Point 클래스를 상속받음)
class ColorPoint extends Point {
    private String color; // 색상 정보를 위한 변수

    // 색상 설정 메서드
    public void setColor(String color) {
        this.color = color;
    }

    // 색상과 좌표를 함께 출력
    public void showColorPoint() {
        System.out.print(color);  // 색상 먼저 출력
        showPoint();              // 부모 클래스의 좌표 출력 메서드 호출
    }
}