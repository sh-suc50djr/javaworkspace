package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        //배열의 순회
        String[] copess ={"아메라키노","카페모카","라떼"};
        for (int i = 0; i < 3; i++) {
            System.out.println(copess[i] + "하나");
        }

        //배열의 길이를 이용한 순회
        for (int i = 0; i < copess.length; i++) {
            System.out.println(copess[i] + "하나");
        }

        //enhanced for (for-each) 반복문
        //foreach 단축키
        for (String coffes: copess) {
            System.out.println(coffes + "하나");
        }

    }
}
