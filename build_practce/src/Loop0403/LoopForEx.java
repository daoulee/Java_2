
public class LoopForEx {
    public static void main(String[] args) {
        
    
    for ( int i =1; i < 10; i ++) { // 단에 대한 반복 . 1 ~ 9단
     for(int j = 1 ; j < 10 ; j ++ ) { // 각 단 의 곱셈
        System.out.print( j + "*" + i + "=" + i * j );
        System.out.print('\t'); // 하나씩 탭으로 띄우기    
     }            
    System.out.println(); // 한 단이 끝나면 다음 줄로 커서 이동
        }
    }
}
