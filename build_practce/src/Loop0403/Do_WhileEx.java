package Loop0403;

public class Do_WhileEx {
    public static void main(String[] args) {
        char a = 'a';
        do{
            System.out.print(a);
            a = (char) ( a + 1 );
        } while ( a <= 'z');
    }
}
