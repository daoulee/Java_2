package Class0508;

abstract class Calculator {
    public abstract int add(int a, int b);       // 더하기
    public abstract int subtract(int a, int b);  // 빼기
    public abstract double average(int[] a);     // 평균 계산

    class GoodCalc extends Calculator {
        // 추상 클래스 구현: GoodCalc
    
    
        @Override
        public int add(int a, int b) {
            return a + b;
        }
    
        @Override
        public int subtract(int a, int b) {
            return a - b;
        }
    
        @Override
        public double average(int[] a) {
            int sum = 0;
            for (int num : a) {
                sum += num;
            }
            return (double) sum / a.length;
        }
    }
    
    
}