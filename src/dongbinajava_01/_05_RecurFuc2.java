package dongbinajava_01;

public class _05_RecurFuc2 {
    //반복 함수
    public static int fibonacci(int num){
        int one = 1;
        int two = 1;
        int result = -1;
        if(num == 1) return one;
        else if (num == 2) return two;
        else{
            for (int i = 2; i <= num; i++) {
                result = one + two;
                one = two;
                two = result;
            }
        }
        return result;
    }
    // 재귀 함수
    public static int fibonacciRecur(int num){
        if (num == 1) return 1;
        else if (num == 2) return 2;
        else return  fibonacciRecur(num - 1) + fibonacciRecur(num - 2);
    }

    public static void main(String[] args) {
        System.out.println("피보나치의 10번째 원소는 " + fibonacciRecur(10));
    }
}
