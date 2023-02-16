package chap_06;

public class _01_Method {
    //메소드 정의
    public static void sayHello(){
        System.out.println("Hello");
    }

    //전달값, 매개변수 Parameter
    public static void power(int a){
        System.out.println(a+"의 제곱은 "+(a*a));
    }

    //반환
    public static int powerExp(int a, int e){
        int result = 1;
        for (int i = 0; i < e; i++) {
            result *= a;
        }
        return result;
    }

    public static void main(String[] args) {
        sayHello();
        //인수 Argument
        power(5);
        System.out.println(powerExp(3,5));
    }
}
