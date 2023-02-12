package chap_01;

public class _06_Operator {
    public static void main(String[] args) {
        int a = (int)Math.pow(3,4); // 3의 4승 실수 형태로 나오기때문에 형변환 해줘야함
        a++;
        --a; //증감 연산자 가능
        int b = 1;

        System.out.println(max(a,b));
        System.out.println(a==b);
        System.out.println(a>b && a>0);
        System.out.println(a>b || a>0);
        System.out.println(!(a>b));


    }
    static int max(int a, int b){
        int result = (a > b) ? a : b;
        return result;
    }
}
