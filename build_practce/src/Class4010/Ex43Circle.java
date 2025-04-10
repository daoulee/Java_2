package Class4010;

// Ex43Circle.java

public class Ex43Circle {
    int radius;
    String name;

    // 기본 생성자 (매개변수 없음)
    public Ex43Circle() {
        radius = 1;
        name = "";
    }

    // 매개변수를 받는 생성자
    public Ex43Circle(int r, String n) {
        radius = r;
        name = n;
    }

    // 원의 면적 계산 메소드
    public double getArea() {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        // 매개변수가 있는 생성자를 이용한 객체 생성
        Ex43Circle pizza = new Ex43Circle(10, "자바피자");
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        // 기본 생성자를 이용한 객체 생성
        Ex43Circle donut = new Ex43Circle(); // 반지름 1로 자동 초기화됨
        donut.name = "도넛피자"; // 이름만 따로 설정
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }
}