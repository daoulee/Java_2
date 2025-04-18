// Shape은 도형이라는 공통 틀(부모 클래스)이야.
// 그리고 Line, Rect, Circle은 그걸 상속받은 각각의 도형(자식 클래스)이야.
// 모두 "그림을 그린다(draw)"라는 행동은 같지만, 실제 동작은 도형마다 달라!

class Shape {
    public void draw() {
        System.out.println("Shape");
    }
}

class Line extends Shape {
    public void draw() {
        System.out.println("Line");
    }
}

class Rect extends Shape {
    public void draw() {
        System.out.println("Rect");
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Circle");
    }
}

public class Ex5_4MethodOverridingEx {
    static void paint(Shape p) {
        p.draw(); // 어떤 객체인지에 따라 실행 결과가 달라짐 → 다형성, 동적 바인딩!
    }

    public static void main(String[] args) {
        paint(new Shape());   // 출력: Shape
        paint(new Line());    // 출력: Line
        paint(new Rect());    // 출력: Rect
        paint(new Circle());  // 출력: Circle
    }
}