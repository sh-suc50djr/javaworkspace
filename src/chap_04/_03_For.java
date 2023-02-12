package chap_04;

public class _03_For {
    public static void main(String[] args) {
        for(int i = 0; i<10; i++){
            System.out.println("seui");
        }
    //포문 단축키 fori 엔터

        //짝수만 출력
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i);
        }
        //홀수만 출력
        for (int i = 1; i < 10; i+=2) {
            System.out.println(i);
        }
    }
}
