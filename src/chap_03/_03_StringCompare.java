package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        //문자열 비교
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1.equals(s2)); //같으면 true 다르면 false
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구분 없이 내용이 같은지 여부 체크

        //문자열 비교 심화
        s1 = "1234";  // 변수 s1, s2가 1234 라는 문자열의 값을 참조
        s2 = "1234";
        System.out.println(s1.equals(s2)); // 내용 비교
        System.out.println(s1 == s2); //참조 비교

        s1 = new String("1234");    // 객체 선언
        s2 = new String("1234");
        System.out.println(s1.equals(s2));  //내용 비교 내용은 똑같음
        System.out.println(s1 == s2); // 다른 객체 참조가 달라서 false

    }
}
