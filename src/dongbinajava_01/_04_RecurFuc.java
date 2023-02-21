package dongbinajava_01;

public class _04_RecurFuc {
    //반복 함수
//    public static int factorial(int num){
//        int sum = 1;
//        for (int i = 2; i <= num; i++) {
//            sum *= i;
//        }
//        return sum;
//    }
    //재귀 함수
    public static int factorial(int num){
        if(num == 1) return 1;
        else return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        System.out.println("10팩토리얼은 "+factorial(10));
    }
}
