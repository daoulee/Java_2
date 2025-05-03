package Class_ver2_0417;  // 📦 이 클래스가 포함된 폴더(패키지) 이름
// 비유 🗂️: 패키지는 폴더, 클래스를 정리정돈하기 위한 공간

class Circle {
    int radius;  // 🟠 원의 반지름 (외부에서 접근 가능한 필드 아님)

    // 생성자: 객체를 만들 때 반지름 값을 지정할 수 있게 함
    public Circle (int radius) {
        this.radius = radius;  // 🛠️ this는 객체 자신을 가리킴 (전달받은 값 → 필드에 저장)
    }

    // 원의 넓이를 구하는 메서드
    public double getArea(){
        return 3.14 * radius * radius;  // 📐 넓이 공식: π * r²
    }
}

public class CircleArray {
    public static void main(String[] args) {

        Circle[] c;  // 🧱 원 객체 배열 선언 (비어있는 5칸짜리 배열 선언 준비)
        c = new Circle[5];  // 📦 Circle 객체를 담을 배열 공간 생성 (실제 객체는 아직 없음)

        // 🌀 for 반복문으로 배열에 각각 Circle 객체 생성 (반지름은 i값으로 설정)
        for (int i = 0; i < c.length; i++)
            c[i] = new Circle(i);  // 예: c[0]은 반지름 0, c[1]은 반지름 1 …

        // 각 원의 넓이를 출력
        for (int i = 0; i < c.length; i++)
            System.out.println((int) (c[i].getArea()) + "");
            // 💬 원의 넓이를 정수로 변환해서 출력
            // 예: 반지름 2 → 넓이 12.56 → 정수 12

        System.out.println("Heellllo");  // 🌟 마지막에 “Heellllo” 출력
    }
}