package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python";

        //문자열의 길이
        System.out.println(s.length());

        //대소문자 변환
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        //포함 관계
        System.out.println(s.contains("확인하고싶은 문자")); // 포함되면 true, 아니면 false
        System.out.println(s.indexOf("확인하고싶은 문자")); // 문자열의 시작 인덱스 없으면 -1
        System.out.println(s.lastIndexOf("확인하고싶은 문자")); //문자열이 겹칠때 마지막에 위치하는 문자열에 인덱스 반환
        System.out.println(s.startsWith("문자열")); // 문자열이 인자문자열로 시작하면 true 아니면 false
        System.out.println(s.endsWith("dd")); // 끝문자열 확인




    }
}
