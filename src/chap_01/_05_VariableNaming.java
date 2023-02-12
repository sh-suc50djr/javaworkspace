package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        int a = 200;
        System.out.println("10진수 :"+a);
        System.out.format("8진수 : %o\n", a);
        System.out.format("16진수 :%x" , a);

        String name = "John Doe";
        System.out.println(name);
        System.out.println(name.substring(0,1));
    }
}
