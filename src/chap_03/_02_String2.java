package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python.";

        //문자열 변환
        System.out.println(s.replace("and",","));
        System.out.println(s.substring(7)); //7번째 부터 시작 이전내용은 삭제 변수에 적용하면 삭제된 문자열 변수에 저장
        System.out.println(s.substring(s.indexOf("Java")));
        System.out.println(s.substring(7,s.indexOf("."))); //시작위치부터 끝위치 직전까지 슬라이싱

        //공백 제거
        //s.trim 양쪽 공백 제거

        //문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 +" , "+ s2);
        System.out.println(s1.concat(",".concat(s2)));
    }
}
