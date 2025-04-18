package Class_ver2_0417;

// 비유 📝: 이 코드는 배열을 '택배 상자'라고 보고,
// 메서드에 상자를 넘겨주는 구조야. 택배 박스를 넘기면 안에 내용물을 바꿀 수 있음.
// 즉, 배열을 메서드에 전달하면 그 메서드가 내용을 바꿔버릴 수 있어!
// 여기선 '공백 문자'를 ','로 바꾸는 작업을 한다.

public class Ex48ArrayParameter {
    
    // 공백을 콤마(,)로 바꾸는 메서드
    static void replaceSpace(char a[]) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == ' ') {
                a[i] = ',';  // 공백을 콤마로 대체
            }
        }
    }

    // 문자 배열을 출력하는 메서드
    static void printCharArray(char a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };

        // 🧾 원본 출력
        printCharArray(c);

        // ✂️ 공백을 ,로 바꾸기
        replaceSpace(c);

        // 🧾 바뀐 배열 출력
        printCharArray(c);
    }
}