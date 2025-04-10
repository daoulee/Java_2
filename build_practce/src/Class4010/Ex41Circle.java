package Class4010;

// Ex41Circle.java

public class Ex41Circle {
    int radius;         // 원의 반지름
    String name;        // 원의 이름

    public double getArea() {  // 면적 계산 메소드
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        // 첫 번째 객체: pizza
        Ex41Circle pizza = new Ex41Circle(); // Circle 객체 생성
        pizza.radius = 10;                   // 반지름 설정
        pizza.name = "자바피자";              // 이름 설정
        double area = pizza.getArea();       // 면적 계산
        System.out.println(pizza.name + "의 면적은 " + area);

        // 두 번째 객체: donut
        Ex41Circle donut = new Ex41Circle(); // Circle 객체 생성
        donut.radius = 2;                    // 반지름 설정
        donut.name = "자바도넛";              // 이름 설정
        area = donut.getArea();              // 면적 계산
        System.out.println(donut.name + "의 면적은 " + area);
    }
}