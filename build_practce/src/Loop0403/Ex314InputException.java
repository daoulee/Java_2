import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex314InputException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 마치 귀에 이어폰 꽂고 사용자 말 듣는 느낌
        System.out.println("정수 3개를 입력하세요");

        int sum = 0, n = 0;

        for (int i = 0; i < 3; i++) { // 숫자 3개 받을 때까지 반복 → 마치 3명한테 차례로 인터뷰하는 느낌
            System.out.print(i + ">>");
            try {
                n = scanner.nextInt(); // 정수 입력 → 인터뷰이가 숫자로 대답하면 OK
            } catch (InputMismatchException e) {
                System.out.println("정수가 아닙니다. 다시 입력하세요!"); // 문자 같은 엉뚱한 대답하면 혼내기
                scanner.next(); // 잘못된 대답은 귀에서 흘려버리기
                i--; // 인터뷰 실패 → 다시 그 사람 순서로 되돌리기
                continue; // 다음 질문으로 넘어가기
            }
            sum += n; // 제대로 대답한 숫자만 합산 → 인터뷰 점수 더하기
        }

        System.out.println("합은 " + sum); // 최종 점수 발표 느낌!
        scanner.close(); // 이어폰 뽑기
    }
}