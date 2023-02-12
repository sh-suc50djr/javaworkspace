package chap_04;

public class _01_if {
    public static void main(String[] args) {
        int hour = 10;
        if (hour < 14) {
            System.out.println("아이스 아메리카노 +1");
        } else if (hour<10){
            System.out.println("ddd");
        } else{
            System.out.println("dddd");
        }

        System.out.println("커피 주문 완료");

    }
}
