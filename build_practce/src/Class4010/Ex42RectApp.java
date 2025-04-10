package Class4010;

// Ex42RectApp.java

import java.util.Scanner;

class Rectangle {
    int width;   // 너비
    int height;  // 높이

    // 면적 계산 메소드
    public int getArea() {
        return width * height;
    }
}

public class Ex42RectApp {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();          // 객체 생성
        Scanner scanner = new Scanner(System.in);  // 사용자 입력 준비

        System.out.print(">> ");                   // 입력 프롬프트
        rect.width = scanner.nextInt();            // 너비 입력
        rect.height = scanner.nextInt();           // 높이 입력

        System.out.println("사각형의 면적은 " + rect.getArea());
        scanner.close();                           // 스캐너 닫기
    }
}