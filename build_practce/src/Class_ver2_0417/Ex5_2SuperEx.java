package Class_ver2_0417;

// 부모 클래스 Point는 점의 좌표(x, y)를 저장하는 클래스야.
// 마치 주소를 담는 우편봉투 같은 역할!
class Point1 {
    private int x, y;

    public Point1() {
        this.x = this.y = 0;
    }

    public Point1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void showPoint() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

// ColorPoint1은 Point1을 상속받아, 색상(color)이라는 새로운 정보를 더해.
// 마치 색칠이 된 좌표처럼, 원래 정보에 색깔을 덧입히는 느낌이지!
class ColorPoint1 extends Point1 {
    private String color;

    public ColorPoint1(int x, int y, String color) {
        super(x, y); // 부모(Point1)의 생성자를 먼저 호출해서 좌표를 초기화해줌
        this.color = color;
    }

    public void showColorPoint() {
        System.out.print(color + " ");
        showPoint(); // 부모 클래스의 메서드도 그대로 활용 가능!
    }
}

public class Ex5_2SuperEx {
    public static void main(String[] args) {
        ColorPoint1 cp = new ColorPoint1(5, 6, "blue");
        cp.showColorPoint(); // 결과: blue (5, 6)
    }
}