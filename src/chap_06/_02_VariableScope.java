package chap_06;

public class _02_VariableScope {

    public static void methodB(){
        int result = 1;
    }

    public static void main(String[] args) {

        int num = 3;  //지역변수  변수가 선언된 중가로 내에서만 사용가능
    }
}
